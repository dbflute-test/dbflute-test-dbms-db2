package org.docksidestage.db2.dbflute.topic;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.EntityAlreadyUpdatedException;
import org.dbflute.utflute.core.cannonball.CannonballCar;
import org.dbflute.utflute.core.cannonball.CannonballOption;
import org.dbflute.utflute.core.cannonball.CannonballRun;
import org.dbflute.util.DfCollectionUtil;
import org.docksidestage.db2.dbflute.cbean.MemberCB;
import org.docksidestage.db2.dbflute.exbhv.MemberBhv;
import org.docksidestage.db2.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.db2.dbflute.exbhv.pmbean.SimpleMemberPmb;
import org.docksidestage.db2.dbflute.exentity.Member;
import org.docksidestage.db2.dbflute.exentity.Purchase;
import org.docksidestage.db2.dbflute.exentity.customize.SimpleMember;
import org.docksidestage.db2.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5.1 (2009/06/20 Saturday)
 */
public class ThreadSafeTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private PurchaseBhv purchaseBhv;

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    public void test_ThreadSafe_conditionBean_sameExecution() {
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                // ## Arrange ##
                MemberCB cb = new MemberCB();
                cb.setupSelect_MemberStatus();
                cb.query().setMemberName_PrefixSearch("S");
                cb.query().addOrderBy_Birthdate_Desc().addOrderBy_MemberId_Asc();

                // ## Act ##
                ListResultBean<Member> memberList = memberBhv.selectList(cb);

                // ## Assert ##
                assertFalse(memberList.isEmpty());
                for (Member member : memberList) {
                    assertTrue(member.getMemberName().startsWith("S"));
                }
                car.goal(memberList);
            }
        }, new CannonballOption().expectSameResult());
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    public void test_ThreadSafe_outsideSql_sameExecution() {
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                // ## Arrange ##
                String path = MemberBhv.PATH_selectSimpleMember;

                SimpleMemberPmb pmb = new SimpleMemberPmb();
                pmb.setMemberName_PrefixSearch("S");

                Class<SimpleMember> entityType = SimpleMember.class;

                // ## Act ##
                List<SimpleMember> memberList = memberBhv.outsideSql().selectList(path, pmb, entityType);

                // ## Assert ##
                assertNotSame(0, memberList.size());
                log("{SimpleMember}");
                for (SimpleMember entity : memberList) {
                    Integer memberId = entity.getMemberId();
                    String memberName = entity.getMemberName();
                    String memberStatusName = entity.getMemberStatusName();
                    log("    " + memberId + ", " + memberName + ", " + memberStatusName);
                    assertNotNull(memberId);
                    assertNotNull(memberName);
                    assertNotNull(memberStatusName);
                    assertTrue(memberName.startsWith("S"));
                }
                car.goal(memberList);
            }
        }, new CannonballOption().expectSameResult());
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    public void test_ThreadSafe_update_sameExecution() { // uses original transactions
        final int memberId = 3;
        final Member before = memberBhv.selectByPK(memberId);
        final Long versionNo = before.getVersionNo();
        final Set<String> markSet = DfCollectionUtil.newHashSet();

        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                Member member = new Member();
                member.setMemberId(memberId);
                member.setVersionNo(versionNo);
                memberBhv.update(member);
                final long threadId = Thread.currentThread().getId();
                for (int i = 0; i < 30; i++) {
                    Purchase purchase = new Purchase();
                    purchase.setMemberId(3);
                    long currentMillis = currentTimestamp().getTime();
                    long keyMillis = currentMillis - (threadId * 10000) - (i * 10000);
                    purchase.setPurchaseDatetime(new Timestamp(keyMillis));
                    purchase.setPurchaseCount(1234 + i);
                    purchase.setPurchasePrice(1234 + i);
                    purchase.setPaymentCompleteFlg_True();
                    purchase.setProductId(3);
                    purchaseBhv.insert(purchase);
                }
                markSet.add("success: " + threadId);
            }
        }, new CannonballOption().commitTx().expectExceptionAny(EntityAlreadyUpdatedException.class));
        log(markSet);
    }

    public void test_ThreadSafe_update_Deadlock() { // uses original transactions
        final int memberId = 3;
        final Member before = memberBhv.selectByPK(memberId);
        final Long versionNo = before.getVersionNo();
        final Set<String> markSet = DfCollectionUtil.newHashSet();

        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                long threadId = car.getThreadId();
                Purchase purchase = new Purchase();
                purchase.setMemberId(threadId % 2 == 1 ? 3 : 4);
                purchase.setProductId(threadId % 3 == 1 ? 3 : (threadId % 3 == 2 ? 4 : 5));
                long keyMillis = currentTimestamp().getTime() - (threadId * 1000);
                purchase.setPurchaseDatetime(new Timestamp(keyMillis));
                purchase.setPurchaseCount(1234);
                purchase.setPurchasePrice(1234);
                purchase.setPaymentCompleteFlg_True();
                purchaseBhv.insert(purchase);

                // DB2 has no deadlock by this pattern
                Member member = new Member();
                member.setMemberId(memberId);
                member.setVersionNo(versionNo);
                memberBhv.update(member);
                markSet.add("success: " + threadId);
            }
        }, new CannonballOption().commitTx().expectExceptionAny(EntityAlreadyUpdatedException.class));
        log(markSet);
    }
}

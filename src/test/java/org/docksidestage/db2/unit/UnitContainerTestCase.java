package org.docksidestage.db2.unit;

import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.utflute.seasar.ContainerTestCase;
import org.docksidestage.db2.dbflute.cbean.MemberAddressCB;
import org.docksidestage.db2.dbflute.cbean.MemberLoginCB;
import org.docksidestage.db2.dbflute.cbean.MemberSecurityCB;
import org.docksidestage.db2.dbflute.cbean.MemberServiceCB;
import org.docksidestage.db2.dbflute.cbean.MemberWithdrawalCB;
import org.docksidestage.db2.dbflute.cbean.PurchaseCB;
import org.docksidestage.db2.dbflute.exbhv.MemberAddressBhv;
import org.docksidestage.db2.dbflute.exbhv.MemberLoginBhv;
import org.docksidestage.db2.dbflute.exbhv.MemberSecurityBhv;
import org.docksidestage.db2.dbflute.exbhv.MemberServiceBhv;
import org.docksidestage.db2.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.db2.dbflute.exbhv.PurchaseBhv;

/**
 * The test base of the application.
 * @author jflute
 * @since 0.9.9.7F (2012/08/26 Sunday)
 */
public abstract class UnitContainerTestCase extends ContainerTestCase {

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    protected boolean isDestroyContainerAtTearDown() {
        return true;
    }
    
    @Override
    protected boolean isUseTestCaseLooseBinding() {
        return true;
    }

    // ===================================================================================
    //                                                                         Data Helper
    //                                                                         ===========
    private BehaviorSelector _behaviorSelector;

    protected void deleteMemberReferrer() {
        {
            MemberServiceBhv bhv = _behaviorSelector.select(MemberServiceBhv.class);
            MemberServiceCB cb = bhv.newConditionBean();
            bhv.varyingQueryDelete(cb, op -> op.allowNonQueryDelete());
        }
        {
            MemberAddressBhv bhv = _behaviorSelector.select(MemberAddressBhv.class);
            MemberAddressCB cb = bhv.newConditionBean();
            bhv.varyingQueryDelete(cb, op -> op.allowNonQueryDelete());
        }
        {
            MemberLoginBhv bhv = _behaviorSelector.select(MemberLoginBhv.class);
            MemberLoginCB cb = bhv.newConditionBean();
            bhv.varyingQueryDelete(cb, op -> op.allowNonQueryDelete());
        }
        {
            MemberSecurityBhv bhv = _behaviorSelector.select(MemberSecurityBhv.class);
            MemberSecurityCB cb = bhv.newConditionBean();
            bhv.varyingQueryDelete(cb, op -> op.allowNonQueryDelete());
        }
        {
            MemberWithdrawalBhv bhv = _behaviorSelector.select(MemberWithdrawalBhv.class);
            MemberWithdrawalCB cb = bhv.newConditionBean();
            bhv.varyingQueryDelete(cb, op -> op.allowNonQueryDelete());
        }
        {
            PurchaseBhv bhv = _behaviorSelector.select(PurchaseBhv.class);
            PurchaseCB cb = bhv.newConditionBean();
            bhv.varyingQueryDelete(cb, op -> op.allowNonQueryDelete());
        }
    }
}

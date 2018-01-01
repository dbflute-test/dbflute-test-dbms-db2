package org.docksidestage.db2.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import org.docksidestage.db2.dbflute.exbhv.*;
import org.docksidestage.db2.dbflute.bsbhv.loader.*;
import org.docksidestage.db2.dbflute.exentity.*;
import org.docksidestage.db2.dbflute.bsentity.dbmeta.*;
import org.docksidestage.db2.dbflute.cbean.*;

/**
 * The behavior of ALIAS_MEMBER as ALIAS. <br>
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER_STATUS
 *
 * [referrer table]
 *     ALIAS_MEMBER_LOGIN
 *
 * [foreign property]
 *     memberStatus
 *
 * [referrer property]
 *     aliasMemberLoginList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAliasMemberBhv extends AbstractBehaviorWritable<AliasMember, AliasMemberCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public AliasMemberDbm asDBMeta() { return AliasMemberDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "ALIAS_MEMBER"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public AliasMemberCB newConditionBean() { return new AliasMemberCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of AliasMember. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<AliasMemberCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * AliasMemberCB cb = <span style="color: #70226C">new</span> AliasMemberCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(AliasMemberCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br>
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * AliasMember aliasMember = <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * <span style="color: #70226C">if</span> (aliasMember != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = aliasMember.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of AliasMember. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<AliasMember> selectEntity(CBCall<AliasMemberCB> cbLambda) {
        return doSelectOptionalEntity(createCB(cbLambda), typeOfSelectedEntity());
    }

    /**
     * Select the entity by the condition-bean. #beforejava8 <br>
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * AliasMemberCB cb = <span style="color: #70226C">new</span> AliasMemberCB();
     * cb.query().setFoo...(value);
     * AliasMember aliasMember = <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (aliasMember != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = aliasMember.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMember selectEntity(AliasMemberCB cb) {
        return facadeSelectEntity(cb);
    }

    protected AliasMember facadeSelectEntity(AliasMemberCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends AliasMember> OptionalEntity<ENTITY> doSelectOptionalEntity(AliasMemberCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * AliasMember <span style="color: #553000">aliasMember</span> = <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">aliasMember</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of AliasMember. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMember selectEntityWithDeletedCheck(CBCall<AliasMemberCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * AliasMemberCB cb = <span style="color: #70226C">new</span> AliasMemberCB();
     * cb.query().set...;
     * AliasMember aliasMember = <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = aliasMember.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMember selectEntityWithDeletedCheck(AliasMemberCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberId (会員ID): PK, ID, NotNull, INTEGER(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMember selectByPK(Integer memberId) {
        return facadeSelectByPK(memberId);
    }

    protected AliasMember facadeSelectByPK(Integer memberId) {
        return doSelectByPK(memberId, typeOfSelectedEntity());
    }

    protected <ENTITY extends AliasMember> ENTITY doSelectByPK(Integer memberId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(memberId), tp);
    }

    protected <ENTITY extends AliasMember> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer memberId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(memberId, tp), memberId);
    }

    protected AliasMemberCB xprepareCBAsPK(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        return newConditionBean().acceptPK(memberId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param memberAccount (会員アカウント): UQ, NotNull, VARCHAR(50). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<AliasMember> selectByUniqueOf(String memberAccount) {
        return facadeSelectByUniqueOf(memberAccount);
    }

    protected OptionalEntity<AliasMember> facadeSelectByUniqueOf(String memberAccount) {
        return doSelectByUniqueOf(memberAccount, typeOfSelectedEntity());
    }

    protected <ENTITY extends AliasMember> OptionalEntity<ENTITY> doSelectByUniqueOf(String memberAccount, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(memberAccount), tp), memberAccount);
    }

    protected AliasMemberCB xprepareCBAsUniqueOf(String memberAccount) {
        assertObjectNotNull("memberAccount", memberAccount);
        return newConditionBean().acceptUniqueOf(memberAccount);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;AliasMember&gt; <span style="color: #553000">aliasMemberList</span> = <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (AliasMember <span style="color: #553000">aliasMember</span> : <span style="color: #553000">aliasMemberList</span>) {
     *     ... = <span style="color: #553000">aliasMember</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of AliasMember. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<AliasMember> selectList(CBCall<AliasMemberCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * AliasMemberCB cb = <span style="color: #70226C">new</span> AliasMemberCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;AliasMember&gt; <span style="color: #553000">aliasMemberList</span> = <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (AliasMember aliasMember : <span style="color: #553000">aliasMemberList</span>) {
     *     ... = aliasMember.get...;
     * }
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<AliasMember> selectList(AliasMemberCB cb) {
        return facadeSelectList(cb);
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;AliasMember&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (AliasMember aliasMember : <span style="color: #553000">page</span>) {
     *     ... = aliasMember.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of AliasMember. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<AliasMember> selectPage(CBCall<AliasMemberCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * AliasMemberCB cb = <span style="color: #70226C">new</span> AliasMemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;AliasMember&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (AliasMember aliasMember : <span style="color: #553000">page</span>) {
     *     ... = aliasMember.get...();
     * }
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<AliasMember> selectPage(AliasMemberCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of AliasMember. (NotNull)
     * @param entityLambda The handler of entity row of AliasMember. (NotNull)
     */
    public void selectCursor(CBCall<AliasMemberCB> cbLambda, EntityRowHandler<AliasMember> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * AliasMemberCB cb = <span style="color: #70226C">new</span> AliasMemberCB();
     * cb.query().set...
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @param entityRowHandler The handler of entity row of AliasMember. (NotNull)
     */
    public void selectCursor(AliasMemberCB cb, EntityRowHandler<AliasMember> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<AliasMemberCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param aliasMemberList The entity list of aliasMember. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<AliasMember> aliasMemberList, ReferrerLoaderHandler<LoaderOfAliasMember> loaderLambda) {
        xassLRArg(aliasMemberList, loaderLambda);
        loaderLambda.handle(new LoaderOfAliasMember().ready(aliasMemberList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param aliasMember The entity of aliasMember. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(AliasMember aliasMember, ReferrerLoaderHandler<LoaderOfAliasMember> loaderLambda) {
        xassLRArg(aliasMember, loaderLambda);
        loaderLambda.handle(new LoaderOfAliasMember().ready(xnewLRAryLs(aliasMember), _behaviorSelector));
    }

    /**
     * Load referrer of aliasMemberLoginList by the set-upper of referrer. <br>
     * ALIAS_MEMBER_LOGIN by MEMBER_ID, named 'aliasMemberLoginList'.
     * <pre>
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">loadAliasMemberLogin</span>(<span style="color: #553000">aliasMemberList</span>, <span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loginCB</span>.setupSelect...
     *     <span style="color: #553000">loginCB</span>.query().set...
     *     <span style="color: #553000">loginCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (AliasMember aliasMember : <span style="color: #553000">aliasMemberList</span>) {
     *     ... = aliasMember.<span style="color: #CC4747">getAliasMemberLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param aliasMemberList The entity list of aliasMember. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<AliasMemberLogin> loadAliasMemberLogin(List<AliasMember> aliasMemberList, ConditionBeanSetupper<AliasMemberLoginCB> refCBLambda) {
        xassLRArg(aliasMemberList, refCBLambda);
        return doLoadAliasMemberLogin(aliasMemberList, new LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin>().xinit(refCBLambda));
    }

    /**
     * Load referrer of aliasMemberLoginList by the set-upper of referrer. <br>
     * ALIAS_MEMBER_LOGIN by MEMBER_ID, named 'aliasMemberLoginList'.
     * <pre>
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">loadAliasMemberLogin</span>(<span style="color: #553000">aliasMember</span>, <span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loginCB</span>.setupSelect...
     *     <span style="color: #553000">loginCB</span>.query().set...
     *     <span style="color: #553000">loginCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">aliasMember</span>.<span style="color: #CC4747">getAliasMemberLoginList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param aliasMember The entity of aliasMember. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<AliasMemberLogin> loadAliasMemberLogin(AliasMember aliasMember, ConditionBeanSetupper<AliasMemberLoginCB> refCBLambda) {
        xassLRArg(aliasMember, refCBLambda);
        return doLoadAliasMemberLogin(xnewLRLs(aliasMember), new LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param aliasMember The entity of aliasMember. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<AliasMemberLogin> loadAliasMemberLogin(AliasMember aliasMember, LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin> loadReferrerOption) {
        xassLRArg(aliasMember, loadReferrerOption);
        return loadAliasMemberLogin(xnewLRLs(aliasMember), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param aliasMemberList The entity list of aliasMember. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<AliasMemberLogin> loadAliasMemberLogin(List<AliasMember> aliasMemberList, LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin> loadReferrerOption) {
        xassLRArg(aliasMemberList, loadReferrerOption);
        if (aliasMemberList.isEmpty()) { return (NestedReferrerListGateway<AliasMemberLogin>)EMPTY_NREF_LGWAY; }
        return doLoadAliasMemberLogin(aliasMemberList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<AliasMemberLogin> doLoadAliasMemberLogin(List<AliasMember> aliasMemberList, LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin> option) {
        return helpLoadReferrerInternally(aliasMemberList, option, "aliasMemberLoginList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MemberStatus'.
     * @param aliasMemberList The list of aliasMember. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MemberStatus> pulloutMemberStatus(List<AliasMember> aliasMemberList)
    { return helpPulloutInternally(aliasMemberList, "memberStatus"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param aliasMemberList The list of aliasMember. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMemberIdList(List<AliasMember> aliasMemberList)
    { return helpExtractListInternally(aliasMemberList, "memberId"); }

    /**
     * Extract the value list of (single) unique key memberAccount.
     * @param aliasMemberList The list of aliasMember. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractMemberAccountList(List<AliasMember> aliasMemberList)
    { return helpExtractListInternally(aliasMemberList, "memberAccount"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * AliasMember aliasMember = <span style="color: #70226C">new</span> AliasMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * aliasMember.setFoo...(value);
     * aliasMember.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasMember.set...;</span>
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">insert</span>(aliasMember);
     * ... = aliasMember.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param aliasMember The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(AliasMember aliasMember) {
        doInsert(aliasMember, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * AliasMember aliasMember = <span style="color: #70226C">new</span> AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasMember.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * aliasMember.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">update</span>(aliasMember);
     * </pre>
     * @param aliasMember The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(AliasMember aliasMember) {
        doUpdate(aliasMember, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * AliasMember aliasMember = <span style="color: #70226C">new</span> AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasMember.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(aliasMember);
     * </pre>
     * @param aliasMember The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(AliasMember aliasMember) {
        doUpdateNonstrict(aliasMember, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param aliasMember The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(AliasMember aliasMember) {
        doInsertOrUpdate(aliasMember, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param aliasMember The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(AliasMember aliasMember) {
        doInsertOrUpdateNonstrict(aliasMember, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * AliasMember aliasMember = <span style="color: #70226C">new</span> AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * aliasMember.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">delete</span>(aliasMember);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasMember The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(AliasMember aliasMember) {
        doDelete(aliasMember, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * AliasMember aliasMember = <span style="color: #70226C">new</span> AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(aliasMember);
     * </pre>
     * @param aliasMember The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(AliasMember aliasMember) {
        doDeleteNonstrict(aliasMember, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     AliasMember aliasMember = <span style="color: #70226C">new</span> AliasMember();
     *     aliasMember.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         aliasMember.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     aliasMemberList.add(aliasMember);
     * }
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">batchInsert</span>(aliasMemberList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<AliasMember> aliasMemberList) {
        return doBatchInsert(aliasMemberList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     AliasMember aliasMember = <span style="color: #70226C">new</span> AliasMember();
     *     aliasMember.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         aliasMember.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         aliasMember.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//aliasMember.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     aliasMemberList.add(aliasMember);
     * }
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">batchUpdate</span>(aliasMemberList);
     * </pre>
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<AliasMember> aliasMemberList) {
        return doBatchUpdate(aliasMemberList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     AliasMember aliasMember = <span style="color: #70226C">new</span> AliasMember();
     *     aliasMember.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         aliasMember.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         aliasMember.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//aliasMember.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     aliasMemberList.add(aliasMember);
     * }
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">batchUpdate</span>(aliasMemberList);
     * </pre>
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<AliasMember> aliasMemberList) {
        return doBatchUpdateNonstrict(aliasMemberList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<AliasMember> aliasMemberList) {
        return doBatchDelete(aliasMemberList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<AliasMember> aliasMemberList) {
        return doBatchDeleteNonstrict(aliasMemberList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;AliasMember, AliasMemberCB&gt;() {
     *     public ConditionBean setup(AliasMember entity, AliasMemberCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<AliasMember, AliasMemberCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * AliasMember aliasMember = <span style="color: #70226C">new</span> AliasMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasMember.setPK...(value);</span>
     * aliasMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasMember.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">queryUpdate</span>(aliasMember, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param aliasMember The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of AliasMember. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(AliasMember aliasMember, CBCall<AliasMemberCB> cbLambda) {
        return doQueryUpdate(aliasMember, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * AliasMember aliasMember = <span style="color: #70226C">new</span> AliasMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasMember.setPK...(value);</span>
     * aliasMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasMember.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * AliasMemberCB cb = <span style="color: #70226C">new</span> AliasMemberCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">queryUpdate</span>(aliasMember, cb);
     * </pre>
     * @param aliasMember The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(AliasMember aliasMember, AliasMemberCB cb) {
        return doQueryUpdate(aliasMember, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">queryDelete</span>(aliasMember, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of AliasMember. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<AliasMemberCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">queryDelete</span>(aliasMember, cb);
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(AliasMemberCB cb) {
        return doQueryDelete(cb, null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * AliasMember aliasMember = <span style="color: #70226C">new</span> AliasMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * aliasMember.setFoo...(value);
     * aliasMember.setBar...(value);
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">varyingInsert</span>(aliasMember, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = aliasMember.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param aliasMember The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(AliasMember aliasMember, WritableOptionCall<AliasMemberCB, InsertOption<AliasMemberCB>> opLambda) {
        doInsert(aliasMember, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * AliasMember aliasMember = <span style="color: #70226C">new</span> AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasMember.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * aliasMember.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(aliasMember, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param aliasMember The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(AliasMember aliasMember, WritableOptionCall<AliasMemberCB, UpdateOption<AliasMemberCB>> opLambda) {
        doUpdate(aliasMember, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * AliasMember aliasMember = <span style="color: #70226C">new</span> AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasMember.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(aliasMember, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param aliasMember The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(AliasMember aliasMember, WritableOptionCall<AliasMemberCB, UpdateOption<AliasMemberCB>> opLambda) {
        doUpdateNonstrict(aliasMember, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param aliasMember The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(AliasMember aliasMember, WritableOptionCall<AliasMemberCB, InsertOption<AliasMemberCB>> insertOpLambda, WritableOptionCall<AliasMemberCB, UpdateOption<AliasMemberCB>> updateOpLambda) {
        doInsertOrUpdate(aliasMember, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param aliasMember The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(AliasMember aliasMember, WritableOptionCall<AliasMemberCB, InsertOption<AliasMemberCB>> insertOpLambda, WritableOptionCall<AliasMemberCB, UpdateOption<AliasMemberCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(aliasMember, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param aliasMember The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(AliasMember aliasMember, WritableOptionCall<AliasMemberCB, DeleteOption<AliasMemberCB>> opLambda) {
        doDelete(aliasMember, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param aliasMember The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(AliasMember aliasMember, WritableOptionCall<AliasMemberCB, DeleteOption<AliasMemberCB>> opLambda) {
        doDeleteNonstrict(aliasMember, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<AliasMember> aliasMemberList, WritableOptionCall<AliasMemberCB, InsertOption<AliasMemberCB>> opLambda) {
        return doBatchInsert(aliasMemberList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<AliasMember> aliasMemberList, WritableOptionCall<AliasMemberCB, UpdateOption<AliasMemberCB>> opLambda) {
        return doBatchUpdate(aliasMemberList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<AliasMember> aliasMemberList, WritableOptionCall<AliasMemberCB, UpdateOption<AliasMemberCB>> opLambda) {
        return doBatchUpdateNonstrict(aliasMemberList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<AliasMember> aliasMemberList, WritableOptionCall<AliasMemberCB, DeleteOption<AliasMemberCB>> opLambda) {
        return doBatchDelete(aliasMemberList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<AliasMember> aliasMemberList, WritableOptionCall<AliasMemberCB, DeleteOption<AliasMemberCB>> opLambda) {
        return doBatchDeleteNonstrict(aliasMemberList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<AliasMember, AliasMemberCB> manyArgLambda, WritableOptionCall<AliasMemberCB, InsertOption<AliasMemberCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * AliasMember aliasMember = <span style="color: #70226C">new</span> AliasMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasMember.setPK...(value);</span>
     * aliasMember.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(aliasMember, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param aliasMember The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of AliasMember. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(AliasMember aliasMember, CBCall<AliasMemberCB> cbLambda, WritableOptionCall<AliasMemberCB, UpdateOption<AliasMemberCB>> opLambda) {
        return doQueryUpdate(aliasMember, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * AliasMember aliasMember = <span style="color: #70226C">new</span> AliasMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasMember.setPK...(value);</span>
     * aliasMember.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * AliasMemberCB cb = <span style="color: #70226C">new</span> AliasMemberCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(aliasMember, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param aliasMember The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(AliasMember aliasMember, AliasMemberCB cb, WritableOptionCall<AliasMemberCB, UpdateOption<AliasMemberCB>> opLambda) {
        return doQueryUpdate(aliasMember, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #CC4747">queryDelete</span>(aliasMember, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of AliasMember. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<AliasMemberCB> cbLambda, WritableOptionCall<AliasMemberCB, DeleteOption<AliasMemberCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(AliasMemberCB cb, WritableOptionCall<AliasMemberCB, DeleteOption<AliasMemberCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * aliasMemberBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * aliasMemberBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * aliasMemberBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * aliasMemberBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * aliasMemberBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * aliasMemberBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * aliasMemberBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * aliasMemberBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * aliasMemberBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * aliasMemberBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * aliasMemberBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * aliasMemberBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * aliasMemberBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * aliasMemberBhv.outideSql().removeBlockComment().selectList()
     * aliasMemberBhv.outideSql().removeLineComment().selectList()
     * aliasMemberBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<AliasMemberBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<AliasMemberBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) { return downcast(et).getVersionNo() != null; }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends AliasMember> typeOfSelectedEntity() { return AliasMember.class; }
    protected Class<AliasMember> typeOfHandlingEntity() { return AliasMember.class; }
    protected Class<AliasMemberCB> typeOfHandlingConditionBean() { return AliasMemberCB.class; }
}

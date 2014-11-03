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
 * The behavior of ALIAS_REF_EXCEPT as ALIAS. <br>
 * <pre>
 * [primary key]
 *     REF_EXCEPT_ID
 *
 * [column]
 *     REF_EXCEPT_ID, EXCEPT_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ALIAS_EXCEPT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     aliasExcept
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAliasRefExceptBhv extends AbstractBehaviorWritable<AliasRefExcept, AliasRefExceptCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public AliasRefExceptDbm getDBMeta() { return AliasRefExceptDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public AliasRefExceptCB newConditionBean() { return new AliasRefExceptCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of AliasRefExcept. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<AliasRefExceptCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * AliasRefExceptCB cb = <span style="color: #70226C">new</span> AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(AliasRefExceptCB cb) {
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
     * AliasRefExcept aliasRefExcept = <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * <span style="color: #70226C">if</span> (aliasRefExcept != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = aliasRefExcept.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of AliasRefExcept. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasRefExcept selectEntity(CBCall<AliasRefExceptCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. #beforejava8 <br>
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * AliasRefExceptCB cb = <span style="color: #70226C">new</span> AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * AliasRefExcept aliasRefExcept = <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (aliasRefExcept != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = aliasRefExcept.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasRefExcept selectEntity(AliasRefExceptCB cb) {
        return facadeSelectEntity(cb);
    }

    protected AliasRefExcept facadeSelectEntity(AliasRefExceptCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends AliasRefExcept> OptionalEntity<ENTITY> doSelectOptionalEntity(AliasRefExceptCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * AliasRefExcept <span style="color: #553000">aliasRefExcept</span> = <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">aliasRefExcept</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of AliasRefExcept. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasRefExcept selectEntityWithDeletedCheck(CBCall<AliasRefExceptCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * AliasRefExceptCB cb = <span style="color: #70226C">new</span> AliasRefExceptCB();
     * cb.query().set...;
     * AliasRefExcept aliasRefExcept = <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = aliasRefExcept.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasRefExcept selectEntityWithDeletedCheck(AliasRefExceptCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param refExceptId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasRefExcept selectByPK(Long refExceptId) {
        return facadeSelectByPK(refExceptId);
    }

    protected AliasRefExcept facadeSelectByPK(Long refExceptId) {
        return doSelectByPK(refExceptId, typeOfSelectedEntity());
    }

    protected <ENTITY extends AliasRefExcept> ENTITY doSelectByPK(Long refExceptId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(refExceptId), tp);
    }

    protected <ENTITY extends AliasRefExcept> OptionalEntity<ENTITY> doSelectOptionalByPK(Long refExceptId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(refExceptId, tp), refExceptId);
    }

    protected AliasRefExceptCB xprepareCBAsPK(Long refExceptId) {
        assertObjectNotNull("refExceptId", refExceptId);
        return newConditionBean().acceptPK(refExceptId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;AliasRefExcept&gt; <span style="color: #553000">aliasRefExceptList</span> = <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (AliasRefExcept <span style="color: #553000">aliasRefExcept</span> : <span style="color: #553000">aliasRefExceptList</span>) {
     *     ... = <span style="color: #553000">aliasRefExcept</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of AliasRefExcept. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<AliasRefExcept> selectList(CBCall<AliasRefExceptCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * AliasRefExceptCB cb = <span style="color: #70226C">new</span> AliasRefExceptCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;AliasRefExcept&gt; <span style="color: #553000">aliasRefExceptList</span> = <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (AliasRefExcept aliasRefExcept : <span style="color: #553000">aliasRefExceptList</span>) {
     *     ... = aliasRefExcept.get...;
     * }
     * </pre>
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<AliasRefExcept> selectList(AliasRefExceptCB cb) {
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
     * PagingResultBean&lt;AliasRefExcept&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (AliasRefExcept aliasRefExcept : <span style="color: #553000">page</span>) {
     *     ... = aliasRefExcept.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of AliasRefExcept. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<AliasRefExcept> selectPage(CBCall<AliasRefExceptCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * AliasRefExceptCB cb = <span style="color: #70226C">new</span> AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;AliasRefExcept&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (AliasRefExcept aliasRefExcept : <span style="color: #553000">page</span>) {
     *     ... = aliasRefExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<AliasRefExcept> selectPage(AliasRefExceptCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of AliasRefExcept. (NotNull)
     * @param entityLambda The handler of entity row of AliasRefExcept. (NotNull)
     */
    public void selectCursor(CBCall<AliasRefExceptCB> cbLambda, EntityRowHandler<AliasRefExcept> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * AliasRefExceptCB cb = <span style="color: #70226C">new</span> AliasRefExceptCB();
     * cb.query().set...
     * <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @param entityRowHandler The handler of entity row of AliasRefExcept. (NotNull)
     */
    public void selectCursor(AliasRefExceptCB cb, EntityRowHandler<AliasRefExcept> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<AliasRefExceptCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the the referrer loader.
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
     * @param aliasRefExceptList The entity list of aliasRefExcept. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<AliasRefExcept> aliasRefExceptList, ReferrerLoaderHandler<LoaderOfAliasRefExcept> loaderLambda) {
        xassLRArg(aliasRefExceptList, loaderLambda);
        loaderLambda.handle(new LoaderOfAliasRefExcept().ready(aliasRefExceptList, _behaviorSelector));
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
     * @param aliasRefExcept The entity of aliasRefExcept. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(AliasRefExcept aliasRefExcept, ReferrerLoaderHandler<LoaderOfAliasRefExcept> loaderLambda) {
        xassLRArg(aliasRefExcept, loaderLambda);
        loaderLambda.handle(new LoaderOfAliasRefExcept().ready(xnewLRAryLs(aliasRefExcept), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'AliasExcept'.
     * @param aliasRefExceptList The list of aliasRefExcept. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<AliasExcept> pulloutAliasExcept(List<AliasRefExcept> aliasRefExceptList)
    { return helpPulloutInternally(aliasRefExceptList, "aliasExcept"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key refExceptId.
     * @param aliasRefExceptList The list of aliasRefExcept. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractRefExceptIdList(List<AliasRefExcept> aliasRefExceptList)
    { return helpExtractListInternally(aliasRefExceptList, "refExceptId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * AliasRefExcept aliasRefExcept = <span style="color: #70226C">new</span> AliasRefExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * aliasRefExcept.setFoo...(value);
     * aliasRefExcept.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.set...;</span>
     * <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">insert</span>(aliasRefExcept);
     * ... = aliasRefExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param aliasRefExcept The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(AliasRefExcept aliasRefExcept) {
        doInsert(aliasRefExcept, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * AliasRefExcept aliasRefExcept = <span style="color: #70226C">new</span> AliasRefExcept();
     * aliasRefExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasRefExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * aliasRefExcept.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">update</span>(aliasRefExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasRefExcept The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(AliasRefExcept aliasRefExcept) {
        doUpdate(aliasRefExcept, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param aliasRefExcept The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(AliasRefExcept aliasRefExcept) {
        doInsertOrUpdate(aliasRefExcept, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * AliasRefExcept aliasRefExcept = <span style="color: #70226C">new</span> AliasRefExcept();
     * aliasRefExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * aliasRefExcept.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">delete</span>(aliasRefExcept);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasRefExcept The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(AliasRefExcept aliasRefExcept) {
        doDelete(aliasRefExcept, null);
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
     *     AliasRefExcept aliasRefExcept = <span style="color: #70226C">new</span> AliasRefExcept();
     *     aliasRefExcept.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         aliasRefExcept.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     aliasRefExceptList.add(aliasRefExcept);
     * }
     * <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">batchInsert</span>(aliasRefExceptList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param aliasRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<AliasRefExcept> aliasRefExceptList) {
        return doBatchInsert(aliasRefExceptList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     AliasRefExcept aliasRefExcept = <span style="color: #70226C">new</span> AliasRefExcept();
     *     aliasRefExcept.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         aliasRefExcept.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         aliasRefExcept.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//aliasRefExcept.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     aliasRefExceptList.add(aliasRefExcept);
     * }
     * <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">batchUpdate</span>(aliasRefExceptList);
     * </pre>
     * @param aliasRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<AliasRefExcept> aliasRefExceptList) {
        return doBatchUpdate(aliasRefExceptList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param aliasRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<AliasRefExcept> aliasRefExceptList) {
        return doBatchDelete(aliasRefExceptList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;AliasRefExcept, AliasRefExceptCB&gt;() {
     *     public ConditionBean setup(AliasRefExcept entity, AliasRefExceptCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<AliasRefExcept, AliasRefExceptCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * AliasRefExcept aliasRefExcept = <span style="color: #70226C">new</span> AliasRefExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setPK...(value);</span>
     * aliasRefExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setVersionNo(value);</span>
     * AliasRefExceptCB cb = <span style="color: #70226C">new</span> AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">queryUpdate</span>(aliasRefExcept, cb);
     * </pre>
     * @param aliasRefExcept The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of AliasRefExcept. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(AliasRefExcept aliasRefExcept, CBCall<AliasRefExceptCB> cbLambda) {
        return doQueryUpdate(aliasRefExcept, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * AliasRefExcept aliasRefExcept = <span style="color: #70226C">new</span> AliasRefExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setPK...(value);</span>
     * aliasRefExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setVersionNo(value);</span>
     * AliasRefExceptCB cb = <span style="color: #70226C">new</span> AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">queryUpdate</span>(aliasRefExcept, cb);
     * </pre>
     * @param aliasRefExcept The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(AliasRefExcept aliasRefExcept, AliasRefExceptCB cb) {
        return doQueryUpdate(aliasRefExcept, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * AliasRefExceptCB cb = new AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">queryDelete</span>(aliasRefExcept, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of AliasRefExcept. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<AliasRefExceptCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * AliasRefExceptCB cb = new AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">queryDelete</span>(aliasRefExcept, cb);
     * </pre>
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(AliasRefExceptCB cb) {
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
     * AliasRefExcept aliasRefExcept = <span style="color: #70226C">new</span> AliasRefExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * aliasRefExcept.setFoo...(value);
     * aliasRefExcept.setBar...(value);
     * InsertOption&lt;AliasRefExceptCB&gt; option = new InsertOption&lt;AliasRefExceptCB&gt;();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">varyingInsert</span>(aliasRefExcept, option);
     * ... = aliasRefExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param aliasRefExcept The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(AliasRefExcept aliasRefExcept, WritableOptionCall<AliasRefExceptCB, InsertOption<AliasRefExceptCB>> opLambda) {
        doInsert(aliasRefExcept, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * AliasRefExcept aliasRefExcept = <span style="color: #70226C">new</span> AliasRefExcept();
     * aliasRefExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasRefExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * aliasRefExcept.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;AliasRefExceptCB&gt; option = new UpdateOption&lt;AliasRefExceptCB&gt;();
     *     option.self(new SpecifyQuery&lt;AliasRefExceptCB&gt;() {
     *         public void specify(AliasRefExceptCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(aliasRefExcept, option);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasRefExcept The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(AliasRefExcept aliasRefExcept, WritableOptionCall<AliasRefExceptCB, UpdateOption<AliasRefExceptCB>> opLambda) {
        doUpdate(aliasRefExcept, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param aliasRefExcept The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(AliasRefExcept aliasRefExcept, WritableOptionCall<AliasRefExceptCB, InsertOption<AliasRefExceptCB>> insertOpLambda, WritableOptionCall<AliasRefExceptCB, UpdateOption<AliasRefExceptCB>> updateOpLambda) {
        doInsertOrUpdate(aliasRefExcept, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param aliasRefExcept The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(AliasRefExcept aliasRefExcept, WritableOptionCall<AliasRefExceptCB, DeleteOption<AliasRefExceptCB>> opLambda) {
        doDelete(aliasRefExcept, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param aliasRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<AliasRefExcept> aliasRefExceptList, WritableOptionCall<AliasRefExceptCB, InsertOption<AliasRefExceptCB>> opLambda) {
        return doBatchInsert(aliasRefExceptList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param aliasRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<AliasRefExcept> aliasRefExceptList, WritableOptionCall<AliasRefExceptCB, UpdateOption<AliasRefExceptCB>> opLambda) {
        return doBatchUpdate(aliasRefExceptList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param aliasRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<AliasRefExcept> aliasRefExceptList, WritableOptionCall<AliasRefExceptCB, DeleteOption<AliasRefExceptCB>> opLambda) {
        return doBatchDelete(aliasRefExceptList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<AliasRefExcept, AliasRefExceptCB> manyArgLambda, WritableOptionCall<AliasRefExceptCB, InsertOption<AliasRefExceptCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * AliasRefExcept aliasRefExcept = <span style="color: #70226C">new</span> AliasRefExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setPK...(value);</span>
     * aliasRefExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setVersionNo(value);</span>
     * AliasRefExceptCB cb = new AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;AliasRefExceptCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;AliasRefExceptCB&gt;();
     * option.self(new SpecifyQuery&lt;AliasRefExceptCB&gt;() {
     *     public void specify(AliasRefExceptCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(aliasRefExcept, cb, option);
     * </pre>
     * @param aliasRefExcept The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of AliasRefExcept. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(AliasRefExcept aliasRefExcept, CBCall<AliasRefExceptCB> cbLambda, WritableOptionCall<AliasRefExceptCB, UpdateOption<AliasRefExceptCB>> opLambda) {
        return doQueryUpdate(aliasRefExcept, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * AliasRefExcept aliasRefExcept = <span style="color: #70226C">new</span> AliasRefExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setPK...(value);</span>
     * aliasRefExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setVersionNo(value);</span>
     * AliasRefExceptCB cb = <span style="color: #70226C">new</span> AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;AliasRefExceptCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;AliasRefExceptCB&gt;();
     * option.self(new SpecifyQuery&lt;AliasRefExceptCB&gt;() {
     *     public void specify(AliasRefExceptCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">aliasRefExceptBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(aliasRefExcept, cb, option);
     * </pre>
     * @param aliasRefExcept The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(AliasRefExcept aliasRefExcept, AliasRefExceptCB cb, WritableOptionCall<AliasRefExceptCB, UpdateOption<AliasRefExceptCB>> opLambda) {
        return doQueryUpdate(aliasRefExcept, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of AliasRefExcept. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<AliasRefExceptCB> cbLambda, WritableOptionCall<AliasRefExceptCB, DeleteOption<AliasRefExceptCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(AliasRefExceptCB cb, WritableOptionCall<AliasRefExceptCB, DeleteOption<AliasRefExceptCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * aliasRefExceptBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * aliasRefExceptBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * aliasRefExceptBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * aliasRefExceptBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * aliasRefExceptBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * aliasRefExceptBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * aliasRefExceptBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * aliasRefExceptBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * aliasRefExceptBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * aliasRefExceptBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * aliasRefExceptBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * aliasRefExceptBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * aliasRefExceptBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * aliasRefExceptBhv.outideSql().removeBlockComment().selectList()
     * aliasRefExceptBhv.outideSql().removeLineComment().selectList()
     * aliasRefExceptBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<AliasRefExceptBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<AliasRefExceptBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends AliasRefExcept> typeOfSelectedEntity() { return AliasRefExcept.class; }
    protected Class<AliasRefExcept> typeOfHandlingEntity() { return AliasRefExcept.class; }
    protected Class<AliasRefExceptCB> typeOfHandlingConditionBean() { return AliasRefExceptCB.class; }
}

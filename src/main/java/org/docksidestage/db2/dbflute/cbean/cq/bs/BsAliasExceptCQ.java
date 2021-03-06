package org.docksidestage.db2.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.db2.dbflute.cbean.cq.ciq.*;
import org.docksidestage.db2.dbflute.cbean.*;
import org.docksidestage.db2.dbflute.cbean.cq.*;

/**
 * The base condition-query of ALIAS_EXCEPT.
 * @author DBFlute(AutoGenerator)
 */
public class BsAliasExceptCQ extends AbstractBsAliasExceptCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AliasExceptCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsAliasExceptCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from ALIAS_EXCEPT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public AliasExceptCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected AliasExceptCIQ xcreateCIQ() {
        AliasExceptCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected AliasExceptCIQ xnewCIQ() {
        return new AliasExceptCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join ALIAS_EXCEPT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public AliasExceptCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        AliasExceptCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _exceptId;
    public ConditionValue xdfgetExceptId()
    { if (_exceptId == null) { _exceptId = nCV(); }
      return _exceptId; }
    protected ConditionValue xgetCValueExceptId() { return xdfgetExceptId(); }

    public Map<String, AliasRefExceptCQ> xdfgetExceptId_ExistsReferrer_AliasRefExceptList() { return xgetSQueMap("exceptId_ExistsReferrer_AliasRefExceptList"); }
    public String keepExceptId_ExistsReferrer_AliasRefExceptList(AliasRefExceptCQ sq) { return xkeepSQue("exceptId_ExistsReferrer_AliasRefExceptList", sq); }

    public Map<String, AliasRefExceptCQ> xdfgetExceptId_NotExistsReferrer_AliasRefExceptList() { return xgetSQueMap("exceptId_NotExistsReferrer_AliasRefExceptList"); }
    public String keepExceptId_NotExistsReferrer_AliasRefExceptList(AliasRefExceptCQ sq) { return xkeepSQue("exceptId_NotExistsReferrer_AliasRefExceptList", sq); }

    public Map<String, AliasRefExceptCQ> xdfgetExceptId_SpecifyDerivedReferrer_AliasRefExceptList() { return xgetSQueMap("exceptId_SpecifyDerivedReferrer_AliasRefExceptList"); }
    public String keepExceptId_SpecifyDerivedReferrer_AliasRefExceptList(AliasRefExceptCQ sq) { return xkeepSQue("exceptId_SpecifyDerivedReferrer_AliasRefExceptList", sq); }

    public Map<String, AliasRefExceptCQ> xdfgetExceptId_QueryDerivedReferrer_AliasRefExceptList() { return xgetSQueMap("exceptId_QueryDerivedReferrer_AliasRefExceptList"); }
    public String keepExceptId_QueryDerivedReferrer_AliasRefExceptList(AliasRefExceptCQ sq) { return xkeepSQue("exceptId_QueryDerivedReferrer_AliasRefExceptList", sq); }
    public Map<String, Object> xdfgetExceptId_QueryDerivedReferrer_AliasRefExceptListParameter() { return xgetSQuePmMap("exceptId_QueryDerivedReferrer_AliasRefExceptList"); }
    public String keepExceptId_QueryDerivedReferrer_AliasRefExceptListParameter(Object pm) { return xkeepSQuePm("exceptId_QueryDerivedReferrer_AliasRefExceptList", pm); }

    /**
     * Add order-by as ascend. <br>
     * EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsAliasExceptCQ addOrderBy_ExceptId_Asc() { regOBA("EXCEPT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsAliasExceptCQ addOrderBy_ExceptId_Desc() { regOBD("EXCEPT_ID"); return this; }

    protected ConditionValue _exceptName;
    public ConditionValue xdfgetExceptName()
    { if (_exceptName == null) { _exceptName = nCV(); }
      return _exceptName; }
    protected ConditionValue xgetCValueExceptName() { return xdfgetExceptName(); }

    /**
     * Add order-by as ascend. <br>
     * EXCEPT_NAME: {VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsAliasExceptCQ addOrderBy_ExceptName_Asc() { regOBA("EXCEPT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXCEPT_NAME: {VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsAliasExceptCQ addOrderBy_ExceptName_Desc() { regOBD("EXCEPT_NAME"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsAliasExceptCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsAliasExceptCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, AliasExceptCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(AliasExceptCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, AliasExceptCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(AliasExceptCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, AliasExceptCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(AliasExceptCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, AliasExceptCQ> _myselfExistsMap;
    public Map<String, AliasExceptCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(AliasExceptCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, AliasExceptCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(AliasExceptCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return AliasExceptCB.class.getName(); }
    protected String xCQ() { return AliasExceptCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

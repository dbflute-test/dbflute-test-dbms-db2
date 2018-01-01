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
 * The base condition-query of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorCheckCQ extends AbstractBsVendorCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorCheckCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from VENDOR_CHECK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorCheckCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorCheckCIQ xcreateCIQ() {
        VendorCheckCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorCheckCIQ xnewCIQ() {
        return new VendorCheckCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join VENDOR_CHECK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorCheckCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorCheckCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _vendorCheckId;
    public ConditionValue xdfgetVendorCheckId()
    { if (_vendorCheckId == null) { _vendorCheckId = nCV(); }
      return _vendorCheckId; }
    protected ConditionValue xgetCValueVendorCheckId() { return xdfgetVendorCheckId(); }

    /**
     * Add order-by as ascend. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Asc() { regOBA("VENDOR_CHECK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Desc() { regOBD("VENDOR_CHECK_ID"); return this; }

    protected ConditionValue _typeOfChar;
    public ConditionValue xdfgetTypeOfChar()
    { if (_typeOfChar == null) { _typeOfChar = nCV(); }
      return _typeOfChar; }
    protected ConditionValue xgetCValueTypeOfChar() { return xdfgetTypeOfChar(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfChar_Asc() { regOBA("TYPE_OF_CHAR"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfChar_Desc() { regOBD("TYPE_OF_CHAR"); return this; }

    protected ConditionValue _typeOfCharForBitData;
    public ConditionValue xdfgetTypeOfCharForBitData()
    { if (_typeOfCharForBitData == null) { _typeOfCharForBitData = nCV(); }
      return _typeOfCharForBitData; }
    protected ConditionValue xgetCValueTypeOfCharForBitData() { return xdfgetTypeOfCharForBitData(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_CHAR_FOR_BIT_DATA: {CHAR () FOR BIT DATA(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfCharForBitData_Asc() { regOBA("TYPE_OF_CHAR_FOR_BIT_DATA"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_CHAR_FOR_BIT_DATA: {CHAR () FOR BIT DATA(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfCharForBitData_Desc() { regOBD("TYPE_OF_CHAR_FOR_BIT_DATA"); return this; }

    protected ConditionValue _typeOfVarchar;
    public ConditionValue xdfgetTypeOfVarchar()
    { if (_typeOfVarchar == null) { _typeOfVarchar = nCV(); }
      return _typeOfVarchar; }
    protected ConditionValue xgetCValueTypeOfVarchar() { return xdfgetTypeOfVarchar(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar_Asc() { regOBA("TYPE_OF_VARCHAR"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar_Desc() { regOBD("TYPE_OF_VARCHAR"); return this; }

    protected ConditionValue _typeOfVarcharForBitData;
    public ConditionValue xdfgetTypeOfVarcharForBitData()
    { if (_typeOfVarcharForBitData == null) { _typeOfVarcharForBitData = nCV(); }
      return _typeOfVarcharForBitData; }
    protected ConditionValue xgetCValueTypeOfVarcharForBitData() { return xdfgetTypeOfVarcharForBitData(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_VARCHAR_FOR_BIT_DATA: {VARCHAR () FOR BIT DATA(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarcharForBitData_Asc() { regOBA("TYPE_OF_VARCHAR_FOR_BIT_DATA"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_VARCHAR_FOR_BIT_DATA: {VARCHAR () FOR BIT DATA(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarcharForBitData_Desc() { regOBD("TYPE_OF_VARCHAR_FOR_BIT_DATA"); return this; }

    protected ConditionValue _typeOfClob;
    public ConditionValue xdfgetTypeOfClob()
    { if (_typeOfClob == null) { _typeOfClob = nCV(); }
      return _typeOfClob; }
    protected ConditionValue xgetCValueTypeOfClob() { return xdfgetTypeOfClob(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_CLOB: {CLOB(1048576)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfClob_Asc() { regOBA("TYPE_OF_CLOB"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_CLOB: {CLOB(1048576)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfClob_Desc() { regOBD("TYPE_OF_CLOB"); return this; }

    protected ConditionValue _typeOfDbclob;
    public ConditionValue xdfgetTypeOfDbclob()
    { if (_typeOfDbclob == null) { _typeOfDbclob = nCV(); }
      return _typeOfDbclob; }
    protected ConditionValue xgetCValueTypeOfDbclob() { return xdfgetTypeOfDbclob(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_DBCLOB: {DBCLOB(2097152)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDbclob_Asc() { regOBA("TYPE_OF_DBCLOB"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_DBCLOB: {DBCLOB(2097152)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDbclob_Desc() { regOBD("TYPE_OF_DBCLOB"); return this; }

    protected ConditionValue _typeOfDecimalDecimal;
    public ConditionValue xdfgetTypeOfDecimalDecimal()
    { if (_typeOfDecimalDecimal == null) { _typeOfDecimalDecimal = nCV(); }
      return _typeOfDecimalDecimal; }
    protected ConditionValue xgetCValueTypeOfDecimalDecimal() { return xdfgetTypeOfDecimalDecimal(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalDecimal_Asc() { regOBA("TYPE_OF_DECIMAL_DECIMAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalDecimal_Desc() { regOBD("TYPE_OF_DECIMAL_DECIMAL"); return this; }

    protected ConditionValue _typeOfDecimalInteger;
    public ConditionValue xdfgetTypeOfDecimalInteger()
    { if (_typeOfDecimalInteger == null) { _typeOfDecimalInteger = nCV(); }
      return _typeOfDecimalInteger; }
    protected ConditionValue xgetCValueTypeOfDecimalInteger() { return xdfgetTypeOfDecimalInteger(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalInteger_Asc() { regOBA("TYPE_OF_DECIMAL_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalInteger_Desc() { regOBD("TYPE_OF_DECIMAL_INTEGER"); return this; }

    protected ConditionValue _typeOfDecimalBigint;
    public ConditionValue xdfgetTypeOfDecimalBigint()
    { if (_typeOfDecimalBigint == null) { _typeOfDecimalBigint = nCV(); }
      return _typeOfDecimalBigint; }
    protected ConditionValue xgetCValueTypeOfDecimalBigint() { return xdfgetTypeOfDecimalBigint(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalBigint_Asc() { regOBA("TYPE_OF_DECIMAL_BIGINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalBigint_Desc() { regOBD("TYPE_OF_DECIMAL_BIGINT"); return this; }

    protected ConditionValue _typeOfSmallint;
    public ConditionValue xdfgetTypeOfSmallint()
    { if (_typeOfSmallint == null) { _typeOfSmallint = nCV(); }
      return _typeOfSmallint; }
    protected ConditionValue xgetCValueTypeOfSmallint() { return xdfgetTypeOfSmallint(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfSmallint_Asc() { regOBA("TYPE_OF_SMALLINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfSmallint_Desc() { regOBD("TYPE_OF_SMALLINT"); return this; }

    protected ConditionValue _typeOfInteger;
    public ConditionValue xdfgetTypeOfInteger()
    { if (_typeOfInteger == null) { _typeOfInteger = nCV(); }
      return _typeOfInteger; }
    protected ConditionValue xgetCValueTypeOfInteger() { return xdfgetTypeOfInteger(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInteger_Asc() { regOBA("TYPE_OF_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInteger_Desc() { regOBD("TYPE_OF_INTEGER"); return this; }

    protected ConditionValue _typeOfBigint;
    public ConditionValue xdfgetTypeOfBigint()
    { if (_typeOfBigint == null) { _typeOfBigint = nCV(); }
      return _typeOfBigint; }
    protected ConditionValue xgetCValueTypeOfBigint() { return xdfgetTypeOfBigint(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBigint_Asc() { regOBA("TYPE_OF_BIGINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBigint_Desc() { regOBD("TYPE_OF_BIGINT"); return this; }

    protected ConditionValue _typeOfFloat;
    public ConditionValue xdfgetTypeOfFloat()
    { if (_typeOfFloat == null) { _typeOfFloat = nCV(); }
      return _typeOfFloat; }
    protected ConditionValue xgetCValueTypeOfFloat() { return xdfgetTypeOfFloat(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_FLOAT: {DOUBLE(53)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfFloat_Asc() { regOBA("TYPE_OF_FLOAT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_FLOAT: {DOUBLE(53)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfFloat_Desc() { regOBD("TYPE_OF_FLOAT"); return this; }

    protected ConditionValue _typeOfDouble;
    public ConditionValue xdfgetTypeOfDouble()
    { if (_typeOfDouble == null) { _typeOfDouble = nCV(); }
      return _typeOfDouble; }
    protected ConditionValue xgetCValueTypeOfDouble() { return xdfgetTypeOfDouble(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDouble_Asc() { regOBA("TYPE_OF_DOUBLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDouble_Desc() { regOBD("TYPE_OF_DOUBLE"); return this; }

    protected ConditionValue _typeOfReal;
    public ConditionValue xdfgetTypeOfReal()
    { if (_typeOfReal == null) { _typeOfReal = nCV(); }
      return _typeOfReal; }
    protected ConditionValue xgetCValueTypeOfReal() { return xdfgetTypeOfReal(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_REAL: {REAL(24)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfReal_Asc() { regOBA("TYPE_OF_REAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_REAL: {REAL(24)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfReal_Desc() { regOBD("TYPE_OF_REAL"); return this; }

    protected ConditionValue _typeOfDate;
    public ConditionValue xdfgetTypeOfDate()
    { if (_typeOfDate == null) { _typeOfDate = nCV(); }
      return _typeOfDate; }
    protected ConditionValue xgetCValueTypeOfDate() { return xdfgetTypeOfDate(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDate_Asc() { regOBA("TYPE_OF_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDate_Desc() { regOBD("TYPE_OF_DATE"); return this; }

    protected ConditionValue _typeOfTime;
    public ConditionValue xdfgetTypeOfTime()
    { if (_typeOfTime == null) { _typeOfTime = nCV(); }
      return _typeOfTime; }
    protected ConditionValue xgetCValueTypeOfTime() { return xdfgetTypeOfTime(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_TIME: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTime_Asc() { regOBA("TYPE_OF_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_TIME: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTime_Desc() { regOBD("TYPE_OF_TIME"); return this; }

    protected ConditionValue _typeOfTimestamp;
    public ConditionValue xdfgetTypeOfTimestamp()
    { if (_typeOfTimestamp == null) { _typeOfTimestamp = nCV(); }
      return _typeOfTimestamp; }
    protected ConditionValue xgetCValueTypeOfTimestamp() { return xdfgetTypeOfTimestamp(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimestamp_Asc() { regOBA("TYPE_OF_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimestamp_Desc() { regOBD("TYPE_OF_TIMESTAMP"); return this; }

    protected ConditionValue _typeOfBlob;
    public ConditionValue xdfgetTypeOfBlob()
    { if (_typeOfBlob == null) { _typeOfBlob = nCV(); }
      return _typeOfBlob; }
    protected ConditionValue xgetCValueTypeOfBlob() { return xdfgetTypeOfBlob(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_BLOB: {BLOB(1048576)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBlob_Asc() { regOBA("TYPE_OF_BLOB"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_BLOB: {BLOB(1048576)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBlob_Desc() { regOBD("TYPE_OF_BLOB"); return this; }

    protected ConditionValue _typeOfGraphic;
    public ConditionValue xdfgetTypeOfGraphic()
    { if (_typeOfGraphic == null) { _typeOfGraphic = nCV(); }
      return _typeOfGraphic; }
    protected ConditionValue xgetCValueTypeOfGraphic() { return xdfgetTypeOfGraphic(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfGraphic_Asc() { regOBA("TYPE_OF_GRAPHIC"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfGraphic_Desc() { regOBD("TYPE_OF_GRAPHIC"); return this; }

    protected ConditionValue _typeOfVargraphic;
    public ConditionValue xdfgetTypeOfVargraphic()
    { if (_typeOfVargraphic == null) { _typeOfVargraphic = nCV(); }
      return _typeOfVargraphic; }
    protected ConditionValue xgetCValueTypeOfVargraphic() { return xdfgetTypeOfVargraphic(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVargraphic_Asc() { regOBA("TYPE_OF_VARGRAPHIC"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVargraphic_Desc() { regOBD("TYPE_OF_VARGRAPHIC"); return this; }

    protected ConditionValue _typeOfLongVargraphic;
    public ConditionValue xdfgetTypeOfLongVargraphic()
    { if (_typeOfLongVargraphic == null) { _typeOfLongVargraphic = nCV(); }
      return _typeOfLongVargraphic; }
    protected ConditionValue xgetCValueTypeOfLongVargraphic() { return xdfgetTypeOfLongVargraphic(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfLongVargraphic_Asc() { regOBA("TYPE_OF_LONG_VARGRAPHIC"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfLongVargraphic_Desc() { regOBD("TYPE_OF_LONG_VARGRAPHIC"); return this; }

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
    public BsVendorCheckCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorCheckCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, VendorCheckCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorCheckCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorCheckCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorCheckCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorCheckCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorCheckCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorCheckCQ> _myselfExistsMap;
    public Map<String, VendorCheckCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorCheckCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorCheckCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorCheckCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorCheckCB.class.getName(); }
    protected String xCQ() { return VendorCheckCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

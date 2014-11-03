package org.docksidestage.db2.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.db2.dbflute.cbean.*;
import org.docksidestage.db2.dbflute.cbean.cq.bs.*;
import org.docksidestage.db2.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckCIQ extends AbstractBsVendorCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsVendorCheckCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public VendorCheckCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsVendorCheckCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueVendorCheckId() { return _myCQ.xdfgetVendorCheckId(); }
    protected ConditionValue xgetCValueTypeOfChar() { return _myCQ.xdfgetTypeOfChar(); }
    protected ConditionValue xgetCValueTypeOfCharForBitData() { return _myCQ.xdfgetTypeOfCharForBitData(); }
    protected ConditionValue xgetCValueTypeOfVarchar() { return _myCQ.xdfgetTypeOfVarchar(); }
    protected ConditionValue xgetCValueTypeOfVarcharForBitData() { return _myCQ.xdfgetTypeOfVarcharForBitData(); }
    protected ConditionValue xgetCValueTypeOfClob() { return _myCQ.xdfgetTypeOfClob(); }
    protected ConditionValue xgetCValueTypeOfDbclob() { return _myCQ.xdfgetTypeOfDbclob(); }
    protected ConditionValue xgetCValueTypeOfDecimalDecimal() { return _myCQ.xdfgetTypeOfDecimalDecimal(); }
    protected ConditionValue xgetCValueTypeOfDecimalInteger() { return _myCQ.xdfgetTypeOfDecimalInteger(); }
    protected ConditionValue xgetCValueTypeOfDecimalBigint() { return _myCQ.xdfgetTypeOfDecimalBigint(); }
    protected ConditionValue xgetCValueTypeOfSmallint() { return _myCQ.xdfgetTypeOfSmallint(); }
    protected ConditionValue xgetCValueTypeOfInteger() { return _myCQ.xdfgetTypeOfInteger(); }
    protected ConditionValue xgetCValueTypeOfBigint() { return _myCQ.xdfgetTypeOfBigint(); }
    protected ConditionValue xgetCValueTypeOfFloat() { return _myCQ.xdfgetTypeOfFloat(); }
    protected ConditionValue xgetCValueTypeOfDouble() { return _myCQ.xdfgetTypeOfDouble(); }
    protected ConditionValue xgetCValueTypeOfReal() { return _myCQ.xdfgetTypeOfReal(); }
    protected ConditionValue xgetCValueTypeOfDate() { return _myCQ.xdfgetTypeOfDate(); }
    protected ConditionValue xgetCValueTypeOfTime() { return _myCQ.xdfgetTypeOfTime(); }
    protected ConditionValue xgetCValueTypeOfTimestamp() { return _myCQ.xdfgetTypeOfTimestamp(); }
    protected ConditionValue xgetCValueTypeOfBlob() { return _myCQ.xdfgetTypeOfBlob(); }
    protected ConditionValue xgetCValueTypeOfGraphic() { return _myCQ.xdfgetTypeOfGraphic(); }
    protected ConditionValue xgetCValueTypeOfVargraphic() { return _myCQ.xdfgetTypeOfVargraphic(); }
    protected ConditionValue xgetCValueTypeOfLongVargraphic() { return _myCQ.xdfgetTypeOfLongVargraphic(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(VendorCheckCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(VendorCheckCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(VendorCheckCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(VendorCheckCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return VendorCheckCB.class.getName(); }
    protected String xinCQ() { return VendorCheckCQ.class.getName(); }
}

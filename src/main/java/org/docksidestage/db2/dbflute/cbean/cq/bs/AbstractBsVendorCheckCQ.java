package org.docksidestage.db2.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.db2.dbflute.allcommon.*;
import org.docksidestage.db2.dbflute.cbean.*;
import org.docksidestage.db2.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorCheckCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "VENDOR_CHECK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_Equal(Long vendorCheckId) {
        doSetVendorCheckId_Equal(vendorCheckId);
    }

    protected void doSetVendorCheckId_Equal(Long vendorCheckId) {
        regVendorCheckId(CK_EQ, vendorCheckId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_NotEqual(Long vendorCheckId) {
        doSetVendorCheckId_NotEqual(vendorCheckId);
    }

    protected void doSetVendorCheckId_NotEqual(Long vendorCheckId) {
        regVendorCheckId(CK_NES, vendorCheckId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_GreaterThan(Long vendorCheckId) {
        regVendorCheckId(CK_GT, vendorCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_LessThan(Long vendorCheckId) {
        regVendorCheckId(CK_LT, vendorCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_GreaterEqual(Long vendorCheckId) {
        regVendorCheckId(CK_GE, vendorCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_LessEqual(Long vendorCheckId) {
        regVendorCheckId(CK_LE, vendorCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of vendorCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of vendorCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVendorCheckId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVendorCheckId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of vendorCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of vendorCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVendorCheckId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVendorCheckId(), "VENDOR_CHECK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_InScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_INS, cTL(vendorCheckIdList), xgetCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_NotInScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_NINS, cTL(vendorCheckIdList), xgetCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setVendorCheckId_IsNull() { regVendorCheckId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setVendorCheckId_IsNotNull() { regVendorCheckId(CK_ISNN, DOBJ); }

    protected void regVendorCheckId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVendorCheckId(), "VENDOR_CHECK_ID"); }
    protected abstract ConditionValue xgetCValueVendorCheckId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfChar_Equal(String typeOfChar) {
        doSetTypeOfChar_Equal(fRES(typeOfChar));
    }

    protected void doSetTypeOfChar_Equal(String typeOfChar) {
        regTypeOfChar(CK_EQ, typeOfChar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfChar_NotEqual(String typeOfChar) {
        doSetTypeOfChar_NotEqual(fRES(typeOfChar));
    }

    protected void doSetTypeOfChar_NotEqual(String typeOfChar) {
        regTypeOfChar(CK_NES, typeOfChar);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfCharList The collection of typeOfChar as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfChar_InScope(Collection<String> typeOfCharList) {
        doSetTypeOfChar_InScope(typeOfCharList);
    }

    protected void doSetTypeOfChar_InScope(Collection<String> typeOfCharList) {
        regINS(CK_INS, cTL(typeOfCharList), xgetCValueTypeOfChar(), "TYPE_OF_CHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfCharList The collection of typeOfChar as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfChar_NotInScope(Collection<String> typeOfCharList) {
        doSetTypeOfChar_NotInScope(typeOfCharList);
    }

    protected void doSetTypeOfChar_NotInScope(Collection<String> typeOfCharList) {
        regINS(CK_NINS, cTL(typeOfCharList), xgetCValueTypeOfChar(), "TYPE_OF_CHAR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)} <br>
     * <pre>e.g. setTypeOfChar_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfChar The value of typeOfChar as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfChar_LikeSearch(String typeOfChar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfChar_LikeSearch(typeOfChar, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)} <br>
     * <pre>e.g. setTypeOfChar_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfChar The value of typeOfChar as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfChar_LikeSearch(String typeOfChar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfChar), xgetCValueTypeOfChar(), "TYPE_OF_CHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfChar_NotLikeSearch(String typeOfChar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfChar_NotLikeSearch(typeOfChar, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfChar_NotLikeSearch(String typeOfChar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfChar), xgetCValueTypeOfChar(), "TYPE_OF_CHAR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfChar_PrefixSearch(String typeOfChar) {
        setTypeOfChar_LikeSearch(typeOfChar, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    public void setTypeOfChar_IsNull() { regTypeOfChar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    public void setTypeOfChar_IsNullOrEmpty() { regTypeOfChar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    public void setTypeOfChar_IsNotNull() { regTypeOfChar(CK_ISNN, DOBJ); }

    protected void regTypeOfChar(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfChar(), "TYPE_OF_CHAR"); }
    protected abstract ConditionValue xgetCValueTypeOfChar();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR_FOR_BIT_DATA: {CHAR () FOR BIT DATA(3)}
     */
    public void setTypeOfCharForBitData_IsNull() { regTypeOfCharForBitData(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR_FOR_BIT_DATA: {CHAR () FOR BIT DATA(3)}
     */
    public void setTypeOfCharForBitData_IsNotNull() { regTypeOfCharForBitData(CK_ISNN, DOBJ); }

    protected void regTypeOfCharForBitData(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfCharForBitData(), "TYPE_OF_CHAR_FOR_BIT_DATA"); }
    protected abstract ConditionValue xgetCValueTypeOfCharForBitData();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_Equal(String typeOfVarchar) {
        doSetTypeOfVarchar_Equal(fRES(typeOfVarchar));
    }

    protected void doSetTypeOfVarchar_Equal(String typeOfVarchar) {
        regTypeOfVarchar(CK_EQ, typeOfVarchar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_NotEqual(String typeOfVarchar) {
        doSetTypeOfVarchar_NotEqual(fRES(typeOfVarchar));
    }

    protected void doSetTypeOfVarchar_NotEqual(String typeOfVarchar) {
        regTypeOfVarchar(CK_NES, typeOfVarchar);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarcharList The collection of typeOfVarchar as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_InScope(Collection<String> typeOfVarcharList) {
        doSetTypeOfVarchar_InScope(typeOfVarcharList);
    }

    protected void doSetTypeOfVarchar_InScope(Collection<String> typeOfVarcharList) {
        regINS(CK_INS, cTL(typeOfVarcharList), xgetCValueTypeOfVarchar(), "TYPE_OF_VARCHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarcharList The collection of typeOfVarchar as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_NotInScope(Collection<String> typeOfVarcharList) {
        doSetTypeOfVarchar_NotInScope(typeOfVarcharList);
    }

    protected void doSetTypeOfVarchar_NotInScope(Collection<String> typeOfVarcharList) {
        regINS(CK_NINS, cTL(typeOfVarcharList), xgetCValueTypeOfVarchar(), "TYPE_OF_VARCHAR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(32)} <br>
     * <pre>e.g. setTypeOfVarchar_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfVarchar The value of typeOfVarchar as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfVarchar_LikeSearch(String typeOfVarchar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfVarchar_LikeSearch(typeOfVarchar, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(32)} <br>
     * <pre>e.g. setTypeOfVarchar_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfVarchar The value of typeOfVarchar as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfVarchar_LikeSearch(String typeOfVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfVarchar), xgetCValueTypeOfVarchar(), "TYPE_OF_VARCHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfVarchar_NotLikeSearch(String typeOfVarchar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfVarchar_NotLikeSearch(typeOfVarchar, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfVarchar_NotLikeSearch(String typeOfVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfVarchar), xgetCValueTypeOfVarchar(), "TYPE_OF_VARCHAR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_PrefixSearch(String typeOfVarchar) {
        setTypeOfVarchar_LikeSearch(typeOfVarchar, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     */
    public void setTypeOfVarchar_IsNull() { regTypeOfVarchar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     */
    public void setTypeOfVarchar_IsNullOrEmpty() { regTypeOfVarchar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     */
    public void setTypeOfVarchar_IsNotNull() { regTypeOfVarchar(CK_ISNN, DOBJ); }

    protected void regTypeOfVarchar(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfVarchar(), "TYPE_OF_VARCHAR"); }
    protected abstract ConditionValue xgetCValueTypeOfVarchar();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR_FOR_BIT_DATA: {VARCHAR () FOR BIT DATA(32)}
     */
    public void setTypeOfVarcharForBitData_IsNull() { regTypeOfVarcharForBitData(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR_FOR_BIT_DATA: {VARCHAR () FOR BIT DATA(32)}
     */
    public void setTypeOfVarcharForBitData_IsNotNull() { regTypeOfVarcharForBitData(CK_ISNN, DOBJ); }

    protected void regTypeOfVarcharForBitData(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfVarcharForBitData(), "TYPE_OF_VARCHAR_FOR_BIT_DATA"); }
    protected abstract ConditionValue xgetCValueTypeOfVarcharForBitData();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(1048576)}
     * @param typeOfClob The value of typeOfClob as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfClob_Equal(String typeOfClob) {
        doSetTypeOfClob_Equal(fRES(typeOfClob));
    }

    protected void doSetTypeOfClob_Equal(String typeOfClob) {
        regTypeOfClob(CK_EQ, typeOfClob);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(1048576)}
     * @param typeOfClob The value of typeOfClob as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfClob_NotEqual(String typeOfClob) {
        doSetTypeOfClob_NotEqual(fRES(typeOfClob));
    }

    protected void doSetTypeOfClob_NotEqual(String typeOfClob) {
        regTypeOfClob(CK_NES, typeOfClob);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(1048576)}
     * @param typeOfClobList The collection of typeOfClob as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfClob_InScope(Collection<String> typeOfClobList) {
        doSetTypeOfClob_InScope(typeOfClobList);
    }

    protected void doSetTypeOfClob_InScope(Collection<String> typeOfClobList) {
        regINS(CK_INS, cTL(typeOfClobList), xgetCValueTypeOfClob(), "TYPE_OF_CLOB");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(1048576)}
     * @param typeOfClobList The collection of typeOfClob as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfClob_NotInScope(Collection<String> typeOfClobList) {
        doSetTypeOfClob_NotInScope(typeOfClobList);
    }

    protected void doSetTypeOfClob_NotInScope(Collection<String> typeOfClobList) {
        regINS(CK_NINS, cTL(typeOfClobList), xgetCValueTypeOfClob(), "TYPE_OF_CLOB");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(1048576)} <br>
     * <pre>e.g. setTypeOfClob_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfClob The value of typeOfClob as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfClob_LikeSearch(String typeOfClob, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfClob_LikeSearch(typeOfClob, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(1048576)} <br>
     * <pre>e.g. setTypeOfClob_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfClob The value of typeOfClob as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfClob_LikeSearch(String typeOfClob, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfClob), xgetCValueTypeOfClob(), "TYPE_OF_CLOB", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(1048576)}
     * @param typeOfClob The value of typeOfClob as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfClob_NotLikeSearch(String typeOfClob, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfClob_NotLikeSearch(typeOfClob, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(1048576)}
     * @param typeOfClob The value of typeOfClob as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfClob_NotLikeSearch(String typeOfClob, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfClob), xgetCValueTypeOfClob(), "TYPE_OF_CLOB", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(1048576)}
     * @param typeOfClob The value of typeOfClob as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfClob_PrefixSearch(String typeOfClob) {
        setTypeOfClob_LikeSearch(typeOfClob, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(1048576)}
     */
    public void setTypeOfClob_IsNull() { regTypeOfClob(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(1048576)}
     */
    public void setTypeOfClob_IsNotNull() { regTypeOfClob(CK_ISNN, DOBJ); }

    protected void regTypeOfClob(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfClob(), "TYPE_OF_CLOB"); }
    protected abstract ConditionValue xgetCValueTypeOfClob();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DBCLOB: {DBCLOB(2097152)}
     * @param typeOfDbclob The value of typeOfDbclob as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfDbclob_Equal(String typeOfDbclob) {
        doSetTypeOfDbclob_Equal(fRES(typeOfDbclob));
    }

    protected void doSetTypeOfDbclob_Equal(String typeOfDbclob) {
        regTypeOfDbclob(CK_EQ, typeOfDbclob);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DBCLOB: {DBCLOB(2097152)}
     * @param typeOfDbclob The value of typeOfDbclob as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfDbclob_NotEqual(String typeOfDbclob) {
        doSetTypeOfDbclob_NotEqual(fRES(typeOfDbclob));
    }

    protected void doSetTypeOfDbclob_NotEqual(String typeOfDbclob) {
        regTypeOfDbclob(CK_NES, typeOfDbclob);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DBCLOB: {DBCLOB(2097152)}
     * @param typeOfDbclobList The collection of typeOfDbclob as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfDbclob_InScope(Collection<String> typeOfDbclobList) {
        doSetTypeOfDbclob_InScope(typeOfDbclobList);
    }

    protected void doSetTypeOfDbclob_InScope(Collection<String> typeOfDbclobList) {
        regINS(CK_INS, cTL(typeOfDbclobList), xgetCValueTypeOfDbclob(), "TYPE_OF_DBCLOB");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DBCLOB: {DBCLOB(2097152)}
     * @param typeOfDbclobList The collection of typeOfDbclob as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfDbclob_NotInScope(Collection<String> typeOfDbclobList) {
        doSetTypeOfDbclob_NotInScope(typeOfDbclobList);
    }

    protected void doSetTypeOfDbclob_NotInScope(Collection<String> typeOfDbclobList) {
        regINS(CK_NINS, cTL(typeOfDbclobList), xgetCValueTypeOfDbclob(), "TYPE_OF_DBCLOB");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_DBCLOB: {DBCLOB(2097152)} <br>
     * <pre>e.g. setTypeOfDbclob_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfDbclob The value of typeOfDbclob as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfDbclob_LikeSearch(String typeOfDbclob, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfDbclob_LikeSearch(typeOfDbclob, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_DBCLOB: {DBCLOB(2097152)} <br>
     * <pre>e.g. setTypeOfDbclob_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfDbclob The value of typeOfDbclob as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfDbclob_LikeSearch(String typeOfDbclob, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfDbclob), xgetCValueTypeOfDbclob(), "TYPE_OF_DBCLOB", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_DBCLOB: {DBCLOB(2097152)}
     * @param typeOfDbclob The value of typeOfDbclob as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfDbclob_NotLikeSearch(String typeOfDbclob, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfDbclob_NotLikeSearch(typeOfDbclob, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_DBCLOB: {DBCLOB(2097152)}
     * @param typeOfDbclob The value of typeOfDbclob as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfDbclob_NotLikeSearch(String typeOfDbclob, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfDbclob), xgetCValueTypeOfDbclob(), "TYPE_OF_DBCLOB", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_DBCLOB: {DBCLOB(2097152)}
     * @param typeOfDbclob The value of typeOfDbclob as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfDbclob_PrefixSearch(String typeOfDbclob) {
        setTypeOfDbclob_LikeSearch(typeOfDbclob, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DBCLOB: {DBCLOB(2097152)}
     */
    public void setTypeOfDbclob_IsNull() { regTypeOfDbclob(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DBCLOB: {DBCLOB(2097152)}
     */
    public void setTypeOfDbclob_IsNotNull() { regTypeOfDbclob(CK_ISNN, DOBJ); }

    protected void regTypeOfDbclob(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfDbclob(), "TYPE_OF_DBCLOB"); }
    protected abstract ConditionValue xgetCValueTypeOfDbclob();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalDecimal_Equal(java.math.BigDecimal typeOfDecimalDecimal) {
        doSetTypeOfDecimalDecimal_Equal(typeOfDecimalDecimal);
    }

    protected void doSetTypeOfDecimalDecimal_Equal(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_EQ, typeOfDecimalDecimal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalDecimal_NotEqual(java.math.BigDecimal typeOfDecimalDecimal) {
        doSetTypeOfDecimalDecimal_NotEqual(typeOfDecimalDecimal);
    }

    protected void doSetTypeOfDecimalDecimal_NotEqual(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_NES, typeOfDecimalDecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalDecimal_GreaterThan(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_GT, typeOfDecimalDecimal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalDecimal_LessThan(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_LT, typeOfDecimalDecimal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalDecimal_GreaterEqual(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_GE, typeOfDecimalDecimal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalDecimal_LessEqual(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_LE, typeOfDecimalDecimal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param minNumber The min number of typeOfDecimalDecimal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfDecimalDecimal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfDecimalDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfDecimalDecimal_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param minNumber The min number of typeOfDecimalDecimal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfDecimalDecimal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfDecimalDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfDecimalDecimal(), "TYPE_OF_DECIMAL_DECIMAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimalList The collection of typeOfDecimalDecimal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfDecimalDecimal_InScope(Collection<java.math.BigDecimal> typeOfDecimalDecimalList) {
        doSetTypeOfDecimalDecimal_InScope(typeOfDecimalDecimalList);
    }

    protected void doSetTypeOfDecimalDecimal_InScope(Collection<java.math.BigDecimal> typeOfDecimalDecimalList) {
        regINS(CK_INS, cTL(typeOfDecimalDecimalList), xgetCValueTypeOfDecimalDecimal(), "TYPE_OF_DECIMAL_DECIMAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimalList The collection of typeOfDecimalDecimal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfDecimalDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfDecimalDecimalList) {
        doSetTypeOfDecimalDecimal_NotInScope(typeOfDecimalDecimalList);
    }

    protected void doSetTypeOfDecimalDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfDecimalDecimalList) {
        regINS(CK_NINS, cTL(typeOfDecimalDecimalList), xgetCValueTypeOfDecimalDecimal(), "TYPE_OF_DECIMAL_DECIMAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     */
    public void setTypeOfDecimalDecimal_IsNull() { regTypeOfDecimalDecimal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     */
    public void setTypeOfDecimalDecimal_IsNotNull() { regTypeOfDecimalDecimal(CK_ISNN, DOBJ); }

    protected void regTypeOfDecimalDecimal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfDecimalDecimal(), "TYPE_OF_DECIMAL_DECIMAL"); }
    protected abstract ConditionValue xgetCValueTypeOfDecimalDecimal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalInteger_Equal(Integer typeOfDecimalInteger) {
        doSetTypeOfDecimalInteger_Equal(typeOfDecimalInteger);
    }

    protected void doSetTypeOfDecimalInteger_Equal(Integer typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_EQ, typeOfDecimalInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalInteger_NotEqual(Integer typeOfDecimalInteger) {
        doSetTypeOfDecimalInteger_NotEqual(typeOfDecimalInteger);
    }

    protected void doSetTypeOfDecimalInteger_NotEqual(Integer typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_NES, typeOfDecimalInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalInteger_GreaterThan(Integer typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_GT, typeOfDecimalInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalInteger_LessThan(Integer typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_LT, typeOfDecimalInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalInteger_GreaterEqual(Integer typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_GE, typeOfDecimalInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalInteger_LessEqual(Integer typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_LE, typeOfDecimalInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param minNumber The min number of typeOfDecimalInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfDecimalInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfDecimalInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfDecimalInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param minNumber The min number of typeOfDecimalInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfDecimalInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfDecimalInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfDecimalInteger(), "TYPE_OF_DECIMAL_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalIntegerList The collection of typeOfDecimalInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfDecimalInteger_InScope(Collection<Integer> typeOfDecimalIntegerList) {
        doSetTypeOfDecimalInteger_InScope(typeOfDecimalIntegerList);
    }

    protected void doSetTypeOfDecimalInteger_InScope(Collection<Integer> typeOfDecimalIntegerList) {
        regINS(CK_INS, cTL(typeOfDecimalIntegerList), xgetCValueTypeOfDecimalInteger(), "TYPE_OF_DECIMAL_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalIntegerList The collection of typeOfDecimalInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfDecimalInteger_NotInScope(Collection<Integer> typeOfDecimalIntegerList) {
        doSetTypeOfDecimalInteger_NotInScope(typeOfDecimalIntegerList);
    }

    protected void doSetTypeOfDecimalInteger_NotInScope(Collection<Integer> typeOfDecimalIntegerList) {
        regINS(CK_NINS, cTL(typeOfDecimalIntegerList), xgetCValueTypeOfDecimalInteger(), "TYPE_OF_DECIMAL_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     */
    public void setTypeOfDecimalInteger_IsNull() { regTypeOfDecimalInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     */
    public void setTypeOfDecimalInteger_IsNotNull() { regTypeOfDecimalInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfDecimalInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfDecimalInteger(), "TYPE_OF_DECIMAL_INTEGER"); }
    protected abstract ConditionValue xgetCValueTypeOfDecimalInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalBigint_Equal(Long typeOfDecimalBigint) {
        doSetTypeOfDecimalBigint_Equal(typeOfDecimalBigint);
    }

    protected void doSetTypeOfDecimalBigint_Equal(Long typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_EQ, typeOfDecimalBigint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalBigint_NotEqual(Long typeOfDecimalBigint) {
        doSetTypeOfDecimalBigint_NotEqual(typeOfDecimalBigint);
    }

    protected void doSetTypeOfDecimalBigint_NotEqual(Long typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_NES, typeOfDecimalBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalBigint_GreaterThan(Long typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_GT, typeOfDecimalBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalBigint_LessThan(Long typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_LT, typeOfDecimalBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalBigint_GreaterEqual(Long typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_GE, typeOfDecimalBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalBigint_LessEqual(Long typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_LE, typeOfDecimalBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param minNumber The min number of typeOfDecimalBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfDecimalBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfDecimalBigint_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfDecimalBigint_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param minNumber The min number of typeOfDecimalBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfDecimalBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfDecimalBigint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfDecimalBigint(), "TYPE_OF_DECIMAL_BIGINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigintList The collection of typeOfDecimalBigint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfDecimalBigint_InScope(Collection<Long> typeOfDecimalBigintList) {
        doSetTypeOfDecimalBigint_InScope(typeOfDecimalBigintList);
    }

    protected void doSetTypeOfDecimalBigint_InScope(Collection<Long> typeOfDecimalBigintList) {
        regINS(CK_INS, cTL(typeOfDecimalBigintList), xgetCValueTypeOfDecimalBigint(), "TYPE_OF_DECIMAL_BIGINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigintList The collection of typeOfDecimalBigint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfDecimalBigint_NotInScope(Collection<Long> typeOfDecimalBigintList) {
        doSetTypeOfDecimalBigint_NotInScope(typeOfDecimalBigintList);
    }

    protected void doSetTypeOfDecimalBigint_NotInScope(Collection<Long> typeOfDecimalBigintList) {
        regINS(CK_NINS, cTL(typeOfDecimalBigintList), xgetCValueTypeOfDecimalBigint(), "TYPE_OF_DECIMAL_BIGINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     */
    public void setTypeOfDecimalBigint_IsNull() { regTypeOfDecimalBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     */
    public void setTypeOfDecimalBigint_IsNotNull() { regTypeOfDecimalBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfDecimalBigint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfDecimalBigint(), "TYPE_OF_DECIMAL_BIGINT"); }
    protected abstract ConditionValue xgetCValueTypeOfDecimalBigint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     * @param typeOfSmallint The value of typeOfSmallint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallint_Equal(Integer typeOfSmallint) {
        doSetTypeOfSmallint_Equal(typeOfSmallint);
    }

    protected void doSetTypeOfSmallint_Equal(Integer typeOfSmallint) {
        regTypeOfSmallint(CK_EQ, typeOfSmallint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     * @param typeOfSmallint The value of typeOfSmallint as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallint_NotEqual(Integer typeOfSmallint) {
        doSetTypeOfSmallint_NotEqual(typeOfSmallint);
    }

    protected void doSetTypeOfSmallint_NotEqual(Integer typeOfSmallint) {
        regTypeOfSmallint(CK_NES, typeOfSmallint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     * @param typeOfSmallint The value of typeOfSmallint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallint_GreaterThan(Integer typeOfSmallint) {
        regTypeOfSmallint(CK_GT, typeOfSmallint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     * @param typeOfSmallint The value of typeOfSmallint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallint_LessThan(Integer typeOfSmallint) {
        regTypeOfSmallint(CK_LT, typeOfSmallint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     * @param typeOfSmallint The value of typeOfSmallint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallint_GreaterEqual(Integer typeOfSmallint) {
        regTypeOfSmallint(CK_GE, typeOfSmallint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     * @param typeOfSmallint The value of typeOfSmallint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfSmallint_LessEqual(Integer typeOfSmallint) {
        regTypeOfSmallint(CK_LE, typeOfSmallint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     * @param minNumber The min number of typeOfSmallint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfSmallint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfSmallint_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfSmallint_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     * @param minNumber The min number of typeOfSmallint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfSmallint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfSmallint_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfSmallint(), "TYPE_OF_SMALLINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     * @param typeOfSmallintList The collection of typeOfSmallint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfSmallint_InScope(Collection<Integer> typeOfSmallintList) {
        doSetTypeOfSmallint_InScope(typeOfSmallintList);
    }

    protected void doSetTypeOfSmallint_InScope(Collection<Integer> typeOfSmallintList) {
        regINS(CK_INS, cTL(typeOfSmallintList), xgetCValueTypeOfSmallint(), "TYPE_OF_SMALLINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     * @param typeOfSmallintList The collection of typeOfSmallint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfSmallint_NotInScope(Collection<Integer> typeOfSmallintList) {
        doSetTypeOfSmallint_NotInScope(typeOfSmallintList);
    }

    protected void doSetTypeOfSmallint_NotInScope(Collection<Integer> typeOfSmallintList) {
        regINS(CK_NINS, cTL(typeOfSmallintList), xgetCValueTypeOfSmallint(), "TYPE_OF_SMALLINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     */
    public void setTypeOfSmallint_IsNull() { regTypeOfSmallint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     */
    public void setTypeOfSmallint_IsNotNull() { regTypeOfSmallint(CK_ISNN, DOBJ); }

    protected void regTypeOfSmallint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfSmallint(), "TYPE_OF_SMALLINT"); }
    protected abstract ConditionValue xgetCValueTypeOfSmallint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_Equal(Integer typeOfInteger) {
        doSetTypeOfInteger_Equal(typeOfInteger);
    }

    protected void doSetTypeOfInteger_Equal(Integer typeOfInteger) {
        regTypeOfInteger(CK_EQ, typeOfInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_NotEqual(Integer typeOfInteger) {
        doSetTypeOfInteger_NotEqual(typeOfInteger);
    }

    protected void doSetTypeOfInteger_NotEqual(Integer typeOfInteger) {
        regTypeOfInteger(CK_NES, typeOfInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_GreaterThan(Integer typeOfInteger) {
        regTypeOfInteger(CK_GT, typeOfInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_LessThan(Integer typeOfInteger) {
        regTypeOfInteger(CK_LT, typeOfInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_GreaterEqual(Integer typeOfInteger) {
        regTypeOfInteger(CK_GE, typeOfInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_LessEqual(Integer typeOfInteger) {
        regTypeOfInteger(CK_LE, typeOfInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param minNumber The min number of typeOfInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param minNumber The min number of typeOfInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfInteger(), "TYPE_OF_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfIntegerList The collection of typeOfInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfInteger_InScope(Collection<Integer> typeOfIntegerList) {
        doSetTypeOfInteger_InScope(typeOfIntegerList);
    }

    protected void doSetTypeOfInteger_InScope(Collection<Integer> typeOfIntegerList) {
        regINS(CK_INS, cTL(typeOfIntegerList), xgetCValueTypeOfInteger(), "TYPE_OF_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfIntegerList The collection of typeOfInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfInteger_NotInScope(Collection<Integer> typeOfIntegerList) {
        doSetTypeOfInteger_NotInScope(typeOfIntegerList);
    }

    protected void doSetTypeOfInteger_NotInScope(Collection<Integer> typeOfIntegerList) {
        regINS(CK_NINS, cTL(typeOfIntegerList), xgetCValueTypeOfInteger(), "TYPE_OF_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INTEGER(10)}
     */
    public void setTypeOfInteger_IsNull() { regTypeOfInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INTEGER(10)}
     */
    public void setTypeOfInteger_IsNotNull() { regTypeOfInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfInteger(), "TYPE_OF_INTEGER"); }
    protected abstract ConditionValue xgetCValueTypeOfInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_Equal(Long typeOfBigint) {
        doSetTypeOfBigint_Equal(typeOfBigint);
    }

    protected void doSetTypeOfBigint_Equal(Long typeOfBigint) {
        regTypeOfBigint(CK_EQ, typeOfBigint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_NotEqual(Long typeOfBigint) {
        doSetTypeOfBigint_NotEqual(typeOfBigint);
    }

    protected void doSetTypeOfBigint_NotEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_NES, typeOfBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_GreaterThan(Long typeOfBigint) {
        regTypeOfBigint(CK_GT, typeOfBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_LessThan(Long typeOfBigint) {
        regTypeOfBigint(CK_LT, typeOfBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_GreaterEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_GE, typeOfBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_LessEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_LE, typeOfBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param minNumber The min number of typeOfBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfBigint_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfBigint_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param minNumber The min number of typeOfBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfBigint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfBigint(), "TYPE_OF_BIGINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigintList The collection of typeOfBigint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfBigint_InScope(Collection<Long> typeOfBigintList) {
        doSetTypeOfBigint_InScope(typeOfBigintList);
    }

    protected void doSetTypeOfBigint_InScope(Collection<Long> typeOfBigintList) {
        regINS(CK_INS, cTL(typeOfBigintList), xgetCValueTypeOfBigint(), "TYPE_OF_BIGINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigintList The collection of typeOfBigint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfBigint_NotInScope(Collection<Long> typeOfBigintList) {
        doSetTypeOfBigint_NotInScope(typeOfBigintList);
    }

    protected void doSetTypeOfBigint_NotInScope(Collection<Long> typeOfBigintList) {
        regINS(CK_NINS, cTL(typeOfBigintList), xgetCValueTypeOfBigint(), "TYPE_OF_BIGINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     */
    public void setTypeOfBigint_IsNull() { regTypeOfBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     */
    public void setTypeOfBigint_IsNotNull() { regTypeOfBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfBigint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBigint(), "TYPE_OF_BIGINT"); }
    protected abstract ConditionValue xgetCValueTypeOfBigint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {DOUBLE(53)}
     * @param typeOfFloat The value of typeOfFloat as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfFloat_Equal(java.math.BigDecimal typeOfFloat) {
        doSetTypeOfFloat_Equal(typeOfFloat);
    }

    protected void doSetTypeOfFloat_Equal(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_EQ, typeOfFloat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {DOUBLE(53)}
     * @param typeOfFloat The value of typeOfFloat as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfFloat_NotEqual(java.math.BigDecimal typeOfFloat) {
        doSetTypeOfFloat_NotEqual(typeOfFloat);
    }

    protected void doSetTypeOfFloat_NotEqual(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_NES, typeOfFloat);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {DOUBLE(53)}
     * @param typeOfFloat The value of typeOfFloat as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfFloat_GreaterThan(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_GT, typeOfFloat);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {DOUBLE(53)}
     * @param typeOfFloat The value of typeOfFloat as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfFloat_LessThan(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_LT, typeOfFloat);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {DOUBLE(53)}
     * @param typeOfFloat The value of typeOfFloat as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfFloat_GreaterEqual(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_GE, typeOfFloat);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {DOUBLE(53)}
     * @param typeOfFloat The value of typeOfFloat as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfFloat_LessEqual(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_LE, typeOfFloat);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {DOUBLE(53)}
     * @param minNumber The min number of typeOfFloat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfFloat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfFloat_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfFloat_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {DOUBLE(53)}
     * @param minNumber The min number of typeOfFloat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfFloat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfFloat_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfFloat(), "TYPE_OF_FLOAT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_FLOAT: {DOUBLE(53)}
     * @param typeOfFloatList The collection of typeOfFloat as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfFloat_InScope(Collection<java.math.BigDecimal> typeOfFloatList) {
        doSetTypeOfFloat_InScope(typeOfFloatList);
    }

    protected void doSetTypeOfFloat_InScope(Collection<java.math.BigDecimal> typeOfFloatList) {
        regINS(CK_INS, cTL(typeOfFloatList), xgetCValueTypeOfFloat(), "TYPE_OF_FLOAT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_FLOAT: {DOUBLE(53)}
     * @param typeOfFloatList The collection of typeOfFloat as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfFloat_NotInScope(Collection<java.math.BigDecimal> typeOfFloatList) {
        doSetTypeOfFloat_NotInScope(typeOfFloatList);
    }

    protected void doSetTypeOfFloat_NotInScope(Collection<java.math.BigDecimal> typeOfFloatList) {
        regINS(CK_NINS, cTL(typeOfFloatList), xgetCValueTypeOfFloat(), "TYPE_OF_FLOAT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {DOUBLE(53)}
     */
    public void setTypeOfFloat_IsNull() { regTypeOfFloat(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {DOUBLE(53)}
     */
    public void setTypeOfFloat_IsNotNull() { regTypeOfFloat(CK_ISNN, DOBJ); }

    protected void regTypeOfFloat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfFloat(), "TYPE_OF_FLOAT"); }
    protected abstract ConditionValue xgetCValueTypeOfFloat();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     * @param typeOfDouble The value of typeOfDouble as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDouble_Equal(java.math.BigDecimal typeOfDouble) {
        doSetTypeOfDouble_Equal(typeOfDouble);
    }

    protected void doSetTypeOfDouble_Equal(java.math.BigDecimal typeOfDouble) {
        regTypeOfDouble(CK_EQ, typeOfDouble);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     * @param typeOfDouble The value of typeOfDouble as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDouble_NotEqual(java.math.BigDecimal typeOfDouble) {
        doSetTypeOfDouble_NotEqual(typeOfDouble);
    }

    protected void doSetTypeOfDouble_NotEqual(java.math.BigDecimal typeOfDouble) {
        regTypeOfDouble(CK_NES, typeOfDouble);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     * @param typeOfDouble The value of typeOfDouble as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDouble_GreaterThan(java.math.BigDecimal typeOfDouble) {
        regTypeOfDouble(CK_GT, typeOfDouble);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     * @param typeOfDouble The value of typeOfDouble as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDouble_LessThan(java.math.BigDecimal typeOfDouble) {
        regTypeOfDouble(CK_LT, typeOfDouble);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     * @param typeOfDouble The value of typeOfDouble as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDouble_GreaterEqual(java.math.BigDecimal typeOfDouble) {
        regTypeOfDouble(CK_GE, typeOfDouble);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     * @param typeOfDouble The value of typeOfDouble as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDouble_LessEqual(java.math.BigDecimal typeOfDouble) {
        regTypeOfDouble(CK_LE, typeOfDouble);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     * @param minNumber The min number of typeOfDouble. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfDouble. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfDouble_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfDouble_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     * @param minNumber The min number of typeOfDouble. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfDouble. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfDouble_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfDouble(), "TYPE_OF_DOUBLE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     * @param typeOfDoubleList The collection of typeOfDouble as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfDouble_InScope(Collection<java.math.BigDecimal> typeOfDoubleList) {
        doSetTypeOfDouble_InScope(typeOfDoubleList);
    }

    protected void doSetTypeOfDouble_InScope(Collection<java.math.BigDecimal> typeOfDoubleList) {
        regINS(CK_INS, cTL(typeOfDoubleList), xgetCValueTypeOfDouble(), "TYPE_OF_DOUBLE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     * @param typeOfDoubleList The collection of typeOfDouble as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfDouble_NotInScope(Collection<java.math.BigDecimal> typeOfDoubleList) {
        doSetTypeOfDouble_NotInScope(typeOfDoubleList);
    }

    protected void doSetTypeOfDouble_NotInScope(Collection<java.math.BigDecimal> typeOfDoubleList) {
        regINS(CK_NINS, cTL(typeOfDoubleList), xgetCValueTypeOfDouble(), "TYPE_OF_DOUBLE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     */
    public void setTypeOfDouble_IsNull() { regTypeOfDouble(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     */
    public void setTypeOfDouble_IsNotNull() { regTypeOfDouble(CK_ISNN, DOBJ); }

    protected void regTypeOfDouble(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfDouble(), "TYPE_OF_DOUBLE"); }
    protected abstract ConditionValue xgetCValueTypeOfDouble();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_REAL: {REAL(24)}
     * @param typeOfReal The value of typeOfReal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfReal_Equal(java.math.BigDecimal typeOfReal) {
        doSetTypeOfReal_Equal(typeOfReal);
    }

    protected void doSetTypeOfReal_Equal(java.math.BigDecimal typeOfReal) {
        regTypeOfReal(CK_EQ, typeOfReal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_REAL: {REAL(24)}
     * @param typeOfReal The value of typeOfReal as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfReal_NotEqual(java.math.BigDecimal typeOfReal) {
        doSetTypeOfReal_NotEqual(typeOfReal);
    }

    protected void doSetTypeOfReal_NotEqual(java.math.BigDecimal typeOfReal) {
        regTypeOfReal(CK_NES, typeOfReal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_REAL: {REAL(24)}
     * @param typeOfReal The value of typeOfReal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfReal_GreaterThan(java.math.BigDecimal typeOfReal) {
        regTypeOfReal(CK_GT, typeOfReal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_REAL: {REAL(24)}
     * @param typeOfReal The value of typeOfReal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfReal_LessThan(java.math.BigDecimal typeOfReal) {
        regTypeOfReal(CK_LT, typeOfReal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_REAL: {REAL(24)}
     * @param typeOfReal The value of typeOfReal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfReal_GreaterEqual(java.math.BigDecimal typeOfReal) {
        regTypeOfReal(CK_GE, typeOfReal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_REAL: {REAL(24)}
     * @param typeOfReal The value of typeOfReal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfReal_LessEqual(java.math.BigDecimal typeOfReal) {
        regTypeOfReal(CK_LE, typeOfReal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_REAL: {REAL(24)}
     * @param minNumber The min number of typeOfReal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfReal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfReal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfReal_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_REAL: {REAL(24)}
     * @param minNumber The min number of typeOfReal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfReal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfReal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfReal(), "TYPE_OF_REAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_REAL: {REAL(24)}
     * @param typeOfRealList The collection of typeOfReal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfReal_InScope(Collection<java.math.BigDecimal> typeOfRealList) {
        doSetTypeOfReal_InScope(typeOfRealList);
    }

    protected void doSetTypeOfReal_InScope(Collection<java.math.BigDecimal> typeOfRealList) {
        regINS(CK_INS, cTL(typeOfRealList), xgetCValueTypeOfReal(), "TYPE_OF_REAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_REAL: {REAL(24)}
     * @param typeOfRealList The collection of typeOfReal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfReal_NotInScope(Collection<java.math.BigDecimal> typeOfRealList) {
        doSetTypeOfReal_NotInScope(typeOfRealList);
    }

    protected void doSetTypeOfReal_NotInScope(Collection<java.math.BigDecimal> typeOfRealList) {
        regINS(CK_NINS, cTL(typeOfRealList), xgetCValueTypeOfReal(), "TYPE_OF_REAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_REAL: {REAL(24)}
     */
    public void setTypeOfReal_IsNull() { regTypeOfReal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_REAL: {REAL(24)}
     */
    public void setTypeOfReal_IsNotNull() { regTypeOfReal(CK_ISNN, DOBJ); }

    protected void regTypeOfReal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfReal(), "TYPE_OF_REAL"); }
    protected abstract ConditionValue xgetCValueTypeOfReal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDate The value of typeOfDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_Equal(java.util.Date typeOfDate) {
        regTypeOfDate(CK_EQ,  fCTPD(typeOfDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDate The value of typeOfDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_GreaterThan(java.util.Date typeOfDate) {
        regTypeOfDate(CK_GT,  fCTPD(typeOfDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDate The value of typeOfDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_LessThan(java.util.Date typeOfDate) {
        regTypeOfDate(CK_LT,  fCTPD(typeOfDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDate The value of typeOfDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_GreaterEqual(java.util.Date typeOfDate) {
        regTypeOfDate(CK_GE,  fCTPD(typeOfDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDate The value of typeOfDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_LessEqual(java.util.Date typeOfDate) {
        regTypeOfDate(CK_LE, fCTPD(typeOfDate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * <pre>e.g. setTypeOfDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTypeOfDate_FromTo(Date fromDatetime, Date toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTypeOfDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * <pre>e.g. setTypeOfDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), xgetCValueTypeOfDate(), "TYPE_OF_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfDate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setTypeOfDate_DateFromTo(Date fromDate, Date toDate) {
        setTypeOfDate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     */
    public void setTypeOfDate_IsNull() { regTypeOfDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     */
    public void setTypeOfDate_IsNotNull() { regTypeOfDate(CK_ISNN, DOBJ); }

    protected void regTypeOfDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfDate(), "TYPE_OF_DATE"); }
    protected abstract ConditionValue xgetCValueTypeOfDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTime The value of typeOfTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTime_Equal(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_EQ,  typeOfTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTime The value of typeOfTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTime_GreaterThan(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_GT,  typeOfTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTime The value of typeOfTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTime_LessThan(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_LT,  typeOfTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTime The value of typeOfTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTime_GreaterEqual(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_GE,  typeOfTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTime The value of typeOfTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTime_LessEqual(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_LE, typeOfTime);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TIME: {TIME(8)}
     */
    public void setTypeOfTime_IsNull() { regTypeOfTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TIME: {TIME(8)}
     */
    public void setTypeOfTime_IsNotNull() { regTypeOfTime(CK_ISNN, DOBJ); }

    protected void regTypeOfTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfTime(), "TYPE_OF_TIME"); }
    protected abstract ConditionValue xgetCValueTypeOfTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_Equal(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_EQ,  typeOfTimestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_GreaterThan(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_GT,  typeOfTimestamp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_LessThan(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_LT,  typeOfTimestamp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_GreaterEqual(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_GE,  typeOfTimestamp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_LessEqual(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_LE, typeOfTimestamp);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * <pre>e.g. setTypeOfTimestamp_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTypeOfTimestamp_FromTo(Date fromDatetime, Date toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTypeOfTimestamp_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * <pre>e.g. setTypeOfTimestamp_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfTimestamp_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueTypeOfTimestamp(), "TYPE_OF_TIMESTAMP", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfTimestamp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfTimestamp. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setTypeOfTimestamp_DateFromTo(Date fromDate, Date toDate) {
        setTypeOfTimestamp_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     */
    public void setTypeOfTimestamp_IsNull() { regTypeOfTimestamp(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     */
    public void setTypeOfTimestamp_IsNotNull() { regTypeOfTimestamp(CK_ISNN, DOBJ); }

    protected void regTypeOfTimestamp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfTimestamp(), "TYPE_OF_TIMESTAMP"); }
    protected abstract ConditionValue xgetCValueTypeOfTimestamp();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BLOB: {BLOB(1048576)}
     */
    public void setTypeOfBlob_IsNull() { regTypeOfBlob(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BLOB: {BLOB(1048576)}
     */
    public void setTypeOfBlob_IsNotNull() { regTypeOfBlob(CK_ISNN, DOBJ); }

    protected void regTypeOfBlob(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBlob(), "TYPE_OF_BLOB"); }
    protected abstract ConditionValue xgetCValueTypeOfBlob();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)}
     * @param typeOfGraphic The value of typeOfGraphic as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfGraphic_Equal(String typeOfGraphic) {
        doSetTypeOfGraphic_Equal(fRES(typeOfGraphic));
    }

    protected void doSetTypeOfGraphic_Equal(String typeOfGraphic) {
        regTypeOfGraphic(CK_EQ, typeOfGraphic);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)}
     * @param typeOfGraphic The value of typeOfGraphic as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfGraphic_NotEqual(String typeOfGraphic) {
        doSetTypeOfGraphic_NotEqual(fRES(typeOfGraphic));
    }

    protected void doSetTypeOfGraphic_NotEqual(String typeOfGraphic) {
        regTypeOfGraphic(CK_NES, typeOfGraphic);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)}
     * @param typeOfGraphicList The collection of typeOfGraphic as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfGraphic_InScope(Collection<String> typeOfGraphicList) {
        doSetTypeOfGraphic_InScope(typeOfGraphicList);
    }

    protected void doSetTypeOfGraphic_InScope(Collection<String> typeOfGraphicList) {
        regINS(CK_INS, cTL(typeOfGraphicList), xgetCValueTypeOfGraphic(), "TYPE_OF_GRAPHIC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)}
     * @param typeOfGraphicList The collection of typeOfGraphic as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfGraphic_NotInScope(Collection<String> typeOfGraphicList) {
        doSetTypeOfGraphic_NotInScope(typeOfGraphicList);
    }

    protected void doSetTypeOfGraphic_NotInScope(Collection<String> typeOfGraphicList) {
        regINS(CK_NINS, cTL(typeOfGraphicList), xgetCValueTypeOfGraphic(), "TYPE_OF_GRAPHIC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)} <br>
     * <pre>e.g. setTypeOfGraphic_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfGraphic The value of typeOfGraphic as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfGraphic_LikeSearch(String typeOfGraphic, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfGraphic_LikeSearch(typeOfGraphic, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)} <br>
     * <pre>e.g. setTypeOfGraphic_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfGraphic The value of typeOfGraphic as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfGraphic_LikeSearch(String typeOfGraphic, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfGraphic), xgetCValueTypeOfGraphic(), "TYPE_OF_GRAPHIC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)}
     * @param typeOfGraphic The value of typeOfGraphic as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfGraphic_NotLikeSearch(String typeOfGraphic, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfGraphic_NotLikeSearch(typeOfGraphic, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)}
     * @param typeOfGraphic The value of typeOfGraphic as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfGraphic_NotLikeSearch(String typeOfGraphic, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfGraphic), xgetCValueTypeOfGraphic(), "TYPE_OF_GRAPHIC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)}
     * @param typeOfGraphic The value of typeOfGraphic as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfGraphic_PrefixSearch(String typeOfGraphic) {
        setTypeOfGraphic_LikeSearch(typeOfGraphic, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)}
     */
    public void setTypeOfGraphic_IsNull() { regTypeOfGraphic(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)}
     */
    public void setTypeOfGraphic_IsNullOrEmpty() { regTypeOfGraphic(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)}
     */
    public void setTypeOfGraphic_IsNotNull() { regTypeOfGraphic(CK_ISNN, DOBJ); }

    protected void regTypeOfGraphic(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfGraphic(), "TYPE_OF_GRAPHIC"); }
    protected abstract ConditionValue xgetCValueTypeOfGraphic();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)}
     * @param typeOfVargraphic The value of typeOfVargraphic as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVargraphic_Equal(String typeOfVargraphic) {
        doSetTypeOfVargraphic_Equal(fRES(typeOfVargraphic));
    }

    protected void doSetTypeOfVargraphic_Equal(String typeOfVargraphic) {
        regTypeOfVargraphic(CK_EQ, typeOfVargraphic);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)}
     * @param typeOfVargraphic The value of typeOfVargraphic as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVargraphic_NotEqual(String typeOfVargraphic) {
        doSetTypeOfVargraphic_NotEqual(fRES(typeOfVargraphic));
    }

    protected void doSetTypeOfVargraphic_NotEqual(String typeOfVargraphic) {
        regTypeOfVargraphic(CK_NES, typeOfVargraphic);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)}
     * @param typeOfVargraphicList The collection of typeOfVargraphic as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVargraphic_InScope(Collection<String> typeOfVargraphicList) {
        doSetTypeOfVargraphic_InScope(typeOfVargraphicList);
    }

    protected void doSetTypeOfVargraphic_InScope(Collection<String> typeOfVargraphicList) {
        regINS(CK_INS, cTL(typeOfVargraphicList), xgetCValueTypeOfVargraphic(), "TYPE_OF_VARGRAPHIC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)}
     * @param typeOfVargraphicList The collection of typeOfVargraphic as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVargraphic_NotInScope(Collection<String> typeOfVargraphicList) {
        doSetTypeOfVargraphic_NotInScope(typeOfVargraphicList);
    }

    protected void doSetTypeOfVargraphic_NotInScope(Collection<String> typeOfVargraphicList) {
        regINS(CK_NINS, cTL(typeOfVargraphicList), xgetCValueTypeOfVargraphic(), "TYPE_OF_VARGRAPHIC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)} <br>
     * <pre>e.g. setTypeOfVargraphic_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfVargraphic The value of typeOfVargraphic as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfVargraphic_LikeSearch(String typeOfVargraphic, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfVargraphic_LikeSearch(typeOfVargraphic, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)} <br>
     * <pre>e.g. setTypeOfVargraphic_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfVargraphic The value of typeOfVargraphic as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfVargraphic_LikeSearch(String typeOfVargraphic, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfVargraphic), xgetCValueTypeOfVargraphic(), "TYPE_OF_VARGRAPHIC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)}
     * @param typeOfVargraphic The value of typeOfVargraphic as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfVargraphic_NotLikeSearch(String typeOfVargraphic, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfVargraphic_NotLikeSearch(typeOfVargraphic, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)}
     * @param typeOfVargraphic The value of typeOfVargraphic as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfVargraphic_NotLikeSearch(String typeOfVargraphic, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfVargraphic), xgetCValueTypeOfVargraphic(), "TYPE_OF_VARGRAPHIC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)}
     * @param typeOfVargraphic The value of typeOfVargraphic as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVargraphic_PrefixSearch(String typeOfVargraphic) {
        setTypeOfVargraphic_LikeSearch(typeOfVargraphic, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)}
     */
    public void setTypeOfVargraphic_IsNull() { regTypeOfVargraphic(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)}
     */
    public void setTypeOfVargraphic_IsNullOrEmpty() { regTypeOfVargraphic(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)}
     */
    public void setTypeOfVargraphic_IsNotNull() { regTypeOfVargraphic(CK_ISNN, DOBJ); }

    protected void regTypeOfVargraphic(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfVargraphic(), "TYPE_OF_VARGRAPHIC"); }
    protected abstract ConditionValue xgetCValueTypeOfVargraphic();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)}
     * @param typeOfLongVargraphic The value of typeOfLongVargraphic as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfLongVargraphic_Equal(String typeOfLongVargraphic) {
        doSetTypeOfLongVargraphic_Equal(fRES(typeOfLongVargraphic));
    }

    protected void doSetTypeOfLongVargraphic_Equal(String typeOfLongVargraphic) {
        regTypeOfLongVargraphic(CK_EQ, typeOfLongVargraphic);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)}
     * @param typeOfLongVargraphic The value of typeOfLongVargraphic as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfLongVargraphic_NotEqual(String typeOfLongVargraphic) {
        doSetTypeOfLongVargraphic_NotEqual(fRES(typeOfLongVargraphic));
    }

    protected void doSetTypeOfLongVargraphic_NotEqual(String typeOfLongVargraphic) {
        regTypeOfLongVargraphic(CK_NES, typeOfLongVargraphic);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)}
     * @param typeOfLongVargraphicList The collection of typeOfLongVargraphic as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfLongVargraphic_InScope(Collection<String> typeOfLongVargraphicList) {
        doSetTypeOfLongVargraphic_InScope(typeOfLongVargraphicList);
    }

    protected void doSetTypeOfLongVargraphic_InScope(Collection<String> typeOfLongVargraphicList) {
        regINS(CK_INS, cTL(typeOfLongVargraphicList), xgetCValueTypeOfLongVargraphic(), "TYPE_OF_LONG_VARGRAPHIC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)}
     * @param typeOfLongVargraphicList The collection of typeOfLongVargraphic as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfLongVargraphic_NotInScope(Collection<String> typeOfLongVargraphicList) {
        doSetTypeOfLongVargraphic_NotInScope(typeOfLongVargraphicList);
    }

    protected void doSetTypeOfLongVargraphic_NotInScope(Collection<String> typeOfLongVargraphicList) {
        regINS(CK_NINS, cTL(typeOfLongVargraphicList), xgetCValueTypeOfLongVargraphic(), "TYPE_OF_LONG_VARGRAPHIC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)} <br>
     * <pre>e.g. setTypeOfLongVargraphic_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfLongVargraphic The value of typeOfLongVargraphic as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfLongVargraphic_LikeSearch(String typeOfLongVargraphic, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfLongVargraphic_LikeSearch(typeOfLongVargraphic, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)} <br>
     * <pre>e.g. setTypeOfLongVargraphic_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfLongVargraphic The value of typeOfLongVargraphic as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfLongVargraphic_LikeSearch(String typeOfLongVargraphic, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfLongVargraphic), xgetCValueTypeOfLongVargraphic(), "TYPE_OF_LONG_VARGRAPHIC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)}
     * @param typeOfLongVargraphic The value of typeOfLongVargraphic as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfLongVargraphic_NotLikeSearch(String typeOfLongVargraphic, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfLongVargraphic_NotLikeSearch(typeOfLongVargraphic, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)}
     * @param typeOfLongVargraphic The value of typeOfLongVargraphic as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfLongVargraphic_NotLikeSearch(String typeOfLongVargraphic, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfLongVargraphic), xgetCValueTypeOfLongVargraphic(), "TYPE_OF_LONG_VARGRAPHIC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)}
     * @param typeOfLongVargraphic The value of typeOfLongVargraphic as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfLongVargraphic_PrefixSearch(String typeOfLongVargraphic) {
        setTypeOfLongVargraphic_LikeSearch(typeOfLongVargraphic, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)}
     */
    public void setTypeOfLongVargraphic_IsNull() { regTypeOfLongVargraphic(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)}
     */
    public void setTypeOfLongVargraphic_IsNullOrEmpty() { regTypeOfLongVargraphic(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)}
     */
    public void setTypeOfLongVargraphic_IsNotNull() { regTypeOfLongVargraphic(CK_ISNN, DOBJ); }

    protected void regTypeOfLongVargraphic(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfLongVargraphic(), "TYPE_OF_LONG_VARGRAPHIC"); }
    protected abstract ConditionValue xgetCValueTypeOfLongVargraphic();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, VendorCheckCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(VendorCheckCQ sq);

    protected VendorCheckCB xcreateScalarConditionCB() {
        VendorCheckCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorCheckCB xcreateScalarConditionPartitionByCB() {
        VendorCheckCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorCheckCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "VENDOR_CHECK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorCheckCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorCheckCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorCheckCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "VENDOR_CHECK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorCheckCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorCheckCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorCheckCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    /**
     * Order along manual ordering information.
     * <pre>
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param option The option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOption option) { // is user public!
        xdoWithManualOrder(option);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected VendorCheckCB newMyCB() {
        return new VendorCheckCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VendorCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

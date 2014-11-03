package org.docksidestage.db2.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.ProcedurePmb;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.db2.dbflute.allcommon.*;
import org.docksidestage.db2.dbflute.exentity.customize.*;

/**
 * The base class for procedure parameter-bean of SpReturnResultSetWith. <br>
 * This is related to "<span style="color: #AD4747">DFEXDB.SP_RETURN_RESULT_SET_WITH</span>".
 * @author DBFlute(AutoGenerator)
 */
public class BsSpReturnResultSetWithPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String VInChar_PROCEDURE_PARAMETER = "in, 0";
    public static final String notParamResult1_PROCEDURE_PARAMETER = "notParamResult, 1000";
    public static final String notParamResult2_PROCEDURE_PARAMETER = "notParamResult, 1001";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of VInChar: {CHAR(3) as In}. */
    protected String _vInChar;

    /** The parameter of notParamResult1. */
    protected List<SpReturnResultSetWithNotParamResult1> _notParamResult1;

    /** The parameter of notParamResult2. */
    protected List<SpReturnResultSetWithNotParamResult2> _notParamResult2;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpReturnResultSetWith. <br>
     * This is related to "<span style="color: #AD4747">DFEXDB.SP_RETURN_RESULT_SET_WITH</span>".
     */
    public BsSpReturnResultSetWithPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() { return "DFEXDB.SP_RETURN_RESULT_SET_WITH"; }

    /**
     * {@inheritDoc}
     */
     public boolean isEscapeStatement() { return true; } // as default

    /**
     * {@inheritDoc}
     */
     public boolean isCalledBySelect() { return false; } // resolved by generator

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                String
    //                                                ------
    protected String filterStringParameter(String value) { return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value); }
    protected boolean isEmptyStringParameterAllowed() { return DBFluteConfig.getInstance().isEmptyStringParameterAllowed(); }
    protected String convertEmptyToNull(String value) { return PmbCustodial.convertEmptyToNull(value); }
    
    // -----------------------------------------------------
    //                                                  Date
    //                                                  ----
    protected Date toUtilDate(Object date) { return PmbCustodial.toUtilDate(date, _timeZone); }

    // -----------------------------------------------------
    //                                    by Option Handling
    //                                    ------------------
    // might be called by option handling
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { return PmbCustodial.toNumber(obj, type); }
    protected Boolean toBoolean(Object obj) { return PmbCustodial.toBoolean(obj); }
    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { return PmbCustodial.newArrayList(elements); }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected String xbuildColumnString() {
        final String dm = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_vInChar);
        sb.append(dm).append(_notParamResult1);
        sb.append(dm).append(_notParamResult2);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VInChar: {CHAR(3) as In} <br>
     * @return The value of VInChar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInChar() {
        return filterStringParameter(_vInChar);
    }

    /**
     * [set] VInChar: {CHAR(3) as In} <br>
     * @param vInChar The value of VInChar. (NullAllowed)
     */
    public void setVInChar(String vInChar) {
        _vInChar = vInChar;
    }

    /**
     * [get] notParamResult1 <br>
     * @return The value of notParamResult1. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public List<SpReturnResultSetWithNotParamResult1> getNotParamResult1() {
        return _notParamResult1;
    }

    /**
     * [set] notParamResult1 <br>
     * @param notParamResult1 The value of notParamResult1. (NullAllowed)
     */
    public void setNotParamResult1(List<SpReturnResultSetWithNotParamResult1> notParamResult1) {
        _notParamResult1 = notParamResult1;
    }

    /**
     * [get] notParamResult2 <br>
     * @return The value of notParamResult2. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public List<SpReturnResultSetWithNotParamResult2> getNotParamResult2() {
        return _notParamResult2;
    }

    /**
     * [set] notParamResult2 <br>
     * @param notParamResult2 The value of notParamResult2. (NullAllowed)
     */
    public void setNotParamResult2(List<SpReturnResultSetWithNotParamResult2> notParamResult2) {
        _notParamResult2 = notParamResult2;
    }
}

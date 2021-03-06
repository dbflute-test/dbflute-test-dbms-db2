package org.docksidestage.db2.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.ProcedurePmb;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.db2.dbflute.allcommon.*;
import org.docksidestage.db2.dbflute.exentity.customize.*;

/**
 * The base class for procedure parameter-bean of SpReturnResultSetMore. <br>
 * This is related to "<span style="color: #AD4747">DFEXDB.SP_RETURN_RESULT_SET_MORE</span>".
 * @author DBFlute(AutoGenerator)
 */
public class BsSpReturnResultSetMorePmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String notParamResult1_PROCEDURE_PARAMETER = "notParamResult, 1000";
    public static final String notParamResult2_PROCEDURE_PARAMETER = "notParamResult, 1001";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of notParamResult1. */
    protected List<SpReturnResultSetMoreNotParamResult1> _notParamResult1;

    /** The parameter of notParamResult2. */
    protected List<SpReturnResultSetMoreNotParamResult2> _notParamResult2;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpReturnResultSetMore. <br>
     * This is related to "<span style="color: #AD4747">DFEXDB.SP_RETURN_RESULT_SET_MORE</span>".
     */
    public BsSpReturnResultSetMorePmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() { return "DFEXDB.SP_RETURN_RESULT_SET_MORE"; }

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
     * [get] notParamResult1 <br>
     * @return The value of notParamResult1. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public List<SpReturnResultSetMoreNotParamResult1> getNotParamResult1() {
        return _notParamResult1;
    }

    /**
     * [set] notParamResult1 <br>
     * @param notParamResult1 The value of notParamResult1. (NullAllowed)
     */
    public void setNotParamResult1(List<SpReturnResultSetMoreNotParamResult1> notParamResult1) {
        _notParamResult1 = notParamResult1;
    }

    /**
     * [get] notParamResult2 <br>
     * @return The value of notParamResult2. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public List<SpReturnResultSetMoreNotParamResult2> getNotParamResult2() {
        return _notParamResult2;
    }

    /**
     * [set] notParamResult2 <br>
     * @param notParamResult2 The value of notParamResult2. (NullAllowed)
     */
    public void setNotParamResult2(List<SpReturnResultSetMoreNotParamResult2> notParamResult2) {
        _notParamResult2 = notParamResult2;
    }
}

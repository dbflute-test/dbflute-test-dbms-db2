package org.docksidestage.db2.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.db2.dbflute.allcommon.*;
import org.docksidestage.db2.dbflute.exentity.*;

/**
 * The DB meta of ALIAS_MEMBER_LOGIN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class AliasMemberLoginDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final AliasMemberLoginDbm _instance = new AliasMemberLoginDbm();
    private AliasMemberLoginDbm() {}
    public static AliasMemberLoginDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((AliasMemberLogin)et).getMemberLoginId(), (et, vl) -> ((AliasMemberLogin)et).setMemberLoginId(ctl(vl)), "memberLoginId");
        setupEpg(_epgMap, et -> ((AliasMemberLogin)et).getMemberId(), (et, vl) -> ((AliasMemberLogin)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((AliasMemberLogin)et).getLoginDatetime(), (et, vl) -> ((AliasMemberLogin)et).setLoginDatetime(cttp(vl)), "loginDatetime");
        setupEpg(_epgMap, et -> ((AliasMemberLogin)et).getMobileLoginFlg(), (et, vl) -> {
            CDef.Flg cls = (CDef.Flg)gcls(et, columnMobileLoginFlg(), vl);
            if (cls != null) {
                ((AliasMemberLogin)et).setMobileLoginFlgAsFlg(cls);
            } else {
                ((AliasMemberLogin)et).mynativeMappingMobileLoginFlg(ctn(vl, Integer.class));
            }
        }, "mobileLoginFlg");
        setupEpg(_epgMap, et -> ((AliasMemberLogin)et).getLoginMemberStatusCode(), (et, vl) -> {
            CDef.MemberStatus cls = (CDef.MemberStatus)gcls(et, columnLoginMemberStatusCode(), vl);
            if (cls != null) {
                ((AliasMemberLogin)et).setLoginMemberStatusCodeAsMemberStatus(cls);
            } else {
                ((AliasMemberLogin)et).mynativeMappingLoginMemberStatusCode((String)vl);
            }
        }, "loginMemberStatusCode");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((AliasMemberLogin)et).getMemberStatus(), (et, vl) -> ((AliasMemberLogin)et).setMemberStatus((MemberStatus)vl), "memberStatus");
        setupEfpg(_efpgMap, et -> ((AliasMemberLogin)et).getAliasMember(), (et, vl) -> ((AliasMemberLogin)et).setAliasMember((AliasMember)vl), "aliasMember");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "ALIAS_MEMBER_LOGIN";
    protected final String _tableDispName = "ALIAS_MEMBER_LOGIN";
    protected final String _tablePropertyName = "aliasMemberLogin";
    protected final TableSqlName _tableSqlName = new TableSqlName("ALIAS_MEMBER_LOGIN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberLoginId = cci("MEMBER_LOGIN_ID", "MEMBER_LOGIN_ID", null, "会員ログインID", Long.class, "memberLoginId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", Integer.class, "memberId", null, false, false, true, "INTEGER", 10, 0, null, null, false, null, null, "aliasMember", null, null, false);
    protected final ColumnInfo _columnLoginDatetime = cci("LOGIN_DATETIME", "LOGIN_DATETIME", null, "ログイン日時", java.sql.Timestamp.class, "loginDatetime", null, false, false, true, "TIMESTAMP", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMobileLoginFlg = cci("MOBILE_LOGIN_FLG", "MOBILE_LOGIN_FLG", null, "モバイルログインフラグ", Integer.class, "mobileLoginFlg", null, false, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, null, CDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnLoginMemberStatusCode = cci("LOGIN_MEMBER_STATUS_CODE", "LOGIN_MEMBER_STATUS_CODE", null, "ログイン時会員ステータスコード", String.class, "loginMemberStatusCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus, false);

    /**
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberLoginId() { return _columnMemberLoginId; }
    /**
     * (会員ID)MEMBER_ID: {UQ+, NotNull, INTEGER(10), FK to ALIAS_MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginDatetime() { return _columnLoginDatetime; }
    /**
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMobileLoginFlg() { return _columnMobileLoginFlg; }
    /**
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginMemberStatusCode() { return _columnLoginMemberStatusCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberLoginId());
        ls.add(columnMemberId());
        ls.add(columnLoginDatetime());
        ls.add(columnMobileLoginFlg());
        ls.add(columnLoginMemberStatusCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberLoginId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnMemberId());
        ls.add(columnLoginDatetime());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLoginMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("FK_MEMBER_LOGIN_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "aliasMemberLoginList", false);
    }
    /**
     * ALIAS_MEMBER by my MEMBER_ID, named 'aliasMember'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignAliasMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), AliasMemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_LOGIN_MEMBER", "aliasMember", this, AliasMemberDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "aliasMemberLoginList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.db2.dbflute.exentity.AliasMemberLogin"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.db2.dbflute.cbean.AliasMemberLoginCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.db2.dbflute.exbhv.AliasMemberLoginBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<AliasMemberLogin> getEntityType() { return AliasMemberLogin.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public AliasMemberLogin newEntity() { return new AliasMemberLogin(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((AliasMemberLogin)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((AliasMemberLogin)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

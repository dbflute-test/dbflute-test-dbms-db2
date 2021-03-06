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
 * The DB meta of ALIAS_REF_EXCEPT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class AliasRefExceptDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final AliasRefExceptDbm _instance = new AliasRefExceptDbm();
    private AliasRefExceptDbm() {}
    public static AliasRefExceptDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((AliasRefExcept)et).getRefExceptId(), (et, vl) -> ((AliasRefExcept)et).setRefExceptId(ctl(vl)), "refExceptId");
        setupEpg(_epgMap, et -> ((AliasRefExcept)et).getExceptId(), (et, vl) -> ((AliasRefExcept)et).setExceptId(ctl(vl)), "exceptId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((AliasRefExcept)et).getAliasExcept(), (et, vl) -> ((AliasRefExcept)et).setAliasExcept((AliasExcept)vl), "aliasExcept");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "ALIAS_REF_EXCEPT";
    protected final String _tableDispName = "ALIAS_REF_EXCEPT";
    protected final String _tablePropertyName = "aliasRefExcept";
    protected final TableSqlName _tableSqlName = new TableSqlName("ALIAS_REF_EXCEPT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefExceptId = cci("REF_EXCEPT_ID", "REF_EXCEPT_ID", null, null, Long.class, "refExceptId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExceptId = cci("EXCEPT_ID", "EXCEPT_ID", null, null, Long.class, "exceptId", null, false, false, true, "DECIMAL", 16, 0, null, null, false, null, null, "aliasExcept", null, null, false);

    /**
     * REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefExceptId() { return _columnRefExceptId; }
    /**
     * EXCEPT_ID: {NotNull, DECIMAL(16), FK to ALIAS_EXCEPT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExceptId() { return _columnExceptId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefExceptId());
        ls.add(columnExceptId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRefExceptId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * ALIAS_EXCEPT by my EXCEPT_ID, named 'aliasExcept'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignAliasExcept() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnExceptId(), AliasExceptDbm.getInstance().columnExceptId());
        return cfi("FK_WHITE_REF_EXCEPT", "aliasExcept", this, AliasExceptDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "aliasRefExceptList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.db2.dbflute.exentity.AliasRefExcept"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.db2.dbflute.cbean.AliasRefExceptCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.db2.dbflute.exbhv.AliasRefExceptBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<AliasRefExcept> getEntityType() { return AliasRefExcept.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public AliasRefExcept newEntity() { return new AliasRefExcept(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((AliasRefExcept)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((AliasRefExcept)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

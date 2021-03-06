package org.docksidestage.db2.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.db2.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.db2.dbflute.exentity.*;

/**
 * The entity of ALIAS_EXCEPT as ALIAS. <br>
 * <pre>
 * [primary-key]
 *     EXCEPT_ID
 *
 * [column]
 *     EXCEPT_ID, EXCEPT_NAME
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
 *     
 *
 * [referrer table]
 *     ALIAS_REF_EXCEPT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     aliasRefExceptList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long exceptId = entity.getExceptId();
 * String exceptName = entity.getExceptName();
 * entity.setExceptId(exceptId);
 * entity.setExceptName(exceptName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAliasExcept extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** EXCEPT_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _exceptId;

    /** EXCEPT_NAME: {VARCHAR(256)} */
    protected String _exceptName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "ALIAS_EXCEPT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_exceptId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptList'. */
    protected List<AliasRefExcept> _aliasRefExceptList;

    /**
     * [get] ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptList'.
     * @return The entity list of referrer property 'aliasRefExceptList'. (NotNull: even if no loading, returns empty list)
     */
    public List<AliasRefExcept> getAliasRefExceptList() {
        if (_aliasRefExceptList == null) { _aliasRefExceptList = newReferrerList(); }
        return _aliasRefExceptList;
    }

    /**
     * [set] ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptList'.
     * @param aliasRefExceptList The entity list of referrer property 'aliasRefExceptList'. (NullAllowed)
     */
    public void setAliasRefExceptList(List<AliasRefExcept> aliasRefExceptList) {
        _aliasRefExceptList = aliasRefExceptList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsAliasExcept) {
            BsAliasExcept other = (BsAliasExcept)obj;
            if (!xSV(_exceptId, other._exceptId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _exceptId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_aliasRefExceptList != null) { for (AliasRefExcept et : _aliasRefExceptList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "aliasRefExceptList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_exceptId));
        sb.append(dm).append(xfND(_exceptName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_aliasRefExceptList != null && !_aliasRefExceptList.isEmpty())
        { sb.append(dm).append("aliasRefExceptList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public AliasExcept clone() {
        return (AliasExcept)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] EXCEPT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'EXCEPT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getExceptId() {
        checkSpecifiedProperty("exceptId");
        return _exceptId;
    }

    /**
     * [set] EXCEPT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param exceptId The value of the column 'EXCEPT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setExceptId(Long exceptId) {
        registerModifiedProperty("exceptId");
        _exceptId = exceptId;
    }

    /**
     * [get] EXCEPT_NAME: {VARCHAR(256)} <br>
     * @return The value of the column 'EXCEPT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getExceptName() {
        checkSpecifiedProperty("exceptName");
        return _exceptName;
    }

    /**
     * [set] EXCEPT_NAME: {VARCHAR(256)} <br>
     * @param exceptName The value of the column 'EXCEPT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExceptName(String exceptName) {
        registerModifiedProperty("exceptName");
        _exceptName = exceptName;
    }
}

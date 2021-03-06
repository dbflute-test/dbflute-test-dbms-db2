package org.docksidestage.db2.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.db2.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.db2.dbflute.exentity.*;

/**
 * The entity of ALIAS_REF_EXCEPT as ALIAS. <br>
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long refExceptId = entity.getRefExceptId();
 * Long exceptId = entity.getExceptId();
 * entity.setRefExceptId(refExceptId);
 * entity.setExceptId(exceptId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAliasRefExcept extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _refExceptId;

    /** EXCEPT_ID: {NotNull, DECIMAL(16), FK to ALIAS_EXCEPT} */
    protected Long _exceptId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "ALIAS_REF_EXCEPT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_refExceptId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** ALIAS_EXCEPT by my EXCEPT_ID, named 'aliasExcept'. */
    protected AliasExcept _aliasExcept;

    /**
     * [get] ALIAS_EXCEPT by my EXCEPT_ID, named 'aliasExcept'. <br>
     * @return The entity of foreign property 'aliasExcept'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public AliasExcept getAliasExcept() {
        return _aliasExcept;
    }

    /**
     * [set] ALIAS_EXCEPT by my EXCEPT_ID, named 'aliasExcept'.
     * @param aliasExcept The entity of foreign property 'aliasExcept'. (NullAllowed)
     */
    public void setAliasExcept(AliasExcept aliasExcept) {
        _aliasExcept = aliasExcept;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsAliasRefExcept) {
            BsAliasRefExcept other = (BsAliasRefExcept)obj;
            if (!xSV(_refExceptId, other._refExceptId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _refExceptId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_aliasExcept != null)
        { sb.append(li).append(xbRDS(_aliasExcept, "aliasExcept")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_refExceptId));
        sb.append(dm).append(xfND(_exceptId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_aliasExcept != null)
        { sb.append(dm).append("aliasExcept"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public AliasRefExcept clone() {
        return (AliasRefExcept)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'REF_EXCEPT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefExceptId() {
        checkSpecifiedProperty("refExceptId");
        return _refExceptId;
    }

    /**
     * [set] REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param refExceptId The value of the column 'REF_EXCEPT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefExceptId(Long refExceptId) {
        registerModifiedProperty("refExceptId");
        _refExceptId = refExceptId;
    }

    /**
     * [get] EXCEPT_ID: {NotNull, DECIMAL(16), FK to ALIAS_EXCEPT} <br>
     * @return The value of the column 'EXCEPT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getExceptId() {
        checkSpecifiedProperty("exceptId");
        return _exceptId;
    }

    /**
     * [set] EXCEPT_ID: {NotNull, DECIMAL(16), FK to ALIAS_EXCEPT} <br>
     * @param exceptId The value of the column 'EXCEPT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setExceptId(Long exceptId) {
        registerModifiedProperty("exceptId");
        _exceptId = exceptId;
    }
}

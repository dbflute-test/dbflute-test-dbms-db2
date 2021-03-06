package org.docksidestage.db2.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.db2.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.db2.dbflute.exentity.*;

/**
 * The entity of WHITE_TARGET as TABLE. <br>
 * <pre>
 * [primary-key]
 *     TARGET_ID
 *
 * [column]
 *     TARGET_ID, TARGET_NAME
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
 *     WHITE_REF_TARGET
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteRefTargetList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long targetId = entity.getTargetId();
 * String targetName = entity.getTargetName();
 * entity.setTargetId(targetId);
 * entity.setTargetName(targetName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteTarget extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TARGET_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _targetId;

    /** TARGET_NAME: {VARCHAR(256)} */
    protected String _targetName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_TARGET";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_targetId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetList'. */
    protected List<WhiteRefTarget> _whiteRefTargetList;

    /**
     * [get] WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetList'.
     * @return The entity list of referrer property 'whiteRefTargetList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteRefTarget> getWhiteRefTargetList() {
        if (_whiteRefTargetList == null) { _whiteRefTargetList = newReferrerList(); }
        return _whiteRefTargetList;
    }

    /**
     * [set] WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetList'.
     * @param whiteRefTargetList The entity list of referrer property 'whiteRefTargetList'. (NullAllowed)
     */
    public void setWhiteRefTargetList(List<WhiteRefTarget> whiteRefTargetList) {
        _whiteRefTargetList = whiteRefTargetList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteTarget) {
            BsWhiteTarget other = (BsWhiteTarget)obj;
            if (!xSV(_targetId, other._targetId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _targetId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteRefTargetList != null) { for (WhiteRefTarget et : _whiteRefTargetList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteRefTargetList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_targetId));
        sb.append(dm).append(xfND(_targetName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteRefTargetList != null && !_whiteRefTargetList.isEmpty())
        { sb.append(dm).append("whiteRefTargetList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteTarget clone() {
        return (WhiteTarget)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TARGET_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'TARGET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTargetId() {
        checkSpecifiedProperty("targetId");
        return _targetId;
    }

    /**
     * [set] TARGET_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param targetId The value of the column 'TARGET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTargetId(Long targetId) {
        registerModifiedProperty("targetId");
        _targetId = targetId;
    }

    /**
     * [get] TARGET_NAME: {VARCHAR(256)} <br>
     * @return The value of the column 'TARGET_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getTargetName() {
        checkSpecifiedProperty("targetName");
        return _targetName;
    }

    /**
     * [set] TARGET_NAME: {VARCHAR(256)} <br>
     * @param targetName The value of the column 'TARGET_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTargetName(String targetName) {
        registerModifiedProperty("targetName");
        _targetName = targetName;
    }
}

package org.docksidestage.db2.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.db2.dbflute.exentity.customize.*;

/**
 * The entity of SimpleVendorCheck. <br>
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_VARCHAR
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
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long vendorCheckId = entity.getVendorCheckId();
 * String typeOfVarchar = entity.getTypeOfVarchar();
 * entity.setVendorCheckId(vendorCheckId);
 * entity.setTypeOfVarchar(typeOfVarchar);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSimpleVendorCheck extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** VENDOR_CHECK_ID: {DECIMAL(16), refers to VENDOR_CHECK.VENDOR_CHECK_ID} */
    protected Long _vendorCheckId;

    /** TYPE_OF_VARCHAR: {VARCHAR(32), refers to VENDOR_CHECK.TYPE_OF_VARCHAR} */
    protected String _typeOfVarchar;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.db2.dbflute.bsentity.customize.dbmeta.SimpleVendorCheckDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SimpleVendorCheck";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSimpleVendorCheck) {
            BsSimpleVendorCheck other = (BsSimpleVendorCheck)obj;
            if (!xSV(_vendorCheckId, other._vendorCheckId)) { return false; }
            if (!xSV(_typeOfVarchar, other._typeOfVarchar)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _vendorCheckId);
        hs = xCH(hs, _typeOfVarchar);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_vendorCheckId));
        sb.append(dm).append(xfND(_typeOfVarchar));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SimpleVendorCheck clone() {
        return (SimpleVendorCheck)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_CHECK_ID: {DECIMAL(16), refers to VENDOR_CHECK.VENDOR_CHECK_ID} <br>
     * @return The value of the column 'VENDOR_CHECK_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVendorCheckId() {
        checkSpecifiedProperty("vendorCheckId");
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {DECIMAL(16), refers to VENDOR_CHECK.VENDOR_CHECK_ID} <br>
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        registerModifiedProperty("vendorCheckId");
        _vendorCheckId = vendorCheckId;
    }

    /**
     * [get] TYPE_OF_VARCHAR: {VARCHAR(32), refers to VENDOR_CHECK.TYPE_OF_VARCHAR} <br>
     * @return The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVarchar() {
        checkSpecifiedProperty("typeOfVarchar");
        return _typeOfVarchar;
    }

    /**
     * [set] TYPE_OF_VARCHAR: {VARCHAR(32), refers to VENDOR_CHECK.TYPE_OF_VARCHAR} <br>
     * @param typeOfVarchar The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarchar(String typeOfVarchar) {
        registerModifiedProperty("typeOfVarchar");
        _typeOfVarchar = typeOfVarchar;
    }
}

package org.docksidestage.db2.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.db2.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.db2.dbflute.exentity.*;

/**
 * The entity of SUMMARY_MEMBER_PURCHASE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, ALLSUM_PURCHASE_PRICE, LATEST_PURCHASE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ID
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
 * Integer memberId = entity.getMemberId();
 * Integer allsumPurchasePrice = entity.getAllsumPurchasePrice();
 * java.util.Date latestPurchaseDatetime = entity.getLatestPurchaseDatetime();
 * entity.setMemberId(memberId);
 * entity.setAllsumPurchasePrice(allsumPurchasePrice);
 * entity.setLatestPurchaseDatetime(latestPurchaseDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSummaryMemberPurchase extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_ID: {PK, ID, NotNull, UnknownType} */
    protected Integer _memberId;

    /** ALLSUM_PURCHASE_PRICE: {UnknownType} */
    protected Integer _allsumPurchasePrice;

    /** LATEST_PURCHASE_DATETIME: {UnknownType} */
    protected java.util.Date _latestPurchaseDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SUMMARY_MEMBER_PURCHASE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_memberId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsSummaryMemberPurchase) {
            BsSummaryMemberPurchase other = (BsSummaryMemberPurchase)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_allsumPurchasePrice));
        sb.append(dm).append(xfUD(_latestPurchaseDatetime));
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
    public SummaryMemberPurchase clone() {
        return (SummaryMemberPurchase)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {PK, ID, NotNull, UnknownType} <br>
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {PK, ID, NotNull, UnknownType} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] ALLSUM_PURCHASE_PRICE: {UnknownType} <br>
     * @return The value of the column 'ALLSUM_PURCHASE_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getAllsumPurchasePrice() {
        checkSpecifiedProperty("allsumPurchasePrice");
        return _allsumPurchasePrice;
    }

    /**
     * [set] ALLSUM_PURCHASE_PRICE: {UnknownType} <br>
     * @param allsumPurchasePrice The value of the column 'ALLSUM_PURCHASE_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllsumPurchasePrice(Integer allsumPurchasePrice) {
        registerModifiedProperty("allsumPurchasePrice");
        _allsumPurchasePrice = allsumPurchasePrice;
    }

    /**
     * [get] LATEST_PURCHASE_DATETIME: {UnknownType} <br>
     * @return The value of the column 'LATEST_PURCHASE_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getLatestPurchaseDatetime() {
        checkSpecifiedProperty("latestPurchaseDatetime");
        return _latestPurchaseDatetime;
    }

    /**
     * [set] LATEST_PURCHASE_DATETIME: {UnknownType} <br>
     * @param latestPurchaseDatetime The value of the column 'LATEST_PURCHASE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLatestPurchaseDatetime(java.util.Date latestPurchaseDatetime) {
        registerModifiedProperty("latestPurchaseDatetime");
        _latestPurchaseDatetime = latestPurchaseDatetime;
    }
}

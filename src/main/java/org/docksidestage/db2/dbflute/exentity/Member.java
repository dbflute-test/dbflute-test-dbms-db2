package org.docksidestage.db2.dbflute.exentity;

import java.sql.Timestamp;

import org.docksidestage.db2.dbflute.bsentity.BsMember;

/**
 * The entity of MEMBER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class Member extends BsMember {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    public static final String ALIAS_latestLoginDatetime = "LATEST_LOGIN_DATETIME";
    public static final String ALIAS_loginCount = "LOGIN_COUNT";
    public static final String ALIAS_productKindCount = "PRODUCT_KIND_COUNT";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Timestamp _latestLoginDatetime;
    protected Integer _loginCount;
    protected Integer _productKindCount;

    /** HIGHEST_PURCHASE_PRICE: Derived Referrer Alias. */
    public static final String ALIAS_highestPurchasePrice = "HIGHEST_PURCHASE_PRICE";

    /** HIGHEST_PURCHASE_PRICE: (Derived Referrer) */
    protected Integer _highestPurchasePrice;

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Timestamp getLatestLoginDatetime() {
        return _latestLoginDatetime;
    }

    public void setLatestLoginDatetime(Timestamp latestLoginDatetime) {
        _latestLoginDatetime = latestLoginDatetime;
    }

    public Integer getLoginCount() {
        return _loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this._loginCount = loginCount;
    }

    public Integer getProductKindCount() {
        return _productKindCount;
    }

    public void setProductKindCount(Integer productKindCount) {
        this._productKindCount = productKindCount;
    }

    /**
     * [get] HIGHEST_PURCHASE_PRICE: (Derived Referrer)
     * @return The value of the column 'HIGHEST_PURCHASE_PRICE'. (NullAllowed)
     */
    public Integer getHighestPurchasePrice() {
        return _highestPurchasePrice;
    }

    /**
     * [set] HIGHEST_PURCHASE_PRICE: (Derived Referrer)
     * @param highestPurchasePrice The value of the column 'HIGHEST_PURCHASE_PRICE'. (NullAllowed)
     */
    public void setHighestPurchasePrice(Integer highestPurchasePrice) {
        _highestPurchasePrice = highestPurchasePrice;
    }
}

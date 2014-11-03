package org.docksidestage.db2.dbflute.topic;

import java.util.List;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.db2.dbflute.cbean.ProductStatusCB;
import org.docksidestage.db2.dbflute.cbean.SummaryMemberPurchaseCB;
import org.docksidestage.db2.dbflute.cbean.SummaryProductCB;
import org.docksidestage.db2.dbflute.exbhv.ProductStatusBhv;
import org.docksidestage.db2.dbflute.exbhv.SummaryMemberPurchaseBhv;
import org.docksidestage.db2.dbflute.exbhv.SummaryProductBhv;
import org.docksidestage.db2.dbflute.exentity.ProductStatus;
import org.docksidestage.db2.dbflute.exentity.SummaryMemberPurchase;
import org.docksidestage.db2.dbflute.exentity.SummaryProduct;
import org.docksidestage.db2.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5.5 (2009/09/11 Friday)
 */
public class ViewTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private SummaryProductBhv summaryProductBhv;
    private SummaryMemberPurchaseBhv summaryMemberPurchaseBhv;
    private ProductStatusBhv productStatusBhv;

    // ===================================================================================
    //                                                                       Relation Test
    //                                                                       =============
    public void test_setupSelect() {
        // ## Arrange ##
        SummaryProductCB cb = new SummaryProductCB();
        cb.setupSelect_ProductStatus();

        // ## Act ##
        ListResultBean<SummaryProduct> productList = summaryProductBhv.selectList(cb);

        // ## Assert ##
        for (SummaryProduct product : productList) {
            assertNotNull(product.getProductStatus());
        }
    }

    public void test_foreign_loadReferrer() {
        // ## Arrange ##
        ProductStatusCB cb = new ProductStatusCB();
        ListResultBean<ProductStatus> productStatusList = productStatusBhv.selectList(cb);

        // ## Act ##
        productStatusBhv.loadSummaryProduct(productStatusList, new ConditionBeanSetupper<SummaryProductCB>() {
            public void setup(SummaryProductCB cb) {
                cb.query().addOrderBy_LatestPurchaseDatetime_Desc();
            }
        });

        // ## Assert ##
        boolean existsSummaryProduct = false;
        for (ProductStatus productStatus : productStatusList) {
            log(productStatus);
            List<SummaryProduct> summaryProductList = productStatus.getSummaryProductList();
            for (SummaryProduct summaryProduct : summaryProductList) {
                log("    " + summaryProduct.toString());
                existsSummaryProduct = true;
            }
        }
        assertTrue(existsSummaryProduct);
    }

    // ===================================================================================
    //                                                                   Materialized View
    //                                                                   =================
    public void test_selectList_materialized_view() {
        // ## Arrange ##
        SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB();

        // ## Act ##
        ListResultBean<SummaryMemberPurchase> mempurList = summaryMemberPurchaseBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, mempurList.size());
        for (SummaryMemberPurchase member : mempurList) {
            log(member.toString());
        }
    }
}

package org.docksidestage.db2.dbflute.whitebox.dfprop;

import org.docksidestage.db2.dbflute.bsentity.dbmeta.MemberDbm;
import org.docksidestage.db2.dbflute.exbhv.pmbean.SpNoParameterPmb;
import org.docksidestage.db2.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.8 (2010/04/18 Sunday)
 */
public class WxAddingSchemaPrefixTest extends UnitContainerTestCase {

    public void test_table() {
        assertFalse(MemberDbm.getInstance().getTableSqlName().toString().contains("."));
    }

    public void test_procedure() {
        // DB2 requires schema prefix to procedure of main schema
        // (I don't know why it is...)
        assertTrue(new SpNoParameterPmb().getProcedureName().contains("."));
    }
}
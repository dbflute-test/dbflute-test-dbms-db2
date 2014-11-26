package org.docksidestage.db2.dbflute.cbean.nss;

import org.docksidestage.db2.dbflute.cbean.cq.AliasRefExceptCQ;

/**
 * The nest select set-upper of ALIAS_REF_EXCEPT.
 * @author DBFlute(AutoGenerator)
 */
public class AliasRefExceptNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final AliasRefExceptCQ _query;
    public AliasRefExceptNss(AliasRefExceptCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * ALIAS_EXCEPT by my EXCEPT_ID, named 'aliasExcept'.
     */
    public void withAliasExcept() {
        _query.xdoNss(() -> _query.queryAliasExcept());
    }
}

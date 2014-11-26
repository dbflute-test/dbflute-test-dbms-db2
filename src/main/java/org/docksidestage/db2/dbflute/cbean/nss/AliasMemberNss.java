package org.docksidestage.db2.dbflute.cbean.nss;

import org.docksidestage.db2.dbflute.cbean.cq.AliasMemberCQ;

/**
 * The nest select set-upper of ALIAS_MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class AliasMemberNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final AliasMemberCQ _query;
    public AliasMemberNss(AliasMemberCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     */
    public void withMemberStatus() {
        _query.xdoNss(() -> _query.queryMemberStatus());
    }
}

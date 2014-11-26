package org.docksidestage.db2.dbflute.cbean.nss;

import org.docksidestage.db2.dbflute.cbean.cq.AliasMemberLoginCQ;

/**
 * The nest select set-upper of ALIAS_MEMBER_LOGIN.
 * @author DBFlute(AutoGenerator)
 */
public class AliasMemberLoginNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final AliasMemberLoginCQ _query;
    public AliasMemberLoginNss(AliasMemberLoginCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     */
    public void withMemberStatus() {
        _query.xdoNss(() -> _query.queryMemberStatus());
    }
    /**
     * With nested relation columns to select clause. <br>
     * ALIAS_MEMBER by my MEMBER_ID, named 'aliasMember'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public AliasMemberNss withAliasMember() {
        _query.xdoNss(() -> _query.queryAliasMember());
        return new AliasMemberNss(_query.queryAliasMember());
    }
}

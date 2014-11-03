package org.docksidestage.db2.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.db2.dbflute.exbhv.*;
import org.docksidestage.db2.dbflute.exentity.*;

/**
 * The referrer loader of ALIAS_MEMBER_LOGIN as ALIAS. <br>
 * <pre>
 * [primary key]
 *     MEMBER_LOGIN_ID
 *
 * [column]
 *     MEMBER_LOGIN_ID, MEMBER_ID, LOGIN_DATETIME, MOBILE_LOGIN_FLG, LOGIN_MEMBER_STATUS_CODE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_LOGIN_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     MEMBER_STATUS, ALIAS_MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     memberStatus, aliasMember
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfAliasMemberLogin {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<AliasMemberLogin> _selectedList;
    protected BehaviorSelector _selector;
    protected AliasMemberLoginBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfAliasMemberLogin ready(List<AliasMemberLogin> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected AliasMemberLoginBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(AliasMemberLoginBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMemberStatus _foreignMemberStatusLoader;
    public LoaderOfMemberStatus pulloutMemberStatus() {
        if (_foreignMemberStatusLoader == null)
        { _foreignMemberStatusLoader = new LoaderOfMemberStatus().ready(myBhv().pulloutMemberStatus(_selectedList), _selector); }
        return _foreignMemberStatusLoader;
    }

    protected LoaderOfAliasMember _foreignAliasMemberLoader;
    public LoaderOfAliasMember pulloutAliasMember() {
        if (_foreignAliasMemberLoader == null)
        { _foreignAliasMemberLoader = new LoaderOfAliasMember().ready(myBhv().pulloutAliasMember(_selectedList), _selector); }
        return _foreignAliasMemberLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<AliasMemberLogin> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

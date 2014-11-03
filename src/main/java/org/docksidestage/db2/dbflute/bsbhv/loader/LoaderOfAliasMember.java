package org.docksidestage.db2.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.db2.dbflute.exbhv.*;
import org.docksidestage.db2.dbflute.exentity.*;
import org.docksidestage.db2.dbflute.cbean.*;

/**
 * The referrer loader of ALIAS_MEMBER as ALIAS. <br>
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER_STATUS
 *
 * [referrer table]
 *     ALIAS_MEMBER_LOGIN
 *
 * [foreign property]
 *     memberStatus
 *
 * [referrer property]
 *     aliasMemberLoginList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfAliasMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<AliasMember> _selectedList;
    protected BehaviorSelector _selector;
    protected AliasMemberBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfAliasMember ready(List<AliasMember> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected AliasMemberBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(AliasMemberBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<AliasMemberLogin> _referrerAliasMemberLogin;

    /**
     * Load referrer of aliasMemberLoginList by the set-upper of referrer. <br>
     * ALIAS_MEMBER_LOGIN by MEMBER_ID, named 'aliasMemberLoginList'.
     * <pre>
     * <span style="color: #0000C0">aliasMemberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">aliasMemberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadAliasMemberLogin</span>(<span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">loginCB</span>.setupSelect...
     *         <span style="color: #553000">loginCB</span>.query().set...
     *         <span style="color: #553000">loginCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">loginLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    loginLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (AliasMember aliasMember : <span style="color: #553000">aliasMemberList</span>) {
     *     ... = aliasMember.<span style="color: #CC4747">getAliasMemberLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfAliasMemberLogin> loadAliasMemberLogin(ConditionBeanSetupper<AliasMemberLoginCB> refCBLambda) {
        myBhv().loadAliasMemberLogin(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerAliasMemberLogin = refLs);
        return hd -> hd.handle(new LoaderOfAliasMemberLogin().ready(_referrerAliasMemberLogin, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMemberStatus _foreignMemberStatusLoader;
    public LoaderOfMemberStatus pulloutMemberStatus() {
        if (_foreignMemberStatusLoader == null)
        { _foreignMemberStatusLoader = new LoaderOfMemberStatus().ready(myBhv().pulloutMemberStatus(_selectedList), _selector); }
        return _foreignMemberStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<AliasMember> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

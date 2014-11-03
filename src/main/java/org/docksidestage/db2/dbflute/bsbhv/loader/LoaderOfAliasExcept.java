package org.docksidestage.db2.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.db2.dbflute.exbhv.*;
import org.docksidestage.db2.dbflute.exentity.*;
import org.docksidestage.db2.dbflute.cbean.*;

/**
 * The referrer loader of ALIAS_EXCEPT as ALIAS. <br>
 * <pre>
 * [primary key]
 *     EXCEPT_ID
 *
 * [column]
 *     EXCEPT_ID, EXCEPT_NAME
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
 *     ALIAS_REF_EXCEPT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     aliasRefExceptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfAliasExcept {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<AliasExcept> _selectedList;
    protected BehaviorSelector _selector;
    protected AliasExceptBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfAliasExcept ready(List<AliasExcept> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected AliasExceptBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(AliasExceptBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<AliasRefExcept> _referrerAliasRefExcept;

    /**
     * Load referrer of aliasRefExceptList by the set-upper of referrer. <br>
     * ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptList'.
     * <pre>
     * <span style="color: #0000C0">aliasExceptBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">aliasExceptList</span>, <span style="color: #553000">exceptLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">exceptLoader</span>.<span style="color: #CC4747">loadAliasRefExcept</span>(<span style="color: #553000">exceptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">exceptCB</span>.setupSelect...
     *         <span style="color: #553000">exceptCB</span>.query().set...
     *         <span style="color: #553000">exceptCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">exceptLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    exceptLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (AliasExcept aliasExcept : <span style="color: #553000">aliasExceptList</span>) {
     *     ... = aliasExcept.<span style="color: #CC4747">getAliasRefExceptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setExceptId_InScope(pkList);
     * cb.query().addOrderBy_ExceptId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfAliasRefExcept> loadAliasRefExcept(ConditionBeanSetupper<AliasRefExceptCB> refCBLambda) {
        myBhv().loadAliasRefExcept(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerAliasRefExcept = refLs);
        return hd -> hd.handle(new LoaderOfAliasRefExcept().ready(_referrerAliasRefExcept, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<AliasExcept> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

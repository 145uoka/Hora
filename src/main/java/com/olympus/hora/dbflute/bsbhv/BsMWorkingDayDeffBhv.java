package com.olympus.hora.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.bsbhv.loader.*;
import com.olympus.hora.dbflute.exentity.*;
import com.olympus.hora.dbflute.bsentity.dbmeta.*;
import com.olympus.hora.dbflute.cbean.*;

/**
 * The behavior of m_working_day_deff as TABLE. <br>
 * <pre>
 * [primary key]
 *     m_working_day_deff_id
 *
 * [column]
 *     m_working_day_deff_id, shop_id, start_day, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_working_day_deff_m_working_day_deff_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     m_shop
 *
 * [referrer table]
 *     m_working_day_detail_deff
 *
 * [foreign property]
 *     mShop
 *
 * [referrer property]
 *     mWorkingDayDetailDeffList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMWorkingDayDeffBhv extends AbstractBehaviorWritable<MWorkingDayDeff, MWorkingDayDeffCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MWorkingDayDeffDbm asDBMeta() { return MWorkingDayDeffDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "m_working_day_deff"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MWorkingDayDeffCB newConditionBean() { return new MWorkingDayDeffCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingDayDeff. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<MWorkingDayDeffCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">mWorkingDayDeff</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">mWorkingDayDeff</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">mWorkingDayDeff</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">mWorkingDayDeff</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingDayDeff. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MWorkingDayDeff> selectEntity(CBCall<MWorkingDayDeffCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<MWorkingDayDeff> facadeSelectEntity(MWorkingDayDeffCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MWorkingDayDeff> OptionalEntity<ENTITY> doSelectOptionalEntity(MWorkingDayDeffCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MWorkingDayDeff <span style="color: #553000">mWorkingDayDeff</span> = <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">mWorkingDayDeff</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingDayDeff. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MWorkingDayDeff selectEntityWithDeletedCheck(CBCall<MWorkingDayDeffCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param mWorkingDayDeffId : PK, ID, NotNull, serial(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MWorkingDayDeff> selectByPK(Integer mWorkingDayDeffId) {
        return facadeSelectByPK(mWorkingDayDeffId);
    }

    protected OptionalEntity<MWorkingDayDeff> facadeSelectByPK(Integer mWorkingDayDeffId) {
        return doSelectOptionalByPK(mWorkingDayDeffId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MWorkingDayDeff> ENTITY doSelectByPK(Integer mWorkingDayDeffId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(mWorkingDayDeffId), tp);
    }

    protected <ENTITY extends MWorkingDayDeff> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer mWorkingDayDeffId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(mWorkingDayDeffId, tp), mWorkingDayDeffId);
    }

    protected MWorkingDayDeffCB xprepareCBAsPK(Integer mWorkingDayDeffId) {
        assertObjectNotNull("mWorkingDayDeffId", mWorkingDayDeffId);
        return newConditionBean().acceptPK(mWorkingDayDeffId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;MWorkingDayDeff&gt; <span style="color: #553000">mWorkingDayDeffList</span> = <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (MWorkingDayDeff <span style="color: #553000">mWorkingDayDeff</span> : <span style="color: #553000">mWorkingDayDeffList</span>) {
     *     ... = <span style="color: #553000">mWorkingDayDeff</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingDayDeff. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MWorkingDayDeff> selectList(CBCall<MWorkingDayDeffCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;MWorkingDayDeff&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MWorkingDayDeff mWorkingDayDeff : <span style="color: #553000">page</span>) {
     *     ... = mWorkingDayDeff.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingDayDeff. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MWorkingDayDeff> selectPage(CBCall<MWorkingDayDeffCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingDayDeff. (NotNull)
     * @param entityLambda The handler of entity row of MWorkingDayDeff. (NotNull)
     */
    public void selectCursor(CBCall<MWorkingDayDeffCB> cbLambda, EntityRowHandler<MWorkingDayDeff> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MWorkingDayDeffCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    /**
     * Select the next value as sequence. <br>
     * This method is called when insert() and set to primary-key automatically.
     * So you don't need to call this as long as you need to get next value before insert().
     * @return The next value. (NotNull)
     */
    public Integer selectNextVal() {
        return facadeSelectNextVal();
    }

    protected Integer facadeSelectNextVal() {
        return doSelectNextVal(Integer.class);
    }

    protected <RESULT> RESULT doSelectNextVal(Class<RESULT> tp) {
        return delegateSelectNextVal(tp);
    }

    @Override
    protected Number doReadNextVal() {
        return facadeSelectNextVal();
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param mWorkingDayDeffList The entity list of MWorkingDayDeff. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MWorkingDayDeff> mWorkingDayDeffList, ReferrerLoaderHandler<LoaderOfMWorkingDayDeff> loaderLambda) {
        xassLRArg(mWorkingDayDeffList, loaderLambda);
        loaderLambda.handle(new LoaderOfMWorkingDayDeff().ready(mWorkingDayDeffList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param mWorkingDayDeff The entity of MWorkingDayDeff. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MWorkingDayDeff mWorkingDayDeff, ReferrerLoaderHandler<LoaderOfMWorkingDayDeff> loaderLambda) {
        xassLRArg(mWorkingDayDeff, loaderLambda);
        loaderLambda.handle(new LoaderOfMWorkingDayDeff().ready(xnewLRAryLs(mWorkingDayDeff), _behaviorSelector));
    }

    /**
     * Load referrer of MWorkingDayDetailDeffList by the set-upper of referrer. <br>
     * m_working_day_detail_deff by m_working_day_deff_id, named 'MWorkingDayDetailDeffList'.
     * <pre>
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">loadMWorkingDayDetailDeff</span>(<span style="color: #553000">mWorkingDayDeffList</span>, <span style="color: #553000">deffCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">deffCB</span>.setupSelect...
     *     <span style="color: #553000">deffCB</span>.query().set...
     *     <span style="color: #553000">deffCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MWorkingDayDeff mWorkingDayDeff : <span style="color: #553000">mWorkingDayDeffList</span>) {
     *     ... = mWorkingDayDeff.<span style="color: #CC4747">getMWorkingDayDetailDeffList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMWorkingDayDeffId_InScope(pkList);
     * cb.query().addOrderBy_MWorkingDayDeffId_Asc();
     * </pre>
     * @param mWorkingDayDeffList The entity list of MWorkingDayDeff. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWorkingDayDetailDeff> loadMWorkingDayDetailDeff(List<MWorkingDayDeff> mWorkingDayDeffList, ReferrerConditionSetupper<MWorkingDayDetailDeffCB> refCBLambda) {
        xassLRArg(mWorkingDayDeffList, refCBLambda);
        return doLoadMWorkingDayDetailDeff(mWorkingDayDeffList, new LoadReferrerOption<MWorkingDayDetailDeffCB, MWorkingDayDetailDeff>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MWorkingDayDetailDeffList by the set-upper of referrer. <br>
     * m_working_day_detail_deff by m_working_day_deff_id, named 'MWorkingDayDetailDeffList'.
     * <pre>
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">loadMWorkingDayDetailDeff</span>(<span style="color: #553000">mWorkingDayDeff</span>, <span style="color: #553000">deffCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">deffCB</span>.setupSelect...
     *     <span style="color: #553000">deffCB</span>.query().set...
     *     <span style="color: #553000">deffCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mWorkingDayDeff</span>.<span style="color: #CC4747">getMWorkingDayDetailDeffList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMWorkingDayDeffId_InScope(pkList);
     * cb.query().addOrderBy_MWorkingDayDeffId_Asc();
     * </pre>
     * @param mWorkingDayDeff The entity of MWorkingDayDeff. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWorkingDayDetailDeff> loadMWorkingDayDetailDeff(MWorkingDayDeff mWorkingDayDeff, ReferrerConditionSetupper<MWorkingDayDetailDeffCB> refCBLambda) {
        xassLRArg(mWorkingDayDeff, refCBLambda);
        return doLoadMWorkingDayDetailDeff(xnewLRLs(mWorkingDayDeff), new LoadReferrerOption<MWorkingDayDetailDeffCB, MWorkingDayDetailDeff>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<MWorkingDayDetailDeff> doLoadMWorkingDayDetailDeff(List<MWorkingDayDeff> mWorkingDayDeffList, LoadReferrerOption<MWorkingDayDetailDeffCB, MWorkingDayDetailDeff> option) {
        return helpLoadReferrerInternally(mWorkingDayDeffList, option, "mWorkingDayDetailDeffList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MShop'.
     * @param mWorkingDayDeffList The list of mWorkingDayDeff. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MShop> pulloutMShop(List<MWorkingDayDeff> mWorkingDayDeffList)
    { return helpPulloutInternally(mWorkingDayDeffList, "mShop"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key mWorkingDayDeffId.
     * @param mWorkingDayDeffList The list of mWorkingDayDeff. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMWorkingDayDeffIdList(List<MWorkingDayDeff> mWorkingDayDeffList)
    { return helpExtractListInternally(mWorkingDayDeffList, "MWorkingDayDeffId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MWorkingDayDeff mWorkingDayDeff = <span style="color: #70226C">new</span> MWorkingDayDeff();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mWorkingDayDeff.setFoo...(value);
     * mWorkingDayDeff.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mWorkingDayDeff.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mWorkingDayDeff.set...;</span>
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">insert</span>(mWorkingDayDeff);
     * ... = mWorkingDayDeff.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mWorkingDayDeff The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MWorkingDayDeff mWorkingDayDeff) {
        doInsert(mWorkingDayDeff, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MWorkingDayDeff mWorkingDayDeff = <span style="color: #70226C">new</span> MWorkingDayDeff();
     * mWorkingDayDeff.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mWorkingDayDeff.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mWorkingDayDeff.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mWorkingDayDeff.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mWorkingDayDeff.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">update</span>(mWorkingDayDeff);
     * </pre>
     * @param mWorkingDayDeff The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MWorkingDayDeff mWorkingDayDeff) {
        doUpdate(mWorkingDayDeff, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mWorkingDayDeff The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MWorkingDayDeff mWorkingDayDeff) {
        doInsertOrUpdate(mWorkingDayDeff, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MWorkingDayDeff mWorkingDayDeff = <span style="color: #70226C">new</span> MWorkingDayDeff();
     * mWorkingDayDeff.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mWorkingDayDeff.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">delete</span>(mWorkingDayDeff);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mWorkingDayDeff The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MWorkingDayDeff mWorkingDayDeff) {
        doDelete(mWorkingDayDeff, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MWorkingDayDeff mWorkingDayDeff = <span style="color: #70226C">new</span> MWorkingDayDeff();
     *     mWorkingDayDeff.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mWorkingDayDeff.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mWorkingDayDeffList.add(mWorkingDayDeff);
     * }
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">batchInsert</span>(mWorkingDayDeffList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mWorkingDayDeffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MWorkingDayDeff> mWorkingDayDeffList) {
        return doBatchInsert(mWorkingDayDeffList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MWorkingDayDeff mWorkingDayDeff = <span style="color: #70226C">new</span> MWorkingDayDeff();
     *     mWorkingDayDeff.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mWorkingDayDeff.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mWorkingDayDeff.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mWorkingDayDeff.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mWorkingDayDeffList.add(mWorkingDayDeff);
     * }
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mWorkingDayDeffList);
     * </pre>
     * @param mWorkingDayDeffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<MWorkingDayDeff> mWorkingDayDeffList) {
        return doBatchUpdate(mWorkingDayDeffList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mWorkingDayDeffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<MWorkingDayDeff> mWorkingDayDeffList) {
        return doBatchDelete(mWorkingDayDeffList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MWorkingDayDeff, MWorkingDayDeffCB&gt;() {
     *     public ConditionBean setup(MWorkingDayDeff entity, MWorkingDayDeffCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<MWorkingDayDeff, MWorkingDayDeffCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MWorkingDayDeff mWorkingDayDeff = <span style="color: #70226C">new</span> MWorkingDayDeff();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mWorkingDayDeff.setPK...(value);</span>
     * mWorkingDayDeff.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mWorkingDayDeff.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mWorkingDayDeff.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWorkingDayDeff.setVersionNo(value);</span>
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mWorkingDayDeff, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param mWorkingDayDeff The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of MWorkingDayDeff. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MWorkingDayDeff mWorkingDayDeff, CBCall<MWorkingDayDeffCB> cbLambda) {
        return doQueryUpdate(mWorkingDayDeff, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">queryDelete</span>(mWorkingDayDeff, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingDayDeff. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<MWorkingDayDeffCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * MWorkingDayDeff mWorkingDayDeff = <span style="color: #70226C">new</span> MWorkingDayDeff();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mWorkingDayDeff.setFoo...(value);
     * mWorkingDayDeff.setBar...(value);
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mWorkingDayDeff, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mWorkingDayDeff.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mWorkingDayDeff The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MWorkingDayDeff mWorkingDayDeff, WritableOptionCall<MWorkingDayDeffCB, InsertOption<MWorkingDayDeffCB>> opLambda) {
        doInsert(mWorkingDayDeff, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MWorkingDayDeff mWorkingDayDeff = <span style="color: #70226C">new</span> MWorkingDayDeff();
     * mWorkingDayDeff.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mWorkingDayDeff.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mWorkingDayDeff.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mWorkingDayDeff, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mWorkingDayDeff The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MWorkingDayDeff mWorkingDayDeff, WritableOptionCall<MWorkingDayDeffCB, UpdateOption<MWorkingDayDeffCB>> opLambda) {
        doUpdate(mWorkingDayDeff, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mWorkingDayDeff The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MWorkingDayDeff mWorkingDayDeff, WritableOptionCall<MWorkingDayDeffCB, InsertOption<MWorkingDayDeffCB>> insertOpLambda, WritableOptionCall<MWorkingDayDeffCB, UpdateOption<MWorkingDayDeffCB>> updateOpLambda) {
        doInsertOrUpdate(mWorkingDayDeff, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mWorkingDayDeff The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MWorkingDayDeff mWorkingDayDeff, WritableOptionCall<MWorkingDayDeffCB, DeleteOption<MWorkingDayDeffCB>> opLambda) {
        doDelete(mWorkingDayDeff, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mWorkingDayDeffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MWorkingDayDeff> mWorkingDayDeffList, WritableOptionCall<MWorkingDayDeffCB, InsertOption<MWorkingDayDeffCB>> opLambda) {
        return doBatchInsert(mWorkingDayDeffList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mWorkingDayDeffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MWorkingDayDeff> mWorkingDayDeffList, WritableOptionCall<MWorkingDayDeffCB, UpdateOption<MWorkingDayDeffCB>> opLambda) {
        return doBatchUpdate(mWorkingDayDeffList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mWorkingDayDeffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MWorkingDayDeff> mWorkingDayDeffList, WritableOptionCall<MWorkingDayDeffCB, DeleteOption<MWorkingDayDeffCB>> opLambda) {
        return doBatchDelete(mWorkingDayDeffList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<MWorkingDayDeff, MWorkingDayDeffCB> manyArgLambda, WritableOptionCall<MWorkingDayDeffCB, InsertOption<MWorkingDayDeffCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MWorkingDayDeff mWorkingDayDeff = <span style="color: #70226C">new</span> MWorkingDayDeff();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mWorkingDayDeff.setPK...(value);</span>
     * mWorkingDayDeff.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWorkingDayDeff.setVersionNo(value);</span>
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mWorkingDayDeff, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mWorkingDayDeff The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of MWorkingDayDeff. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MWorkingDayDeff mWorkingDayDeff, CBCall<MWorkingDayDeffCB> cbLambda, WritableOptionCall<MWorkingDayDeffCB, UpdateOption<MWorkingDayDeffCB>> opLambda) {
        return doQueryUpdate(mWorkingDayDeff, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #CC4747">queryDelete</span>(mWorkingDayDeff, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingDayDeff. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<MWorkingDayDeffCB> cbLambda, WritableOptionCall<MWorkingDayDeffCB, DeleteOption<MWorkingDayDeffCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mWorkingDayDeffBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mWorkingDayDeffBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mWorkingDayDeffBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mWorkingDayDeffBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mWorkingDayDeffBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mWorkingDayDeffBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mWorkingDayDeffBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mWorkingDayDeffBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mWorkingDayDeffBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mWorkingDayDeffBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mWorkingDayDeffBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mWorkingDayDeffBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mWorkingDayDeffBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mWorkingDayDeffBhv.outideSql().removeBlockComment().selectList()
     * mWorkingDayDeffBhv.outideSql().removeLineComment().selectList()
     * mWorkingDayDeffBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<MWorkingDayDeffBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends MWorkingDayDeff> typeOfSelectedEntity() { return MWorkingDayDeff.class; }
    protected Class<MWorkingDayDeff> typeOfHandlingEntity() { return MWorkingDayDeff.class; }
    protected Class<MWorkingDayDeffCB> typeOfHandlingConditionBean() { return MWorkingDayDeffCB.class; }
}

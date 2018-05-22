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
 * The behavior of m_shop as TABLE. <br>
 * <pre>
 * [primary key]
 *     shop_id
 *
 * [column]
 *     shop_id, company_id, shop_abbreviated_name, shop_name, phone1_1, phone1_2, phone1_3, phone2_1, phone2_2, phone2_3, fax_1, fax_2, fax_3, email1, email2, url, prefecture, city, address1, address2, remarks, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_shop_shop_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     m_company
 *
 * [referrer table]
 *     m_course_group, m_working_day, m_working_day_deff, m_working_staff, t_reservation
 *
 * [foreign property]
 *     mCompany
 *
 * [referrer property]
 *     mCourseGroupList, mWorkingDayList, mWorkingDayDeffList, mWorkingStaffList, tReservationList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMShopBhv extends AbstractBehaviorWritable<MShop, MShopCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MShopDbm asDBMeta() { return MShopDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "m_shop"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MShopCB newConditionBean() { return new MShopCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MShop. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<MShopCB> cbLambda) {
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
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">mShop</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">mShop</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">mShop</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">mShop</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MShop. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MShop> selectEntity(CBCall<MShopCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<MShop> facadeSelectEntity(MShopCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MShop> OptionalEntity<ENTITY> doSelectOptionalEntity(MShopCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MShop <span style="color: #553000">mShop</span> = <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">mShop</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of MShop. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MShop selectEntityWithDeletedCheck(CBCall<MShopCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param shopId : PK, ID, NotNull, serial(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MShop> selectByPK(Integer shopId) {
        return facadeSelectByPK(shopId);
    }

    protected OptionalEntity<MShop> facadeSelectByPK(Integer shopId) {
        return doSelectOptionalByPK(shopId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MShop> ENTITY doSelectByPK(Integer shopId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(shopId), tp);
    }

    protected <ENTITY extends MShop> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer shopId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(shopId, tp), shopId);
    }

    protected MShopCB xprepareCBAsPK(Integer shopId) {
        assertObjectNotNull("shopId", shopId);
        return newConditionBean().acceptPK(shopId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;MShop&gt; <span style="color: #553000">mShopList</span> = <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (MShop <span style="color: #553000">mShop</span> : <span style="color: #553000">mShopList</span>) {
     *     ... = <span style="color: #553000">mShop</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of MShop. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MShop> selectList(CBCall<MShopCB> cbLambda) {
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
     * PagingResultBean&lt;MShop&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MShop mShop : <span style="color: #553000">page</span>) {
     *     ... = mShop.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of MShop. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MShop> selectPage(CBCall<MShopCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MShop. (NotNull)
     * @param entityLambda The handler of entity row of MShop. (NotNull)
     */
    public void selectCursor(CBCall<MShopCB> cbLambda, EntityRowHandler<MShop> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MShopCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param mShopList The entity list of MShop. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MShop> mShopList, ReferrerLoaderHandler<LoaderOfMShop> loaderLambda) {
        xassLRArg(mShopList, loaderLambda);
        loaderLambda.handle(new LoaderOfMShop().ready(mShopList, _behaviorSelector));
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
     * @param mShop The entity of MShop. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MShop mShop, ReferrerLoaderHandler<LoaderOfMShop> loaderLambda) {
        xassLRArg(mShop, loaderLambda);
        loaderLambda.handle(new LoaderOfMShop().ready(xnewLRAryLs(mShop), _behaviorSelector));
    }

    /**
     * Load referrer of MCourseGroupList by the set-upper of referrer. <br>
     * m_course_group by shop_id, named 'MCourseGroupList'.
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">loadMCourseGroup</span>(<span style="color: #553000">mShopList</span>, <span style="color: #553000">groupCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">groupCB</span>.setupSelect...
     *     <span style="color: #553000">groupCB</span>.query().set...
     *     <span style="color: #553000">groupCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShop mShop : <span style="color: #553000">mShopList</span>) {
     *     ... = mShop.<span style="color: #CC4747">getMCourseGroupList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShopId_InScope(pkList);
     * cb.query().addOrderBy_ShopId_Asc();
     * </pre>
     * @param mShopList The entity list of MShop. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCourseGroup> loadMCourseGroup(List<MShop> mShopList, ReferrerConditionSetupper<MCourseGroupCB> refCBLambda) {
        xassLRArg(mShopList, refCBLambda);
        return doLoadMCourseGroup(mShopList, new LoadReferrerOption<MCourseGroupCB, MCourseGroup>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCourseGroupList by the set-upper of referrer. <br>
     * m_course_group by shop_id, named 'MCourseGroupList'.
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">loadMCourseGroup</span>(<span style="color: #553000">mShop</span>, <span style="color: #553000">groupCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">groupCB</span>.setupSelect...
     *     <span style="color: #553000">groupCB</span>.query().set...
     *     <span style="color: #553000">groupCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShop</span>.<span style="color: #CC4747">getMCourseGroupList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShopId_InScope(pkList);
     * cb.query().addOrderBy_ShopId_Asc();
     * </pre>
     * @param mShop The entity of MShop. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCourseGroup> loadMCourseGroup(MShop mShop, ReferrerConditionSetupper<MCourseGroupCB> refCBLambda) {
        xassLRArg(mShop, refCBLambda);
        return doLoadMCourseGroup(xnewLRLs(mShop), new LoadReferrerOption<MCourseGroupCB, MCourseGroup>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<MCourseGroup> doLoadMCourseGroup(List<MShop> mShopList, LoadReferrerOption<MCourseGroupCB, MCourseGroup> option) {
        return helpLoadReferrerInternally(mShopList, option, "mCourseGroupList");
    }

    /**
     * Load referrer of MWorkingDayList by the set-upper of referrer. <br>
     * m_working_day by shop_id, named 'MWorkingDayList'.
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">loadMWorkingDay</span>(<span style="color: #553000">mShopList</span>, <span style="color: #553000">dayCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dayCB</span>.setupSelect...
     *     <span style="color: #553000">dayCB</span>.query().set...
     *     <span style="color: #553000">dayCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShop mShop : <span style="color: #553000">mShopList</span>) {
     *     ... = mShop.<span style="color: #CC4747">getMWorkingDayList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShopId_InScope(pkList);
     * cb.query().addOrderBy_ShopId_Asc();
     * </pre>
     * @param mShopList The entity list of MShop. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWorkingDay> loadMWorkingDay(List<MShop> mShopList, ReferrerConditionSetupper<MWorkingDayCB> refCBLambda) {
        xassLRArg(mShopList, refCBLambda);
        return doLoadMWorkingDay(mShopList, new LoadReferrerOption<MWorkingDayCB, MWorkingDay>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MWorkingDayList by the set-upper of referrer. <br>
     * m_working_day by shop_id, named 'MWorkingDayList'.
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">loadMWorkingDay</span>(<span style="color: #553000">mShop</span>, <span style="color: #553000">dayCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dayCB</span>.setupSelect...
     *     <span style="color: #553000">dayCB</span>.query().set...
     *     <span style="color: #553000">dayCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShop</span>.<span style="color: #CC4747">getMWorkingDayList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShopId_InScope(pkList);
     * cb.query().addOrderBy_ShopId_Asc();
     * </pre>
     * @param mShop The entity of MShop. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWorkingDay> loadMWorkingDay(MShop mShop, ReferrerConditionSetupper<MWorkingDayCB> refCBLambda) {
        xassLRArg(mShop, refCBLambda);
        return doLoadMWorkingDay(xnewLRLs(mShop), new LoadReferrerOption<MWorkingDayCB, MWorkingDay>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<MWorkingDay> doLoadMWorkingDay(List<MShop> mShopList, LoadReferrerOption<MWorkingDayCB, MWorkingDay> option) {
        return helpLoadReferrerInternally(mShopList, option, "mWorkingDayList");
    }

    /**
     * Load referrer of MWorkingDayDeffList by the set-upper of referrer. <br>
     * m_working_day_deff by shop_id, named 'MWorkingDayDeffList'.
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">loadMWorkingDayDeff</span>(<span style="color: #553000">mShopList</span>, <span style="color: #553000">deffCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">deffCB</span>.setupSelect...
     *     <span style="color: #553000">deffCB</span>.query().set...
     *     <span style="color: #553000">deffCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShop mShop : <span style="color: #553000">mShopList</span>) {
     *     ... = mShop.<span style="color: #CC4747">getMWorkingDayDeffList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShopId_InScope(pkList);
     * cb.query().addOrderBy_ShopId_Asc();
     * </pre>
     * @param mShopList The entity list of MShop. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWorkingDayDeff> loadMWorkingDayDeff(List<MShop> mShopList, ReferrerConditionSetupper<MWorkingDayDeffCB> refCBLambda) {
        xassLRArg(mShopList, refCBLambda);
        return doLoadMWorkingDayDeff(mShopList, new LoadReferrerOption<MWorkingDayDeffCB, MWorkingDayDeff>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MWorkingDayDeffList by the set-upper of referrer. <br>
     * m_working_day_deff by shop_id, named 'MWorkingDayDeffList'.
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">loadMWorkingDayDeff</span>(<span style="color: #553000">mShop</span>, <span style="color: #553000">deffCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">deffCB</span>.setupSelect...
     *     <span style="color: #553000">deffCB</span>.query().set...
     *     <span style="color: #553000">deffCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShop</span>.<span style="color: #CC4747">getMWorkingDayDeffList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShopId_InScope(pkList);
     * cb.query().addOrderBy_ShopId_Asc();
     * </pre>
     * @param mShop The entity of MShop. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWorkingDayDeff> loadMWorkingDayDeff(MShop mShop, ReferrerConditionSetupper<MWorkingDayDeffCB> refCBLambda) {
        xassLRArg(mShop, refCBLambda);
        return doLoadMWorkingDayDeff(xnewLRLs(mShop), new LoadReferrerOption<MWorkingDayDeffCB, MWorkingDayDeff>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<MWorkingDayDeff> doLoadMWorkingDayDeff(List<MShop> mShopList, LoadReferrerOption<MWorkingDayDeffCB, MWorkingDayDeff> option) {
        return helpLoadReferrerInternally(mShopList, option, "mWorkingDayDeffList");
    }

    /**
     * Load referrer of MWorkingStaffList by the set-upper of referrer. <br>
     * m_working_staff by shop_id, named 'MWorkingStaffList'.
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">loadMWorkingStaff</span>(<span style="color: #553000">mShopList</span>, <span style="color: #553000">staffCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">staffCB</span>.setupSelect...
     *     <span style="color: #553000">staffCB</span>.query().set...
     *     <span style="color: #553000">staffCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShop mShop : <span style="color: #553000">mShopList</span>) {
     *     ... = mShop.<span style="color: #CC4747">getMWorkingStaffList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShopId_InScope(pkList);
     * cb.query().addOrderBy_ShopId_Asc();
     * </pre>
     * @param mShopList The entity list of MShop. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWorkingStaff> loadMWorkingStaff(List<MShop> mShopList, ReferrerConditionSetupper<MWorkingStaffCB> refCBLambda) {
        xassLRArg(mShopList, refCBLambda);
        return doLoadMWorkingStaff(mShopList, new LoadReferrerOption<MWorkingStaffCB, MWorkingStaff>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MWorkingStaffList by the set-upper of referrer. <br>
     * m_working_staff by shop_id, named 'MWorkingStaffList'.
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">loadMWorkingStaff</span>(<span style="color: #553000">mShop</span>, <span style="color: #553000">staffCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">staffCB</span>.setupSelect...
     *     <span style="color: #553000">staffCB</span>.query().set...
     *     <span style="color: #553000">staffCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShop</span>.<span style="color: #CC4747">getMWorkingStaffList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShopId_InScope(pkList);
     * cb.query().addOrderBy_ShopId_Asc();
     * </pre>
     * @param mShop The entity of MShop. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWorkingStaff> loadMWorkingStaff(MShop mShop, ReferrerConditionSetupper<MWorkingStaffCB> refCBLambda) {
        xassLRArg(mShop, refCBLambda);
        return doLoadMWorkingStaff(xnewLRLs(mShop), new LoadReferrerOption<MWorkingStaffCB, MWorkingStaff>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<MWorkingStaff> doLoadMWorkingStaff(List<MShop> mShopList, LoadReferrerOption<MWorkingStaffCB, MWorkingStaff> option) {
        return helpLoadReferrerInternally(mShopList, option, "mWorkingStaffList");
    }

    /**
     * Load referrer of TReservationList by the set-upper of referrer. <br>
     * t_reservation by shop_id, named 'TReservationList'.
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">loadTReservation</span>(<span style="color: #553000">mShopList</span>, <span style="color: #553000">reservationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">reservationCB</span>.setupSelect...
     *     <span style="color: #553000">reservationCB</span>.query().set...
     *     <span style="color: #553000">reservationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShop mShop : <span style="color: #553000">mShopList</span>) {
     *     ... = mShop.<span style="color: #CC4747">getTReservationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShopId_InScope(pkList);
     * cb.query().addOrderBy_ShopId_Asc();
     * </pre>
     * @param mShopList The entity list of MShop. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReservation> loadTReservation(List<MShop> mShopList, ReferrerConditionSetupper<TReservationCB> refCBLambda) {
        xassLRArg(mShopList, refCBLambda);
        return doLoadTReservation(mShopList, new LoadReferrerOption<TReservationCB, TReservation>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TReservationList by the set-upper of referrer. <br>
     * t_reservation by shop_id, named 'TReservationList'.
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">loadTReservation</span>(<span style="color: #553000">mShop</span>, <span style="color: #553000">reservationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">reservationCB</span>.setupSelect...
     *     <span style="color: #553000">reservationCB</span>.query().set...
     *     <span style="color: #553000">reservationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShop</span>.<span style="color: #CC4747">getTReservationList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShopId_InScope(pkList);
     * cb.query().addOrderBy_ShopId_Asc();
     * </pre>
     * @param mShop The entity of MShop. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReservation> loadTReservation(MShop mShop, ReferrerConditionSetupper<TReservationCB> refCBLambda) {
        xassLRArg(mShop, refCBLambda);
        return doLoadTReservation(xnewLRLs(mShop), new LoadReferrerOption<TReservationCB, TReservation>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<TReservation> doLoadTReservation(List<MShop> mShopList, LoadReferrerOption<TReservationCB, TReservation> option) {
        return helpLoadReferrerInternally(mShopList, option, "tReservationList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCompany'.
     * @param mShopList The list of mShop. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCompany> pulloutMCompany(List<MShop> mShopList)
    { return helpPulloutInternally(mShopList, "mCompany"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key shopId.
     * @param mShopList The list of mShop. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractShopIdList(List<MShop> mShopList)
    { return helpExtractListInternally(mShopList, "shopId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MShop mShop = <span style="color: #70226C">new</span> MShop();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mShop.setFoo...(value);
     * mShop.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mShop.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mShop.set...;</span>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">insert</span>(mShop);
     * ... = mShop.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mShop The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MShop mShop) {
        doInsert(mShop, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MShop mShop = <span style="color: #70226C">new</span> MShop();
     * mShop.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mShop.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mShop.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mShop.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mShop.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">update</span>(mShop);
     * </pre>
     * @param mShop The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MShop mShop) {
        doUpdate(mShop, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mShop The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MShop mShop) {
        doInsertOrUpdate(mShop, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MShop mShop = <span style="color: #70226C">new</span> MShop();
     * mShop.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mShop.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">delete</span>(mShop);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mShop The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MShop mShop) {
        doDelete(mShop, null);
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
     *     MShop mShop = <span style="color: #70226C">new</span> MShop();
     *     mShop.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mShop.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mShopList.add(mShop);
     * }
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">batchInsert</span>(mShopList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mShopList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MShop> mShopList) {
        return doBatchInsert(mShopList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MShop mShop = <span style="color: #70226C">new</span> MShop();
     *     mShop.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mShop.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mShop.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mShop.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mShopList.add(mShop);
     * }
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mShopList);
     * </pre>
     * @param mShopList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<MShop> mShopList) {
        return doBatchUpdate(mShopList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mShopList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<MShop> mShopList) {
        return doBatchDelete(mShopList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MShop, MShopCB&gt;() {
     *     public ConditionBean setup(MShop entity, MShopCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MShop, MShopCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MShop mShop = <span style="color: #70226C">new</span> MShop();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mShop.setPK...(value);</span>
     * mShop.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mShop.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mShop.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShop.setVersionNo(value);</span>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mShop, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param mShop The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of MShop. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MShop mShop, CBCall<MShopCB> cbLambda) {
        return doQueryUpdate(mShop, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">queryDelete</span>(mShop, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MShop. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<MShopCB> cbLambda) {
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
     * MShop mShop = <span style="color: #70226C">new</span> MShop();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mShop.setFoo...(value);
     * mShop.setBar...(value);
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mShop, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mShop.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mShop The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MShop mShop, WritableOptionCall<MShopCB, InsertOption<MShopCB>> opLambda) {
        doInsert(mShop, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MShop mShop = <span style="color: #70226C">new</span> MShop();
     * mShop.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mShop.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mShop.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mShop, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mShop The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MShop mShop, WritableOptionCall<MShopCB, UpdateOption<MShopCB>> opLambda) {
        doUpdate(mShop, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mShop The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MShop mShop, WritableOptionCall<MShopCB, InsertOption<MShopCB>> insertOpLambda, WritableOptionCall<MShopCB, UpdateOption<MShopCB>> updateOpLambda) {
        doInsertOrUpdate(mShop, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mShop The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MShop mShop, WritableOptionCall<MShopCB, DeleteOption<MShopCB>> opLambda) {
        doDelete(mShop, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mShopList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MShop> mShopList, WritableOptionCall<MShopCB, InsertOption<MShopCB>> opLambda) {
        return doBatchInsert(mShopList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mShopList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MShop> mShopList, WritableOptionCall<MShopCB, UpdateOption<MShopCB>> opLambda) {
        return doBatchUpdate(mShopList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mShopList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MShop> mShopList, WritableOptionCall<MShopCB, DeleteOption<MShopCB>> opLambda) {
        return doBatchDelete(mShopList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MShop, MShopCB> manyArgLambda, WritableOptionCall<MShopCB, InsertOption<MShopCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MShop mShop = <span style="color: #70226C">new</span> MShop();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mShop.setPK...(value);</span>
     * mShop.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShop.setVersionNo(value);</span>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mShop, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mShop The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of MShop. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MShop mShop, CBCall<MShopCB> cbLambda, WritableOptionCall<MShopCB, UpdateOption<MShopCB>> opLambda) {
        return doQueryUpdate(mShop, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #CC4747">queryDelete</span>(mShop, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MShop. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<MShopCB> cbLambda, WritableOptionCall<MShopCB, DeleteOption<MShopCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mShopBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mShopBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mShopBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mShopBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mShopBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mShopBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mShopBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mShopBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mShopBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mShopBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mShopBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mShopBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mShopBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mShopBhv.outideSql().removeBlockComment().selectList()
     * mShopBhv.outideSql().removeLineComment().selectList()
     * mShopBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<MShopBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends MShop> typeOfSelectedEntity() { return MShop.class; }
    protected Class<MShop> typeOfHandlingEntity() { return MShop.class; }
    protected Class<MShopCB> typeOfHandlingConditionBean() { return MShopCB.class; }
}

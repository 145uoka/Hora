package com.olympus.hora.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.olympus.hora.dbflute.allcommon.*;
import com.olympus.hora.dbflute.cbean.*;
import com.olympus.hora.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of m_shop.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMShopCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMShopCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "m_shop";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * shop_id: {PK, ID, NotNull, serial(10)}
     * @param shopId The value of shopId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopId_Equal(Integer shopId) {
        doSetShopId_Equal(shopId);
    }

    protected void doSetShopId_Equal(Integer shopId) {
        regShopId(CK_EQ, shopId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * shop_id: {PK, ID, NotNull, serial(10)}
     * @param shopId The value of shopId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopId_NotEqual(Integer shopId) {
        doSetShopId_NotEqual(shopId);
    }

    protected void doSetShopId_NotEqual(Integer shopId) {
        regShopId(CK_NES, shopId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * shop_id: {PK, ID, NotNull, serial(10)}
     * @param shopId The value of shopId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopId_GreaterThan(Integer shopId) {
        regShopId(CK_GT, shopId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * shop_id: {PK, ID, NotNull, serial(10)}
     * @param shopId The value of shopId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopId_LessThan(Integer shopId) {
        regShopId(CK_LT, shopId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * shop_id: {PK, ID, NotNull, serial(10)}
     * @param shopId The value of shopId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopId_GreaterEqual(Integer shopId) {
        regShopId(CK_GE, shopId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * shop_id: {PK, ID, NotNull, serial(10)}
     * @param shopId The value of shopId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopId_LessEqual(Integer shopId) {
        regShopId(CK_LE, shopId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * shop_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of shopId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shopId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setShopId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setShopId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * shop_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of shopId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shopId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setShopId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShopId(), "shop_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * shop_id: {PK, ID, NotNull, serial(10)}
     * @param shopIdList The collection of shopId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopId_InScope(Collection<Integer> shopIdList) {
        doSetShopId_InScope(shopIdList);
    }

    protected void doSetShopId_InScope(Collection<Integer> shopIdList) {
        regINS(CK_INS, cTL(shopIdList), xgetCValueShopId(), "shop_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * shop_id: {PK, ID, NotNull, serial(10)}
     * @param shopIdList The collection of shopId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopId_NotInScope(Collection<Integer> shopIdList) {
        doSetShopId_NotInScope(shopIdList);
    }

    protected void doSetShopId_NotInScope(Collection<Integer> shopIdList) {
        regINS(CK_NINS, cTL(shopIdList), xgetCValueShopId(), "shop_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select shop_id from m_course_group where ...)} <br>
     * m_course_group by shop_id, named 'MCourseGroupAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCourseGroup</span>(groupCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     groupCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCourseGroupList for 'exists'. (NotNull)
     */
    public void existsMCourseGroup(SubQuery<MCourseGroupCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCourseGroupCB cb = new MCourseGroupCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShopId_ExistsReferrer_MCourseGroupList(cb.query());
        registerExistsReferrer(cb.query(), "shop_id", "shop_id", pp, "mCourseGroupList");
    }
    public abstract String keepShopId_ExistsReferrer_MCourseGroupList(MCourseGroupCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select shop_id from m_working_day where ...)} <br>
     * m_working_day by shop_id, named 'MWorkingDayAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMWorkingDay</span>(dayCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dayCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MWorkingDayList for 'exists'. (NotNull)
     */
    public void existsMWorkingDay(SubQuery<MWorkingDayCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWorkingDayCB cb = new MWorkingDayCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShopId_ExistsReferrer_MWorkingDayList(cb.query());
        registerExistsReferrer(cb.query(), "shop_id", "shop_id", pp, "mWorkingDayList");
    }
    public abstract String keepShopId_ExistsReferrer_MWorkingDayList(MWorkingDayCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select shop_id from m_working_day_deff where ...)} <br>
     * m_working_day_deff by shop_id, named 'MWorkingDayDeffAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMWorkingDayDeff</span>(deffCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     deffCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MWorkingDayDeffList for 'exists'. (NotNull)
     */
    public void existsMWorkingDayDeff(SubQuery<MWorkingDayDeffCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWorkingDayDeffCB cb = new MWorkingDayDeffCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShopId_ExistsReferrer_MWorkingDayDeffList(cb.query());
        registerExistsReferrer(cb.query(), "shop_id", "shop_id", pp, "mWorkingDayDeffList");
    }
    public abstract String keepShopId_ExistsReferrer_MWorkingDayDeffList(MWorkingDayDeffCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select shop_id from m_working_staff where ...)} <br>
     * m_working_staff by shop_id, named 'MWorkingStaffAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMWorkingStaff</span>(staffCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     staffCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MWorkingStaffList for 'exists'. (NotNull)
     */
    public void existsMWorkingStaff(SubQuery<MWorkingStaffCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWorkingStaffCB cb = new MWorkingStaffCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShopId_ExistsReferrer_MWorkingStaffList(cb.query());
        registerExistsReferrer(cb.query(), "shop_id", "shop_id", pp, "mWorkingStaffList");
    }
    public abstract String keepShopId_ExistsReferrer_MWorkingStaffList(MWorkingStaffCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select shop_id from t_reservation where ...)} <br>
     * t_reservation by shop_id, named 'TReservationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReservation</span>(reservationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     reservationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReservationList for 'exists'. (NotNull)
     */
    public void existsTReservation(SubQuery<TReservationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReservationCB cb = new TReservationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShopId_ExistsReferrer_TReservationList(cb.query());
        registerExistsReferrer(cb.query(), "shop_id", "shop_id", pp, "tReservationList");
    }
    public abstract String keepShopId_ExistsReferrer_TReservationList(TReservationCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select shop_id from m_course_group where ...)} <br>
     * m_course_group by shop_id, named 'MCourseGroupAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCourseGroup</span>(groupCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     groupCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShopId_NotExistsReferrer_MCourseGroupList for 'not exists'. (NotNull)
     */
    public void notExistsMCourseGroup(SubQuery<MCourseGroupCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCourseGroupCB cb = new MCourseGroupCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShopId_NotExistsReferrer_MCourseGroupList(cb.query());
        registerNotExistsReferrer(cb.query(), "shop_id", "shop_id", pp, "mCourseGroupList");
    }
    public abstract String keepShopId_NotExistsReferrer_MCourseGroupList(MCourseGroupCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select shop_id from m_working_day where ...)} <br>
     * m_working_day by shop_id, named 'MWorkingDayAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMWorkingDay</span>(dayCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dayCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShopId_NotExistsReferrer_MWorkingDayList for 'not exists'. (NotNull)
     */
    public void notExistsMWorkingDay(SubQuery<MWorkingDayCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWorkingDayCB cb = new MWorkingDayCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShopId_NotExistsReferrer_MWorkingDayList(cb.query());
        registerNotExistsReferrer(cb.query(), "shop_id", "shop_id", pp, "mWorkingDayList");
    }
    public abstract String keepShopId_NotExistsReferrer_MWorkingDayList(MWorkingDayCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select shop_id from m_working_day_deff where ...)} <br>
     * m_working_day_deff by shop_id, named 'MWorkingDayDeffAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMWorkingDayDeff</span>(deffCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     deffCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShopId_NotExistsReferrer_MWorkingDayDeffList for 'not exists'. (NotNull)
     */
    public void notExistsMWorkingDayDeff(SubQuery<MWorkingDayDeffCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWorkingDayDeffCB cb = new MWorkingDayDeffCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShopId_NotExistsReferrer_MWorkingDayDeffList(cb.query());
        registerNotExistsReferrer(cb.query(), "shop_id", "shop_id", pp, "mWorkingDayDeffList");
    }
    public abstract String keepShopId_NotExistsReferrer_MWorkingDayDeffList(MWorkingDayDeffCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select shop_id from m_working_staff where ...)} <br>
     * m_working_staff by shop_id, named 'MWorkingStaffAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMWorkingStaff</span>(staffCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     staffCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShopId_NotExistsReferrer_MWorkingStaffList for 'not exists'. (NotNull)
     */
    public void notExistsMWorkingStaff(SubQuery<MWorkingStaffCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWorkingStaffCB cb = new MWorkingStaffCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShopId_NotExistsReferrer_MWorkingStaffList(cb.query());
        registerNotExistsReferrer(cb.query(), "shop_id", "shop_id", pp, "mWorkingStaffList");
    }
    public abstract String keepShopId_NotExistsReferrer_MWorkingStaffList(MWorkingStaffCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select shop_id from t_reservation where ...)} <br>
     * t_reservation by shop_id, named 'TReservationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReservation</span>(reservationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     reservationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShopId_NotExistsReferrer_TReservationList for 'not exists'. (NotNull)
     */
    public void notExistsTReservation(SubQuery<TReservationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReservationCB cb = new TReservationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShopId_NotExistsReferrer_TReservationList(cb.query());
        registerNotExistsReferrer(cb.query(), "shop_id", "shop_id", pp, "tReservationList");
    }
    public abstract String keepShopId_NotExistsReferrer_TReservationList(TReservationCQ sq);

    public void xsderiveMCourseGroupList(String fn, SubQuery<MCourseGroupCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCourseGroupCB cb = new MCourseGroupCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShopId_SpecifyDerivedReferrer_MCourseGroupList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "shop_id", "shop_id", pp, "mCourseGroupList", al, op);
    }
    public abstract String keepShopId_SpecifyDerivedReferrer_MCourseGroupList(MCourseGroupCQ sq);

    public void xsderiveMWorkingDayList(String fn, SubQuery<MWorkingDayCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWorkingDayCB cb = new MWorkingDayCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShopId_SpecifyDerivedReferrer_MWorkingDayList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "shop_id", "shop_id", pp, "mWorkingDayList", al, op);
    }
    public abstract String keepShopId_SpecifyDerivedReferrer_MWorkingDayList(MWorkingDayCQ sq);

    public void xsderiveMWorkingDayDeffList(String fn, SubQuery<MWorkingDayDeffCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWorkingDayDeffCB cb = new MWorkingDayDeffCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShopId_SpecifyDerivedReferrer_MWorkingDayDeffList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "shop_id", "shop_id", pp, "mWorkingDayDeffList", al, op);
    }
    public abstract String keepShopId_SpecifyDerivedReferrer_MWorkingDayDeffList(MWorkingDayDeffCQ sq);

    public void xsderiveMWorkingStaffList(String fn, SubQuery<MWorkingStaffCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWorkingStaffCB cb = new MWorkingStaffCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShopId_SpecifyDerivedReferrer_MWorkingStaffList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "shop_id", "shop_id", pp, "mWorkingStaffList", al, op);
    }
    public abstract String keepShopId_SpecifyDerivedReferrer_MWorkingStaffList(MWorkingStaffCQ sq);

    public void xsderiveTReservationList(String fn, SubQuery<TReservationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReservationCB cb = new TReservationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShopId_SpecifyDerivedReferrer_TReservationList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "shop_id", "shop_id", pp, "tReservationList", al, op);
    }
    public abstract String keepShopId_SpecifyDerivedReferrer_TReservationList(TReservationCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_course_group where ...)} <br>
     * m_course_group by shop_id, named 'MCourseGroupAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCourseGroup()</span>.<span style="color: #CC4747">max</span>(groupCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     groupCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     groupCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCourseGroupCB> derivedMCourseGroup() {
        return xcreateQDRFunctionMCourseGroupList();
    }
    protected HpQDRFunction<MCourseGroupCB> xcreateQDRFunctionMCourseGroupList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCourseGroupList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCourseGroupList(String fn, SubQuery<MCourseGroupCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCourseGroupCB cb = new MCourseGroupCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShopId_QueryDerivedReferrer_MCourseGroupList(cb.query()); String prpp = keepShopId_QueryDerivedReferrer_MCourseGroupListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "shop_id", "shop_id", sqpp, "mCourseGroupList", rd, vl, prpp, op);
    }
    public abstract String keepShopId_QueryDerivedReferrer_MCourseGroupList(MCourseGroupCQ sq);
    public abstract String keepShopId_QueryDerivedReferrer_MCourseGroupListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_working_day where ...)} <br>
     * m_working_day by shop_id, named 'MWorkingDayAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMWorkingDay()</span>.<span style="color: #CC4747">max</span>(dayCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dayCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     dayCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MWorkingDayCB> derivedMWorkingDay() {
        return xcreateQDRFunctionMWorkingDayList();
    }
    protected HpQDRFunction<MWorkingDayCB> xcreateQDRFunctionMWorkingDayList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMWorkingDayList(fn, sq, rd, vl, op));
    }
    public void xqderiveMWorkingDayList(String fn, SubQuery<MWorkingDayCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWorkingDayCB cb = new MWorkingDayCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShopId_QueryDerivedReferrer_MWorkingDayList(cb.query()); String prpp = keepShopId_QueryDerivedReferrer_MWorkingDayListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "shop_id", "shop_id", sqpp, "mWorkingDayList", rd, vl, prpp, op);
    }
    public abstract String keepShopId_QueryDerivedReferrer_MWorkingDayList(MWorkingDayCQ sq);
    public abstract String keepShopId_QueryDerivedReferrer_MWorkingDayListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_working_day_deff where ...)} <br>
     * m_working_day_deff by shop_id, named 'MWorkingDayDeffAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMWorkingDayDeff()</span>.<span style="color: #CC4747">max</span>(deffCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     deffCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     deffCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MWorkingDayDeffCB> derivedMWorkingDayDeff() {
        return xcreateQDRFunctionMWorkingDayDeffList();
    }
    protected HpQDRFunction<MWorkingDayDeffCB> xcreateQDRFunctionMWorkingDayDeffList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMWorkingDayDeffList(fn, sq, rd, vl, op));
    }
    public void xqderiveMWorkingDayDeffList(String fn, SubQuery<MWorkingDayDeffCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWorkingDayDeffCB cb = new MWorkingDayDeffCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShopId_QueryDerivedReferrer_MWorkingDayDeffList(cb.query()); String prpp = keepShopId_QueryDerivedReferrer_MWorkingDayDeffListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "shop_id", "shop_id", sqpp, "mWorkingDayDeffList", rd, vl, prpp, op);
    }
    public abstract String keepShopId_QueryDerivedReferrer_MWorkingDayDeffList(MWorkingDayDeffCQ sq);
    public abstract String keepShopId_QueryDerivedReferrer_MWorkingDayDeffListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_working_staff where ...)} <br>
     * m_working_staff by shop_id, named 'MWorkingStaffAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMWorkingStaff()</span>.<span style="color: #CC4747">max</span>(staffCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     staffCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     staffCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MWorkingStaffCB> derivedMWorkingStaff() {
        return xcreateQDRFunctionMWorkingStaffList();
    }
    protected HpQDRFunction<MWorkingStaffCB> xcreateQDRFunctionMWorkingStaffList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMWorkingStaffList(fn, sq, rd, vl, op));
    }
    public void xqderiveMWorkingStaffList(String fn, SubQuery<MWorkingStaffCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWorkingStaffCB cb = new MWorkingStaffCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShopId_QueryDerivedReferrer_MWorkingStaffList(cb.query()); String prpp = keepShopId_QueryDerivedReferrer_MWorkingStaffListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "shop_id", "shop_id", sqpp, "mWorkingStaffList", rd, vl, prpp, op);
    }
    public abstract String keepShopId_QueryDerivedReferrer_MWorkingStaffList(MWorkingStaffCQ sq);
    public abstract String keepShopId_QueryDerivedReferrer_MWorkingStaffListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_reservation where ...)} <br>
     * t_reservation by shop_id, named 'TReservationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReservation()</span>.<span style="color: #CC4747">max</span>(reservationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     reservationCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     reservationCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReservationCB> derivedTReservation() {
        return xcreateQDRFunctionTReservationList();
    }
    protected HpQDRFunction<TReservationCB> xcreateQDRFunctionTReservationList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReservationList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReservationList(String fn, SubQuery<TReservationCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReservationCB cb = new TReservationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShopId_QueryDerivedReferrer_TReservationList(cb.query()); String prpp = keepShopId_QueryDerivedReferrer_TReservationListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "shop_id", "shop_id", sqpp, "tReservationList", rd, vl, prpp, op);
    }
    public abstract String keepShopId_QueryDerivedReferrer_TReservationList(TReservationCQ sq);
    public abstract String keepShopId_QueryDerivedReferrer_TReservationListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * shop_id: {PK, ID, NotNull, serial(10)}
     */
    public void setShopId_IsNull() { regShopId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * shop_id: {PK, ID, NotNull, serial(10)}
     */
    public void setShopId_IsNotNull() { regShopId(CK_ISNN, DOBJ); }

    protected void regShopId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShopId(), "shop_id"); }
    protected abstract ConditionValue xgetCValueShopId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * company_id: {int4(10), FK to m_company}
     * @param companyId The value of companyId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompanyId_Equal(Integer companyId) {
        doSetCompanyId_Equal(companyId);
    }

    protected void doSetCompanyId_Equal(Integer companyId) {
        regCompanyId(CK_EQ, companyId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * company_id: {int4(10), FK to m_company}
     * @param companyId The value of companyId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompanyId_NotEqual(Integer companyId) {
        doSetCompanyId_NotEqual(companyId);
    }

    protected void doSetCompanyId_NotEqual(Integer companyId) {
        regCompanyId(CK_NES, companyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * company_id: {int4(10), FK to m_company}
     * @param companyId The value of companyId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompanyId_GreaterThan(Integer companyId) {
        regCompanyId(CK_GT, companyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * company_id: {int4(10), FK to m_company}
     * @param companyId The value of companyId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompanyId_LessThan(Integer companyId) {
        regCompanyId(CK_LT, companyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * company_id: {int4(10), FK to m_company}
     * @param companyId The value of companyId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompanyId_GreaterEqual(Integer companyId) {
        regCompanyId(CK_GE, companyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * company_id: {int4(10), FK to m_company}
     * @param companyId The value of companyId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompanyId_LessEqual(Integer companyId) {
        regCompanyId(CK_LE, companyId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * company_id: {int4(10), FK to m_company}
     * @param minNumber The min number of companyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of companyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCompanyId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCompanyId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * company_id: {int4(10), FK to m_company}
     * @param minNumber The min number of companyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of companyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCompanyId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCompanyId(), "company_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * company_id: {int4(10), FK to m_company}
     * @param companyIdList The collection of companyId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyId_InScope(Collection<Integer> companyIdList) {
        doSetCompanyId_InScope(companyIdList);
    }

    protected void doSetCompanyId_InScope(Collection<Integer> companyIdList) {
        regINS(CK_INS, cTL(companyIdList), xgetCValueCompanyId(), "company_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * company_id: {int4(10), FK to m_company}
     * @param companyIdList The collection of companyId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyId_NotInScope(Collection<Integer> companyIdList) {
        doSetCompanyId_NotInScope(companyIdList);
    }

    protected void doSetCompanyId_NotInScope(Collection<Integer> companyIdList) {
        regINS(CK_NINS, cTL(companyIdList), xgetCValueCompanyId(), "company_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * company_id: {int4(10), FK to m_company}
     */
    public void setCompanyId_IsNull() { regCompanyId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * company_id: {int4(10), FK to m_company}
     */
    public void setCompanyId_IsNotNull() { regCompanyId(CK_ISNN, DOBJ); }

    protected void regCompanyId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanyId(), "company_id"); }
    protected abstract ConditionValue xgetCValueCompanyId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * shop_abbreviated_name: {text(2147483647)}
     * @param shopAbbreviatedName The value of shopAbbreviatedName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopAbbreviatedName_Equal(String shopAbbreviatedName) {
        doSetShopAbbreviatedName_Equal(fRES(shopAbbreviatedName));
    }

    protected void doSetShopAbbreviatedName_Equal(String shopAbbreviatedName) {
        regShopAbbreviatedName(CK_EQ, shopAbbreviatedName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * shop_abbreviated_name: {text(2147483647)}
     * @param shopAbbreviatedName The value of shopAbbreviatedName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopAbbreviatedName_NotEqual(String shopAbbreviatedName) {
        doSetShopAbbreviatedName_NotEqual(fRES(shopAbbreviatedName));
    }

    protected void doSetShopAbbreviatedName_NotEqual(String shopAbbreviatedName) {
        regShopAbbreviatedName(CK_NES, shopAbbreviatedName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * shop_abbreviated_name: {text(2147483647)}
     * @param shopAbbreviatedName The value of shopAbbreviatedName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopAbbreviatedName_GreaterThan(String shopAbbreviatedName) {
        regShopAbbreviatedName(CK_GT, fRES(shopAbbreviatedName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * shop_abbreviated_name: {text(2147483647)}
     * @param shopAbbreviatedName The value of shopAbbreviatedName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopAbbreviatedName_LessThan(String shopAbbreviatedName) {
        regShopAbbreviatedName(CK_LT, fRES(shopAbbreviatedName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * shop_abbreviated_name: {text(2147483647)}
     * @param shopAbbreviatedName The value of shopAbbreviatedName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopAbbreviatedName_GreaterEqual(String shopAbbreviatedName) {
        regShopAbbreviatedName(CK_GE, fRES(shopAbbreviatedName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * shop_abbreviated_name: {text(2147483647)}
     * @param shopAbbreviatedName The value of shopAbbreviatedName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopAbbreviatedName_LessEqual(String shopAbbreviatedName) {
        regShopAbbreviatedName(CK_LE, fRES(shopAbbreviatedName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * shop_abbreviated_name: {text(2147483647)}
     * @param shopAbbreviatedNameList The collection of shopAbbreviatedName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopAbbreviatedName_InScope(Collection<String> shopAbbreviatedNameList) {
        doSetShopAbbreviatedName_InScope(shopAbbreviatedNameList);
    }

    protected void doSetShopAbbreviatedName_InScope(Collection<String> shopAbbreviatedNameList) {
        regINS(CK_INS, cTL(shopAbbreviatedNameList), xgetCValueShopAbbreviatedName(), "shop_abbreviated_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * shop_abbreviated_name: {text(2147483647)}
     * @param shopAbbreviatedNameList The collection of shopAbbreviatedName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopAbbreviatedName_NotInScope(Collection<String> shopAbbreviatedNameList) {
        doSetShopAbbreviatedName_NotInScope(shopAbbreviatedNameList);
    }

    protected void doSetShopAbbreviatedName_NotInScope(Collection<String> shopAbbreviatedNameList) {
        regINS(CK_NINS, cTL(shopAbbreviatedNameList), xgetCValueShopAbbreviatedName(), "shop_abbreviated_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * shop_abbreviated_name: {text(2147483647)} <br>
     * <pre>e.g. setShopAbbreviatedName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param shopAbbreviatedName The value of shopAbbreviatedName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShopAbbreviatedName_LikeSearch(String shopAbbreviatedName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShopAbbreviatedName_LikeSearch(shopAbbreviatedName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * shop_abbreviated_name: {text(2147483647)} <br>
     * <pre>e.g. setShopAbbreviatedName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shopAbbreviatedName The value of shopAbbreviatedName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setShopAbbreviatedName_LikeSearch(String shopAbbreviatedName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shopAbbreviatedName), xgetCValueShopAbbreviatedName(), "shop_abbreviated_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * shop_abbreviated_name: {text(2147483647)}
     * @param shopAbbreviatedName The value of shopAbbreviatedName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShopAbbreviatedName_NotLikeSearch(String shopAbbreviatedName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShopAbbreviatedName_NotLikeSearch(shopAbbreviatedName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * shop_abbreviated_name: {text(2147483647)}
     * @param shopAbbreviatedName The value of shopAbbreviatedName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setShopAbbreviatedName_NotLikeSearch(String shopAbbreviatedName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shopAbbreviatedName), xgetCValueShopAbbreviatedName(), "shop_abbreviated_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * shop_abbreviated_name: {text(2147483647)}
     */
    public void setShopAbbreviatedName_IsNull() { regShopAbbreviatedName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * shop_abbreviated_name: {text(2147483647)}
     */
    public void setShopAbbreviatedName_IsNullOrEmpty() { regShopAbbreviatedName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * shop_abbreviated_name: {text(2147483647)}
     */
    public void setShopAbbreviatedName_IsNotNull() { regShopAbbreviatedName(CK_ISNN, DOBJ); }

    protected void regShopAbbreviatedName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShopAbbreviatedName(), "shop_abbreviated_name"); }
    protected abstract ConditionValue xgetCValueShopAbbreviatedName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * shop_name: {text(2147483647)}
     * @param shopName The value of shopName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopName_Equal(String shopName) {
        doSetShopName_Equal(fRES(shopName));
    }

    protected void doSetShopName_Equal(String shopName) {
        regShopName(CK_EQ, shopName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * shop_name: {text(2147483647)}
     * @param shopName The value of shopName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopName_NotEqual(String shopName) {
        doSetShopName_NotEqual(fRES(shopName));
    }

    protected void doSetShopName_NotEqual(String shopName) {
        regShopName(CK_NES, shopName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * shop_name: {text(2147483647)}
     * @param shopName The value of shopName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopName_GreaterThan(String shopName) {
        regShopName(CK_GT, fRES(shopName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * shop_name: {text(2147483647)}
     * @param shopName The value of shopName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopName_LessThan(String shopName) {
        regShopName(CK_LT, fRES(shopName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * shop_name: {text(2147483647)}
     * @param shopName The value of shopName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopName_GreaterEqual(String shopName) {
        regShopName(CK_GE, fRES(shopName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * shop_name: {text(2147483647)}
     * @param shopName The value of shopName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopName_LessEqual(String shopName) {
        regShopName(CK_LE, fRES(shopName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * shop_name: {text(2147483647)}
     * @param shopNameList The collection of shopName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopName_InScope(Collection<String> shopNameList) {
        doSetShopName_InScope(shopNameList);
    }

    protected void doSetShopName_InScope(Collection<String> shopNameList) {
        regINS(CK_INS, cTL(shopNameList), xgetCValueShopName(), "shop_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * shop_name: {text(2147483647)}
     * @param shopNameList The collection of shopName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopName_NotInScope(Collection<String> shopNameList) {
        doSetShopName_NotInScope(shopNameList);
    }

    protected void doSetShopName_NotInScope(Collection<String> shopNameList) {
        regINS(CK_NINS, cTL(shopNameList), xgetCValueShopName(), "shop_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * shop_name: {text(2147483647)} <br>
     * <pre>e.g. setShopName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param shopName The value of shopName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShopName_LikeSearch(String shopName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShopName_LikeSearch(shopName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * shop_name: {text(2147483647)} <br>
     * <pre>e.g. setShopName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shopName The value of shopName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setShopName_LikeSearch(String shopName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shopName), xgetCValueShopName(), "shop_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * shop_name: {text(2147483647)}
     * @param shopName The value of shopName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShopName_NotLikeSearch(String shopName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShopName_NotLikeSearch(shopName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * shop_name: {text(2147483647)}
     * @param shopName The value of shopName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setShopName_NotLikeSearch(String shopName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shopName), xgetCValueShopName(), "shop_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * shop_name: {text(2147483647)}
     */
    public void setShopName_IsNull() { regShopName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * shop_name: {text(2147483647)}
     */
    public void setShopName_IsNullOrEmpty() { regShopName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * shop_name: {text(2147483647)}
     */
    public void setShopName_IsNotNull() { regShopName(CK_ISNN, DOBJ); }

    protected void regShopName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShopName(), "shop_name"); }
    protected abstract ConditionValue xgetCValueShopName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_1: {text(2147483647)}
     * @param phone11 The value of phone11 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone11_Equal(String phone11) {
        doSetPhone11_Equal(fRES(phone11));
    }

    protected void doSetPhone11_Equal(String phone11) {
        regPhone11(CK_EQ, phone11);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_1: {text(2147483647)}
     * @param phone11 The value of phone11 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone11_NotEqual(String phone11) {
        doSetPhone11_NotEqual(fRES(phone11));
    }

    protected void doSetPhone11_NotEqual(String phone11) {
        regPhone11(CK_NES, phone11);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_1: {text(2147483647)}
     * @param phone11 The value of phone11 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone11_GreaterThan(String phone11) {
        regPhone11(CK_GT, fRES(phone11));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_1: {text(2147483647)}
     * @param phone11 The value of phone11 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone11_LessThan(String phone11) {
        regPhone11(CK_LT, fRES(phone11));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_1: {text(2147483647)}
     * @param phone11 The value of phone11 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone11_GreaterEqual(String phone11) {
        regPhone11(CK_GE, fRES(phone11));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_1: {text(2147483647)}
     * @param phone11 The value of phone11 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone11_LessEqual(String phone11) {
        regPhone11(CK_LE, fRES(phone11));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone1_1: {text(2147483647)}
     * @param phone11List The collection of phone11 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone11_InScope(Collection<String> phone11List) {
        doSetPhone11_InScope(phone11List);
    }

    protected void doSetPhone11_InScope(Collection<String> phone11List) {
        regINS(CK_INS, cTL(phone11List), xgetCValuePhone11(), "phone1_1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone1_1: {text(2147483647)}
     * @param phone11List The collection of phone11 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone11_NotInScope(Collection<String> phone11List) {
        doSetPhone11_NotInScope(phone11List);
    }

    protected void doSetPhone11_NotInScope(Collection<String> phone11List) {
        regINS(CK_NINS, cTL(phone11List), xgetCValuePhone11(), "phone1_1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone1_1: {text(2147483647)} <br>
     * <pre>e.g. setPhone11_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param phone11 The value of phone11 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhone11_LikeSearch(String phone11, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhone11_LikeSearch(phone11, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone1_1: {text(2147483647)} <br>
     * <pre>e.g. setPhone11_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phone11 The value of phone11 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPhone11_LikeSearch(String phone11, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phone11), xgetCValuePhone11(), "phone1_1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone1_1: {text(2147483647)}
     * @param phone11 The value of phone11 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhone11_NotLikeSearch(String phone11, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhone11_NotLikeSearch(phone11, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone1_1: {text(2147483647)}
     * @param phone11 The value of phone11 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPhone11_NotLikeSearch(String phone11, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phone11), xgetCValuePhone11(), "phone1_1", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * phone1_1: {text(2147483647)}
     */
    public void setPhone11_IsNull() { regPhone11(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * phone1_1: {text(2147483647)}
     */
    public void setPhone11_IsNullOrEmpty() { regPhone11(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * phone1_1: {text(2147483647)}
     */
    public void setPhone11_IsNotNull() { regPhone11(CK_ISNN, DOBJ); }

    protected void regPhone11(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhone11(), "phone1_1"); }
    protected abstract ConditionValue xgetCValuePhone11();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_2: {text(2147483647)}
     * @param phone12 The value of phone12 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone12_Equal(String phone12) {
        doSetPhone12_Equal(fRES(phone12));
    }

    protected void doSetPhone12_Equal(String phone12) {
        regPhone12(CK_EQ, phone12);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_2: {text(2147483647)}
     * @param phone12 The value of phone12 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone12_NotEqual(String phone12) {
        doSetPhone12_NotEqual(fRES(phone12));
    }

    protected void doSetPhone12_NotEqual(String phone12) {
        regPhone12(CK_NES, phone12);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_2: {text(2147483647)}
     * @param phone12 The value of phone12 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone12_GreaterThan(String phone12) {
        regPhone12(CK_GT, fRES(phone12));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_2: {text(2147483647)}
     * @param phone12 The value of phone12 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone12_LessThan(String phone12) {
        regPhone12(CK_LT, fRES(phone12));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_2: {text(2147483647)}
     * @param phone12 The value of phone12 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone12_GreaterEqual(String phone12) {
        regPhone12(CK_GE, fRES(phone12));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_2: {text(2147483647)}
     * @param phone12 The value of phone12 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone12_LessEqual(String phone12) {
        regPhone12(CK_LE, fRES(phone12));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone1_2: {text(2147483647)}
     * @param phone12List The collection of phone12 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone12_InScope(Collection<String> phone12List) {
        doSetPhone12_InScope(phone12List);
    }

    protected void doSetPhone12_InScope(Collection<String> phone12List) {
        regINS(CK_INS, cTL(phone12List), xgetCValuePhone12(), "phone1_2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone1_2: {text(2147483647)}
     * @param phone12List The collection of phone12 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone12_NotInScope(Collection<String> phone12List) {
        doSetPhone12_NotInScope(phone12List);
    }

    protected void doSetPhone12_NotInScope(Collection<String> phone12List) {
        regINS(CK_NINS, cTL(phone12List), xgetCValuePhone12(), "phone1_2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone1_2: {text(2147483647)} <br>
     * <pre>e.g. setPhone12_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param phone12 The value of phone12 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhone12_LikeSearch(String phone12, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhone12_LikeSearch(phone12, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone1_2: {text(2147483647)} <br>
     * <pre>e.g. setPhone12_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phone12 The value of phone12 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPhone12_LikeSearch(String phone12, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phone12), xgetCValuePhone12(), "phone1_2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone1_2: {text(2147483647)}
     * @param phone12 The value of phone12 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhone12_NotLikeSearch(String phone12, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhone12_NotLikeSearch(phone12, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone1_2: {text(2147483647)}
     * @param phone12 The value of phone12 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPhone12_NotLikeSearch(String phone12, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phone12), xgetCValuePhone12(), "phone1_2", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * phone1_2: {text(2147483647)}
     */
    public void setPhone12_IsNull() { regPhone12(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * phone1_2: {text(2147483647)}
     */
    public void setPhone12_IsNullOrEmpty() { regPhone12(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * phone1_2: {text(2147483647)}
     */
    public void setPhone12_IsNotNull() { regPhone12(CK_ISNN, DOBJ); }

    protected void regPhone12(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhone12(), "phone1_2"); }
    protected abstract ConditionValue xgetCValuePhone12();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_3: {text(2147483647)}
     * @param phone13 The value of phone13 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone13_Equal(String phone13) {
        doSetPhone13_Equal(fRES(phone13));
    }

    protected void doSetPhone13_Equal(String phone13) {
        regPhone13(CK_EQ, phone13);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_3: {text(2147483647)}
     * @param phone13 The value of phone13 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone13_NotEqual(String phone13) {
        doSetPhone13_NotEqual(fRES(phone13));
    }

    protected void doSetPhone13_NotEqual(String phone13) {
        regPhone13(CK_NES, phone13);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_3: {text(2147483647)}
     * @param phone13 The value of phone13 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone13_GreaterThan(String phone13) {
        regPhone13(CK_GT, fRES(phone13));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_3: {text(2147483647)}
     * @param phone13 The value of phone13 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone13_LessThan(String phone13) {
        regPhone13(CK_LT, fRES(phone13));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_3: {text(2147483647)}
     * @param phone13 The value of phone13 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone13_GreaterEqual(String phone13) {
        regPhone13(CK_GE, fRES(phone13));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone1_3: {text(2147483647)}
     * @param phone13 The value of phone13 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone13_LessEqual(String phone13) {
        regPhone13(CK_LE, fRES(phone13));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone1_3: {text(2147483647)}
     * @param phone13List The collection of phone13 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone13_InScope(Collection<String> phone13List) {
        doSetPhone13_InScope(phone13List);
    }

    protected void doSetPhone13_InScope(Collection<String> phone13List) {
        regINS(CK_INS, cTL(phone13List), xgetCValuePhone13(), "phone1_3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone1_3: {text(2147483647)}
     * @param phone13List The collection of phone13 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone13_NotInScope(Collection<String> phone13List) {
        doSetPhone13_NotInScope(phone13List);
    }

    protected void doSetPhone13_NotInScope(Collection<String> phone13List) {
        regINS(CK_NINS, cTL(phone13List), xgetCValuePhone13(), "phone1_3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone1_3: {text(2147483647)} <br>
     * <pre>e.g. setPhone13_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param phone13 The value of phone13 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhone13_LikeSearch(String phone13, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhone13_LikeSearch(phone13, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone1_3: {text(2147483647)} <br>
     * <pre>e.g. setPhone13_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phone13 The value of phone13 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPhone13_LikeSearch(String phone13, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phone13), xgetCValuePhone13(), "phone1_3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone1_3: {text(2147483647)}
     * @param phone13 The value of phone13 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhone13_NotLikeSearch(String phone13, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhone13_NotLikeSearch(phone13, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone1_3: {text(2147483647)}
     * @param phone13 The value of phone13 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPhone13_NotLikeSearch(String phone13, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phone13), xgetCValuePhone13(), "phone1_3", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * phone1_3: {text(2147483647)}
     */
    public void setPhone13_IsNull() { regPhone13(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * phone1_3: {text(2147483647)}
     */
    public void setPhone13_IsNullOrEmpty() { regPhone13(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * phone1_3: {text(2147483647)}
     */
    public void setPhone13_IsNotNull() { regPhone13(CK_ISNN, DOBJ); }

    protected void regPhone13(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhone13(), "phone1_3"); }
    protected abstract ConditionValue xgetCValuePhone13();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_1: {text(2147483647)}
     * @param phone21 The value of phone21 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone21_Equal(String phone21) {
        doSetPhone21_Equal(fRES(phone21));
    }

    protected void doSetPhone21_Equal(String phone21) {
        regPhone21(CK_EQ, phone21);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_1: {text(2147483647)}
     * @param phone21 The value of phone21 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone21_NotEqual(String phone21) {
        doSetPhone21_NotEqual(fRES(phone21));
    }

    protected void doSetPhone21_NotEqual(String phone21) {
        regPhone21(CK_NES, phone21);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_1: {text(2147483647)}
     * @param phone21 The value of phone21 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone21_GreaterThan(String phone21) {
        regPhone21(CK_GT, fRES(phone21));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_1: {text(2147483647)}
     * @param phone21 The value of phone21 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone21_LessThan(String phone21) {
        regPhone21(CK_LT, fRES(phone21));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_1: {text(2147483647)}
     * @param phone21 The value of phone21 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone21_GreaterEqual(String phone21) {
        regPhone21(CK_GE, fRES(phone21));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_1: {text(2147483647)}
     * @param phone21 The value of phone21 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone21_LessEqual(String phone21) {
        regPhone21(CK_LE, fRES(phone21));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone2_1: {text(2147483647)}
     * @param phone21List The collection of phone21 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone21_InScope(Collection<String> phone21List) {
        doSetPhone21_InScope(phone21List);
    }

    protected void doSetPhone21_InScope(Collection<String> phone21List) {
        regINS(CK_INS, cTL(phone21List), xgetCValuePhone21(), "phone2_1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone2_1: {text(2147483647)}
     * @param phone21List The collection of phone21 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone21_NotInScope(Collection<String> phone21List) {
        doSetPhone21_NotInScope(phone21List);
    }

    protected void doSetPhone21_NotInScope(Collection<String> phone21List) {
        regINS(CK_NINS, cTL(phone21List), xgetCValuePhone21(), "phone2_1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone2_1: {text(2147483647)} <br>
     * <pre>e.g. setPhone21_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param phone21 The value of phone21 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhone21_LikeSearch(String phone21, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhone21_LikeSearch(phone21, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone2_1: {text(2147483647)} <br>
     * <pre>e.g. setPhone21_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phone21 The value of phone21 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPhone21_LikeSearch(String phone21, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phone21), xgetCValuePhone21(), "phone2_1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone2_1: {text(2147483647)}
     * @param phone21 The value of phone21 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhone21_NotLikeSearch(String phone21, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhone21_NotLikeSearch(phone21, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone2_1: {text(2147483647)}
     * @param phone21 The value of phone21 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPhone21_NotLikeSearch(String phone21, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phone21), xgetCValuePhone21(), "phone2_1", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * phone2_1: {text(2147483647)}
     */
    public void setPhone21_IsNull() { regPhone21(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * phone2_1: {text(2147483647)}
     */
    public void setPhone21_IsNullOrEmpty() { regPhone21(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * phone2_1: {text(2147483647)}
     */
    public void setPhone21_IsNotNull() { regPhone21(CK_ISNN, DOBJ); }

    protected void regPhone21(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhone21(), "phone2_1"); }
    protected abstract ConditionValue xgetCValuePhone21();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_2: {text(2147483647)}
     * @param phone22 The value of phone22 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone22_Equal(String phone22) {
        doSetPhone22_Equal(fRES(phone22));
    }

    protected void doSetPhone22_Equal(String phone22) {
        regPhone22(CK_EQ, phone22);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_2: {text(2147483647)}
     * @param phone22 The value of phone22 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone22_NotEqual(String phone22) {
        doSetPhone22_NotEqual(fRES(phone22));
    }

    protected void doSetPhone22_NotEqual(String phone22) {
        regPhone22(CK_NES, phone22);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_2: {text(2147483647)}
     * @param phone22 The value of phone22 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone22_GreaterThan(String phone22) {
        regPhone22(CK_GT, fRES(phone22));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_2: {text(2147483647)}
     * @param phone22 The value of phone22 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone22_LessThan(String phone22) {
        regPhone22(CK_LT, fRES(phone22));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_2: {text(2147483647)}
     * @param phone22 The value of phone22 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone22_GreaterEqual(String phone22) {
        regPhone22(CK_GE, fRES(phone22));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_2: {text(2147483647)}
     * @param phone22 The value of phone22 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone22_LessEqual(String phone22) {
        regPhone22(CK_LE, fRES(phone22));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone2_2: {text(2147483647)}
     * @param phone22List The collection of phone22 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone22_InScope(Collection<String> phone22List) {
        doSetPhone22_InScope(phone22List);
    }

    protected void doSetPhone22_InScope(Collection<String> phone22List) {
        regINS(CK_INS, cTL(phone22List), xgetCValuePhone22(), "phone2_2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone2_2: {text(2147483647)}
     * @param phone22List The collection of phone22 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone22_NotInScope(Collection<String> phone22List) {
        doSetPhone22_NotInScope(phone22List);
    }

    protected void doSetPhone22_NotInScope(Collection<String> phone22List) {
        regINS(CK_NINS, cTL(phone22List), xgetCValuePhone22(), "phone2_2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone2_2: {text(2147483647)} <br>
     * <pre>e.g. setPhone22_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param phone22 The value of phone22 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhone22_LikeSearch(String phone22, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhone22_LikeSearch(phone22, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone2_2: {text(2147483647)} <br>
     * <pre>e.g. setPhone22_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phone22 The value of phone22 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPhone22_LikeSearch(String phone22, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phone22), xgetCValuePhone22(), "phone2_2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone2_2: {text(2147483647)}
     * @param phone22 The value of phone22 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhone22_NotLikeSearch(String phone22, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhone22_NotLikeSearch(phone22, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone2_2: {text(2147483647)}
     * @param phone22 The value of phone22 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPhone22_NotLikeSearch(String phone22, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phone22), xgetCValuePhone22(), "phone2_2", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * phone2_2: {text(2147483647)}
     */
    public void setPhone22_IsNull() { regPhone22(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * phone2_2: {text(2147483647)}
     */
    public void setPhone22_IsNullOrEmpty() { regPhone22(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * phone2_2: {text(2147483647)}
     */
    public void setPhone22_IsNotNull() { regPhone22(CK_ISNN, DOBJ); }

    protected void regPhone22(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhone22(), "phone2_2"); }
    protected abstract ConditionValue xgetCValuePhone22();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_3: {text(2147483647)}
     * @param phone23 The value of phone23 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone23_Equal(String phone23) {
        doSetPhone23_Equal(fRES(phone23));
    }

    protected void doSetPhone23_Equal(String phone23) {
        regPhone23(CK_EQ, phone23);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_3: {text(2147483647)}
     * @param phone23 The value of phone23 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone23_NotEqual(String phone23) {
        doSetPhone23_NotEqual(fRES(phone23));
    }

    protected void doSetPhone23_NotEqual(String phone23) {
        regPhone23(CK_NES, phone23);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_3: {text(2147483647)}
     * @param phone23 The value of phone23 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone23_GreaterThan(String phone23) {
        regPhone23(CK_GT, fRES(phone23));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_3: {text(2147483647)}
     * @param phone23 The value of phone23 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone23_LessThan(String phone23) {
        regPhone23(CK_LT, fRES(phone23));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_3: {text(2147483647)}
     * @param phone23 The value of phone23 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone23_GreaterEqual(String phone23) {
        regPhone23(CK_GE, fRES(phone23));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone2_3: {text(2147483647)}
     * @param phone23 The value of phone23 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone23_LessEqual(String phone23) {
        regPhone23(CK_LE, fRES(phone23));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone2_3: {text(2147483647)}
     * @param phone23List The collection of phone23 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone23_InScope(Collection<String> phone23List) {
        doSetPhone23_InScope(phone23List);
    }

    protected void doSetPhone23_InScope(Collection<String> phone23List) {
        regINS(CK_INS, cTL(phone23List), xgetCValuePhone23(), "phone2_3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone2_3: {text(2147483647)}
     * @param phone23List The collection of phone23 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone23_NotInScope(Collection<String> phone23List) {
        doSetPhone23_NotInScope(phone23List);
    }

    protected void doSetPhone23_NotInScope(Collection<String> phone23List) {
        regINS(CK_NINS, cTL(phone23List), xgetCValuePhone23(), "phone2_3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone2_3: {text(2147483647)} <br>
     * <pre>e.g. setPhone23_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param phone23 The value of phone23 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhone23_LikeSearch(String phone23, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhone23_LikeSearch(phone23, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone2_3: {text(2147483647)} <br>
     * <pre>e.g. setPhone23_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phone23 The value of phone23 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPhone23_LikeSearch(String phone23, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phone23), xgetCValuePhone23(), "phone2_3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone2_3: {text(2147483647)}
     * @param phone23 The value of phone23 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhone23_NotLikeSearch(String phone23, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhone23_NotLikeSearch(phone23, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone2_3: {text(2147483647)}
     * @param phone23 The value of phone23 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPhone23_NotLikeSearch(String phone23, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phone23), xgetCValuePhone23(), "phone2_3", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * phone2_3: {text(2147483647)}
     */
    public void setPhone23_IsNull() { regPhone23(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * phone2_3: {text(2147483647)}
     */
    public void setPhone23_IsNullOrEmpty() { regPhone23(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * phone2_3: {text(2147483647)}
     */
    public void setPhone23_IsNotNull() { regPhone23(CK_ISNN, DOBJ); }

    protected void regPhone23(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhone23(), "phone2_3"); }
    protected abstract ConditionValue xgetCValuePhone23();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_1: {text(2147483647)}
     * @param fax1 The value of fax1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_Equal(String fax1) {
        doSetFax1_Equal(fRES(fax1));
    }

    protected void doSetFax1_Equal(String fax1) {
        regFax1(CK_EQ, fax1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_1: {text(2147483647)}
     * @param fax1 The value of fax1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_NotEqual(String fax1) {
        doSetFax1_NotEqual(fRES(fax1));
    }

    protected void doSetFax1_NotEqual(String fax1) {
        regFax1(CK_NES, fax1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_1: {text(2147483647)}
     * @param fax1 The value of fax1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_GreaterThan(String fax1) {
        regFax1(CK_GT, fRES(fax1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_1: {text(2147483647)}
     * @param fax1 The value of fax1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_LessThan(String fax1) {
        regFax1(CK_LT, fRES(fax1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_1: {text(2147483647)}
     * @param fax1 The value of fax1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_GreaterEqual(String fax1) {
        regFax1(CK_GE, fRES(fax1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_1: {text(2147483647)}
     * @param fax1 The value of fax1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_LessEqual(String fax1) {
        regFax1(CK_LE, fRES(fax1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * fax_1: {text(2147483647)}
     * @param fax1List The collection of fax1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_InScope(Collection<String> fax1List) {
        doSetFax1_InScope(fax1List);
    }

    protected void doSetFax1_InScope(Collection<String> fax1List) {
        regINS(CK_INS, cTL(fax1List), xgetCValueFax1(), "fax_1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * fax_1: {text(2147483647)}
     * @param fax1List The collection of fax1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_NotInScope(Collection<String> fax1List) {
        doSetFax1_NotInScope(fax1List);
    }

    protected void doSetFax1_NotInScope(Collection<String> fax1List) {
        regINS(CK_NINS, cTL(fax1List), xgetCValueFax1(), "fax_1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * fax_1: {text(2147483647)} <br>
     * <pre>e.g. setFax1_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param fax1 The value of fax1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFax1_LikeSearch(String fax1, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFax1_LikeSearch(fax1, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * fax_1: {text(2147483647)} <br>
     * <pre>e.g. setFax1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fax1 The value of fax1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFax1_LikeSearch(String fax1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fax1), xgetCValueFax1(), "fax_1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * fax_1: {text(2147483647)}
     * @param fax1 The value of fax1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFax1_NotLikeSearch(String fax1, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFax1_NotLikeSearch(fax1, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * fax_1: {text(2147483647)}
     * @param fax1 The value of fax1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFax1_NotLikeSearch(String fax1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fax1), xgetCValueFax1(), "fax_1", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * fax_1: {text(2147483647)}
     */
    public void setFax1_IsNull() { regFax1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * fax_1: {text(2147483647)}
     */
    public void setFax1_IsNullOrEmpty() { regFax1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * fax_1: {text(2147483647)}
     */
    public void setFax1_IsNotNull() { regFax1(CK_ISNN, DOBJ); }

    protected void regFax1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFax1(), "fax_1"); }
    protected abstract ConditionValue xgetCValueFax1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_2: {text(2147483647)}
     * @param fax2 The value of fax2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_Equal(String fax2) {
        doSetFax2_Equal(fRES(fax2));
    }

    protected void doSetFax2_Equal(String fax2) {
        regFax2(CK_EQ, fax2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_2: {text(2147483647)}
     * @param fax2 The value of fax2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_NotEqual(String fax2) {
        doSetFax2_NotEqual(fRES(fax2));
    }

    protected void doSetFax2_NotEqual(String fax2) {
        regFax2(CK_NES, fax2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_2: {text(2147483647)}
     * @param fax2 The value of fax2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_GreaterThan(String fax2) {
        regFax2(CK_GT, fRES(fax2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_2: {text(2147483647)}
     * @param fax2 The value of fax2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_LessThan(String fax2) {
        regFax2(CK_LT, fRES(fax2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_2: {text(2147483647)}
     * @param fax2 The value of fax2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_GreaterEqual(String fax2) {
        regFax2(CK_GE, fRES(fax2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_2: {text(2147483647)}
     * @param fax2 The value of fax2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_LessEqual(String fax2) {
        regFax2(CK_LE, fRES(fax2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * fax_2: {text(2147483647)}
     * @param fax2List The collection of fax2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_InScope(Collection<String> fax2List) {
        doSetFax2_InScope(fax2List);
    }

    protected void doSetFax2_InScope(Collection<String> fax2List) {
        regINS(CK_INS, cTL(fax2List), xgetCValueFax2(), "fax_2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * fax_2: {text(2147483647)}
     * @param fax2List The collection of fax2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_NotInScope(Collection<String> fax2List) {
        doSetFax2_NotInScope(fax2List);
    }

    protected void doSetFax2_NotInScope(Collection<String> fax2List) {
        regINS(CK_NINS, cTL(fax2List), xgetCValueFax2(), "fax_2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * fax_2: {text(2147483647)} <br>
     * <pre>e.g. setFax2_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param fax2 The value of fax2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFax2_LikeSearch(String fax2, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFax2_LikeSearch(fax2, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * fax_2: {text(2147483647)} <br>
     * <pre>e.g. setFax2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fax2 The value of fax2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFax2_LikeSearch(String fax2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fax2), xgetCValueFax2(), "fax_2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * fax_2: {text(2147483647)}
     * @param fax2 The value of fax2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFax2_NotLikeSearch(String fax2, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFax2_NotLikeSearch(fax2, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * fax_2: {text(2147483647)}
     * @param fax2 The value of fax2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFax2_NotLikeSearch(String fax2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fax2), xgetCValueFax2(), "fax_2", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * fax_2: {text(2147483647)}
     */
    public void setFax2_IsNull() { regFax2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * fax_2: {text(2147483647)}
     */
    public void setFax2_IsNullOrEmpty() { regFax2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * fax_2: {text(2147483647)}
     */
    public void setFax2_IsNotNull() { regFax2(CK_ISNN, DOBJ); }

    protected void regFax2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFax2(), "fax_2"); }
    protected abstract ConditionValue xgetCValueFax2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_3: {text(2147483647)}
     * @param fax3 The value of fax3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax3_Equal(String fax3) {
        doSetFax3_Equal(fRES(fax3));
    }

    protected void doSetFax3_Equal(String fax3) {
        regFax3(CK_EQ, fax3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_3: {text(2147483647)}
     * @param fax3 The value of fax3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax3_NotEqual(String fax3) {
        doSetFax3_NotEqual(fRES(fax3));
    }

    protected void doSetFax3_NotEqual(String fax3) {
        regFax3(CK_NES, fax3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_3: {text(2147483647)}
     * @param fax3 The value of fax3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax3_GreaterThan(String fax3) {
        regFax3(CK_GT, fRES(fax3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_3: {text(2147483647)}
     * @param fax3 The value of fax3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax3_LessThan(String fax3) {
        regFax3(CK_LT, fRES(fax3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_3: {text(2147483647)}
     * @param fax3 The value of fax3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax3_GreaterEqual(String fax3) {
        regFax3(CK_GE, fRES(fax3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fax_3: {text(2147483647)}
     * @param fax3 The value of fax3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax3_LessEqual(String fax3) {
        regFax3(CK_LE, fRES(fax3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * fax_3: {text(2147483647)}
     * @param fax3List The collection of fax3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax3_InScope(Collection<String> fax3List) {
        doSetFax3_InScope(fax3List);
    }

    protected void doSetFax3_InScope(Collection<String> fax3List) {
        regINS(CK_INS, cTL(fax3List), xgetCValueFax3(), "fax_3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * fax_3: {text(2147483647)}
     * @param fax3List The collection of fax3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax3_NotInScope(Collection<String> fax3List) {
        doSetFax3_NotInScope(fax3List);
    }

    protected void doSetFax3_NotInScope(Collection<String> fax3List) {
        regINS(CK_NINS, cTL(fax3List), xgetCValueFax3(), "fax_3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * fax_3: {text(2147483647)} <br>
     * <pre>e.g. setFax3_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param fax3 The value of fax3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFax3_LikeSearch(String fax3, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFax3_LikeSearch(fax3, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * fax_3: {text(2147483647)} <br>
     * <pre>e.g. setFax3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fax3 The value of fax3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFax3_LikeSearch(String fax3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fax3), xgetCValueFax3(), "fax_3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * fax_3: {text(2147483647)}
     * @param fax3 The value of fax3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFax3_NotLikeSearch(String fax3, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFax3_NotLikeSearch(fax3, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * fax_3: {text(2147483647)}
     * @param fax3 The value of fax3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFax3_NotLikeSearch(String fax3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fax3), xgetCValueFax3(), "fax_3", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * fax_3: {text(2147483647)}
     */
    public void setFax3_IsNull() { regFax3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * fax_3: {text(2147483647)}
     */
    public void setFax3_IsNullOrEmpty() { regFax3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * fax_3: {text(2147483647)}
     */
    public void setFax3_IsNotNull() { regFax3(CK_ISNN, DOBJ); }

    protected void regFax3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFax3(), "fax_3"); }
    protected abstract ConditionValue xgetCValueFax3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email1: {text(2147483647)}
     * @param email1 The value of email1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail1_Equal(String email1) {
        doSetEmail1_Equal(fRES(email1));
    }

    protected void doSetEmail1_Equal(String email1) {
        regEmail1(CK_EQ, email1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email1: {text(2147483647)}
     * @param email1 The value of email1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail1_NotEqual(String email1) {
        doSetEmail1_NotEqual(fRES(email1));
    }

    protected void doSetEmail1_NotEqual(String email1) {
        regEmail1(CK_NES, email1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email1: {text(2147483647)}
     * @param email1 The value of email1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail1_GreaterThan(String email1) {
        regEmail1(CK_GT, fRES(email1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email1: {text(2147483647)}
     * @param email1 The value of email1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail1_LessThan(String email1) {
        regEmail1(CK_LT, fRES(email1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email1: {text(2147483647)}
     * @param email1 The value of email1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail1_GreaterEqual(String email1) {
        regEmail1(CK_GE, fRES(email1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email1: {text(2147483647)}
     * @param email1 The value of email1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail1_LessEqual(String email1) {
        regEmail1(CK_LE, fRES(email1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * email1: {text(2147483647)}
     * @param email1List The collection of email1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail1_InScope(Collection<String> email1List) {
        doSetEmail1_InScope(email1List);
    }

    protected void doSetEmail1_InScope(Collection<String> email1List) {
        regINS(CK_INS, cTL(email1List), xgetCValueEmail1(), "email1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * email1: {text(2147483647)}
     * @param email1List The collection of email1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail1_NotInScope(Collection<String> email1List) {
        doSetEmail1_NotInScope(email1List);
    }

    protected void doSetEmail1_NotInScope(Collection<String> email1List) {
        regINS(CK_NINS, cTL(email1List), xgetCValueEmail1(), "email1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * email1: {text(2147483647)} <br>
     * <pre>e.g. setEmail1_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param email1 The value of email1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEmail1_LikeSearch(String email1, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEmail1_LikeSearch(email1, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * email1: {text(2147483647)} <br>
     * <pre>e.g. setEmail1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param email1 The value of email1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setEmail1_LikeSearch(String email1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(email1), xgetCValueEmail1(), "email1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * email1: {text(2147483647)}
     * @param email1 The value of email1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEmail1_NotLikeSearch(String email1, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEmail1_NotLikeSearch(email1, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * email1: {text(2147483647)}
     * @param email1 The value of email1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setEmail1_NotLikeSearch(String email1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(email1), xgetCValueEmail1(), "email1", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * email1: {text(2147483647)}
     */
    public void setEmail1_IsNull() { regEmail1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * email1: {text(2147483647)}
     */
    public void setEmail1_IsNullOrEmpty() { regEmail1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * email1: {text(2147483647)}
     */
    public void setEmail1_IsNotNull() { regEmail1(CK_ISNN, DOBJ); }

    protected void regEmail1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmail1(), "email1"); }
    protected abstract ConditionValue xgetCValueEmail1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email2: {text(2147483647)}
     * @param email2 The value of email2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail2_Equal(String email2) {
        doSetEmail2_Equal(fRES(email2));
    }

    protected void doSetEmail2_Equal(String email2) {
        regEmail2(CK_EQ, email2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email2: {text(2147483647)}
     * @param email2 The value of email2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail2_NotEqual(String email2) {
        doSetEmail2_NotEqual(fRES(email2));
    }

    protected void doSetEmail2_NotEqual(String email2) {
        regEmail2(CK_NES, email2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email2: {text(2147483647)}
     * @param email2 The value of email2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail2_GreaterThan(String email2) {
        regEmail2(CK_GT, fRES(email2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email2: {text(2147483647)}
     * @param email2 The value of email2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail2_LessThan(String email2) {
        regEmail2(CK_LT, fRES(email2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email2: {text(2147483647)}
     * @param email2 The value of email2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail2_GreaterEqual(String email2) {
        regEmail2(CK_GE, fRES(email2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email2: {text(2147483647)}
     * @param email2 The value of email2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail2_LessEqual(String email2) {
        regEmail2(CK_LE, fRES(email2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * email2: {text(2147483647)}
     * @param email2List The collection of email2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail2_InScope(Collection<String> email2List) {
        doSetEmail2_InScope(email2List);
    }

    protected void doSetEmail2_InScope(Collection<String> email2List) {
        regINS(CK_INS, cTL(email2List), xgetCValueEmail2(), "email2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * email2: {text(2147483647)}
     * @param email2List The collection of email2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail2_NotInScope(Collection<String> email2List) {
        doSetEmail2_NotInScope(email2List);
    }

    protected void doSetEmail2_NotInScope(Collection<String> email2List) {
        regINS(CK_NINS, cTL(email2List), xgetCValueEmail2(), "email2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * email2: {text(2147483647)} <br>
     * <pre>e.g. setEmail2_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param email2 The value of email2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEmail2_LikeSearch(String email2, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEmail2_LikeSearch(email2, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * email2: {text(2147483647)} <br>
     * <pre>e.g. setEmail2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param email2 The value of email2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setEmail2_LikeSearch(String email2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(email2), xgetCValueEmail2(), "email2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * email2: {text(2147483647)}
     * @param email2 The value of email2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEmail2_NotLikeSearch(String email2, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEmail2_NotLikeSearch(email2, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * email2: {text(2147483647)}
     * @param email2 The value of email2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setEmail2_NotLikeSearch(String email2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(email2), xgetCValueEmail2(), "email2", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * email2: {text(2147483647)}
     */
    public void setEmail2_IsNull() { regEmail2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * email2: {text(2147483647)}
     */
    public void setEmail2_IsNullOrEmpty() { regEmail2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * email2: {text(2147483647)}
     */
    public void setEmail2_IsNotNull() { regEmail2(CK_ISNN, DOBJ); }

    protected void regEmail2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmail2(), "email2"); }
    protected abstract ConditionValue xgetCValueEmail2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * url: {text(2147483647)}
     * @param url The value of url as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_Equal(String url) {
        doSetUrl_Equal(fRES(url));
    }

    protected void doSetUrl_Equal(String url) {
        regUrl(CK_EQ, url);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * url: {text(2147483647)}
     * @param url The value of url as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_NotEqual(String url) {
        doSetUrl_NotEqual(fRES(url));
    }

    protected void doSetUrl_NotEqual(String url) {
        regUrl(CK_NES, url);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * url: {text(2147483647)}
     * @param url The value of url as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_GreaterThan(String url) {
        regUrl(CK_GT, fRES(url));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * url: {text(2147483647)}
     * @param url The value of url as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_LessThan(String url) {
        regUrl(CK_LT, fRES(url));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * url: {text(2147483647)}
     * @param url The value of url as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_GreaterEqual(String url) {
        regUrl(CK_GE, fRES(url));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * url: {text(2147483647)}
     * @param url The value of url as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_LessEqual(String url) {
        regUrl(CK_LE, fRES(url));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * url: {text(2147483647)}
     * @param urlList The collection of url as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_InScope(Collection<String> urlList) {
        doSetUrl_InScope(urlList);
    }

    protected void doSetUrl_InScope(Collection<String> urlList) {
        regINS(CK_INS, cTL(urlList), xgetCValueUrl(), "url");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * url: {text(2147483647)}
     * @param urlList The collection of url as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_NotInScope(Collection<String> urlList) {
        doSetUrl_NotInScope(urlList);
    }

    protected void doSetUrl_NotInScope(Collection<String> urlList) {
        regINS(CK_NINS, cTL(urlList), xgetCValueUrl(), "url");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * url: {text(2147483647)} <br>
     * <pre>e.g. setUrl_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param url The value of url as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUrl_LikeSearch(String url, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUrl_LikeSearch(url, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * url: {text(2147483647)} <br>
     * <pre>e.g. setUrl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param url The value of url as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUrl_LikeSearch(String url, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(url), xgetCValueUrl(), "url", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * url: {text(2147483647)}
     * @param url The value of url as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUrl_NotLikeSearch(String url, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUrl_NotLikeSearch(url, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * url: {text(2147483647)}
     * @param url The value of url as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUrl_NotLikeSearch(String url, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(url), xgetCValueUrl(), "url", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * url: {text(2147483647)}
     */
    public void setUrl_IsNull() { regUrl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * url: {text(2147483647)}
     */
    public void setUrl_IsNullOrEmpty() { regUrl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * url: {text(2147483647)}
     */
    public void setUrl_IsNotNull() { regUrl(CK_ISNN, DOBJ); }

    protected void regUrl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUrl(), "url"); }
    protected abstract ConditionValue xgetCValueUrl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * prefecture: {int2(5)}
     * @param prefecture The value of prefecture as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrefecture_Equal(Integer prefecture) {
        doSetPrefecture_Equal(prefecture);
    }

    protected void doSetPrefecture_Equal(Integer prefecture) {
        regPrefecture(CK_EQ, prefecture);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * prefecture: {int2(5)}
     * @param prefecture The value of prefecture as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrefecture_NotEqual(Integer prefecture) {
        doSetPrefecture_NotEqual(prefecture);
    }

    protected void doSetPrefecture_NotEqual(Integer prefecture) {
        regPrefecture(CK_NES, prefecture);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * prefecture: {int2(5)}
     * @param prefecture The value of prefecture as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrefecture_GreaterThan(Integer prefecture) {
        regPrefecture(CK_GT, prefecture);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * prefecture: {int2(5)}
     * @param prefecture The value of prefecture as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrefecture_LessThan(Integer prefecture) {
        regPrefecture(CK_LT, prefecture);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * prefecture: {int2(5)}
     * @param prefecture The value of prefecture as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrefecture_GreaterEqual(Integer prefecture) {
        regPrefecture(CK_GE, prefecture);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * prefecture: {int2(5)}
     * @param prefecture The value of prefecture as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrefecture_LessEqual(Integer prefecture) {
        regPrefecture(CK_LE, prefecture);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * prefecture: {int2(5)}
     * @param minNumber The min number of prefecture. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of prefecture. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPrefecture_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPrefecture_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * prefecture: {int2(5)}
     * @param minNumber The min number of prefecture. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of prefecture. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPrefecture_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrefecture(), "prefecture", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * prefecture: {int2(5)}
     * @param prefectureList The collection of prefecture as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_InScope(Collection<Integer> prefectureList) {
        doSetPrefecture_InScope(prefectureList);
    }

    protected void doSetPrefecture_InScope(Collection<Integer> prefectureList) {
        regINS(CK_INS, cTL(prefectureList), xgetCValuePrefecture(), "prefecture");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * prefecture: {int2(5)}
     * @param prefectureList The collection of prefecture as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_NotInScope(Collection<Integer> prefectureList) {
        doSetPrefecture_NotInScope(prefectureList);
    }

    protected void doSetPrefecture_NotInScope(Collection<Integer> prefectureList) {
        regINS(CK_NINS, cTL(prefectureList), xgetCValuePrefecture(), "prefecture");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * prefecture: {int2(5)}
     */
    public void setPrefecture_IsNull() { regPrefecture(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * prefecture: {int2(5)}
     */
    public void setPrefecture_IsNotNull() { regPrefecture(CK_ISNN, DOBJ); }

    protected void regPrefecture(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrefecture(), "prefecture"); }
    protected abstract ConditionValue xgetCValuePrefecture();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {text(2147483647)}
     * @param city The value of city as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_Equal(String city) {
        doSetCity_Equal(fRES(city));
    }

    protected void doSetCity_Equal(String city) {
        regCity(CK_EQ, city);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {text(2147483647)}
     * @param city The value of city as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_NotEqual(String city) {
        doSetCity_NotEqual(fRES(city));
    }

    protected void doSetCity_NotEqual(String city) {
        regCity(CK_NES, city);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {text(2147483647)}
     * @param city The value of city as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_GreaterThan(String city) {
        regCity(CK_GT, fRES(city));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {text(2147483647)}
     * @param city The value of city as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_LessThan(String city) {
        regCity(CK_LT, fRES(city));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {text(2147483647)}
     * @param city The value of city as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_GreaterEqual(String city) {
        regCity(CK_GE, fRES(city));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {text(2147483647)}
     * @param city The value of city as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_LessEqual(String city) {
        regCity(CK_LE, fRES(city));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * city: {text(2147483647)}
     * @param cityList The collection of city as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_InScope(Collection<String> cityList) {
        doSetCity_InScope(cityList);
    }

    protected void doSetCity_InScope(Collection<String> cityList) {
        regINS(CK_INS, cTL(cityList), xgetCValueCity(), "city");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * city: {text(2147483647)}
     * @param cityList The collection of city as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_NotInScope(Collection<String> cityList) {
        doSetCity_NotInScope(cityList);
    }

    protected void doSetCity_NotInScope(Collection<String> cityList) {
        regINS(CK_NINS, cTL(cityList), xgetCValueCity(), "city");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city: {text(2147483647)} <br>
     * <pre>e.g. setCity_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param city The value of city as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCity_LikeSearch(String city, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCity_LikeSearch(city, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city: {text(2147483647)} <br>
     * <pre>e.g. setCity_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param city The value of city as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCity_LikeSearch(String city, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(city), xgetCValueCity(), "city", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city: {text(2147483647)}
     * @param city The value of city as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCity_NotLikeSearch(String city, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCity_NotLikeSearch(city, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city: {text(2147483647)}
     * @param city The value of city as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCity_NotLikeSearch(String city, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(city), xgetCValueCity(), "city", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * city: {text(2147483647)}
     */
    public void setCity_IsNull() { regCity(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * city: {text(2147483647)}
     */
    public void setCity_IsNullOrEmpty() { regCity(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * city: {text(2147483647)}
     */
    public void setCity_IsNotNull() { regCity(CK_ISNN, DOBJ); }

    protected void regCity(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCity(), "city"); }
    protected abstract ConditionValue xgetCValueCity();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address1: {text(2147483647)}
     * @param address1 The value of address1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_Equal(String address1) {
        doSetAddress1_Equal(fRES(address1));
    }

    protected void doSetAddress1_Equal(String address1) {
        regAddress1(CK_EQ, address1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address1: {text(2147483647)}
     * @param address1 The value of address1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_NotEqual(String address1) {
        doSetAddress1_NotEqual(fRES(address1));
    }

    protected void doSetAddress1_NotEqual(String address1) {
        regAddress1(CK_NES, address1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address1: {text(2147483647)}
     * @param address1 The value of address1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterThan(String address1) {
        regAddress1(CK_GT, fRES(address1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address1: {text(2147483647)}
     * @param address1 The value of address1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessThan(String address1) {
        regAddress1(CK_LT, fRES(address1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address1: {text(2147483647)}
     * @param address1 The value of address1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterEqual(String address1) {
        regAddress1(CK_GE, fRES(address1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address1: {text(2147483647)}
     * @param address1 The value of address1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessEqual(String address1) {
        regAddress1(CK_LE, fRES(address1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * address1: {text(2147483647)}
     * @param address1List The collection of address1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_InScope(Collection<String> address1List) {
        doSetAddress1_InScope(address1List);
    }

    protected void doSetAddress1_InScope(Collection<String> address1List) {
        regINS(CK_INS, cTL(address1List), xgetCValueAddress1(), "address1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * address1: {text(2147483647)}
     * @param address1List The collection of address1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_NotInScope(Collection<String> address1List) {
        doSetAddress1_NotInScope(address1List);
    }

    protected void doSetAddress1_NotInScope(Collection<String> address1List) {
        regINS(CK_NINS, cTL(address1List), xgetCValueAddress1(), "address1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * address1: {text(2147483647)} <br>
     * <pre>e.g. setAddress1_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param address1 The value of address1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAddress1_LikeSearch(String address1, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAddress1_LikeSearch(address1, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * address1: {text(2147483647)} <br>
     * <pre>e.g. setAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address1 The value of address1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAddress1_LikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address1), xgetCValueAddress1(), "address1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * address1: {text(2147483647)}
     * @param address1 The value of address1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAddress1_NotLikeSearch(String address1, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAddress1_NotLikeSearch(address1, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * address1: {text(2147483647)}
     * @param address1 The value of address1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAddress1_NotLikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address1), xgetCValueAddress1(), "address1", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * address1: {text(2147483647)}
     */
    public void setAddress1_IsNull() { regAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * address1: {text(2147483647)}
     */
    public void setAddress1_IsNullOrEmpty() { regAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * address1: {text(2147483647)}
     */
    public void setAddress1_IsNotNull() { regAddress1(CK_ISNN, DOBJ); }

    protected void regAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress1(), "address1"); }
    protected abstract ConditionValue xgetCValueAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address2: {text(2147483647)}
     * @param address2 The value of address2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_Equal(String address2) {
        doSetAddress2_Equal(fRES(address2));
    }

    protected void doSetAddress2_Equal(String address2) {
        regAddress2(CK_EQ, address2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address2: {text(2147483647)}
     * @param address2 The value of address2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotEqual(String address2) {
        doSetAddress2_NotEqual(fRES(address2));
    }

    protected void doSetAddress2_NotEqual(String address2) {
        regAddress2(CK_NES, address2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address2: {text(2147483647)}
     * @param address2 The value of address2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterThan(String address2) {
        regAddress2(CK_GT, fRES(address2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address2: {text(2147483647)}
     * @param address2 The value of address2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessThan(String address2) {
        regAddress2(CK_LT, fRES(address2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address2: {text(2147483647)}
     * @param address2 The value of address2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterEqual(String address2) {
        regAddress2(CK_GE, fRES(address2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address2: {text(2147483647)}
     * @param address2 The value of address2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessEqual(String address2) {
        regAddress2(CK_LE, fRES(address2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * address2: {text(2147483647)}
     * @param address2List The collection of address2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_InScope(Collection<String> address2List) {
        doSetAddress2_InScope(address2List);
    }

    protected void doSetAddress2_InScope(Collection<String> address2List) {
        regINS(CK_INS, cTL(address2List), xgetCValueAddress2(), "address2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * address2: {text(2147483647)}
     * @param address2List The collection of address2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotInScope(Collection<String> address2List) {
        doSetAddress2_NotInScope(address2List);
    }

    protected void doSetAddress2_NotInScope(Collection<String> address2List) {
        regINS(CK_NINS, cTL(address2List), xgetCValueAddress2(), "address2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * address2: {text(2147483647)} <br>
     * <pre>e.g. setAddress2_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param address2 The value of address2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAddress2_LikeSearch(String address2, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAddress2_LikeSearch(address2, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * address2: {text(2147483647)} <br>
     * <pre>e.g. setAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address2 The value of address2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAddress2_LikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address2), xgetCValueAddress2(), "address2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * address2: {text(2147483647)}
     * @param address2 The value of address2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAddress2_NotLikeSearch(String address2, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAddress2_NotLikeSearch(address2, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * address2: {text(2147483647)}
     * @param address2 The value of address2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAddress2_NotLikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address2), xgetCValueAddress2(), "address2", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * address2: {text(2147483647)}
     */
    public void setAddress2_IsNull() { regAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * address2: {text(2147483647)}
     */
    public void setAddress2_IsNullOrEmpty() { regAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * address2: {text(2147483647)}
     */
    public void setAddress2_IsNotNull() { regAddress2(CK_ISNN, DOBJ); }

    protected void regAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress2(), "address2"); }
    protected abstract ConditionValue xgetCValueAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarks The value of remarks as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_Equal(String remarks) {
        doSetRemarks_Equal(fRES(remarks));
    }

    protected void doSetRemarks_Equal(String remarks) {
        regRemarks(CK_EQ, remarks);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarks The value of remarks as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_NotEqual(String remarks) {
        doSetRemarks_NotEqual(fRES(remarks));
    }

    protected void doSetRemarks_NotEqual(String remarks) {
        regRemarks(CK_NES, remarks);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarks The value of remarks as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_GreaterThan(String remarks) {
        regRemarks(CK_GT, fRES(remarks));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarks The value of remarks as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_LessThan(String remarks) {
        regRemarks(CK_LT, fRES(remarks));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarks The value of remarks as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_GreaterEqual(String remarks) {
        regRemarks(CK_GE, fRES(remarks));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarks The value of remarks as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_LessEqual(String remarks) {
        regRemarks(CK_LE, fRES(remarks));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarksList The collection of remarks as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_InScope(Collection<String> remarksList) {
        doSetRemarks_InScope(remarksList);
    }

    protected void doSetRemarks_InScope(Collection<String> remarksList) {
        regINS(CK_INS, cTL(remarksList), xgetCValueRemarks(), "remarks");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarksList The collection of remarks as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_NotInScope(Collection<String> remarksList) {
        doSetRemarks_NotInScope(remarksList);
    }

    protected void doSetRemarks_NotInScope(Collection<String> remarksList) {
        regINS(CK_NINS, cTL(remarksList), xgetCValueRemarks(), "remarks");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * remarks: {text(2147483647)} <br>
     * <pre>e.g. setRemarks_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param remarks The value of remarks as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRemarks_LikeSearch(String remarks, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRemarks_LikeSearch(remarks, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * remarks: {text(2147483647)} <br>
     * <pre>e.g. setRemarks_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param remarks The value of remarks as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRemarks_LikeSearch(String remarks, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(remarks), xgetCValueRemarks(), "remarks", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarks The value of remarks as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRemarks_NotLikeSearch(String remarks, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRemarks_NotLikeSearch(remarks, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarks The value of remarks as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRemarks_NotLikeSearch(String remarks, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(remarks), xgetCValueRemarks(), "remarks", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     */
    public void setRemarks_IsNull() { regRemarks(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     */
    public void setRemarks_IsNullOrEmpty() { regRemarks(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     */
    public void setRemarks_IsNotNull() { regRemarks(CK_ISNN, DOBJ); }

    protected void regRemarks(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRemarks(), "remarks"); }
    protected abstract ConditionValue xgetCValueRemarks();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @param deleteFlag The value of deleteFlag as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeleteFlag_Equal(Boolean deleteFlag) {
        regDeleteFlag(CK_EQ, deleteFlag);
    }

    protected void regDeleteFlag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeleteFlag(), "delete_flag"); }
    protected abstract ConditionValue xgetCValueDeleteFlag();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "register_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "register_datetime"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "update_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     */
    public void setUpdateDatetime_IsNull() { regUpdateDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     */
    public void setUpdateDatetime_IsNotNull() { regUpdateDatetime(CK_ISNN, DOBJ); }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "update_datetime"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MShopCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MShopCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MShopCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MShopCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MShopCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MShopCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MShopCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MShopCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MShopCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MShopCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MShopCB&gt;() {
     *     public void query(MShopCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MShopCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MShopCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MShopCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MShopCQ sq);

    protected MShopCB xcreateScalarConditionCB() {
        MShopCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MShopCB xcreateScalarConditionPartitionByCB() {
        MShopCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MShopCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MShopCB cb = new MShopCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "shop_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MShopCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MShopCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MShopCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MShopCB cb = new MShopCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "shop_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MShopCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MShopCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShopCB cb = new MShopCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MShopCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected MShopCB newMyCB() {
        return new MShopCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MShopCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

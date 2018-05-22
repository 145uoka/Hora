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
 * The abstract condition-query of t_reservation.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTReservationCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTReservationCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_reservation";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_id: {PK, ID, NotNull, bigserial(19)}
     * @param reservationId The value of reservationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationId_Equal(Long reservationId) {
        doSetReservationId_Equal(reservationId);
    }

    protected void doSetReservationId_Equal(Long reservationId) {
        regReservationId(CK_EQ, reservationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_id: {PK, ID, NotNull, bigserial(19)}
     * @param reservationId The value of reservationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationId_NotEqual(Long reservationId) {
        doSetReservationId_NotEqual(reservationId);
    }

    protected void doSetReservationId_NotEqual(Long reservationId) {
        regReservationId(CK_NES, reservationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_id: {PK, ID, NotNull, bigserial(19)}
     * @param reservationId The value of reservationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationId_GreaterThan(Long reservationId) {
        regReservationId(CK_GT, reservationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_id: {PK, ID, NotNull, bigserial(19)}
     * @param reservationId The value of reservationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationId_LessThan(Long reservationId) {
        regReservationId(CK_LT, reservationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_id: {PK, ID, NotNull, bigserial(19)}
     * @param reservationId The value of reservationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationId_GreaterEqual(Long reservationId) {
        regReservationId(CK_GE, reservationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_id: {PK, ID, NotNull, bigserial(19)}
     * @param reservationId The value of reservationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationId_LessEqual(Long reservationId) {
        regReservationId(CK_LE, reservationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_id: {PK, ID, NotNull, bigserial(19)}
     * @param minNumber The min number of reservationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reservationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReservationId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReservationId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_id: {PK, ID, NotNull, bigserial(19)}
     * @param minNumber The min number of reservationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reservationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReservationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReservationId(), "reservation_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * reservation_id: {PK, ID, NotNull, bigserial(19)}
     * @param reservationIdList The collection of reservationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservationId_InScope(Collection<Long> reservationIdList) {
        doSetReservationId_InScope(reservationIdList);
    }

    protected void doSetReservationId_InScope(Collection<Long> reservationIdList) {
        regINS(CK_INS, cTL(reservationIdList), xgetCValueReservationId(), "reservation_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * reservation_id: {PK, ID, NotNull, bigserial(19)}
     * @param reservationIdList The collection of reservationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservationId_NotInScope(Collection<Long> reservationIdList) {
        doSetReservationId_NotInScope(reservationIdList);
    }

    protected void doSetReservationId_NotInScope(Collection<Long> reservationIdList) {
        regINS(CK_NINS, cTL(reservationIdList), xgetCValueReservationId(), "reservation_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select reservation_id from t_reservation_detail where ...)} <br>
     * t_reservation_detail by reservation_id, named 'TReservationDetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReservationDetail</span>(detailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     detailCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReservationDetailList for 'exists'. (NotNull)
     */
    public void existsTReservationDetail(SubQuery<TReservationDetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReservationDetailCB cb = new TReservationDetailCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReservationId_ExistsReferrer_TReservationDetailList(cb.query());
        registerExistsReferrer(cb.query(), "reservation_id", "reservation_id", pp, "tReservationDetailList");
    }
    public abstract String keepReservationId_ExistsReferrer_TReservationDetailList(TReservationDetailCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select reservation_id from t_reservation_detail where ...)} <br>
     * t_reservation_detail by reservation_id, named 'TReservationDetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReservationDetail</span>(detailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     detailCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReservationId_NotExistsReferrer_TReservationDetailList for 'not exists'. (NotNull)
     */
    public void notExistsTReservationDetail(SubQuery<TReservationDetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReservationDetailCB cb = new TReservationDetailCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReservationId_NotExistsReferrer_TReservationDetailList(cb.query());
        registerNotExistsReferrer(cb.query(), "reservation_id", "reservation_id", pp, "tReservationDetailList");
    }
    public abstract String keepReservationId_NotExistsReferrer_TReservationDetailList(TReservationDetailCQ sq);

    public void xsderiveTReservationDetailList(String fn, SubQuery<TReservationDetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReservationDetailCB cb = new TReservationDetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepReservationId_SpecifyDerivedReferrer_TReservationDetailList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "reservation_id", "reservation_id", pp, "tReservationDetailList", al, op);
    }
    public abstract String keepReservationId_SpecifyDerivedReferrer_TReservationDetailList(TReservationDetailCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_reservation_detail where ...)} <br>
     * t_reservation_detail by reservation_id, named 'TReservationDetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReservationDetail()</span>.<span style="color: #CC4747">max</span>(detailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     detailCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     detailCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReservationDetailCB> derivedTReservationDetail() {
        return xcreateQDRFunctionTReservationDetailList();
    }
    protected HpQDRFunction<TReservationDetailCB> xcreateQDRFunctionTReservationDetailList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReservationDetailList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReservationDetailList(String fn, SubQuery<TReservationDetailCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReservationDetailCB cb = new TReservationDetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepReservationId_QueryDerivedReferrer_TReservationDetailList(cb.query()); String prpp = keepReservationId_QueryDerivedReferrer_TReservationDetailListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "reservation_id", "reservation_id", sqpp, "tReservationDetailList", rd, vl, prpp, op);
    }
    public abstract String keepReservationId_QueryDerivedReferrer_TReservationDetailList(TReservationDetailCQ sq);
    public abstract String keepReservationId_QueryDerivedReferrer_TReservationDetailListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * reservation_id: {PK, ID, NotNull, bigserial(19)}
     */
    public void setReservationId_IsNull() { regReservationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * reservation_id: {PK, ID, NotNull, bigserial(19)}
     */
    public void setReservationId_IsNotNull() { regReservationId(CK_ISNN, DOBJ); }

    protected void regReservationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReservationId(), "reservation_id"); }
    protected abstract ConditionValue xgetCValueReservationId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * shop_id: {int4(10), FK to m_shop}
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
     * shop_id: {int4(10), FK to m_shop}
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
     * shop_id: {int4(10), FK to m_shop}
     * @param shopId The value of shopId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopId_GreaterThan(Integer shopId) {
        regShopId(CK_GT, shopId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * shop_id: {int4(10), FK to m_shop}
     * @param shopId The value of shopId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopId_LessThan(Integer shopId) {
        regShopId(CK_LT, shopId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * shop_id: {int4(10), FK to m_shop}
     * @param shopId The value of shopId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopId_GreaterEqual(Integer shopId) {
        regShopId(CK_GE, shopId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * shop_id: {int4(10), FK to m_shop}
     * @param shopId The value of shopId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopId_LessEqual(Integer shopId) {
        regShopId(CK_LE, shopId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * shop_id: {int4(10), FK to m_shop}
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
     * shop_id: {int4(10), FK to m_shop}
     * @param minNumber The min number of shopId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shopId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setShopId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShopId(), "shop_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * shop_id: {int4(10), FK to m_shop}
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
     * shop_id: {int4(10), FK to m_shop}
     * @param shopIdList The collection of shopId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopId_NotInScope(Collection<Integer> shopIdList) {
        doSetShopId_NotInScope(shopIdList);
    }

    protected void doSetShopId_NotInScope(Collection<Integer> shopIdList) {
        regINS(CK_NINS, cTL(shopIdList), xgetCValueShopId(), "shop_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * shop_id: {int4(10), FK to m_shop}
     */
    public void setShopId_IsNull() { regShopId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * shop_id: {int4(10), FK to m_shop}
     */
    public void setShopId_IsNotNull() { regShopId(CK_ISNN, DOBJ); }

    protected void regShopId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShopId(), "shop_id"); }
    protected abstract ConditionValue xgetCValueShopId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {NotNull, int4(10), FK to m_staff}
     * @param staffId The value of staffId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStaffId_Equal(Integer staffId) {
        doSetStaffId_Equal(staffId);
    }

    protected void doSetStaffId_Equal(Integer staffId) {
        regStaffId(CK_EQ, staffId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {NotNull, int4(10), FK to m_staff}
     * @param staffId The value of staffId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStaffId_NotEqual(Integer staffId) {
        doSetStaffId_NotEqual(staffId);
    }

    protected void doSetStaffId_NotEqual(Integer staffId) {
        regStaffId(CK_NES, staffId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {NotNull, int4(10), FK to m_staff}
     * @param staffId The value of staffId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStaffId_GreaterThan(Integer staffId) {
        regStaffId(CK_GT, staffId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {NotNull, int4(10), FK to m_staff}
     * @param staffId The value of staffId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStaffId_LessThan(Integer staffId) {
        regStaffId(CK_LT, staffId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {NotNull, int4(10), FK to m_staff}
     * @param staffId The value of staffId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStaffId_GreaterEqual(Integer staffId) {
        regStaffId(CK_GE, staffId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {NotNull, int4(10), FK to m_staff}
     * @param staffId The value of staffId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStaffId_LessEqual(Integer staffId) {
        regStaffId(CK_LE, staffId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {NotNull, int4(10), FK to m_staff}
     * @param minNumber The min number of staffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of staffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setStaffId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setStaffId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {NotNull, int4(10), FK to m_staff}
     * @param minNumber The min number of staffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of staffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setStaffId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStaffId(), "staff_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * staff_id: {NotNull, int4(10), FK to m_staff}
     * @param staffIdList The collection of staffId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStaffId_InScope(Collection<Integer> staffIdList) {
        doSetStaffId_InScope(staffIdList);
    }

    protected void doSetStaffId_InScope(Collection<Integer> staffIdList) {
        regINS(CK_INS, cTL(staffIdList), xgetCValueStaffId(), "staff_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * staff_id: {NotNull, int4(10), FK to m_staff}
     * @param staffIdList The collection of staffId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStaffId_NotInScope(Collection<Integer> staffIdList) {
        doSetStaffId_NotInScope(staffIdList);
    }

    protected void doSetStaffId_NotInScope(Collection<Integer> staffIdList) {
        regINS(CK_NINS, cTL(staffIdList), xgetCValueStaffId(), "staff_id");
    }

    protected void regStaffId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStaffId(), "staff_id"); }
    protected abstract ConditionValue xgetCValueStaffId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_staff_family_name: {text(2147483647)}
     * @param histStaffFamilyName The value of histStaffFamilyName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistStaffFamilyName_Equal(String histStaffFamilyName) {
        doSetHistStaffFamilyName_Equal(fRES(histStaffFamilyName));
    }

    protected void doSetHistStaffFamilyName_Equal(String histStaffFamilyName) {
        regHistStaffFamilyName(CK_EQ, histStaffFamilyName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_staff_family_name: {text(2147483647)}
     * @param histStaffFamilyName The value of histStaffFamilyName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistStaffFamilyName_NotEqual(String histStaffFamilyName) {
        doSetHistStaffFamilyName_NotEqual(fRES(histStaffFamilyName));
    }

    protected void doSetHistStaffFamilyName_NotEqual(String histStaffFamilyName) {
        regHistStaffFamilyName(CK_NES, histStaffFamilyName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_staff_family_name: {text(2147483647)}
     * @param histStaffFamilyName The value of histStaffFamilyName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistStaffFamilyName_GreaterThan(String histStaffFamilyName) {
        regHistStaffFamilyName(CK_GT, fRES(histStaffFamilyName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_staff_family_name: {text(2147483647)}
     * @param histStaffFamilyName The value of histStaffFamilyName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistStaffFamilyName_LessThan(String histStaffFamilyName) {
        regHistStaffFamilyName(CK_LT, fRES(histStaffFamilyName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_staff_family_name: {text(2147483647)}
     * @param histStaffFamilyName The value of histStaffFamilyName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistStaffFamilyName_GreaterEqual(String histStaffFamilyName) {
        regHistStaffFamilyName(CK_GE, fRES(histStaffFamilyName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_staff_family_name: {text(2147483647)}
     * @param histStaffFamilyName The value of histStaffFamilyName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistStaffFamilyName_LessEqual(String histStaffFamilyName) {
        regHistStaffFamilyName(CK_LE, fRES(histStaffFamilyName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * hist_staff_family_name: {text(2147483647)}
     * @param histStaffFamilyNameList The collection of histStaffFamilyName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistStaffFamilyName_InScope(Collection<String> histStaffFamilyNameList) {
        doSetHistStaffFamilyName_InScope(histStaffFamilyNameList);
    }

    protected void doSetHistStaffFamilyName_InScope(Collection<String> histStaffFamilyNameList) {
        regINS(CK_INS, cTL(histStaffFamilyNameList), xgetCValueHistStaffFamilyName(), "hist_staff_family_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * hist_staff_family_name: {text(2147483647)}
     * @param histStaffFamilyNameList The collection of histStaffFamilyName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistStaffFamilyName_NotInScope(Collection<String> histStaffFamilyNameList) {
        doSetHistStaffFamilyName_NotInScope(histStaffFamilyNameList);
    }

    protected void doSetHistStaffFamilyName_NotInScope(Collection<String> histStaffFamilyNameList) {
        regINS(CK_NINS, cTL(histStaffFamilyNameList), xgetCValueHistStaffFamilyName(), "hist_staff_family_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_staff_family_name: {text(2147483647)} <br>
     * <pre>e.g. setHistStaffFamilyName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param histStaffFamilyName The value of histStaffFamilyName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHistStaffFamilyName_LikeSearch(String histStaffFamilyName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHistStaffFamilyName_LikeSearch(histStaffFamilyName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_staff_family_name: {text(2147483647)} <br>
     * <pre>e.g. setHistStaffFamilyName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param histStaffFamilyName The value of histStaffFamilyName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setHistStaffFamilyName_LikeSearch(String histStaffFamilyName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(histStaffFamilyName), xgetCValueHistStaffFamilyName(), "hist_staff_family_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_staff_family_name: {text(2147483647)}
     * @param histStaffFamilyName The value of histStaffFamilyName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHistStaffFamilyName_NotLikeSearch(String histStaffFamilyName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHistStaffFamilyName_NotLikeSearch(histStaffFamilyName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_staff_family_name: {text(2147483647)}
     * @param histStaffFamilyName The value of histStaffFamilyName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setHistStaffFamilyName_NotLikeSearch(String histStaffFamilyName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(histStaffFamilyName), xgetCValueHistStaffFamilyName(), "hist_staff_family_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * hist_staff_family_name: {text(2147483647)}
     */
    public void setHistStaffFamilyName_IsNull() { regHistStaffFamilyName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * hist_staff_family_name: {text(2147483647)}
     */
    public void setHistStaffFamilyName_IsNullOrEmpty() { regHistStaffFamilyName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * hist_staff_family_name: {text(2147483647)}
     */
    public void setHistStaffFamilyName_IsNotNull() { regHistStaffFamilyName(CK_ISNN, DOBJ); }

    protected void regHistStaffFamilyName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHistStaffFamilyName(), "hist_staff_family_name"); }
    protected abstract ConditionValue xgetCValueHistStaffFamilyName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_shop_name: {text(2147483647)}
     * @param histShopName The value of histShopName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistShopName_Equal(String histShopName) {
        doSetHistShopName_Equal(fRES(histShopName));
    }

    protected void doSetHistShopName_Equal(String histShopName) {
        regHistShopName(CK_EQ, histShopName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_shop_name: {text(2147483647)}
     * @param histShopName The value of histShopName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistShopName_NotEqual(String histShopName) {
        doSetHistShopName_NotEqual(fRES(histShopName));
    }

    protected void doSetHistShopName_NotEqual(String histShopName) {
        regHistShopName(CK_NES, histShopName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_shop_name: {text(2147483647)}
     * @param histShopName The value of histShopName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistShopName_GreaterThan(String histShopName) {
        regHistShopName(CK_GT, fRES(histShopName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_shop_name: {text(2147483647)}
     * @param histShopName The value of histShopName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistShopName_LessThan(String histShopName) {
        regHistShopName(CK_LT, fRES(histShopName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_shop_name: {text(2147483647)}
     * @param histShopName The value of histShopName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistShopName_GreaterEqual(String histShopName) {
        regHistShopName(CK_GE, fRES(histShopName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_shop_name: {text(2147483647)}
     * @param histShopName The value of histShopName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistShopName_LessEqual(String histShopName) {
        regHistShopName(CK_LE, fRES(histShopName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * hist_shop_name: {text(2147483647)}
     * @param histShopNameList The collection of histShopName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistShopName_InScope(Collection<String> histShopNameList) {
        doSetHistShopName_InScope(histShopNameList);
    }

    protected void doSetHistShopName_InScope(Collection<String> histShopNameList) {
        regINS(CK_INS, cTL(histShopNameList), xgetCValueHistShopName(), "hist_shop_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * hist_shop_name: {text(2147483647)}
     * @param histShopNameList The collection of histShopName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistShopName_NotInScope(Collection<String> histShopNameList) {
        doSetHistShopName_NotInScope(histShopNameList);
    }

    protected void doSetHistShopName_NotInScope(Collection<String> histShopNameList) {
        regINS(CK_NINS, cTL(histShopNameList), xgetCValueHistShopName(), "hist_shop_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_shop_name: {text(2147483647)} <br>
     * <pre>e.g. setHistShopName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param histShopName The value of histShopName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHistShopName_LikeSearch(String histShopName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHistShopName_LikeSearch(histShopName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_shop_name: {text(2147483647)} <br>
     * <pre>e.g. setHistShopName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param histShopName The value of histShopName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setHistShopName_LikeSearch(String histShopName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(histShopName), xgetCValueHistShopName(), "hist_shop_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_shop_name: {text(2147483647)}
     * @param histShopName The value of histShopName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHistShopName_NotLikeSearch(String histShopName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHistShopName_NotLikeSearch(histShopName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_shop_name: {text(2147483647)}
     * @param histShopName The value of histShopName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setHistShopName_NotLikeSearch(String histShopName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(histShopName), xgetCValueHistShopName(), "hist_shop_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * hist_shop_name: {text(2147483647)}
     */
    public void setHistShopName_IsNull() { regHistShopName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * hist_shop_name: {text(2147483647)}
     */
    public void setHistShopName_IsNullOrEmpty() { regHistShopName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * hist_shop_name: {text(2147483647)}
     */
    public void setHistShopName_IsNotNull() { regHistShopName(CK_ISNN, DOBJ); }

    protected void regHistShopName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHistShopName(), "hist_shop_name"); }
    protected abstract ConditionValue xgetCValueHistShopName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_shop_abbreviated_name: {text(2147483647)}
     * @param histShopAbbreviatedName The value of histShopAbbreviatedName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistShopAbbreviatedName_Equal(String histShopAbbreviatedName) {
        doSetHistShopAbbreviatedName_Equal(fRES(histShopAbbreviatedName));
    }

    protected void doSetHistShopAbbreviatedName_Equal(String histShopAbbreviatedName) {
        regHistShopAbbreviatedName(CK_EQ, histShopAbbreviatedName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_shop_abbreviated_name: {text(2147483647)}
     * @param histShopAbbreviatedName The value of histShopAbbreviatedName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistShopAbbreviatedName_NotEqual(String histShopAbbreviatedName) {
        doSetHistShopAbbreviatedName_NotEqual(fRES(histShopAbbreviatedName));
    }

    protected void doSetHistShopAbbreviatedName_NotEqual(String histShopAbbreviatedName) {
        regHistShopAbbreviatedName(CK_NES, histShopAbbreviatedName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_shop_abbreviated_name: {text(2147483647)}
     * @param histShopAbbreviatedName The value of histShopAbbreviatedName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistShopAbbreviatedName_GreaterThan(String histShopAbbreviatedName) {
        regHistShopAbbreviatedName(CK_GT, fRES(histShopAbbreviatedName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_shop_abbreviated_name: {text(2147483647)}
     * @param histShopAbbreviatedName The value of histShopAbbreviatedName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistShopAbbreviatedName_LessThan(String histShopAbbreviatedName) {
        regHistShopAbbreviatedName(CK_LT, fRES(histShopAbbreviatedName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_shop_abbreviated_name: {text(2147483647)}
     * @param histShopAbbreviatedName The value of histShopAbbreviatedName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistShopAbbreviatedName_GreaterEqual(String histShopAbbreviatedName) {
        regHistShopAbbreviatedName(CK_GE, fRES(histShopAbbreviatedName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_shop_abbreviated_name: {text(2147483647)}
     * @param histShopAbbreviatedName The value of histShopAbbreviatedName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistShopAbbreviatedName_LessEqual(String histShopAbbreviatedName) {
        regHistShopAbbreviatedName(CK_LE, fRES(histShopAbbreviatedName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * hist_shop_abbreviated_name: {text(2147483647)}
     * @param histShopAbbreviatedNameList The collection of histShopAbbreviatedName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistShopAbbreviatedName_InScope(Collection<String> histShopAbbreviatedNameList) {
        doSetHistShopAbbreviatedName_InScope(histShopAbbreviatedNameList);
    }

    protected void doSetHistShopAbbreviatedName_InScope(Collection<String> histShopAbbreviatedNameList) {
        regINS(CK_INS, cTL(histShopAbbreviatedNameList), xgetCValueHistShopAbbreviatedName(), "hist_shop_abbreviated_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * hist_shop_abbreviated_name: {text(2147483647)}
     * @param histShopAbbreviatedNameList The collection of histShopAbbreviatedName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistShopAbbreviatedName_NotInScope(Collection<String> histShopAbbreviatedNameList) {
        doSetHistShopAbbreviatedName_NotInScope(histShopAbbreviatedNameList);
    }

    protected void doSetHistShopAbbreviatedName_NotInScope(Collection<String> histShopAbbreviatedNameList) {
        regINS(CK_NINS, cTL(histShopAbbreviatedNameList), xgetCValueHistShopAbbreviatedName(), "hist_shop_abbreviated_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_shop_abbreviated_name: {text(2147483647)} <br>
     * <pre>e.g. setHistShopAbbreviatedName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param histShopAbbreviatedName The value of histShopAbbreviatedName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHistShopAbbreviatedName_LikeSearch(String histShopAbbreviatedName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHistShopAbbreviatedName_LikeSearch(histShopAbbreviatedName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_shop_abbreviated_name: {text(2147483647)} <br>
     * <pre>e.g. setHistShopAbbreviatedName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param histShopAbbreviatedName The value of histShopAbbreviatedName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setHistShopAbbreviatedName_LikeSearch(String histShopAbbreviatedName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(histShopAbbreviatedName), xgetCValueHistShopAbbreviatedName(), "hist_shop_abbreviated_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_shop_abbreviated_name: {text(2147483647)}
     * @param histShopAbbreviatedName The value of histShopAbbreviatedName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHistShopAbbreviatedName_NotLikeSearch(String histShopAbbreviatedName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHistShopAbbreviatedName_NotLikeSearch(histShopAbbreviatedName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_shop_abbreviated_name: {text(2147483647)}
     * @param histShopAbbreviatedName The value of histShopAbbreviatedName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setHistShopAbbreviatedName_NotLikeSearch(String histShopAbbreviatedName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(histShopAbbreviatedName), xgetCValueHistShopAbbreviatedName(), "hist_shop_abbreviated_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * hist_shop_abbreviated_name: {text(2147483647)}
     */
    public void setHistShopAbbreviatedName_IsNull() { regHistShopAbbreviatedName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * hist_shop_abbreviated_name: {text(2147483647)}
     */
    public void setHistShopAbbreviatedName_IsNullOrEmpty() { regHistShopAbbreviatedName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * hist_shop_abbreviated_name: {text(2147483647)}
     */
    public void setHistShopAbbreviatedName_IsNotNull() { regHistShopAbbreviatedName(CK_ISNN, DOBJ); }

    protected void regHistShopAbbreviatedName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHistShopAbbreviatedName(), "hist_shop_abbreviated_name"); }
    protected abstract ConditionValue xgetCValueHistShopAbbreviatedName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_staff_given_name: {text(2147483647)}
     * @param histStaffGivenName The value of histStaffGivenName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistStaffGivenName_Equal(String histStaffGivenName) {
        doSetHistStaffGivenName_Equal(fRES(histStaffGivenName));
    }

    protected void doSetHistStaffGivenName_Equal(String histStaffGivenName) {
        regHistStaffGivenName(CK_EQ, histStaffGivenName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_staff_given_name: {text(2147483647)}
     * @param histStaffGivenName The value of histStaffGivenName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistStaffGivenName_NotEqual(String histStaffGivenName) {
        doSetHistStaffGivenName_NotEqual(fRES(histStaffGivenName));
    }

    protected void doSetHistStaffGivenName_NotEqual(String histStaffGivenName) {
        regHistStaffGivenName(CK_NES, histStaffGivenName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_staff_given_name: {text(2147483647)}
     * @param histStaffGivenName The value of histStaffGivenName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistStaffGivenName_GreaterThan(String histStaffGivenName) {
        regHistStaffGivenName(CK_GT, fRES(histStaffGivenName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_staff_given_name: {text(2147483647)}
     * @param histStaffGivenName The value of histStaffGivenName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistStaffGivenName_LessThan(String histStaffGivenName) {
        regHistStaffGivenName(CK_LT, fRES(histStaffGivenName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_staff_given_name: {text(2147483647)}
     * @param histStaffGivenName The value of histStaffGivenName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistStaffGivenName_GreaterEqual(String histStaffGivenName) {
        regHistStaffGivenName(CK_GE, fRES(histStaffGivenName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_staff_given_name: {text(2147483647)}
     * @param histStaffGivenName The value of histStaffGivenName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistStaffGivenName_LessEqual(String histStaffGivenName) {
        regHistStaffGivenName(CK_LE, fRES(histStaffGivenName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * hist_staff_given_name: {text(2147483647)}
     * @param histStaffGivenNameList The collection of histStaffGivenName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistStaffGivenName_InScope(Collection<String> histStaffGivenNameList) {
        doSetHistStaffGivenName_InScope(histStaffGivenNameList);
    }

    protected void doSetHistStaffGivenName_InScope(Collection<String> histStaffGivenNameList) {
        regINS(CK_INS, cTL(histStaffGivenNameList), xgetCValueHistStaffGivenName(), "hist_staff_given_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * hist_staff_given_name: {text(2147483647)}
     * @param histStaffGivenNameList The collection of histStaffGivenName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistStaffGivenName_NotInScope(Collection<String> histStaffGivenNameList) {
        doSetHistStaffGivenName_NotInScope(histStaffGivenNameList);
    }

    protected void doSetHistStaffGivenName_NotInScope(Collection<String> histStaffGivenNameList) {
        regINS(CK_NINS, cTL(histStaffGivenNameList), xgetCValueHistStaffGivenName(), "hist_staff_given_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_staff_given_name: {text(2147483647)} <br>
     * <pre>e.g. setHistStaffGivenName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param histStaffGivenName The value of histStaffGivenName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHistStaffGivenName_LikeSearch(String histStaffGivenName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHistStaffGivenName_LikeSearch(histStaffGivenName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_staff_given_name: {text(2147483647)} <br>
     * <pre>e.g. setHistStaffGivenName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param histStaffGivenName The value of histStaffGivenName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setHistStaffGivenName_LikeSearch(String histStaffGivenName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(histStaffGivenName), xgetCValueHistStaffGivenName(), "hist_staff_given_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_staff_given_name: {text(2147483647)}
     * @param histStaffGivenName The value of histStaffGivenName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHistStaffGivenName_NotLikeSearch(String histStaffGivenName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHistStaffGivenName_NotLikeSearch(histStaffGivenName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_staff_given_name: {text(2147483647)}
     * @param histStaffGivenName The value of histStaffGivenName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setHistStaffGivenName_NotLikeSearch(String histStaffGivenName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(histStaffGivenName), xgetCValueHistStaffGivenName(), "hist_staff_given_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * hist_staff_given_name: {text(2147483647)}
     */
    public void setHistStaffGivenName_IsNull() { regHistStaffGivenName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * hist_staff_given_name: {text(2147483647)}
     */
    public void setHistStaffGivenName_IsNullOrEmpty() { regHistStaffGivenName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * hist_staff_given_name: {text(2147483647)}
     */
    public void setHistStaffGivenName_IsNotNull() { regHistStaffGivenName(CK_ISNN, DOBJ); }

    protected void regHistStaffGivenName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHistStaffGivenName(), "hist_staff_given_name"); }
    protected abstract ConditionValue xgetCValueHistStaffGivenName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_date: {date(13)}
     * @param reservationDate The value of reservationDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationDate_Equal(java.time.LocalDate reservationDate) {
        regReservationDate(CK_EQ,  reservationDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_date: {date(13)}
     * @param reservationDate The value of reservationDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationDate_GreaterThan(java.time.LocalDate reservationDate) {
        regReservationDate(CK_GT,  reservationDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_date: {date(13)}
     * @param reservationDate The value of reservationDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationDate_LessThan(java.time.LocalDate reservationDate) {
        regReservationDate(CK_LT,  reservationDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_date: {date(13)}
     * @param reservationDate The value of reservationDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationDate_GreaterEqual(java.time.LocalDate reservationDate) {
        regReservationDate(CK_GE,  reservationDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_date: {date(13)}
     * @param reservationDate The value of reservationDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationDate_LessEqual(java.time.LocalDate reservationDate) {
        regReservationDate(CK_LE, reservationDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_date: {date(13)}
     * <pre>e.g. setReservationDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of reservationDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of reservationDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setReservationDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setReservationDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_date: {date(13)}
     * <pre>e.g. setReservationDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of reservationDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of reservationDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setReservationDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "reservation_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueReservationDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * reservation_date: {date(13)}
     */
    public void setReservationDate_IsNull() { regReservationDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * reservation_date: {date(13)}
     */
    public void setReservationDate_IsNotNull() { regReservationDate(CK_ISNN, DOBJ); }

    protected void regReservationDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReservationDate(), "reservation_date"); }
    protected abstract ConditionValue xgetCValueReservationDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_time: {time(15, 6)}
     * @param reservationTime The value of reservationTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationTime_Equal(java.time.LocalTime reservationTime) {
        regReservationTime(CK_EQ,  reservationTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_time: {time(15, 6)}
     * @param reservationTime The value of reservationTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationTime_GreaterThan(java.time.LocalTime reservationTime) {
        regReservationTime(CK_GT,  reservationTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_time: {time(15, 6)}
     * @param reservationTime The value of reservationTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationTime_LessThan(java.time.LocalTime reservationTime) {
        regReservationTime(CK_LT,  reservationTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_time: {time(15, 6)}
     * @param reservationTime The value of reservationTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationTime_GreaterEqual(java.time.LocalTime reservationTime) {
        regReservationTime(CK_GE,  reservationTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_time: {time(15, 6)}
     * @param reservationTime The value of reservationTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationTime_LessEqual(java.time.LocalTime reservationTime) {
        regReservationTime(CK_LE, reservationTime);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * reservation_time: {time(15, 6)}
     */
    public void setReservationTime_IsNull() { regReservationTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * reservation_time: {time(15, 6)}
     */
    public void setReservationTime_IsNotNull() { regReservationTime(CK_ISNN, DOBJ); }

    protected void regReservationTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReservationTime(), "reservation_time"); }
    protected abstract ConditionValue xgetCValueReservationTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to m_user}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Integer userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Integer userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to m_user}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Integer userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Integer userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to m_user}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to m_user}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to m_user}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to m_user}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to m_user}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to m_user}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "user_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_id: {int4(10), FK to m_user}
     * @param userIdList The collection of userId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_InScope(Collection<Integer> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Integer> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "user_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_id: {int4(10), FK to m_user}
     * @param userIdList The collection of userId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_NotInScope(Collection<Integer> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Integer> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "user_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to m_user}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to m_user}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "user_id"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * total_amount: {int4(10)}
     * @param totalAmount The value of totalAmount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_Equal(Integer totalAmount) {
        doSetTotalAmount_Equal(totalAmount);
    }

    protected void doSetTotalAmount_Equal(Integer totalAmount) {
        regTotalAmount(CK_EQ, totalAmount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * total_amount: {int4(10)}
     * @param totalAmount The value of totalAmount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_NotEqual(Integer totalAmount) {
        doSetTotalAmount_NotEqual(totalAmount);
    }

    protected void doSetTotalAmount_NotEqual(Integer totalAmount) {
        regTotalAmount(CK_NES, totalAmount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * total_amount: {int4(10)}
     * @param totalAmount The value of totalAmount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_GreaterThan(Integer totalAmount) {
        regTotalAmount(CK_GT, totalAmount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * total_amount: {int4(10)}
     * @param totalAmount The value of totalAmount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_LessThan(Integer totalAmount) {
        regTotalAmount(CK_LT, totalAmount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * total_amount: {int4(10)}
     * @param totalAmount The value of totalAmount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_GreaterEqual(Integer totalAmount) {
        regTotalAmount(CK_GE, totalAmount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * total_amount: {int4(10)}
     * @param totalAmount The value of totalAmount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_LessEqual(Integer totalAmount) {
        regTotalAmount(CK_LE, totalAmount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * total_amount: {int4(10)}
     * @param minNumber The min number of totalAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTotalAmount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTotalAmount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * total_amount: {int4(10)}
     * @param minNumber The min number of totalAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTotalAmount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalAmount(), "total_amount", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * total_amount: {int4(10)}
     * @param totalAmountList The collection of totalAmount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalAmount_InScope(Collection<Integer> totalAmountList) {
        doSetTotalAmount_InScope(totalAmountList);
    }

    protected void doSetTotalAmount_InScope(Collection<Integer> totalAmountList) {
        regINS(CK_INS, cTL(totalAmountList), xgetCValueTotalAmount(), "total_amount");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * total_amount: {int4(10)}
     * @param totalAmountList The collection of totalAmount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalAmount_NotInScope(Collection<Integer> totalAmountList) {
        doSetTotalAmount_NotInScope(totalAmountList);
    }

    protected void doSetTotalAmount_NotInScope(Collection<Integer> totalAmountList) {
        regINS(CK_NINS, cTL(totalAmountList), xgetCValueTotalAmount(), "total_amount");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * total_amount: {int4(10)}
     */
    public void setTotalAmount_IsNull() { regTotalAmount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * total_amount: {int4(10)}
     */
    public void setTotalAmount_IsNotNull() { regTotalAmount(CK_ISNN, DOBJ); }

    protected void regTotalAmount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalAmount(), "total_amount"); }
    protected abstract ConditionValue xgetCValueTotalAmount();

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
     * status: {int4(10)}
     * @param status The value of status as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatus_Equal(Integer status) {
        doSetStatus_Equal(status);
    }

    protected void doSetStatus_Equal(Integer status) {
        regStatus(CK_EQ, status);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * status: {int4(10)}
     * @param status The value of status as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatus_NotEqual(Integer status) {
        doSetStatus_NotEqual(status);
    }

    protected void doSetStatus_NotEqual(Integer status) {
        regStatus(CK_NES, status);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * status: {int4(10)}
     * @param status The value of status as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatus_GreaterThan(Integer status) {
        regStatus(CK_GT, status);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * status: {int4(10)}
     * @param status The value of status as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatus_LessThan(Integer status) {
        regStatus(CK_LT, status);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * status: {int4(10)}
     * @param status The value of status as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatus_GreaterEqual(Integer status) {
        regStatus(CK_GE, status);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * status: {int4(10)}
     * @param status The value of status as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatus_LessEqual(Integer status) {
        regStatus(CK_LE, status);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * status: {int4(10)}
     * @param minNumber The min number of status. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of status. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setStatus_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setStatus_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * status: {int4(10)}
     * @param minNumber The min number of status. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of status. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setStatus_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStatus(), "status", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * status: {int4(10)}
     * @param statusList The collection of status as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_InScope(Collection<Integer> statusList) {
        doSetStatus_InScope(statusList);
    }

    protected void doSetStatus_InScope(Collection<Integer> statusList) {
        regINS(CK_INS, cTL(statusList), xgetCValueStatus(), "status");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * status: {int4(10)}
     * @param statusList The collection of status as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_NotInScope(Collection<Integer> statusList) {
        doSetStatus_NotInScope(statusList);
    }

    protected void doSetStatus_NotInScope(Collection<Integer> statusList) {
        regINS(CK_NINS, cTL(statusList), xgetCValueStatus(), "status");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * status: {int4(10)}
     */
    public void setStatus_IsNull() { regStatus(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * status: {int4(10)}
     */
    public void setStatus_IsNotNull() { regStatus(CK_ISNN, DOBJ); }

    protected void regStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStatus(), "status"); }
    protected abstract ConditionValue xgetCValueStatus();

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
    public HpSLCFunction<TReservationCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TReservationCB.class);
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
    public HpSLCFunction<TReservationCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TReservationCB.class);
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
    public HpSLCFunction<TReservationCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TReservationCB.class);
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
    public HpSLCFunction<TReservationCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TReservationCB.class);
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
    public HpSLCFunction<TReservationCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TReservationCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TReservationCB&gt;() {
     *     public void query(TReservationCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TReservationCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TReservationCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TReservationCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TReservationCQ sq);

    protected TReservationCB xcreateScalarConditionCB() {
        TReservationCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TReservationCB xcreateScalarConditionPartitionByCB() {
        TReservationCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TReservationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReservationCB cb = new TReservationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "reservation_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TReservationCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TReservationCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TReservationCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReservationCB cb = new TReservationCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "reservation_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TReservationCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TReservationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReservationCB cb = new TReservationCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TReservationCQ sq);

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
    protected TReservationCB newMyCB() {
        return new TReservationCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TReservationCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

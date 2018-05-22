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
 * The abstract condition-query of m_working_staff.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMWorkingStaffCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMWorkingStaffCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_working_staff";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * working_staff_id: {PK, ID, NotNull, serial(10)}
     * @param workingStaffId The value of workingStaffId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingStaffId_Equal(Integer workingStaffId) {
        doSetWorkingStaffId_Equal(workingStaffId);
    }

    protected void doSetWorkingStaffId_Equal(Integer workingStaffId) {
        regWorkingStaffId(CK_EQ, workingStaffId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * working_staff_id: {PK, ID, NotNull, serial(10)}
     * @param workingStaffId The value of workingStaffId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingStaffId_NotEqual(Integer workingStaffId) {
        doSetWorkingStaffId_NotEqual(workingStaffId);
    }

    protected void doSetWorkingStaffId_NotEqual(Integer workingStaffId) {
        regWorkingStaffId(CK_NES, workingStaffId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * working_staff_id: {PK, ID, NotNull, serial(10)}
     * @param workingStaffId The value of workingStaffId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingStaffId_GreaterThan(Integer workingStaffId) {
        regWorkingStaffId(CK_GT, workingStaffId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * working_staff_id: {PK, ID, NotNull, serial(10)}
     * @param workingStaffId The value of workingStaffId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingStaffId_LessThan(Integer workingStaffId) {
        regWorkingStaffId(CK_LT, workingStaffId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * working_staff_id: {PK, ID, NotNull, serial(10)}
     * @param workingStaffId The value of workingStaffId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingStaffId_GreaterEqual(Integer workingStaffId) {
        regWorkingStaffId(CK_GE, workingStaffId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * working_staff_id: {PK, ID, NotNull, serial(10)}
     * @param workingStaffId The value of workingStaffId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingStaffId_LessEqual(Integer workingStaffId) {
        regWorkingStaffId(CK_LE, workingStaffId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * working_staff_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of workingStaffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workingStaffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setWorkingStaffId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setWorkingStaffId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * working_staff_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of workingStaffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workingStaffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setWorkingStaffId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkingStaffId(), "working_staff_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * working_staff_id: {PK, ID, NotNull, serial(10)}
     * @param workingStaffIdList The collection of workingStaffId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkingStaffId_InScope(Collection<Integer> workingStaffIdList) {
        doSetWorkingStaffId_InScope(workingStaffIdList);
    }

    protected void doSetWorkingStaffId_InScope(Collection<Integer> workingStaffIdList) {
        regINS(CK_INS, cTL(workingStaffIdList), xgetCValueWorkingStaffId(), "working_staff_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * working_staff_id: {PK, ID, NotNull, serial(10)}
     * @param workingStaffIdList The collection of workingStaffId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkingStaffId_NotInScope(Collection<Integer> workingStaffIdList) {
        doSetWorkingStaffId_NotInScope(workingStaffIdList);
    }

    protected void doSetWorkingStaffId_NotInScope(Collection<Integer> workingStaffIdList) {
        regINS(CK_NINS, cTL(workingStaffIdList), xgetCValueWorkingStaffId(), "working_staff_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * working_staff_id: {PK, ID, NotNull, serial(10)}
     */
    public void setWorkingStaffId_IsNull() { regWorkingStaffId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * working_staff_id: {PK, ID, NotNull, serial(10)}
     */
    public void setWorkingStaffId_IsNotNull() { regWorkingStaffId(CK_ISNN, DOBJ); }

    protected void regWorkingStaffId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkingStaffId(), "working_staff_id"); }
    protected abstract ConditionValue xgetCValueWorkingStaffId();

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
     * staff_id: {int4(10), FK to m_staff}
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
     * staff_id: {int4(10), FK to m_staff}
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
     * staff_id: {int4(10), FK to m_staff}
     * @param staffId The value of staffId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStaffId_GreaterThan(Integer staffId) {
        regStaffId(CK_GT, staffId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {int4(10), FK to m_staff}
     * @param staffId The value of staffId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStaffId_LessThan(Integer staffId) {
        regStaffId(CK_LT, staffId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {int4(10), FK to m_staff}
     * @param staffId The value of staffId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStaffId_GreaterEqual(Integer staffId) {
        regStaffId(CK_GE, staffId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {int4(10), FK to m_staff}
     * @param staffId The value of staffId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStaffId_LessEqual(Integer staffId) {
        regStaffId(CK_LE, staffId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {int4(10), FK to m_staff}
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
     * staff_id: {int4(10), FK to m_staff}
     * @param minNumber The min number of staffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of staffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setStaffId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStaffId(), "staff_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * staff_id: {int4(10), FK to m_staff}
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
     * staff_id: {int4(10), FK to m_staff}
     * @param staffIdList The collection of staffId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStaffId_NotInScope(Collection<Integer> staffIdList) {
        doSetStaffId_NotInScope(staffIdList);
    }

    protected void doSetStaffId_NotInScope(Collection<Integer> staffIdList) {
        regINS(CK_NINS, cTL(staffIdList), xgetCValueStaffId(), "staff_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * staff_id: {int4(10), FK to m_staff}
     */
    public void setStaffId_IsNull() { regStaffId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * staff_id: {int4(10), FK to m_staff}
     */
    public void setStaffId_IsNotNull() { regStaffId(CK_ISNN, DOBJ); }

    protected void regStaffId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStaffId(), "staff_id"); }
    protected abstract ConditionValue xgetCValueStaffId();

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
    public HpSLCFunction<MWorkingStaffCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MWorkingStaffCB.class);
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
    public HpSLCFunction<MWorkingStaffCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MWorkingStaffCB.class);
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
    public HpSLCFunction<MWorkingStaffCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MWorkingStaffCB.class);
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
    public HpSLCFunction<MWorkingStaffCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MWorkingStaffCB.class);
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
    public HpSLCFunction<MWorkingStaffCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MWorkingStaffCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MWorkingStaffCB&gt;() {
     *     public void query(MWorkingStaffCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MWorkingStaffCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MWorkingStaffCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MWorkingStaffCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MWorkingStaffCQ sq);

    protected MWorkingStaffCB xcreateScalarConditionCB() {
        MWorkingStaffCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MWorkingStaffCB xcreateScalarConditionPartitionByCB() {
        MWorkingStaffCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MWorkingStaffCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWorkingStaffCB cb = new MWorkingStaffCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "working_staff_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MWorkingStaffCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MWorkingStaffCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MWorkingStaffCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWorkingStaffCB cb = new MWorkingStaffCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "working_staff_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MWorkingStaffCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MWorkingStaffCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWorkingStaffCB cb = new MWorkingStaffCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MWorkingStaffCQ sq);

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
    protected MWorkingStaffCB newMyCB() {
        return new MWorkingStaffCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MWorkingStaffCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of m_working_day_detail_deff.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMWorkingDayDetailDeffCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMWorkingDayDetailDeffCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_working_day_detail_deff";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_detail_deff_id: {PK, ID, NotNull, serial(10)}
     * @param workingDayDetailDeffId The value of workingDayDetailDeffId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingDayDetailDeffId_Equal(Integer workingDayDetailDeffId) {
        doSetWorkingDayDetailDeffId_Equal(workingDayDetailDeffId);
    }

    protected void doSetWorkingDayDetailDeffId_Equal(Integer workingDayDetailDeffId) {
        regWorkingDayDetailDeffId(CK_EQ, workingDayDetailDeffId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_detail_deff_id: {PK, ID, NotNull, serial(10)}
     * @param workingDayDetailDeffId The value of workingDayDetailDeffId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingDayDetailDeffId_NotEqual(Integer workingDayDetailDeffId) {
        doSetWorkingDayDetailDeffId_NotEqual(workingDayDetailDeffId);
    }

    protected void doSetWorkingDayDetailDeffId_NotEqual(Integer workingDayDetailDeffId) {
        regWorkingDayDetailDeffId(CK_NES, workingDayDetailDeffId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_detail_deff_id: {PK, ID, NotNull, serial(10)}
     * @param workingDayDetailDeffId The value of workingDayDetailDeffId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingDayDetailDeffId_GreaterThan(Integer workingDayDetailDeffId) {
        regWorkingDayDetailDeffId(CK_GT, workingDayDetailDeffId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_detail_deff_id: {PK, ID, NotNull, serial(10)}
     * @param workingDayDetailDeffId The value of workingDayDetailDeffId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingDayDetailDeffId_LessThan(Integer workingDayDetailDeffId) {
        regWorkingDayDetailDeffId(CK_LT, workingDayDetailDeffId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_detail_deff_id: {PK, ID, NotNull, serial(10)}
     * @param workingDayDetailDeffId The value of workingDayDetailDeffId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingDayDetailDeffId_GreaterEqual(Integer workingDayDetailDeffId) {
        regWorkingDayDetailDeffId(CK_GE, workingDayDetailDeffId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_detail_deff_id: {PK, ID, NotNull, serial(10)}
     * @param workingDayDetailDeffId The value of workingDayDetailDeffId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingDayDetailDeffId_LessEqual(Integer workingDayDetailDeffId) {
        regWorkingDayDetailDeffId(CK_LE, workingDayDetailDeffId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_detail_deff_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of workingDayDetailDeffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workingDayDetailDeffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setWorkingDayDetailDeffId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setWorkingDayDetailDeffId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_detail_deff_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of workingDayDetailDeffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workingDayDetailDeffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setWorkingDayDetailDeffId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkingDayDetailDeffId(), "working_day_detail_deff_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * working_day_detail_deff_id: {PK, ID, NotNull, serial(10)}
     * @param workingDayDetailDeffIdList The collection of workingDayDetailDeffId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkingDayDetailDeffId_InScope(Collection<Integer> workingDayDetailDeffIdList) {
        doSetWorkingDayDetailDeffId_InScope(workingDayDetailDeffIdList);
    }

    protected void doSetWorkingDayDetailDeffId_InScope(Collection<Integer> workingDayDetailDeffIdList) {
        regINS(CK_INS, cTL(workingDayDetailDeffIdList), xgetCValueWorkingDayDetailDeffId(), "working_day_detail_deff_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * working_day_detail_deff_id: {PK, ID, NotNull, serial(10)}
     * @param workingDayDetailDeffIdList The collection of workingDayDetailDeffId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkingDayDetailDeffId_NotInScope(Collection<Integer> workingDayDetailDeffIdList) {
        doSetWorkingDayDetailDeffId_NotInScope(workingDayDetailDeffIdList);
    }

    protected void doSetWorkingDayDetailDeffId_NotInScope(Collection<Integer> workingDayDetailDeffIdList) {
        regINS(CK_NINS, cTL(workingDayDetailDeffIdList), xgetCValueWorkingDayDetailDeffId(), "working_day_detail_deff_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * working_day_detail_deff_id: {PK, ID, NotNull, serial(10)}
     */
    public void setWorkingDayDetailDeffId_IsNull() { regWorkingDayDetailDeffId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * working_day_detail_deff_id: {PK, ID, NotNull, serial(10)}
     */
    public void setWorkingDayDetailDeffId_IsNotNull() { regWorkingDayDetailDeffId(CK_ISNN, DOBJ); }

    protected void regWorkingDayDetailDeffId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkingDayDetailDeffId(), "working_day_detail_deff_id"); }
    protected abstract ConditionValue xgetCValueWorkingDayDetailDeffId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * m_working_day_deff_id: {NotNull, int4(10), FK to m_working_day_deff}
     * @param mWorkingDayDeffId The value of mWorkingDayDeffId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMWorkingDayDeffId_Equal(Integer mWorkingDayDeffId) {
        doSetMWorkingDayDeffId_Equal(mWorkingDayDeffId);
    }

    protected void doSetMWorkingDayDeffId_Equal(Integer mWorkingDayDeffId) {
        regMWorkingDayDeffId(CK_EQ, mWorkingDayDeffId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * m_working_day_deff_id: {NotNull, int4(10), FK to m_working_day_deff}
     * @param mWorkingDayDeffId The value of mWorkingDayDeffId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMWorkingDayDeffId_NotEqual(Integer mWorkingDayDeffId) {
        doSetMWorkingDayDeffId_NotEqual(mWorkingDayDeffId);
    }

    protected void doSetMWorkingDayDeffId_NotEqual(Integer mWorkingDayDeffId) {
        regMWorkingDayDeffId(CK_NES, mWorkingDayDeffId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * m_working_day_deff_id: {NotNull, int4(10), FK to m_working_day_deff}
     * @param mWorkingDayDeffId The value of mWorkingDayDeffId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMWorkingDayDeffId_GreaterThan(Integer mWorkingDayDeffId) {
        regMWorkingDayDeffId(CK_GT, mWorkingDayDeffId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * m_working_day_deff_id: {NotNull, int4(10), FK to m_working_day_deff}
     * @param mWorkingDayDeffId The value of mWorkingDayDeffId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMWorkingDayDeffId_LessThan(Integer mWorkingDayDeffId) {
        regMWorkingDayDeffId(CK_LT, mWorkingDayDeffId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * m_working_day_deff_id: {NotNull, int4(10), FK to m_working_day_deff}
     * @param mWorkingDayDeffId The value of mWorkingDayDeffId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMWorkingDayDeffId_GreaterEqual(Integer mWorkingDayDeffId) {
        regMWorkingDayDeffId(CK_GE, mWorkingDayDeffId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * m_working_day_deff_id: {NotNull, int4(10), FK to m_working_day_deff}
     * @param mWorkingDayDeffId The value of mWorkingDayDeffId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMWorkingDayDeffId_LessEqual(Integer mWorkingDayDeffId) {
        regMWorkingDayDeffId(CK_LE, mWorkingDayDeffId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * m_working_day_deff_id: {NotNull, int4(10), FK to m_working_day_deff}
     * @param minNumber The min number of mWorkingDayDeffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mWorkingDayDeffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMWorkingDayDeffId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMWorkingDayDeffId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * m_working_day_deff_id: {NotNull, int4(10), FK to m_working_day_deff}
     * @param minNumber The min number of mWorkingDayDeffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mWorkingDayDeffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMWorkingDayDeffId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMWorkingDayDeffId(), "m_working_day_deff_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * m_working_day_deff_id: {NotNull, int4(10), FK to m_working_day_deff}
     * @param mWorkingDayDeffIdList The collection of mWorkingDayDeffId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMWorkingDayDeffId_InScope(Collection<Integer> mWorkingDayDeffIdList) {
        doSetMWorkingDayDeffId_InScope(mWorkingDayDeffIdList);
    }

    protected void doSetMWorkingDayDeffId_InScope(Collection<Integer> mWorkingDayDeffIdList) {
        regINS(CK_INS, cTL(mWorkingDayDeffIdList), xgetCValueMWorkingDayDeffId(), "m_working_day_deff_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * m_working_day_deff_id: {NotNull, int4(10), FK to m_working_day_deff}
     * @param mWorkingDayDeffIdList The collection of mWorkingDayDeffId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMWorkingDayDeffId_NotInScope(Collection<Integer> mWorkingDayDeffIdList) {
        doSetMWorkingDayDeffId_NotInScope(mWorkingDayDeffIdList);
    }

    protected void doSetMWorkingDayDeffId_NotInScope(Collection<Integer> mWorkingDayDeffIdList) {
        regINS(CK_NINS, cTL(mWorkingDayDeffIdList), xgetCValueMWorkingDayDeffId(), "m_working_day_deff_id");
    }

    protected void regMWorkingDayDeffId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMWorkingDayDeffId(), "m_working_day_deff_id"); }
    protected abstract ConditionValue xgetCValueMWorkingDayDeffId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * effective_flag: {NotNull, bool(1)}
     * @param effectiveFlag The value of effectiveFlag as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEffectiveFlag_Equal(Boolean effectiveFlag) {
        regEffectiveFlag(CK_EQ, effectiveFlag);
    }

    protected void regEffectiveFlag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEffectiveFlag(), "effective_flag"); }
    protected abstract ConditionValue xgetCValueEffectiveFlag();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_flg: {NotNull, bool(1)}
     * @param workingDayFlg The value of workingDayFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingDayFlg_Equal(Boolean workingDayFlg) {
        regWorkingDayFlg(CK_EQ, workingDayFlg);
    }

    protected void regWorkingDayFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkingDayFlg(), "working_day_flg"); }
    protected abstract ConditionValue xgetCValueWorkingDayFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * week_1_flag: {bool(1)}
     * @param week1Flag The value of week1Flag as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWeek1Flag_Equal(Boolean week1Flag) {
        regWeek1Flag(CK_EQ, week1Flag);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * week_1_flag: {bool(1)}
     */
    public void setWeek1Flag_IsNull() { regWeek1Flag(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * week_1_flag: {bool(1)}
     */
    public void setWeek1Flag_IsNotNull() { regWeek1Flag(CK_ISNN, DOBJ); }

    protected void regWeek1Flag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWeek1Flag(), "week_1_flag"); }
    protected abstract ConditionValue xgetCValueWeek1Flag();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * week_2_flag: {bool(1)}
     * @param week2Flag The value of week2Flag as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWeek2Flag_Equal(Boolean week2Flag) {
        regWeek2Flag(CK_EQ, week2Flag);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * week_2_flag: {bool(1)}
     */
    public void setWeek2Flag_IsNull() { regWeek2Flag(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * week_2_flag: {bool(1)}
     */
    public void setWeek2Flag_IsNotNull() { regWeek2Flag(CK_ISNN, DOBJ); }

    protected void regWeek2Flag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWeek2Flag(), "week_2_flag"); }
    protected abstract ConditionValue xgetCValueWeek2Flag();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * week_3_flag: {bool(1)}
     * @param week3Flag The value of week3Flag as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWeek3Flag_Equal(Boolean week3Flag) {
        regWeek3Flag(CK_EQ, week3Flag);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * week_3_flag: {bool(1)}
     */
    public void setWeek3Flag_IsNull() { regWeek3Flag(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * week_3_flag: {bool(1)}
     */
    public void setWeek3Flag_IsNotNull() { regWeek3Flag(CK_ISNN, DOBJ); }

    protected void regWeek3Flag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWeek3Flag(), "week_3_flag"); }
    protected abstract ConditionValue xgetCValueWeek3Flag();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * week4_flag: {bool(1)}
     * @param week4Flag The value of week4Flag as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWeek4Flag_Equal(Boolean week4Flag) {
        regWeek4Flag(CK_EQ, week4Flag);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * week4_flag: {bool(1)}
     */
    public void setWeek4Flag_IsNull() { regWeek4Flag(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * week4_flag: {bool(1)}
     */
    public void setWeek4Flag_IsNotNull() { regWeek4Flag(CK_ISNN, DOBJ); }

    protected void regWeek4Flag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWeek4Flag(), "week4_flag"); }
    protected abstract ConditionValue xgetCValueWeek4Flag();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * week5_flag: {bool(1)}
     * @param week5Flag The value of week5Flag as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWeek5Flag_Equal(Boolean week5Flag) {
        regWeek5Flag(CK_EQ, week5Flag);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * week5_flag: {bool(1)}
     */
    public void setWeek5Flag_IsNull() { regWeek5Flag(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * week5_flag: {bool(1)}
     */
    public void setWeek5Flag_IsNotNull() { regWeek5Flag(CK_ISNN, DOBJ); }

    protected void regWeek5Flag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWeek5Flag(), "week5_flag"); }
    protected abstract ConditionValue xgetCValueWeek5Flag();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * mon_flg: {bool(1)}
     * @param monFlg The value of monFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMonFlg_Equal(Boolean monFlg) {
        regMonFlg(CK_EQ, monFlg);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * mon_flg: {bool(1)}
     */
    public void setMonFlg_IsNull() { regMonFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * mon_flg: {bool(1)}
     */
    public void setMonFlg_IsNotNull() { regMonFlg(CK_ISNN, DOBJ); }

    protected void regMonFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMonFlg(), "mon_flg"); }
    protected abstract ConditionValue xgetCValueMonFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * tue_flg: {bool(1)}
     * @param tueFlg The value of tueFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTueFlg_Equal(Boolean tueFlg) {
        regTueFlg(CK_EQ, tueFlg);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * tue_flg: {bool(1)}
     */
    public void setTueFlg_IsNull() { regTueFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * tue_flg: {bool(1)}
     */
    public void setTueFlg_IsNotNull() { regTueFlg(CK_ISNN, DOBJ); }

    protected void regTueFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTueFlg(), "tue_flg"); }
    protected abstract ConditionValue xgetCValueTueFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * web_flg: {bool(1)}
     * @param webFlg The value of webFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWebFlg_Equal(Boolean webFlg) {
        regWebFlg(CK_EQ, webFlg);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * web_flg: {bool(1)}
     */
    public void setWebFlg_IsNull() { regWebFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * web_flg: {bool(1)}
     */
    public void setWebFlg_IsNotNull() { regWebFlg(CK_ISNN, DOBJ); }

    protected void regWebFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWebFlg(), "web_flg"); }
    protected abstract ConditionValue xgetCValueWebFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * thu_flg: {bool(1)}
     * @param thuFlg The value of thuFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setThuFlg_Equal(Boolean thuFlg) {
        regThuFlg(CK_EQ, thuFlg);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * thu_flg: {bool(1)}
     */
    public void setThuFlg_IsNull() { regThuFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * thu_flg: {bool(1)}
     */
    public void setThuFlg_IsNotNull() { regThuFlg(CK_ISNN, DOBJ); }

    protected void regThuFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueThuFlg(), "thu_flg"); }
    protected abstract ConditionValue xgetCValueThuFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * fri_flg: {bool(1)}
     * @param friFlg The value of friFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFriFlg_Equal(Boolean friFlg) {
        regFriFlg(CK_EQ, friFlg);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * fri_flg: {bool(1)}
     */
    public void setFriFlg_IsNull() { regFriFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * fri_flg: {bool(1)}
     */
    public void setFriFlg_IsNotNull() { regFriFlg(CK_ISNN, DOBJ); }

    protected void regFriFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFriFlg(), "fri_flg"); }
    protected abstract ConditionValue xgetCValueFriFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * sat_flg: {bool(1)}
     * @param satFlg The value of satFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSatFlg_Equal(Boolean satFlg) {
        regSatFlg(CK_EQ, satFlg);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * sat_flg: {bool(1)}
     */
    public void setSatFlg_IsNull() { regSatFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * sat_flg: {bool(1)}
     */
    public void setSatFlg_IsNotNull() { regSatFlg(CK_ISNN, DOBJ); }

    protected void regSatFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSatFlg(), "sat_flg"); }
    protected abstract ConditionValue xgetCValueSatFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * sun_flg: {bool(1)}
     * @param sunFlg The value of sunFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSunFlg_Equal(Boolean sunFlg) {
        regSunFlg(CK_EQ, sunFlg);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * sun_flg: {bool(1)}
     */
    public void setSunFlg_IsNull() { regSunFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * sun_flg: {bool(1)}
     */
    public void setSunFlg_IsNotNull() { regSunFlg(CK_ISNN, DOBJ); }

    protected void regSunFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSunFlg(), "sun_flg"); }
    protected abstract ConditionValue xgetCValueSunFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * holiday_flg: {bool(1)}
     * @param holidayFlg The value of holidayFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHolidayFlg_Equal(Boolean holidayFlg) {
        regHolidayFlg(CK_EQ, holidayFlg);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * holiday_flg: {bool(1)}
     */
    public void setHolidayFlg_IsNull() { regHolidayFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * holiday_flg: {bool(1)}
     */
    public void setHolidayFlg_IsNotNull() { regHolidayFlg(CK_ISNN, DOBJ); }

    protected void regHolidayFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHolidayFlg(), "holiday_flg"); }
    protected abstract ConditionValue xgetCValueHolidayFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * day_of_month: {int2(5)}
     * @param dayOfMonth The value of dayOfMonth as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDayOfMonth_Equal(Integer dayOfMonth) {
        doSetDayOfMonth_Equal(dayOfMonth);
    }

    protected void doSetDayOfMonth_Equal(Integer dayOfMonth) {
        regDayOfMonth(CK_EQ, dayOfMonth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * day_of_month: {int2(5)}
     * @param dayOfMonth The value of dayOfMonth as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDayOfMonth_NotEqual(Integer dayOfMonth) {
        doSetDayOfMonth_NotEqual(dayOfMonth);
    }

    protected void doSetDayOfMonth_NotEqual(Integer dayOfMonth) {
        regDayOfMonth(CK_NES, dayOfMonth);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * day_of_month: {int2(5)}
     * @param dayOfMonth The value of dayOfMonth as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDayOfMonth_GreaterThan(Integer dayOfMonth) {
        regDayOfMonth(CK_GT, dayOfMonth);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * day_of_month: {int2(5)}
     * @param dayOfMonth The value of dayOfMonth as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDayOfMonth_LessThan(Integer dayOfMonth) {
        regDayOfMonth(CK_LT, dayOfMonth);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * day_of_month: {int2(5)}
     * @param dayOfMonth The value of dayOfMonth as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDayOfMonth_GreaterEqual(Integer dayOfMonth) {
        regDayOfMonth(CK_GE, dayOfMonth);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * day_of_month: {int2(5)}
     * @param dayOfMonth The value of dayOfMonth as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDayOfMonth_LessEqual(Integer dayOfMonth) {
        regDayOfMonth(CK_LE, dayOfMonth);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * day_of_month: {int2(5)}
     * @param minNumber The min number of dayOfMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dayOfMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDayOfMonth_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDayOfMonth_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * day_of_month: {int2(5)}
     * @param minNumber The min number of dayOfMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dayOfMonth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDayOfMonth_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDayOfMonth(), "day_of_month", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * day_of_month: {int2(5)}
     * @param dayOfMonthList The collection of dayOfMonth as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDayOfMonth_InScope(Collection<Integer> dayOfMonthList) {
        doSetDayOfMonth_InScope(dayOfMonthList);
    }

    protected void doSetDayOfMonth_InScope(Collection<Integer> dayOfMonthList) {
        regINS(CK_INS, cTL(dayOfMonthList), xgetCValueDayOfMonth(), "day_of_month");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * day_of_month: {int2(5)}
     * @param dayOfMonthList The collection of dayOfMonth as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDayOfMonth_NotInScope(Collection<Integer> dayOfMonthList) {
        doSetDayOfMonth_NotInScope(dayOfMonthList);
    }

    protected void doSetDayOfMonth_NotInScope(Collection<Integer> dayOfMonthList) {
        regINS(CK_NINS, cTL(dayOfMonthList), xgetCValueDayOfMonth(), "day_of_month");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * day_of_month: {int2(5)}
     */
    public void setDayOfMonth_IsNull() { regDayOfMonth(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * day_of_month: {int2(5)}
     */
    public void setDayOfMonth_IsNotNull() { regDayOfMonth(CK_ISNN, DOBJ); }

    protected void regDayOfMonth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDayOfMonth(), "day_of_month"); }
    protected abstract ConditionValue xgetCValueDayOfMonth();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * specified_day: {date(13)}
     * @param specifiedDay The value of specifiedDay as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecifiedDay_Equal(java.time.LocalDate specifiedDay) {
        regSpecifiedDay(CK_EQ,  specifiedDay);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * specified_day: {date(13)}
     * @param specifiedDay The value of specifiedDay as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecifiedDay_GreaterThan(java.time.LocalDate specifiedDay) {
        regSpecifiedDay(CK_GT,  specifiedDay);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * specified_day: {date(13)}
     * @param specifiedDay The value of specifiedDay as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecifiedDay_LessThan(java.time.LocalDate specifiedDay) {
        regSpecifiedDay(CK_LT,  specifiedDay);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * specified_day: {date(13)}
     * @param specifiedDay The value of specifiedDay as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecifiedDay_GreaterEqual(java.time.LocalDate specifiedDay) {
        regSpecifiedDay(CK_GE,  specifiedDay);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * specified_day: {date(13)}
     * @param specifiedDay The value of specifiedDay as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecifiedDay_LessEqual(java.time.LocalDate specifiedDay) {
        regSpecifiedDay(CK_LE, specifiedDay);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * specified_day: {date(13)}
     * <pre>e.g. setSpecifiedDay_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of specifiedDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of specifiedDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setSpecifiedDay_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setSpecifiedDay_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * specified_day: {date(13)}
     * <pre>e.g. setSpecifiedDay_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of specifiedDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of specifiedDay. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setSpecifiedDay_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "specified_day"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueSpecifiedDay(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * specified_day: {date(13)}
     */
    public void setSpecifiedDay_IsNull() { regSpecifiedDay(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * specified_day: {date(13)}
     */
    public void setSpecifiedDay_IsNotNull() { regSpecifiedDay(CK_ISNN, DOBJ); }

    protected void regSpecifiedDay(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpecifiedDay(), "specified_day"); }
    protected abstract ConditionValue xgetCValueSpecifiedDay();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * start_time: {time(15, 6)}
     * @param startTime The value of startTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTime_Equal(java.time.LocalTime startTime) {
        regStartTime(CK_EQ,  startTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * start_time: {time(15, 6)}
     * @param startTime The value of startTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTime_GreaterThan(java.time.LocalTime startTime) {
        regStartTime(CK_GT,  startTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * start_time: {time(15, 6)}
     * @param startTime The value of startTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTime_LessThan(java.time.LocalTime startTime) {
        regStartTime(CK_LT,  startTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * start_time: {time(15, 6)}
     * @param startTime The value of startTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTime_GreaterEqual(java.time.LocalTime startTime) {
        regStartTime(CK_GE,  startTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * start_time: {time(15, 6)}
     * @param startTime The value of startTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTime_LessEqual(java.time.LocalTime startTime) {
        regStartTime(CK_LE, startTime);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * start_time: {time(15, 6)}
     */
    public void setStartTime_IsNull() { regStartTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * start_time: {time(15, 6)}
     */
    public void setStartTime_IsNotNull() { regStartTime(CK_ISNN, DOBJ); }

    protected void regStartTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStartTime(), "start_time"); }
    protected abstract ConditionValue xgetCValueStartTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * end_time: {time(15, 6)}
     * @param endTime The value of endTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTime_Equal(java.time.LocalTime endTime) {
        regEndTime(CK_EQ,  endTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * end_time: {time(15, 6)}
     * @param endTime The value of endTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTime_GreaterThan(java.time.LocalTime endTime) {
        regEndTime(CK_GT,  endTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * end_time: {time(15, 6)}
     * @param endTime The value of endTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTime_LessThan(java.time.LocalTime endTime) {
        regEndTime(CK_LT,  endTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * end_time: {time(15, 6)}
     * @param endTime The value of endTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTime_GreaterEqual(java.time.LocalTime endTime) {
        regEndTime(CK_GE,  endTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * end_time: {time(15, 6)}
     * @param endTime The value of endTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTime_LessEqual(java.time.LocalTime endTime) {
        regEndTime(CK_LE, endTime);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * end_time: {time(15, 6)}
     */
    public void setEndTime_IsNull() { regEndTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * end_time: {time(15, 6)}
     */
    public void setEndTime_IsNotNull() { regEndTime(CK_ISNN, DOBJ); }

    protected void regEndTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEndTime(), "end_time"); }
    protected abstract ConditionValue xgetCValueEndTime();

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
    public HpSLCFunction<MWorkingDayDetailDeffCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MWorkingDayDetailDeffCB.class);
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
    public HpSLCFunction<MWorkingDayDetailDeffCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MWorkingDayDetailDeffCB.class);
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
    public HpSLCFunction<MWorkingDayDetailDeffCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MWorkingDayDetailDeffCB.class);
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
    public HpSLCFunction<MWorkingDayDetailDeffCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MWorkingDayDetailDeffCB.class);
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
    public HpSLCFunction<MWorkingDayDetailDeffCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MWorkingDayDetailDeffCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MWorkingDayDetailDeffCB&gt;() {
     *     public void query(MWorkingDayDetailDeffCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MWorkingDayDetailDeffCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MWorkingDayDetailDeffCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MWorkingDayDetailDeffCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MWorkingDayDetailDeffCQ sq);

    protected MWorkingDayDetailDeffCB xcreateScalarConditionCB() {
        MWorkingDayDetailDeffCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MWorkingDayDetailDeffCB xcreateScalarConditionPartitionByCB() {
        MWorkingDayDetailDeffCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MWorkingDayDetailDeffCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWorkingDayDetailDeffCB cb = new MWorkingDayDetailDeffCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "working_day_detail_deff_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MWorkingDayDetailDeffCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MWorkingDayDetailDeffCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MWorkingDayDetailDeffCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWorkingDayDetailDeffCB cb = new MWorkingDayDetailDeffCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "working_day_detail_deff_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MWorkingDayDetailDeffCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MWorkingDayDetailDeffCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWorkingDayDetailDeffCB cb = new MWorkingDayDetailDeffCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MWorkingDayDetailDeffCQ sq);

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
    protected MWorkingDayDetailDeffCB newMyCB() {
        return new MWorkingDayDetailDeffCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MWorkingDayDetailDeffCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

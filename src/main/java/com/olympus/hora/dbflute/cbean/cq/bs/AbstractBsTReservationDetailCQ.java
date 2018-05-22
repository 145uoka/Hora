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
 * The abstract condition-query of t_reservation_detail.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTReservationDetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTReservationDetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_reservation_detail";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_detail_id: {PK, ID, NotNull, bigserial(19)}
     * @param reservationDetailId The value of reservationDetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationDetailId_Equal(Long reservationDetailId) {
        doSetReservationDetailId_Equal(reservationDetailId);
    }

    protected void doSetReservationDetailId_Equal(Long reservationDetailId) {
        regReservationDetailId(CK_EQ, reservationDetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_detail_id: {PK, ID, NotNull, bigserial(19)}
     * @param reservationDetailId The value of reservationDetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationDetailId_NotEqual(Long reservationDetailId) {
        doSetReservationDetailId_NotEqual(reservationDetailId);
    }

    protected void doSetReservationDetailId_NotEqual(Long reservationDetailId) {
        regReservationDetailId(CK_NES, reservationDetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_detail_id: {PK, ID, NotNull, bigserial(19)}
     * @param reservationDetailId The value of reservationDetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationDetailId_GreaterThan(Long reservationDetailId) {
        regReservationDetailId(CK_GT, reservationDetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_detail_id: {PK, ID, NotNull, bigserial(19)}
     * @param reservationDetailId The value of reservationDetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationDetailId_LessThan(Long reservationDetailId) {
        regReservationDetailId(CK_LT, reservationDetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_detail_id: {PK, ID, NotNull, bigserial(19)}
     * @param reservationDetailId The value of reservationDetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationDetailId_GreaterEqual(Long reservationDetailId) {
        regReservationDetailId(CK_GE, reservationDetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_detail_id: {PK, ID, NotNull, bigserial(19)}
     * @param reservationDetailId The value of reservationDetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationDetailId_LessEqual(Long reservationDetailId) {
        regReservationDetailId(CK_LE, reservationDetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_detail_id: {PK, ID, NotNull, bigserial(19)}
     * @param minNumber The min number of reservationDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reservationDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReservationDetailId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReservationDetailId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_detail_id: {PK, ID, NotNull, bigserial(19)}
     * @param minNumber The min number of reservationDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reservationDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReservationDetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReservationDetailId(), "reservation_detail_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * reservation_detail_id: {PK, ID, NotNull, bigserial(19)}
     * @param reservationDetailIdList The collection of reservationDetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservationDetailId_InScope(Collection<Long> reservationDetailIdList) {
        doSetReservationDetailId_InScope(reservationDetailIdList);
    }

    protected void doSetReservationDetailId_InScope(Collection<Long> reservationDetailIdList) {
        regINS(CK_INS, cTL(reservationDetailIdList), xgetCValueReservationDetailId(), "reservation_detail_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * reservation_detail_id: {PK, ID, NotNull, bigserial(19)}
     * @param reservationDetailIdList The collection of reservationDetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservationDetailId_NotInScope(Collection<Long> reservationDetailIdList) {
        doSetReservationDetailId_NotInScope(reservationDetailIdList);
    }

    protected void doSetReservationDetailId_NotInScope(Collection<Long> reservationDetailIdList) {
        regINS(CK_NINS, cTL(reservationDetailIdList), xgetCValueReservationDetailId(), "reservation_detail_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * reservation_detail_id: {PK, ID, NotNull, bigserial(19)}
     */
    public void setReservationDetailId_IsNull() { regReservationDetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * reservation_detail_id: {PK, ID, NotNull, bigserial(19)}
     */
    public void setReservationDetailId_IsNotNull() { regReservationDetailId(CK_ISNN, DOBJ); }

    protected void regReservationDetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReservationDetailId(), "reservation_detail_id"); }
    protected abstract ConditionValue xgetCValueReservationDetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_id: {int8(19), FK to t_reservation}
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
     * reservation_id: {int8(19), FK to t_reservation}
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
     * reservation_id: {int8(19), FK to t_reservation}
     * @param reservationId The value of reservationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationId_GreaterThan(Long reservationId) {
        regReservationId(CK_GT, reservationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_id: {int8(19), FK to t_reservation}
     * @param reservationId The value of reservationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationId_LessThan(Long reservationId) {
        regReservationId(CK_LT, reservationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_id: {int8(19), FK to t_reservation}
     * @param reservationId The value of reservationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationId_GreaterEqual(Long reservationId) {
        regReservationId(CK_GE, reservationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_id: {int8(19), FK to t_reservation}
     * @param reservationId The value of reservationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReservationId_LessEqual(Long reservationId) {
        regReservationId(CK_LE, reservationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * reservation_id: {int8(19), FK to t_reservation}
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
     * reservation_id: {int8(19), FK to t_reservation}
     * @param minNumber The min number of reservationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reservationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReservationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReservationId(), "reservation_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * reservation_id: {int8(19), FK to t_reservation}
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
     * reservation_id: {int8(19), FK to t_reservation}
     * @param reservationIdList The collection of reservationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservationId_NotInScope(Collection<Long> reservationIdList) {
        doSetReservationId_NotInScope(reservationIdList);
    }

    protected void doSetReservationId_NotInScope(Collection<Long> reservationIdList) {
        regINS(CK_NINS, cTL(reservationIdList), xgetCValueReservationId(), "reservation_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * reservation_id: {int8(19), FK to t_reservation}
     */
    public void setReservationId_IsNull() { regReservationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * reservation_id: {int8(19), FK to t_reservation}
     */
    public void setReservationId_IsNotNull() { regReservationId(CK_ISNN, DOBJ); }

    protected void regReservationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReservationId(), "reservation_id"); }
    protected abstract ConditionValue xgetCValueReservationId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * course_id: {int4(10), FK to m_course}
     * @param courseId The value of courseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseId_Equal(Integer courseId) {
        doSetCourseId_Equal(courseId);
    }

    protected void doSetCourseId_Equal(Integer courseId) {
        regCourseId(CK_EQ, courseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * course_id: {int4(10), FK to m_course}
     * @param courseId The value of courseId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseId_NotEqual(Integer courseId) {
        doSetCourseId_NotEqual(courseId);
    }

    protected void doSetCourseId_NotEqual(Integer courseId) {
        regCourseId(CK_NES, courseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * course_id: {int4(10), FK to m_course}
     * @param courseId The value of courseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseId_GreaterThan(Integer courseId) {
        regCourseId(CK_GT, courseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * course_id: {int4(10), FK to m_course}
     * @param courseId The value of courseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseId_LessThan(Integer courseId) {
        regCourseId(CK_LT, courseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * course_id: {int4(10), FK to m_course}
     * @param courseId The value of courseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseId_GreaterEqual(Integer courseId) {
        regCourseId(CK_GE, courseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * course_id: {int4(10), FK to m_course}
     * @param courseId The value of courseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseId_LessEqual(Integer courseId) {
        regCourseId(CK_LE, courseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * course_id: {int4(10), FK to m_course}
     * @param minNumber The min number of courseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of courseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCourseId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCourseId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * course_id: {int4(10), FK to m_course}
     * @param minNumber The min number of courseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of courseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCourseId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCourseId(), "course_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * course_id: {int4(10), FK to m_course}
     * @param courseIdList The collection of courseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCourseId_InScope(Collection<Integer> courseIdList) {
        doSetCourseId_InScope(courseIdList);
    }

    protected void doSetCourseId_InScope(Collection<Integer> courseIdList) {
        regINS(CK_INS, cTL(courseIdList), xgetCValueCourseId(), "course_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * course_id: {int4(10), FK to m_course}
     * @param courseIdList The collection of courseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCourseId_NotInScope(Collection<Integer> courseIdList) {
        doSetCourseId_NotInScope(courseIdList);
    }

    protected void doSetCourseId_NotInScope(Collection<Integer> courseIdList) {
        regINS(CK_NINS, cTL(courseIdList), xgetCValueCourseId(), "course_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * course_id: {int4(10), FK to m_course}
     */
    public void setCourseId_IsNull() { regCourseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * course_id: {int4(10), FK to m_course}
     */
    public void setCourseId_IsNotNull() { regCourseId(CK_ISNN, DOBJ); }

    protected void regCourseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCourseId(), "course_id"); }
    protected abstract ConditionValue xgetCValueCourseId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_course_name: {text(2147483647)}
     * @param histCourseName The value of histCourseName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistCourseName_Equal(String histCourseName) {
        doSetHistCourseName_Equal(fRES(histCourseName));
    }

    protected void doSetHistCourseName_Equal(String histCourseName) {
        regHistCourseName(CK_EQ, histCourseName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_course_name: {text(2147483647)}
     * @param histCourseName The value of histCourseName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistCourseName_NotEqual(String histCourseName) {
        doSetHistCourseName_NotEqual(fRES(histCourseName));
    }

    protected void doSetHistCourseName_NotEqual(String histCourseName) {
        regHistCourseName(CK_NES, histCourseName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_course_name: {text(2147483647)}
     * @param histCourseName The value of histCourseName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistCourseName_GreaterThan(String histCourseName) {
        regHistCourseName(CK_GT, fRES(histCourseName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_course_name: {text(2147483647)}
     * @param histCourseName The value of histCourseName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistCourseName_LessThan(String histCourseName) {
        regHistCourseName(CK_LT, fRES(histCourseName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_course_name: {text(2147483647)}
     * @param histCourseName The value of histCourseName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistCourseName_GreaterEqual(String histCourseName) {
        regHistCourseName(CK_GE, fRES(histCourseName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * hist_course_name: {text(2147483647)}
     * @param histCourseName The value of histCourseName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistCourseName_LessEqual(String histCourseName) {
        regHistCourseName(CK_LE, fRES(histCourseName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * hist_course_name: {text(2147483647)}
     * @param histCourseNameList The collection of histCourseName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistCourseName_InScope(Collection<String> histCourseNameList) {
        doSetHistCourseName_InScope(histCourseNameList);
    }

    protected void doSetHistCourseName_InScope(Collection<String> histCourseNameList) {
        regINS(CK_INS, cTL(histCourseNameList), xgetCValueHistCourseName(), "hist_course_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * hist_course_name: {text(2147483647)}
     * @param histCourseNameList The collection of histCourseName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistCourseName_NotInScope(Collection<String> histCourseNameList) {
        doSetHistCourseName_NotInScope(histCourseNameList);
    }

    protected void doSetHistCourseName_NotInScope(Collection<String> histCourseNameList) {
        regINS(CK_NINS, cTL(histCourseNameList), xgetCValueHistCourseName(), "hist_course_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_course_name: {text(2147483647)} <br>
     * <pre>e.g. setHistCourseName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param histCourseName The value of histCourseName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHistCourseName_LikeSearch(String histCourseName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHistCourseName_LikeSearch(histCourseName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_course_name: {text(2147483647)} <br>
     * <pre>e.g. setHistCourseName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param histCourseName The value of histCourseName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setHistCourseName_LikeSearch(String histCourseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(histCourseName), xgetCValueHistCourseName(), "hist_course_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_course_name: {text(2147483647)}
     * @param histCourseName The value of histCourseName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHistCourseName_NotLikeSearch(String histCourseName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHistCourseName_NotLikeSearch(histCourseName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * hist_course_name: {text(2147483647)}
     * @param histCourseName The value of histCourseName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setHistCourseName_NotLikeSearch(String histCourseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(histCourseName), xgetCValueHistCourseName(), "hist_course_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * hist_course_name: {text(2147483647)}
     */
    public void setHistCourseName_IsNull() { regHistCourseName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * hist_course_name: {text(2147483647)}
     */
    public void setHistCourseName_IsNullOrEmpty() { regHistCourseName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * hist_course_name: {text(2147483647)}
     */
    public void setHistCourseName_IsNotNull() { regHistCourseName(CK_ISNN, DOBJ); }

    protected void regHistCourseName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHistCourseName(), "hist_course_name"); }
    protected abstract ConditionValue xgetCValueHistCourseName();

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
    public HpSLCFunction<TReservationDetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TReservationDetailCB.class);
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
    public HpSLCFunction<TReservationDetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TReservationDetailCB.class);
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
    public HpSLCFunction<TReservationDetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TReservationDetailCB.class);
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
    public HpSLCFunction<TReservationDetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TReservationDetailCB.class);
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
    public HpSLCFunction<TReservationDetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TReservationDetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TReservationDetailCB&gt;() {
     *     public void query(TReservationDetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TReservationDetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TReservationDetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TReservationDetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TReservationDetailCQ sq);

    protected TReservationDetailCB xcreateScalarConditionCB() {
        TReservationDetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TReservationDetailCB xcreateScalarConditionPartitionByCB() {
        TReservationDetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TReservationDetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReservationDetailCB cb = new TReservationDetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "reservation_detail_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TReservationDetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TReservationDetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TReservationDetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReservationDetailCB cb = new TReservationDetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "reservation_detail_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TReservationDetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TReservationDetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReservationDetailCB cb = new TReservationDetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TReservationDetailCQ sq);

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
    protected TReservationDetailCB newMyCB() {
        return new TReservationDetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TReservationDetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of m_course.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCourseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCourseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_course";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * course_id: {PK, NotNull, int4(10)}
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
     * course_id: {PK, NotNull, int4(10)}
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
     * course_id: {PK, NotNull, int4(10)}
     * @param courseId The value of courseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseId_GreaterThan(Integer courseId) {
        regCourseId(CK_GT, courseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * course_id: {PK, NotNull, int4(10)}
     * @param courseId The value of courseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseId_LessThan(Integer courseId) {
        regCourseId(CK_LT, courseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * course_id: {PK, NotNull, int4(10)}
     * @param courseId The value of courseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseId_GreaterEqual(Integer courseId) {
        regCourseId(CK_GE, courseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * course_id: {PK, NotNull, int4(10)}
     * @param courseId The value of courseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseId_LessEqual(Integer courseId) {
        regCourseId(CK_LE, courseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * course_id: {PK, NotNull, int4(10)}
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
     * course_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of courseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of courseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCourseId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCourseId(), "course_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * course_id: {PK, NotNull, int4(10)}
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
     * course_id: {PK, NotNull, int4(10)}
     * @param courseIdList The collection of courseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCourseId_NotInScope(Collection<Integer> courseIdList) {
        doSetCourseId_NotInScope(courseIdList);
    }

    protected void doSetCourseId_NotInScope(Collection<Integer> courseIdList) {
        regINS(CK_NINS, cTL(courseIdList), xgetCValueCourseId(), "course_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select course_id from t_reservation_detail where ...)} <br>
     * t_reservation_detail by course_id, named 'TReservationDetailAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCourseId_ExistsReferrer_TReservationDetailList(cb.query());
        registerExistsReferrer(cb.query(), "course_id", "course_id", pp, "tReservationDetailList");
    }
    public abstract String keepCourseId_ExistsReferrer_TReservationDetailList(TReservationDetailCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select course_id from t_reservation_detail where ...)} <br>
     * t_reservation_detail by course_id, named 'TReservationDetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReservationDetail</span>(detailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     detailCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CourseId_NotExistsReferrer_TReservationDetailList for 'not exists'. (NotNull)
     */
    public void notExistsTReservationDetail(SubQuery<TReservationDetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReservationDetailCB cb = new TReservationDetailCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCourseId_NotExistsReferrer_TReservationDetailList(cb.query());
        registerNotExistsReferrer(cb.query(), "course_id", "course_id", pp, "tReservationDetailList");
    }
    public abstract String keepCourseId_NotExistsReferrer_TReservationDetailList(TReservationDetailCQ sq);

    public void xsderiveTReservationDetailList(String fn, SubQuery<TReservationDetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReservationDetailCB cb = new TReservationDetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCourseId_SpecifyDerivedReferrer_TReservationDetailList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "course_id", "course_id", pp, "tReservationDetailList", al, op);
    }
    public abstract String keepCourseId_SpecifyDerivedReferrer_TReservationDetailList(TReservationDetailCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_reservation_detail where ...)} <br>
     * t_reservation_detail by course_id, named 'TReservationDetailAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepCourseId_QueryDerivedReferrer_TReservationDetailList(cb.query()); String prpp = keepCourseId_QueryDerivedReferrer_TReservationDetailListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "course_id", "course_id", sqpp, "tReservationDetailList", rd, vl, prpp, op);
    }
    public abstract String keepCourseId_QueryDerivedReferrer_TReservationDetailList(TReservationDetailCQ sq);
    public abstract String keepCourseId_QueryDerivedReferrer_TReservationDetailListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * course_id: {PK, NotNull, int4(10)}
     */
    public void setCourseId_IsNull() { regCourseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * course_id: {PK, NotNull, int4(10)}
     */
    public void setCourseId_IsNotNull() { regCourseId(CK_ISNN, DOBJ); }

    protected void regCourseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCourseId(), "course_id"); }
    protected abstract ConditionValue xgetCValueCourseId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * course_group_id: {int4(10), FK to m_course_group}
     * @param courseGroupId The value of courseGroupId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseGroupId_Equal(Integer courseGroupId) {
        doSetCourseGroupId_Equal(courseGroupId);
    }

    protected void doSetCourseGroupId_Equal(Integer courseGroupId) {
        regCourseGroupId(CK_EQ, courseGroupId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * course_group_id: {int4(10), FK to m_course_group}
     * @param courseGroupId The value of courseGroupId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseGroupId_NotEqual(Integer courseGroupId) {
        doSetCourseGroupId_NotEqual(courseGroupId);
    }

    protected void doSetCourseGroupId_NotEqual(Integer courseGroupId) {
        regCourseGroupId(CK_NES, courseGroupId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * course_group_id: {int4(10), FK to m_course_group}
     * @param courseGroupId The value of courseGroupId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseGroupId_GreaterThan(Integer courseGroupId) {
        regCourseGroupId(CK_GT, courseGroupId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * course_group_id: {int4(10), FK to m_course_group}
     * @param courseGroupId The value of courseGroupId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseGroupId_LessThan(Integer courseGroupId) {
        regCourseGroupId(CK_LT, courseGroupId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * course_group_id: {int4(10), FK to m_course_group}
     * @param courseGroupId The value of courseGroupId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseGroupId_GreaterEqual(Integer courseGroupId) {
        regCourseGroupId(CK_GE, courseGroupId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * course_group_id: {int4(10), FK to m_course_group}
     * @param courseGroupId The value of courseGroupId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseGroupId_LessEqual(Integer courseGroupId) {
        regCourseGroupId(CK_LE, courseGroupId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * course_group_id: {int4(10), FK to m_course_group}
     * @param minNumber The min number of courseGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of courseGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCourseGroupId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCourseGroupId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * course_group_id: {int4(10), FK to m_course_group}
     * @param minNumber The min number of courseGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of courseGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCourseGroupId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCourseGroupId(), "course_group_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * course_group_id: {int4(10), FK to m_course_group}
     * @param courseGroupIdList The collection of courseGroupId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCourseGroupId_InScope(Collection<Integer> courseGroupIdList) {
        doSetCourseGroupId_InScope(courseGroupIdList);
    }

    protected void doSetCourseGroupId_InScope(Collection<Integer> courseGroupIdList) {
        regINS(CK_INS, cTL(courseGroupIdList), xgetCValueCourseGroupId(), "course_group_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * course_group_id: {int4(10), FK to m_course_group}
     * @param courseGroupIdList The collection of courseGroupId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCourseGroupId_NotInScope(Collection<Integer> courseGroupIdList) {
        doSetCourseGroupId_NotInScope(courseGroupIdList);
    }

    protected void doSetCourseGroupId_NotInScope(Collection<Integer> courseGroupIdList) {
        regINS(CK_NINS, cTL(courseGroupIdList), xgetCValueCourseGroupId(), "course_group_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * course_group_id: {int4(10), FK to m_course_group}
     */
    public void setCourseGroupId_IsNull() { regCourseGroupId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * course_group_id: {int4(10), FK to m_course_group}
     */
    public void setCourseGroupId_IsNotNull() { regCourseGroupId(CK_ISNN, DOBJ); }

    protected void regCourseGroupId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCourseGroupId(), "course_group_id"); }
    protected abstract ConditionValue xgetCValueCourseGroupId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * course_name: {text(2147483647)}
     * @param courseName The value of courseName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCourseName_Equal(String courseName) {
        doSetCourseName_Equal(fRES(courseName));
    }

    protected void doSetCourseName_Equal(String courseName) {
        regCourseName(CK_EQ, courseName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * course_name: {text(2147483647)}
     * @param courseName The value of courseName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCourseName_NotEqual(String courseName) {
        doSetCourseName_NotEqual(fRES(courseName));
    }

    protected void doSetCourseName_NotEqual(String courseName) {
        regCourseName(CK_NES, courseName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * course_name: {text(2147483647)}
     * @param courseName The value of courseName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCourseName_GreaterThan(String courseName) {
        regCourseName(CK_GT, fRES(courseName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * course_name: {text(2147483647)}
     * @param courseName The value of courseName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCourseName_LessThan(String courseName) {
        regCourseName(CK_LT, fRES(courseName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * course_name: {text(2147483647)}
     * @param courseName The value of courseName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCourseName_GreaterEqual(String courseName) {
        regCourseName(CK_GE, fRES(courseName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * course_name: {text(2147483647)}
     * @param courseName The value of courseName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCourseName_LessEqual(String courseName) {
        regCourseName(CK_LE, fRES(courseName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * course_name: {text(2147483647)}
     * @param courseNameList The collection of courseName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCourseName_InScope(Collection<String> courseNameList) {
        doSetCourseName_InScope(courseNameList);
    }

    protected void doSetCourseName_InScope(Collection<String> courseNameList) {
        regINS(CK_INS, cTL(courseNameList), xgetCValueCourseName(), "course_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * course_name: {text(2147483647)}
     * @param courseNameList The collection of courseName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCourseName_NotInScope(Collection<String> courseNameList) {
        doSetCourseName_NotInScope(courseNameList);
    }

    protected void doSetCourseName_NotInScope(Collection<String> courseNameList) {
        regINS(CK_NINS, cTL(courseNameList), xgetCValueCourseName(), "course_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * course_name: {text(2147483647)} <br>
     * <pre>e.g. setCourseName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param courseName The value of courseName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCourseName_LikeSearch(String courseName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCourseName_LikeSearch(courseName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * course_name: {text(2147483647)} <br>
     * <pre>e.g. setCourseName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param courseName The value of courseName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCourseName_LikeSearch(String courseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(courseName), xgetCValueCourseName(), "course_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * course_name: {text(2147483647)}
     * @param courseName The value of courseName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCourseName_NotLikeSearch(String courseName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCourseName_NotLikeSearch(courseName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * course_name: {text(2147483647)}
     * @param courseName The value of courseName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCourseName_NotLikeSearch(String courseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(courseName), xgetCValueCourseName(), "course_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * course_name: {text(2147483647)}
     */
    public void setCourseName_IsNull() { regCourseName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * course_name: {text(2147483647)}
     */
    public void setCourseName_IsNullOrEmpty() { regCourseName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * course_name: {text(2147483647)}
     */
    public void setCourseName_IsNotNull() { regCourseName(CK_ISNN, DOBJ); }

    protected void regCourseName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCourseName(), "course_name"); }
    protected abstract ConditionValue xgetCValueCourseName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * charge: {int4(10)}
     * @param charge The value of charge as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCharge_Equal(Integer charge) {
        doSetCharge_Equal(charge);
    }

    protected void doSetCharge_Equal(Integer charge) {
        regCharge(CK_EQ, charge);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * charge: {int4(10)}
     * @param charge The value of charge as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCharge_NotEqual(Integer charge) {
        doSetCharge_NotEqual(charge);
    }

    protected void doSetCharge_NotEqual(Integer charge) {
        regCharge(CK_NES, charge);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * charge: {int4(10)}
     * @param charge The value of charge as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCharge_GreaterThan(Integer charge) {
        regCharge(CK_GT, charge);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * charge: {int4(10)}
     * @param charge The value of charge as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCharge_LessThan(Integer charge) {
        regCharge(CK_LT, charge);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * charge: {int4(10)}
     * @param charge The value of charge as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCharge_GreaterEqual(Integer charge) {
        regCharge(CK_GE, charge);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * charge: {int4(10)}
     * @param charge The value of charge as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCharge_LessEqual(Integer charge) {
        regCharge(CK_LE, charge);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * charge: {int4(10)}
     * @param minNumber The min number of charge. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of charge. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCharge_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCharge_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * charge: {int4(10)}
     * @param minNumber The min number of charge. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of charge. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCharge_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCharge(), "charge", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * charge: {int4(10)}
     * @param chargeList The collection of charge as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharge_InScope(Collection<Integer> chargeList) {
        doSetCharge_InScope(chargeList);
    }

    protected void doSetCharge_InScope(Collection<Integer> chargeList) {
        regINS(CK_INS, cTL(chargeList), xgetCValueCharge(), "charge");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * charge: {int4(10)}
     * @param chargeList The collection of charge as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharge_NotInScope(Collection<Integer> chargeList) {
        doSetCharge_NotInScope(chargeList);
    }

    protected void doSetCharge_NotInScope(Collection<Integer> chargeList) {
        regINS(CK_NINS, cTL(chargeList), xgetCValueCharge(), "charge");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * charge: {int4(10)}
     */
    public void setCharge_IsNull() { regCharge(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * charge: {int4(10)}
     */
    public void setCharge_IsNotNull() { regCharge(CK_ISNN, DOBJ); }

    protected void regCharge(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCharge(), "charge"); }
    protected abstract ConditionValue xgetCValueCharge();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * required_time: {interval(49, 6)}
     * @param requiredTime The value of requiredTime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRequiredTime_Equal(String requiredTime) {
        doSetRequiredTime_Equal(fRES(requiredTime));
    }

    protected void doSetRequiredTime_Equal(String requiredTime) {
        regRequiredTime(CK_EQ, requiredTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * required_time: {interval(49, 6)}
     * @param requiredTime The value of requiredTime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRequiredTime_NotEqual(String requiredTime) {
        doSetRequiredTime_NotEqual(fRES(requiredTime));
    }

    protected void doSetRequiredTime_NotEqual(String requiredTime) {
        regRequiredTime(CK_NES, requiredTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * required_time: {interval(49, 6)}
     * @param requiredTime The value of requiredTime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRequiredTime_GreaterThan(String requiredTime) {
        regRequiredTime(CK_GT, fRES(requiredTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * required_time: {interval(49, 6)}
     * @param requiredTime The value of requiredTime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRequiredTime_LessThan(String requiredTime) {
        regRequiredTime(CK_LT, fRES(requiredTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * required_time: {interval(49, 6)}
     * @param requiredTime The value of requiredTime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRequiredTime_GreaterEqual(String requiredTime) {
        regRequiredTime(CK_GE, fRES(requiredTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * required_time: {interval(49, 6)}
     * @param requiredTime The value of requiredTime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRequiredTime_LessEqual(String requiredTime) {
        regRequiredTime(CK_LE, fRES(requiredTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * required_time: {interval(49, 6)}
     * @param requiredTimeList The collection of requiredTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRequiredTime_InScope(Collection<String> requiredTimeList) {
        doSetRequiredTime_InScope(requiredTimeList);
    }

    protected void doSetRequiredTime_InScope(Collection<String> requiredTimeList) {
        regINS(CK_INS, cTL(requiredTimeList), xgetCValueRequiredTime(), "required_time");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * required_time: {interval(49, 6)}
     * @param requiredTimeList The collection of requiredTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRequiredTime_NotInScope(Collection<String> requiredTimeList) {
        doSetRequiredTime_NotInScope(requiredTimeList);
    }

    protected void doSetRequiredTime_NotInScope(Collection<String> requiredTimeList) {
        regINS(CK_NINS, cTL(requiredTimeList), xgetCValueRequiredTime(), "required_time");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * required_time: {interval(49, 6)} <br>
     * <pre>e.g. setRequiredTime_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param requiredTime The value of requiredTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRequiredTime_LikeSearch(String requiredTime, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRequiredTime_LikeSearch(requiredTime, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * required_time: {interval(49, 6)} <br>
     * <pre>e.g. setRequiredTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param requiredTime The value of requiredTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRequiredTime_LikeSearch(String requiredTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(requiredTime), xgetCValueRequiredTime(), "required_time", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * required_time: {interval(49, 6)}
     * @param requiredTime The value of requiredTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRequiredTime_NotLikeSearch(String requiredTime, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRequiredTime_NotLikeSearch(requiredTime, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * required_time: {interval(49, 6)}
     * @param requiredTime The value of requiredTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRequiredTime_NotLikeSearch(String requiredTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(requiredTime), xgetCValueRequiredTime(), "required_time", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * required_time: {interval(49, 6)}
     */
    public void setRequiredTime_IsNull() { regRequiredTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * required_time: {interval(49, 6)}
     */
    public void setRequiredTime_IsNullOrEmpty() { regRequiredTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * required_time: {interval(49, 6)}
     */
    public void setRequiredTime_IsNotNull() { regRequiredTime(CK_ISNN, DOBJ); }

    protected void regRequiredTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRequiredTime(), "required_time"); }
    protected abstract ConditionValue xgetCValueRequiredTime();

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
    public HpSLCFunction<MCourseCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCourseCB.class);
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
    public HpSLCFunction<MCourseCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCourseCB.class);
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
    public HpSLCFunction<MCourseCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCourseCB.class);
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
    public HpSLCFunction<MCourseCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCourseCB.class);
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
    public HpSLCFunction<MCourseCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCourseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCourseCB&gt;() {
     *     public void query(MCourseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCourseCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCourseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCourseCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCourseCQ sq);

    protected MCourseCB xcreateScalarConditionCB() {
        MCourseCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCourseCB xcreateScalarConditionPartitionByCB() {
        MCourseCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCourseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCourseCB cb = new MCourseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "course_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCourseCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCourseCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCourseCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCourseCB cb = new MCourseCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "course_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCourseCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCourseCB cb = new MCourseCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCourseCQ sq);

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
    protected MCourseCB newMyCB() {
        return new MCourseCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCourseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

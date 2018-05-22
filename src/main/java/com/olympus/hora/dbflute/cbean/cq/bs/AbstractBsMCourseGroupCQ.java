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
 * The abstract condition-query of m_course_group.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCourseGroupCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCourseGroupCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_course_group";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * course_group_id: {PK, ID, NotNull, serial(10)}
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
     * course_group_id: {PK, ID, NotNull, serial(10)}
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
     * course_group_id: {PK, ID, NotNull, serial(10)}
     * @param courseGroupId The value of courseGroupId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseGroupId_GreaterThan(Integer courseGroupId) {
        regCourseGroupId(CK_GT, courseGroupId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * course_group_id: {PK, ID, NotNull, serial(10)}
     * @param courseGroupId The value of courseGroupId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseGroupId_LessThan(Integer courseGroupId) {
        regCourseGroupId(CK_LT, courseGroupId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * course_group_id: {PK, ID, NotNull, serial(10)}
     * @param courseGroupId The value of courseGroupId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseGroupId_GreaterEqual(Integer courseGroupId) {
        regCourseGroupId(CK_GE, courseGroupId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * course_group_id: {PK, ID, NotNull, serial(10)}
     * @param courseGroupId The value of courseGroupId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourseGroupId_LessEqual(Integer courseGroupId) {
        regCourseGroupId(CK_LE, courseGroupId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * course_group_id: {PK, ID, NotNull, serial(10)}
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
     * course_group_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of courseGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of courseGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCourseGroupId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCourseGroupId(), "course_group_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * course_group_id: {PK, ID, NotNull, serial(10)}
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
     * course_group_id: {PK, ID, NotNull, serial(10)}
     * @param courseGroupIdList The collection of courseGroupId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCourseGroupId_NotInScope(Collection<Integer> courseGroupIdList) {
        doSetCourseGroupId_NotInScope(courseGroupIdList);
    }

    protected void doSetCourseGroupId_NotInScope(Collection<Integer> courseGroupIdList) {
        regINS(CK_NINS, cTL(courseGroupIdList), xgetCValueCourseGroupId(), "course_group_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select course_group_id from m_course where ...)} <br>
     * m_course by course_group_id, named 'MCourseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCourse</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCourseList for 'exists'. (NotNull)
     */
    public void existsMCourse(SubQuery<MCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCourseCB cb = new MCourseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCourseGroupId_ExistsReferrer_MCourseList(cb.query());
        registerExistsReferrer(cb.query(), "course_group_id", "course_group_id", pp, "mCourseList");
    }
    public abstract String keepCourseGroupId_ExistsReferrer_MCourseList(MCourseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select course_group_id from m_course where ...)} <br>
     * m_course by course_group_id, named 'MCourseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCourse</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CourseGroupId_NotExistsReferrer_MCourseList for 'not exists'. (NotNull)
     */
    public void notExistsMCourse(SubQuery<MCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCourseCB cb = new MCourseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCourseGroupId_NotExistsReferrer_MCourseList(cb.query());
        registerNotExistsReferrer(cb.query(), "course_group_id", "course_group_id", pp, "mCourseList");
    }
    public abstract String keepCourseGroupId_NotExistsReferrer_MCourseList(MCourseCQ sq);

    public void xsderiveMCourseList(String fn, SubQuery<MCourseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCourseCB cb = new MCourseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCourseGroupId_SpecifyDerivedReferrer_MCourseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "course_group_id", "course_group_id", pp, "mCourseList", al, op);
    }
    public abstract String keepCourseGroupId_SpecifyDerivedReferrer_MCourseList(MCourseCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_course where ...)} <br>
     * m_course by course_group_id, named 'MCourseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCourse()</span>.<span style="color: #CC4747">max</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courseCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     courseCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCourseCB> derivedMCourse() {
        return xcreateQDRFunctionMCourseList();
    }
    protected HpQDRFunction<MCourseCB> xcreateQDRFunctionMCourseList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCourseList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCourseList(String fn, SubQuery<MCourseCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCourseCB cb = new MCourseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCourseGroupId_QueryDerivedReferrer_MCourseList(cb.query()); String prpp = keepCourseGroupId_QueryDerivedReferrer_MCourseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "course_group_id", "course_group_id", sqpp, "mCourseList", rd, vl, prpp, op);
    }
    public abstract String keepCourseGroupId_QueryDerivedReferrer_MCourseList(MCourseCQ sq);
    public abstract String keepCourseGroupId_QueryDerivedReferrer_MCourseListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * course_group_id: {PK, ID, NotNull, serial(10)}
     */
    public void setCourseGroupId_IsNull() { regCourseGroupId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * course_group_id: {PK, ID, NotNull, serial(10)}
     */
    public void setCourseGroupId_IsNotNull() { regCourseGroupId(CK_ISNN, DOBJ); }

    protected void regCourseGroupId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCourseGroupId(), "course_group_id"); }
    protected abstract ConditionValue xgetCValueCourseGroupId();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * group_name: {text(2147483647)}
     * @param groupName The value of groupName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGroupName_Equal(String groupName) {
        doSetGroupName_Equal(fRES(groupName));
    }

    protected void doSetGroupName_Equal(String groupName) {
        regGroupName(CK_EQ, groupName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * group_name: {text(2147483647)}
     * @param groupName The value of groupName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGroupName_NotEqual(String groupName) {
        doSetGroupName_NotEqual(fRES(groupName));
    }

    protected void doSetGroupName_NotEqual(String groupName) {
        regGroupName(CK_NES, groupName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * group_name: {text(2147483647)}
     * @param groupName The value of groupName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGroupName_GreaterThan(String groupName) {
        regGroupName(CK_GT, fRES(groupName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * group_name: {text(2147483647)}
     * @param groupName The value of groupName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGroupName_LessThan(String groupName) {
        regGroupName(CK_LT, fRES(groupName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * group_name: {text(2147483647)}
     * @param groupName The value of groupName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGroupName_GreaterEqual(String groupName) {
        regGroupName(CK_GE, fRES(groupName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * group_name: {text(2147483647)}
     * @param groupName The value of groupName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGroupName_LessEqual(String groupName) {
        regGroupName(CK_LE, fRES(groupName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * group_name: {text(2147483647)}
     * @param groupNameList The collection of groupName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGroupName_InScope(Collection<String> groupNameList) {
        doSetGroupName_InScope(groupNameList);
    }

    protected void doSetGroupName_InScope(Collection<String> groupNameList) {
        regINS(CK_INS, cTL(groupNameList), xgetCValueGroupName(), "group_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * group_name: {text(2147483647)}
     * @param groupNameList The collection of groupName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGroupName_NotInScope(Collection<String> groupNameList) {
        doSetGroupName_NotInScope(groupNameList);
    }

    protected void doSetGroupName_NotInScope(Collection<String> groupNameList) {
        regINS(CK_NINS, cTL(groupNameList), xgetCValueGroupName(), "group_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * group_name: {text(2147483647)} <br>
     * <pre>e.g. setGroupName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param groupName The value of groupName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGroupName_LikeSearch(String groupName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGroupName_LikeSearch(groupName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * group_name: {text(2147483647)} <br>
     * <pre>e.g. setGroupName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param groupName The value of groupName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setGroupName_LikeSearch(String groupName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(groupName), xgetCValueGroupName(), "group_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * group_name: {text(2147483647)}
     * @param groupName The value of groupName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGroupName_NotLikeSearch(String groupName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGroupName_NotLikeSearch(groupName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * group_name: {text(2147483647)}
     * @param groupName The value of groupName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setGroupName_NotLikeSearch(String groupName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(groupName), xgetCValueGroupName(), "group_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * group_name: {text(2147483647)}
     */
    public void setGroupName_IsNull() { regGroupName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * group_name: {text(2147483647)}
     */
    public void setGroupName_IsNullOrEmpty() { regGroupName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * group_name: {text(2147483647)}
     */
    public void setGroupName_IsNotNull() { regGroupName(CK_ISNN, DOBJ); }

    protected void regGroupName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGroupName(), "group_name"); }
    protected abstract ConditionValue xgetCValueGroupName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * required_flg: {int2(5)}
     * @param requiredFlg The value of requiredFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRequiredFlg_Equal(Integer requiredFlg) {
        doSetRequiredFlg_Equal(requiredFlg);
    }

    protected void doSetRequiredFlg_Equal(Integer requiredFlg) {
        regRequiredFlg(CK_EQ, requiredFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * required_flg: {int2(5)}
     * @param requiredFlg The value of requiredFlg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRequiredFlg_NotEqual(Integer requiredFlg) {
        doSetRequiredFlg_NotEqual(requiredFlg);
    }

    protected void doSetRequiredFlg_NotEqual(Integer requiredFlg) {
        regRequiredFlg(CK_NES, requiredFlg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * required_flg: {int2(5)}
     * @param requiredFlg The value of requiredFlg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRequiredFlg_GreaterThan(Integer requiredFlg) {
        regRequiredFlg(CK_GT, requiredFlg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * required_flg: {int2(5)}
     * @param requiredFlg The value of requiredFlg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRequiredFlg_LessThan(Integer requiredFlg) {
        regRequiredFlg(CK_LT, requiredFlg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * required_flg: {int2(5)}
     * @param requiredFlg The value of requiredFlg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRequiredFlg_GreaterEqual(Integer requiredFlg) {
        regRequiredFlg(CK_GE, requiredFlg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * required_flg: {int2(5)}
     * @param requiredFlg The value of requiredFlg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRequiredFlg_LessEqual(Integer requiredFlg) {
        regRequiredFlg(CK_LE, requiredFlg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * required_flg: {int2(5)}
     * @param minNumber The min number of requiredFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of requiredFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRequiredFlg_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRequiredFlg_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * required_flg: {int2(5)}
     * @param minNumber The min number of requiredFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of requiredFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRequiredFlg_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRequiredFlg(), "required_flg", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * required_flg: {int2(5)}
     * @param requiredFlgList The collection of requiredFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRequiredFlg_InScope(Collection<Integer> requiredFlgList) {
        doSetRequiredFlg_InScope(requiredFlgList);
    }

    protected void doSetRequiredFlg_InScope(Collection<Integer> requiredFlgList) {
        regINS(CK_INS, cTL(requiredFlgList), xgetCValueRequiredFlg(), "required_flg");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * required_flg: {int2(5)}
     * @param requiredFlgList The collection of requiredFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRequiredFlg_NotInScope(Collection<Integer> requiredFlgList) {
        doSetRequiredFlg_NotInScope(requiredFlgList);
    }

    protected void doSetRequiredFlg_NotInScope(Collection<Integer> requiredFlgList) {
        regINS(CK_NINS, cTL(requiredFlgList), xgetCValueRequiredFlg(), "required_flg");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * required_flg: {int2(5)}
     */
    public void setRequiredFlg_IsNull() { regRequiredFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * required_flg: {int2(5)}
     */
    public void setRequiredFlg_IsNotNull() { regRequiredFlg(CK_ISNN, DOBJ); }

    protected void regRequiredFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRequiredFlg(), "required_flg"); }
    protected abstract ConditionValue xgetCValueRequiredFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * reamarks: {text(2147483647)}
     * @param reamarks The value of reamarks as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReamarks_Equal(String reamarks) {
        doSetReamarks_Equal(fRES(reamarks));
    }

    protected void doSetReamarks_Equal(String reamarks) {
        regReamarks(CK_EQ, reamarks);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * reamarks: {text(2147483647)}
     * @param reamarks The value of reamarks as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReamarks_NotEqual(String reamarks) {
        doSetReamarks_NotEqual(fRES(reamarks));
    }

    protected void doSetReamarks_NotEqual(String reamarks) {
        regReamarks(CK_NES, reamarks);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * reamarks: {text(2147483647)}
     * @param reamarks The value of reamarks as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReamarks_GreaterThan(String reamarks) {
        regReamarks(CK_GT, fRES(reamarks));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * reamarks: {text(2147483647)}
     * @param reamarks The value of reamarks as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReamarks_LessThan(String reamarks) {
        regReamarks(CK_LT, fRES(reamarks));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * reamarks: {text(2147483647)}
     * @param reamarks The value of reamarks as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReamarks_GreaterEqual(String reamarks) {
        regReamarks(CK_GE, fRES(reamarks));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * reamarks: {text(2147483647)}
     * @param reamarks The value of reamarks as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReamarks_LessEqual(String reamarks) {
        regReamarks(CK_LE, fRES(reamarks));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * reamarks: {text(2147483647)}
     * @param reamarksList The collection of reamarks as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReamarks_InScope(Collection<String> reamarksList) {
        doSetReamarks_InScope(reamarksList);
    }

    protected void doSetReamarks_InScope(Collection<String> reamarksList) {
        regINS(CK_INS, cTL(reamarksList), xgetCValueReamarks(), "reamarks");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * reamarks: {text(2147483647)}
     * @param reamarksList The collection of reamarks as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReamarks_NotInScope(Collection<String> reamarksList) {
        doSetReamarks_NotInScope(reamarksList);
    }

    protected void doSetReamarks_NotInScope(Collection<String> reamarksList) {
        regINS(CK_NINS, cTL(reamarksList), xgetCValueReamarks(), "reamarks");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * reamarks: {text(2147483647)} <br>
     * <pre>e.g. setReamarks_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param reamarks The value of reamarks as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setReamarks_LikeSearch(String reamarks, ConditionOptionCall<LikeSearchOption> opLambda) {
        setReamarks_LikeSearch(reamarks, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * reamarks: {text(2147483647)} <br>
     * <pre>e.g. setReamarks_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reamarks The value of reamarks as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setReamarks_LikeSearch(String reamarks, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reamarks), xgetCValueReamarks(), "reamarks", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * reamarks: {text(2147483647)}
     * @param reamarks The value of reamarks as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setReamarks_NotLikeSearch(String reamarks, ConditionOptionCall<LikeSearchOption> opLambda) {
        setReamarks_NotLikeSearch(reamarks, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * reamarks: {text(2147483647)}
     * @param reamarks The value of reamarks as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setReamarks_NotLikeSearch(String reamarks, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reamarks), xgetCValueReamarks(), "reamarks", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * reamarks: {text(2147483647)}
     */
    public void setReamarks_IsNull() { regReamarks(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * reamarks: {text(2147483647)}
     */
    public void setReamarks_IsNullOrEmpty() { regReamarks(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * reamarks: {text(2147483647)}
     */
    public void setReamarks_IsNotNull() { regReamarks(CK_ISNN, DOBJ); }

    protected void regReamarks(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReamarks(), "reamarks"); }
    protected abstract ConditionValue xgetCValueReamarks();

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
    public HpSLCFunction<MCourseGroupCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCourseGroupCB.class);
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
    public HpSLCFunction<MCourseGroupCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCourseGroupCB.class);
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
    public HpSLCFunction<MCourseGroupCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCourseGroupCB.class);
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
    public HpSLCFunction<MCourseGroupCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCourseGroupCB.class);
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
    public HpSLCFunction<MCourseGroupCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCourseGroupCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCourseGroupCB&gt;() {
     *     public void query(MCourseGroupCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCourseGroupCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCourseGroupCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCourseGroupCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCourseGroupCQ sq);

    protected MCourseGroupCB xcreateScalarConditionCB() {
        MCourseGroupCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCourseGroupCB xcreateScalarConditionPartitionByCB() {
        MCourseGroupCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCourseGroupCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCourseGroupCB cb = new MCourseGroupCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "course_group_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCourseGroupCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCourseGroupCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCourseGroupCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCourseGroupCB cb = new MCourseGroupCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "course_group_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCourseGroupCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCourseGroupCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCourseGroupCB cb = new MCourseGroupCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCourseGroupCQ sq);

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
    protected MCourseGroupCB newMyCB() {
        return new MCourseGroupCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCourseGroupCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

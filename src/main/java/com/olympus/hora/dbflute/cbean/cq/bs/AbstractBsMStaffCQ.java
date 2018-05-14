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
 * The abstract condition-query of m_staff.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMStaffCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMStaffCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_staff";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {PK, ID, NotNull, serial(10)}
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
     * staff_id: {PK, ID, NotNull, serial(10)}
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
     * staff_id: {PK, ID, NotNull, serial(10)}
     * @param staffId The value of staffId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStaffId_GreaterThan(Integer staffId) {
        regStaffId(CK_GT, staffId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {PK, ID, NotNull, serial(10)}
     * @param staffId The value of staffId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStaffId_LessThan(Integer staffId) {
        regStaffId(CK_LT, staffId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {PK, ID, NotNull, serial(10)}
     * @param staffId The value of staffId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStaffId_GreaterEqual(Integer staffId) {
        regStaffId(CK_GE, staffId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {PK, ID, NotNull, serial(10)}
     * @param staffId The value of staffId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStaffId_LessEqual(Integer staffId) {
        regStaffId(CK_LE, staffId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * staff_id: {PK, ID, NotNull, serial(10)}
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
     * staff_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of staffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of staffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setStaffId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStaffId(), "staff_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * staff_id: {PK, ID, NotNull, serial(10)}
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
     * staff_id: {PK, ID, NotNull, serial(10)}
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
     * staff_id: {PK, ID, NotNull, serial(10)}
     */
    public void setStaffId_IsNull() { regStaffId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * staff_id: {PK, ID, NotNull, serial(10)}
     */
    public void setStaffId_IsNotNull() { regStaffId(CK_ISNN, DOBJ); }

    protected void regStaffId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStaffId(), "staff_id"); }
    protected abstract ConditionValue xgetCValueStaffId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * family_name: {text(2147483647)}
     * @param familyName The value of familyName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFamilyName_Equal(String familyName) {
        doSetFamilyName_Equal(fRES(familyName));
    }

    protected void doSetFamilyName_Equal(String familyName) {
        regFamilyName(CK_EQ, familyName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * family_name: {text(2147483647)}
     * @param familyName The value of familyName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFamilyName_NotEqual(String familyName) {
        doSetFamilyName_NotEqual(fRES(familyName));
    }

    protected void doSetFamilyName_NotEqual(String familyName) {
        regFamilyName(CK_NES, familyName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * family_name: {text(2147483647)}
     * @param familyName The value of familyName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFamilyName_GreaterThan(String familyName) {
        regFamilyName(CK_GT, fRES(familyName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * family_name: {text(2147483647)}
     * @param familyName The value of familyName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFamilyName_LessThan(String familyName) {
        regFamilyName(CK_LT, fRES(familyName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * family_name: {text(2147483647)}
     * @param familyName The value of familyName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFamilyName_GreaterEqual(String familyName) {
        regFamilyName(CK_GE, fRES(familyName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * family_name: {text(2147483647)}
     * @param familyName The value of familyName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFamilyName_LessEqual(String familyName) {
        regFamilyName(CK_LE, fRES(familyName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * family_name: {text(2147483647)}
     * @param familyNameList The collection of familyName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFamilyName_InScope(Collection<String> familyNameList) {
        doSetFamilyName_InScope(familyNameList);
    }

    protected void doSetFamilyName_InScope(Collection<String> familyNameList) {
        regINS(CK_INS, cTL(familyNameList), xgetCValueFamilyName(), "family_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * family_name: {text(2147483647)}
     * @param familyNameList The collection of familyName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFamilyName_NotInScope(Collection<String> familyNameList) {
        doSetFamilyName_NotInScope(familyNameList);
    }

    protected void doSetFamilyName_NotInScope(Collection<String> familyNameList) {
        regINS(CK_NINS, cTL(familyNameList), xgetCValueFamilyName(), "family_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * family_name: {text(2147483647)} <br>
     * <pre>e.g. setFamilyName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param familyName The value of familyName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFamilyName_LikeSearch(String familyName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFamilyName_LikeSearch(familyName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * family_name: {text(2147483647)} <br>
     * <pre>e.g. setFamilyName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param familyName The value of familyName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFamilyName_LikeSearch(String familyName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(familyName), xgetCValueFamilyName(), "family_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * family_name: {text(2147483647)}
     * @param familyName The value of familyName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFamilyName_NotLikeSearch(String familyName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFamilyName_NotLikeSearch(familyName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * family_name: {text(2147483647)}
     * @param familyName The value of familyName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFamilyName_NotLikeSearch(String familyName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(familyName), xgetCValueFamilyName(), "family_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * family_name: {text(2147483647)}
     */
    public void setFamilyName_IsNull() { regFamilyName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * family_name: {text(2147483647)}
     */
    public void setFamilyName_IsNullOrEmpty() { regFamilyName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * family_name: {text(2147483647)}
     */
    public void setFamilyName_IsNotNull() { regFamilyName(CK_ISNN, DOBJ); }

    protected void regFamilyName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFamilyName(), "family_name"); }
    protected abstract ConditionValue xgetCValueFamilyName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * given_name: {text(2147483647)}
     * @param givenName The value of givenName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGivenName_Equal(String givenName) {
        doSetGivenName_Equal(fRES(givenName));
    }

    protected void doSetGivenName_Equal(String givenName) {
        regGivenName(CK_EQ, givenName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * given_name: {text(2147483647)}
     * @param givenName The value of givenName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGivenName_NotEqual(String givenName) {
        doSetGivenName_NotEqual(fRES(givenName));
    }

    protected void doSetGivenName_NotEqual(String givenName) {
        regGivenName(CK_NES, givenName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * given_name: {text(2147483647)}
     * @param givenName The value of givenName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGivenName_GreaterThan(String givenName) {
        regGivenName(CK_GT, fRES(givenName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * given_name: {text(2147483647)}
     * @param givenName The value of givenName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGivenName_LessThan(String givenName) {
        regGivenName(CK_LT, fRES(givenName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * given_name: {text(2147483647)}
     * @param givenName The value of givenName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGivenName_GreaterEqual(String givenName) {
        regGivenName(CK_GE, fRES(givenName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * given_name: {text(2147483647)}
     * @param givenName The value of givenName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGivenName_LessEqual(String givenName) {
        regGivenName(CK_LE, fRES(givenName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * given_name: {text(2147483647)}
     * @param givenNameList The collection of givenName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGivenName_InScope(Collection<String> givenNameList) {
        doSetGivenName_InScope(givenNameList);
    }

    protected void doSetGivenName_InScope(Collection<String> givenNameList) {
        regINS(CK_INS, cTL(givenNameList), xgetCValueGivenName(), "given_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * given_name: {text(2147483647)}
     * @param givenNameList The collection of givenName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGivenName_NotInScope(Collection<String> givenNameList) {
        doSetGivenName_NotInScope(givenNameList);
    }

    protected void doSetGivenName_NotInScope(Collection<String> givenNameList) {
        regINS(CK_NINS, cTL(givenNameList), xgetCValueGivenName(), "given_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * given_name: {text(2147483647)} <br>
     * <pre>e.g. setGivenName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param givenName The value of givenName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGivenName_LikeSearch(String givenName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGivenName_LikeSearch(givenName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * given_name: {text(2147483647)} <br>
     * <pre>e.g. setGivenName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param givenName The value of givenName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setGivenName_LikeSearch(String givenName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(givenName), xgetCValueGivenName(), "given_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * given_name: {text(2147483647)}
     * @param givenName The value of givenName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGivenName_NotLikeSearch(String givenName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGivenName_NotLikeSearch(givenName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * given_name: {text(2147483647)}
     * @param givenName The value of givenName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setGivenName_NotLikeSearch(String givenName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(givenName), xgetCValueGivenName(), "given_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * given_name: {text(2147483647)}
     */
    public void setGivenName_IsNull() { regGivenName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * given_name: {text(2147483647)}
     */
    public void setGivenName_IsNullOrEmpty() { regGivenName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * given_name: {text(2147483647)}
     */
    public void setGivenName_IsNotNull() { regGivenName(CK_ISNN, DOBJ); }

    protected void regGivenName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGivenName(), "given_name"); }
    protected abstract ConditionValue xgetCValueGivenName();

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
    public HpSLCFunction<MStaffCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MStaffCB.class);
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
    public HpSLCFunction<MStaffCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MStaffCB.class);
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
    public HpSLCFunction<MStaffCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MStaffCB.class);
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
    public HpSLCFunction<MStaffCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MStaffCB.class);
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
    public HpSLCFunction<MStaffCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MStaffCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MStaffCB&gt;() {
     *     public void query(MStaffCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MStaffCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MStaffCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MStaffCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MStaffCQ sq);

    protected MStaffCB xcreateScalarConditionCB() {
        MStaffCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MStaffCB xcreateScalarConditionPartitionByCB() {
        MStaffCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MStaffCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MStaffCB cb = new MStaffCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "staff_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MStaffCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MStaffCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MStaffCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MStaffCB cb = new MStaffCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "staff_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MStaffCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MStaffCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MStaffCB cb = new MStaffCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MStaffCQ sq);

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
    protected MStaffCB newMyCB() {
        return new MStaffCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MStaffCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

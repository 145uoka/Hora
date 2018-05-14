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
 * The abstract condition-query of m_user.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMUserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_user";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
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
     * user_id: {PK, ID, NotNull, serial(10)}
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
     * user_id: {PK, ID, NotNull, serial(10)}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
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
     * user_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "user_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
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
     * user_id: {PK, ID, NotNull, serial(10)}
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
     * user_id: {PK, ID, NotNull, serial(10)}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "user_id"); }
    protected abstract ConditionValue xgetCValueUserId();

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
     * family_name_kana: {text(2147483647)}
     * @param familyNameKana The value of familyNameKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFamilyNameKana_Equal(String familyNameKana) {
        doSetFamilyNameKana_Equal(fRES(familyNameKana));
    }

    protected void doSetFamilyNameKana_Equal(String familyNameKana) {
        regFamilyNameKana(CK_EQ, familyNameKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * family_name_kana: {text(2147483647)}
     * @param familyNameKana The value of familyNameKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFamilyNameKana_NotEqual(String familyNameKana) {
        doSetFamilyNameKana_NotEqual(fRES(familyNameKana));
    }

    protected void doSetFamilyNameKana_NotEqual(String familyNameKana) {
        regFamilyNameKana(CK_NES, familyNameKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * family_name_kana: {text(2147483647)}
     * @param familyNameKana The value of familyNameKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFamilyNameKana_GreaterThan(String familyNameKana) {
        regFamilyNameKana(CK_GT, fRES(familyNameKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * family_name_kana: {text(2147483647)}
     * @param familyNameKana The value of familyNameKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFamilyNameKana_LessThan(String familyNameKana) {
        regFamilyNameKana(CK_LT, fRES(familyNameKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * family_name_kana: {text(2147483647)}
     * @param familyNameKana The value of familyNameKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFamilyNameKana_GreaterEqual(String familyNameKana) {
        regFamilyNameKana(CK_GE, fRES(familyNameKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * family_name_kana: {text(2147483647)}
     * @param familyNameKana The value of familyNameKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFamilyNameKana_LessEqual(String familyNameKana) {
        regFamilyNameKana(CK_LE, fRES(familyNameKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * family_name_kana: {text(2147483647)}
     * @param familyNameKanaList The collection of familyNameKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFamilyNameKana_InScope(Collection<String> familyNameKanaList) {
        doSetFamilyNameKana_InScope(familyNameKanaList);
    }

    protected void doSetFamilyNameKana_InScope(Collection<String> familyNameKanaList) {
        regINS(CK_INS, cTL(familyNameKanaList), xgetCValueFamilyNameKana(), "family_name_kana");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * family_name_kana: {text(2147483647)}
     * @param familyNameKanaList The collection of familyNameKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFamilyNameKana_NotInScope(Collection<String> familyNameKanaList) {
        doSetFamilyNameKana_NotInScope(familyNameKanaList);
    }

    protected void doSetFamilyNameKana_NotInScope(Collection<String> familyNameKanaList) {
        regINS(CK_NINS, cTL(familyNameKanaList), xgetCValueFamilyNameKana(), "family_name_kana");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * family_name_kana: {text(2147483647)} <br>
     * <pre>e.g. setFamilyNameKana_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param familyNameKana The value of familyNameKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFamilyNameKana_LikeSearch(String familyNameKana, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFamilyNameKana_LikeSearch(familyNameKana, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * family_name_kana: {text(2147483647)} <br>
     * <pre>e.g. setFamilyNameKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param familyNameKana The value of familyNameKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFamilyNameKana_LikeSearch(String familyNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(familyNameKana), xgetCValueFamilyNameKana(), "family_name_kana", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * family_name_kana: {text(2147483647)}
     * @param familyNameKana The value of familyNameKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFamilyNameKana_NotLikeSearch(String familyNameKana, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFamilyNameKana_NotLikeSearch(familyNameKana, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * family_name_kana: {text(2147483647)}
     * @param familyNameKana The value of familyNameKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFamilyNameKana_NotLikeSearch(String familyNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(familyNameKana), xgetCValueFamilyNameKana(), "family_name_kana", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * family_name_kana: {text(2147483647)}
     */
    public void setFamilyNameKana_IsNull() { regFamilyNameKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * family_name_kana: {text(2147483647)}
     */
    public void setFamilyNameKana_IsNullOrEmpty() { regFamilyNameKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * family_name_kana: {text(2147483647)}
     */
    public void setFamilyNameKana_IsNotNull() { regFamilyNameKana(CK_ISNN, DOBJ); }

    protected void regFamilyNameKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFamilyNameKana(), "family_name_kana"); }
    protected abstract ConditionValue xgetCValueFamilyNameKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * given_name_kana: {text(2147483647)}
     * @param givenNameKana The value of givenNameKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGivenNameKana_Equal(String givenNameKana) {
        doSetGivenNameKana_Equal(fRES(givenNameKana));
    }

    protected void doSetGivenNameKana_Equal(String givenNameKana) {
        regGivenNameKana(CK_EQ, givenNameKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * given_name_kana: {text(2147483647)}
     * @param givenNameKana The value of givenNameKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGivenNameKana_NotEqual(String givenNameKana) {
        doSetGivenNameKana_NotEqual(fRES(givenNameKana));
    }

    protected void doSetGivenNameKana_NotEqual(String givenNameKana) {
        regGivenNameKana(CK_NES, givenNameKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * given_name_kana: {text(2147483647)}
     * @param givenNameKana The value of givenNameKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGivenNameKana_GreaterThan(String givenNameKana) {
        regGivenNameKana(CK_GT, fRES(givenNameKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * given_name_kana: {text(2147483647)}
     * @param givenNameKana The value of givenNameKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGivenNameKana_LessThan(String givenNameKana) {
        regGivenNameKana(CK_LT, fRES(givenNameKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * given_name_kana: {text(2147483647)}
     * @param givenNameKana The value of givenNameKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGivenNameKana_GreaterEqual(String givenNameKana) {
        regGivenNameKana(CK_GE, fRES(givenNameKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * given_name_kana: {text(2147483647)}
     * @param givenNameKana The value of givenNameKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGivenNameKana_LessEqual(String givenNameKana) {
        regGivenNameKana(CK_LE, fRES(givenNameKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * given_name_kana: {text(2147483647)}
     * @param givenNameKanaList The collection of givenNameKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGivenNameKana_InScope(Collection<String> givenNameKanaList) {
        doSetGivenNameKana_InScope(givenNameKanaList);
    }

    protected void doSetGivenNameKana_InScope(Collection<String> givenNameKanaList) {
        regINS(CK_INS, cTL(givenNameKanaList), xgetCValueGivenNameKana(), "given_name_kana");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * given_name_kana: {text(2147483647)}
     * @param givenNameKanaList The collection of givenNameKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGivenNameKana_NotInScope(Collection<String> givenNameKanaList) {
        doSetGivenNameKana_NotInScope(givenNameKanaList);
    }

    protected void doSetGivenNameKana_NotInScope(Collection<String> givenNameKanaList) {
        regINS(CK_NINS, cTL(givenNameKanaList), xgetCValueGivenNameKana(), "given_name_kana");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * given_name_kana: {text(2147483647)} <br>
     * <pre>e.g. setGivenNameKana_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param givenNameKana The value of givenNameKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGivenNameKana_LikeSearch(String givenNameKana, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGivenNameKana_LikeSearch(givenNameKana, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * given_name_kana: {text(2147483647)} <br>
     * <pre>e.g. setGivenNameKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param givenNameKana The value of givenNameKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setGivenNameKana_LikeSearch(String givenNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(givenNameKana), xgetCValueGivenNameKana(), "given_name_kana", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * given_name_kana: {text(2147483647)}
     * @param givenNameKana The value of givenNameKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGivenNameKana_NotLikeSearch(String givenNameKana, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGivenNameKana_NotLikeSearch(givenNameKana, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * given_name_kana: {text(2147483647)}
     * @param givenNameKana The value of givenNameKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setGivenNameKana_NotLikeSearch(String givenNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(givenNameKana), xgetCValueGivenNameKana(), "given_name_kana", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * given_name_kana: {text(2147483647)}
     */
    public void setGivenNameKana_IsNull() { regGivenNameKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * given_name_kana: {text(2147483647)}
     */
    public void setGivenNameKana_IsNullOrEmpty() { regGivenNameKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * given_name_kana: {text(2147483647)}
     */
    public void setGivenNameKana_IsNotNull() { regGivenNameKana(CK_ISNN, DOBJ); }

    protected void regGivenNameKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGivenNameKana(), "given_name_kana"); }
    protected abstract ConditionValue xgetCValueGivenNameKana();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * sex: {int4(10)}
     * @param sex The value of sex as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSex_Equal(Integer sex) {
        doSetSex_Equal(sex);
    }

    protected void doSetSex_Equal(Integer sex) {
        regSex(CK_EQ, sex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * sex: {int4(10)}
     * @param sex The value of sex as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSex_NotEqual(Integer sex) {
        doSetSex_NotEqual(sex);
    }

    protected void doSetSex_NotEqual(Integer sex) {
        regSex(CK_NES, sex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * sex: {int4(10)}
     * @param sex The value of sex as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSex_GreaterThan(Integer sex) {
        regSex(CK_GT, sex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * sex: {int4(10)}
     * @param sex The value of sex as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSex_LessThan(Integer sex) {
        regSex(CK_LT, sex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * sex: {int4(10)}
     * @param sex The value of sex as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSex_GreaterEqual(Integer sex) {
        regSex(CK_GE, sex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * sex: {int4(10)}
     * @param sex The value of sex as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSex_LessEqual(Integer sex) {
        regSex(CK_LE, sex);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * sex: {int4(10)}
     * @param minNumber The min number of sex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSex_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSex_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * sex: {int4(10)}
     * @param minNumber The min number of sex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSex_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSex(), "sex", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * sex: {int4(10)}
     * @param sexList The collection of sex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSex_InScope(Collection<Integer> sexList) {
        doSetSex_InScope(sexList);
    }

    protected void doSetSex_InScope(Collection<Integer> sexList) {
        regINS(CK_INS, cTL(sexList), xgetCValueSex(), "sex");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * sex: {int4(10)}
     * @param sexList The collection of sex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSex_NotInScope(Collection<Integer> sexList) {
        doSetSex_NotInScope(sexList);
    }

    protected void doSetSex_NotInScope(Collection<Integer> sexList) {
        regINS(CK_NINS, cTL(sexList), xgetCValueSex(), "sex");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * sex: {int4(10)}
     */
    public void setSex_IsNull() { regSex(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * sex: {int4(10)}
     */
    public void setSex_IsNotNull() { regSex(CK_ISNN, DOBJ); }

    protected void regSex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSex(), "sex"); }
    protected abstract ConditionValue xgetCValueSex();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     * @param birthday The value of birthday as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthday_Equal(java.time.LocalDate birthday) {
        regBirthday(CK_EQ,  birthday);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     * @param birthday The value of birthday as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthday_GreaterThan(java.time.LocalDate birthday) {
        regBirthday(CK_GT,  birthday);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     * @param birthday The value of birthday as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthday_LessThan(java.time.LocalDate birthday) {
        regBirthday(CK_LT,  birthday);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     * @param birthday The value of birthday as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthday_GreaterEqual(java.time.LocalDate birthday) {
        regBirthday(CK_GE,  birthday);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     * @param birthday The value of birthday as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthday_LessEqual(java.time.LocalDate birthday) {
        regBirthday(CK_LE, birthday);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     * <pre>e.g. setBirthday_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setBirthday_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setBirthday_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     * <pre>e.g. setBirthday_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setBirthday_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "birthday"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueBirthday(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     */
    public void setBirthday_IsNull() { regBirthday(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     */
    public void setBirthday_IsNotNull() { regBirthday(CK_ISNN, DOBJ); }

    protected void regBirthday(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBirthday(), "birthday"); }
    protected abstract ConditionValue xgetCValueBirthday();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first1: {text(2147483647)}
     * @param phoneFirst1 The value of phoneFirst1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst1_Equal(String phoneFirst1) {
        doSetPhoneFirst1_Equal(fRES(phoneFirst1));
    }

    protected void doSetPhoneFirst1_Equal(String phoneFirst1) {
        regPhoneFirst1(CK_EQ, phoneFirst1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first1: {text(2147483647)}
     * @param phoneFirst1 The value of phoneFirst1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst1_NotEqual(String phoneFirst1) {
        doSetPhoneFirst1_NotEqual(fRES(phoneFirst1));
    }

    protected void doSetPhoneFirst1_NotEqual(String phoneFirst1) {
        regPhoneFirst1(CK_NES, phoneFirst1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first1: {text(2147483647)}
     * @param phoneFirst1 The value of phoneFirst1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst1_GreaterThan(String phoneFirst1) {
        regPhoneFirst1(CK_GT, fRES(phoneFirst1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first1: {text(2147483647)}
     * @param phoneFirst1 The value of phoneFirst1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst1_LessThan(String phoneFirst1) {
        regPhoneFirst1(CK_LT, fRES(phoneFirst1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first1: {text(2147483647)}
     * @param phoneFirst1 The value of phoneFirst1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst1_GreaterEqual(String phoneFirst1) {
        regPhoneFirst1(CK_GE, fRES(phoneFirst1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first1: {text(2147483647)}
     * @param phoneFirst1 The value of phoneFirst1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst1_LessEqual(String phoneFirst1) {
        regPhoneFirst1(CK_LE, fRES(phoneFirst1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone_first1: {text(2147483647)}
     * @param phoneFirst1List The collection of phoneFirst1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst1_InScope(Collection<String> phoneFirst1List) {
        doSetPhoneFirst1_InScope(phoneFirst1List);
    }

    protected void doSetPhoneFirst1_InScope(Collection<String> phoneFirst1List) {
        regINS(CK_INS, cTL(phoneFirst1List), xgetCValuePhoneFirst1(), "phone_first1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone_first1: {text(2147483647)}
     * @param phoneFirst1List The collection of phoneFirst1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst1_NotInScope(Collection<String> phoneFirst1List) {
        doSetPhoneFirst1_NotInScope(phoneFirst1List);
    }

    protected void doSetPhoneFirst1_NotInScope(Collection<String> phoneFirst1List) {
        regINS(CK_NINS, cTL(phoneFirst1List), xgetCValuePhoneFirst1(), "phone_first1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_first1: {text(2147483647)} <br>
     * <pre>e.g. setPhoneFirst1_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param phoneFirst1 The value of phoneFirst1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhoneFirst1_LikeSearch(String phoneFirst1, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhoneFirst1_LikeSearch(phoneFirst1, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_first1: {text(2147483647)} <br>
     * <pre>e.g. setPhoneFirst1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phoneFirst1 The value of phoneFirst1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPhoneFirst1_LikeSearch(String phoneFirst1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phoneFirst1), xgetCValuePhoneFirst1(), "phone_first1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_first1: {text(2147483647)}
     * @param phoneFirst1 The value of phoneFirst1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhoneFirst1_NotLikeSearch(String phoneFirst1, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhoneFirst1_NotLikeSearch(phoneFirst1, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_first1: {text(2147483647)}
     * @param phoneFirst1 The value of phoneFirst1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPhoneFirst1_NotLikeSearch(String phoneFirst1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phoneFirst1), xgetCValuePhoneFirst1(), "phone_first1", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * phone_first1: {text(2147483647)}
     */
    public void setPhoneFirst1_IsNull() { regPhoneFirst1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * phone_first1: {text(2147483647)}
     */
    public void setPhoneFirst1_IsNullOrEmpty() { regPhoneFirst1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * phone_first1: {text(2147483647)}
     */
    public void setPhoneFirst1_IsNotNull() { regPhoneFirst1(CK_ISNN, DOBJ); }

    protected void regPhoneFirst1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhoneFirst1(), "phone_first1"); }
    protected abstract ConditionValue xgetCValuePhoneFirst1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first2: {text(2147483647)}
     * @param phoneFirst2 The value of phoneFirst2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst2_Equal(String phoneFirst2) {
        doSetPhoneFirst2_Equal(fRES(phoneFirst2));
    }

    protected void doSetPhoneFirst2_Equal(String phoneFirst2) {
        regPhoneFirst2(CK_EQ, phoneFirst2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first2: {text(2147483647)}
     * @param phoneFirst2 The value of phoneFirst2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst2_NotEqual(String phoneFirst2) {
        doSetPhoneFirst2_NotEqual(fRES(phoneFirst2));
    }

    protected void doSetPhoneFirst2_NotEqual(String phoneFirst2) {
        regPhoneFirst2(CK_NES, phoneFirst2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first2: {text(2147483647)}
     * @param phoneFirst2 The value of phoneFirst2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst2_GreaterThan(String phoneFirst2) {
        regPhoneFirst2(CK_GT, fRES(phoneFirst2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first2: {text(2147483647)}
     * @param phoneFirst2 The value of phoneFirst2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst2_LessThan(String phoneFirst2) {
        regPhoneFirst2(CK_LT, fRES(phoneFirst2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first2: {text(2147483647)}
     * @param phoneFirst2 The value of phoneFirst2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst2_GreaterEqual(String phoneFirst2) {
        regPhoneFirst2(CK_GE, fRES(phoneFirst2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first2: {text(2147483647)}
     * @param phoneFirst2 The value of phoneFirst2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst2_LessEqual(String phoneFirst2) {
        regPhoneFirst2(CK_LE, fRES(phoneFirst2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone_first2: {text(2147483647)}
     * @param phoneFirst2List The collection of phoneFirst2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst2_InScope(Collection<String> phoneFirst2List) {
        doSetPhoneFirst2_InScope(phoneFirst2List);
    }

    protected void doSetPhoneFirst2_InScope(Collection<String> phoneFirst2List) {
        regINS(CK_INS, cTL(phoneFirst2List), xgetCValuePhoneFirst2(), "phone_first2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone_first2: {text(2147483647)}
     * @param phoneFirst2List The collection of phoneFirst2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst2_NotInScope(Collection<String> phoneFirst2List) {
        doSetPhoneFirst2_NotInScope(phoneFirst2List);
    }

    protected void doSetPhoneFirst2_NotInScope(Collection<String> phoneFirst2List) {
        regINS(CK_NINS, cTL(phoneFirst2List), xgetCValuePhoneFirst2(), "phone_first2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_first2: {text(2147483647)} <br>
     * <pre>e.g. setPhoneFirst2_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param phoneFirst2 The value of phoneFirst2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhoneFirst2_LikeSearch(String phoneFirst2, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhoneFirst2_LikeSearch(phoneFirst2, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_first2: {text(2147483647)} <br>
     * <pre>e.g. setPhoneFirst2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phoneFirst2 The value of phoneFirst2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPhoneFirst2_LikeSearch(String phoneFirst2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phoneFirst2), xgetCValuePhoneFirst2(), "phone_first2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_first2: {text(2147483647)}
     * @param phoneFirst2 The value of phoneFirst2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhoneFirst2_NotLikeSearch(String phoneFirst2, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhoneFirst2_NotLikeSearch(phoneFirst2, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_first2: {text(2147483647)}
     * @param phoneFirst2 The value of phoneFirst2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPhoneFirst2_NotLikeSearch(String phoneFirst2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phoneFirst2), xgetCValuePhoneFirst2(), "phone_first2", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * phone_first2: {text(2147483647)}
     */
    public void setPhoneFirst2_IsNull() { regPhoneFirst2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * phone_first2: {text(2147483647)}
     */
    public void setPhoneFirst2_IsNullOrEmpty() { regPhoneFirst2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * phone_first2: {text(2147483647)}
     */
    public void setPhoneFirst2_IsNotNull() { regPhoneFirst2(CK_ISNN, DOBJ); }

    protected void regPhoneFirst2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhoneFirst2(), "phone_first2"); }
    protected abstract ConditionValue xgetCValuePhoneFirst2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first3: {text(2147483647)}
     * @param phoneFirst3 The value of phoneFirst3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst3_Equal(String phoneFirst3) {
        doSetPhoneFirst3_Equal(fRES(phoneFirst3));
    }

    protected void doSetPhoneFirst3_Equal(String phoneFirst3) {
        regPhoneFirst3(CK_EQ, phoneFirst3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first3: {text(2147483647)}
     * @param phoneFirst3 The value of phoneFirst3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst3_NotEqual(String phoneFirst3) {
        doSetPhoneFirst3_NotEqual(fRES(phoneFirst3));
    }

    protected void doSetPhoneFirst3_NotEqual(String phoneFirst3) {
        regPhoneFirst3(CK_NES, phoneFirst3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first3: {text(2147483647)}
     * @param phoneFirst3 The value of phoneFirst3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst3_GreaterThan(String phoneFirst3) {
        regPhoneFirst3(CK_GT, fRES(phoneFirst3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first3: {text(2147483647)}
     * @param phoneFirst3 The value of phoneFirst3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst3_LessThan(String phoneFirst3) {
        regPhoneFirst3(CK_LT, fRES(phoneFirst3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first3: {text(2147483647)}
     * @param phoneFirst3 The value of phoneFirst3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst3_GreaterEqual(String phoneFirst3) {
        regPhoneFirst3(CK_GE, fRES(phoneFirst3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_first3: {text(2147483647)}
     * @param phoneFirst3 The value of phoneFirst3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst3_LessEqual(String phoneFirst3) {
        regPhoneFirst3(CK_LE, fRES(phoneFirst3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone_first3: {text(2147483647)}
     * @param phoneFirst3List The collection of phoneFirst3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst3_InScope(Collection<String> phoneFirst3List) {
        doSetPhoneFirst3_InScope(phoneFirst3List);
    }

    protected void doSetPhoneFirst3_InScope(Collection<String> phoneFirst3List) {
        regINS(CK_INS, cTL(phoneFirst3List), xgetCValuePhoneFirst3(), "phone_first3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone_first3: {text(2147483647)}
     * @param phoneFirst3List The collection of phoneFirst3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneFirst3_NotInScope(Collection<String> phoneFirst3List) {
        doSetPhoneFirst3_NotInScope(phoneFirst3List);
    }

    protected void doSetPhoneFirst3_NotInScope(Collection<String> phoneFirst3List) {
        regINS(CK_NINS, cTL(phoneFirst3List), xgetCValuePhoneFirst3(), "phone_first3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_first3: {text(2147483647)} <br>
     * <pre>e.g. setPhoneFirst3_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param phoneFirst3 The value of phoneFirst3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhoneFirst3_LikeSearch(String phoneFirst3, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhoneFirst3_LikeSearch(phoneFirst3, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_first3: {text(2147483647)} <br>
     * <pre>e.g. setPhoneFirst3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phoneFirst3 The value of phoneFirst3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPhoneFirst3_LikeSearch(String phoneFirst3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phoneFirst3), xgetCValuePhoneFirst3(), "phone_first3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_first3: {text(2147483647)}
     * @param phoneFirst3 The value of phoneFirst3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhoneFirst3_NotLikeSearch(String phoneFirst3, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhoneFirst3_NotLikeSearch(phoneFirst3, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_first3: {text(2147483647)}
     * @param phoneFirst3 The value of phoneFirst3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPhoneFirst3_NotLikeSearch(String phoneFirst3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phoneFirst3), xgetCValuePhoneFirst3(), "phone_first3", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * phone_first3: {text(2147483647)}
     */
    public void setPhoneFirst3_IsNull() { regPhoneFirst3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * phone_first3: {text(2147483647)}
     */
    public void setPhoneFirst3_IsNullOrEmpty() { regPhoneFirst3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * phone_first3: {text(2147483647)}
     */
    public void setPhoneFirst3_IsNotNull() { regPhoneFirst3(CK_ISNN, DOBJ); }

    protected void regPhoneFirst3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhoneFirst3(), "phone_first3"); }
    protected abstract ConditionValue xgetCValuePhoneFirst3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second1: {text(2147483647)}
     * @param phoneSecond1 The value of phoneSecond1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond1_Equal(String phoneSecond1) {
        doSetPhoneSecond1_Equal(fRES(phoneSecond1));
    }

    protected void doSetPhoneSecond1_Equal(String phoneSecond1) {
        regPhoneSecond1(CK_EQ, phoneSecond1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second1: {text(2147483647)}
     * @param phoneSecond1 The value of phoneSecond1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond1_NotEqual(String phoneSecond1) {
        doSetPhoneSecond1_NotEqual(fRES(phoneSecond1));
    }

    protected void doSetPhoneSecond1_NotEqual(String phoneSecond1) {
        regPhoneSecond1(CK_NES, phoneSecond1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second1: {text(2147483647)}
     * @param phoneSecond1 The value of phoneSecond1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond1_GreaterThan(String phoneSecond1) {
        regPhoneSecond1(CK_GT, fRES(phoneSecond1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second1: {text(2147483647)}
     * @param phoneSecond1 The value of phoneSecond1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond1_LessThan(String phoneSecond1) {
        regPhoneSecond1(CK_LT, fRES(phoneSecond1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second1: {text(2147483647)}
     * @param phoneSecond1 The value of phoneSecond1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond1_GreaterEqual(String phoneSecond1) {
        regPhoneSecond1(CK_GE, fRES(phoneSecond1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second1: {text(2147483647)}
     * @param phoneSecond1 The value of phoneSecond1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond1_LessEqual(String phoneSecond1) {
        regPhoneSecond1(CK_LE, fRES(phoneSecond1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone_second1: {text(2147483647)}
     * @param phoneSecond1List The collection of phoneSecond1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond1_InScope(Collection<String> phoneSecond1List) {
        doSetPhoneSecond1_InScope(phoneSecond1List);
    }

    protected void doSetPhoneSecond1_InScope(Collection<String> phoneSecond1List) {
        regINS(CK_INS, cTL(phoneSecond1List), xgetCValuePhoneSecond1(), "phone_second1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone_second1: {text(2147483647)}
     * @param phoneSecond1List The collection of phoneSecond1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond1_NotInScope(Collection<String> phoneSecond1List) {
        doSetPhoneSecond1_NotInScope(phoneSecond1List);
    }

    protected void doSetPhoneSecond1_NotInScope(Collection<String> phoneSecond1List) {
        regINS(CK_NINS, cTL(phoneSecond1List), xgetCValuePhoneSecond1(), "phone_second1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_second1: {text(2147483647)} <br>
     * <pre>e.g. setPhoneSecond1_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param phoneSecond1 The value of phoneSecond1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhoneSecond1_LikeSearch(String phoneSecond1, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhoneSecond1_LikeSearch(phoneSecond1, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_second1: {text(2147483647)} <br>
     * <pre>e.g. setPhoneSecond1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phoneSecond1 The value of phoneSecond1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPhoneSecond1_LikeSearch(String phoneSecond1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phoneSecond1), xgetCValuePhoneSecond1(), "phone_second1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_second1: {text(2147483647)}
     * @param phoneSecond1 The value of phoneSecond1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhoneSecond1_NotLikeSearch(String phoneSecond1, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhoneSecond1_NotLikeSearch(phoneSecond1, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_second1: {text(2147483647)}
     * @param phoneSecond1 The value of phoneSecond1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPhoneSecond1_NotLikeSearch(String phoneSecond1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phoneSecond1), xgetCValuePhoneSecond1(), "phone_second1", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * phone_second1: {text(2147483647)}
     */
    public void setPhoneSecond1_IsNull() { regPhoneSecond1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * phone_second1: {text(2147483647)}
     */
    public void setPhoneSecond1_IsNullOrEmpty() { regPhoneSecond1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * phone_second1: {text(2147483647)}
     */
    public void setPhoneSecond1_IsNotNull() { regPhoneSecond1(CK_ISNN, DOBJ); }

    protected void regPhoneSecond1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhoneSecond1(), "phone_second1"); }
    protected abstract ConditionValue xgetCValuePhoneSecond1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second2: {text(2147483647)}
     * @param phoneSecond2 The value of phoneSecond2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond2_Equal(String phoneSecond2) {
        doSetPhoneSecond2_Equal(fRES(phoneSecond2));
    }

    protected void doSetPhoneSecond2_Equal(String phoneSecond2) {
        regPhoneSecond2(CK_EQ, phoneSecond2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second2: {text(2147483647)}
     * @param phoneSecond2 The value of phoneSecond2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond2_NotEqual(String phoneSecond2) {
        doSetPhoneSecond2_NotEqual(fRES(phoneSecond2));
    }

    protected void doSetPhoneSecond2_NotEqual(String phoneSecond2) {
        regPhoneSecond2(CK_NES, phoneSecond2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second2: {text(2147483647)}
     * @param phoneSecond2 The value of phoneSecond2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond2_GreaterThan(String phoneSecond2) {
        regPhoneSecond2(CK_GT, fRES(phoneSecond2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second2: {text(2147483647)}
     * @param phoneSecond2 The value of phoneSecond2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond2_LessThan(String phoneSecond2) {
        regPhoneSecond2(CK_LT, fRES(phoneSecond2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second2: {text(2147483647)}
     * @param phoneSecond2 The value of phoneSecond2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond2_GreaterEqual(String phoneSecond2) {
        regPhoneSecond2(CK_GE, fRES(phoneSecond2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second2: {text(2147483647)}
     * @param phoneSecond2 The value of phoneSecond2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond2_LessEqual(String phoneSecond2) {
        regPhoneSecond2(CK_LE, fRES(phoneSecond2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone_second2: {text(2147483647)}
     * @param phoneSecond2List The collection of phoneSecond2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond2_InScope(Collection<String> phoneSecond2List) {
        doSetPhoneSecond2_InScope(phoneSecond2List);
    }

    protected void doSetPhoneSecond2_InScope(Collection<String> phoneSecond2List) {
        regINS(CK_INS, cTL(phoneSecond2List), xgetCValuePhoneSecond2(), "phone_second2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone_second2: {text(2147483647)}
     * @param phoneSecond2List The collection of phoneSecond2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond2_NotInScope(Collection<String> phoneSecond2List) {
        doSetPhoneSecond2_NotInScope(phoneSecond2List);
    }

    protected void doSetPhoneSecond2_NotInScope(Collection<String> phoneSecond2List) {
        regINS(CK_NINS, cTL(phoneSecond2List), xgetCValuePhoneSecond2(), "phone_second2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_second2: {text(2147483647)} <br>
     * <pre>e.g. setPhoneSecond2_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param phoneSecond2 The value of phoneSecond2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhoneSecond2_LikeSearch(String phoneSecond2, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhoneSecond2_LikeSearch(phoneSecond2, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_second2: {text(2147483647)} <br>
     * <pre>e.g. setPhoneSecond2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phoneSecond2 The value of phoneSecond2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPhoneSecond2_LikeSearch(String phoneSecond2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phoneSecond2), xgetCValuePhoneSecond2(), "phone_second2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_second2: {text(2147483647)}
     * @param phoneSecond2 The value of phoneSecond2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhoneSecond2_NotLikeSearch(String phoneSecond2, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhoneSecond2_NotLikeSearch(phoneSecond2, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_second2: {text(2147483647)}
     * @param phoneSecond2 The value of phoneSecond2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPhoneSecond2_NotLikeSearch(String phoneSecond2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phoneSecond2), xgetCValuePhoneSecond2(), "phone_second2", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * phone_second2: {text(2147483647)}
     */
    public void setPhoneSecond2_IsNull() { regPhoneSecond2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * phone_second2: {text(2147483647)}
     */
    public void setPhoneSecond2_IsNullOrEmpty() { regPhoneSecond2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * phone_second2: {text(2147483647)}
     */
    public void setPhoneSecond2_IsNotNull() { regPhoneSecond2(CK_ISNN, DOBJ); }

    protected void regPhoneSecond2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhoneSecond2(), "phone_second2"); }
    protected abstract ConditionValue xgetCValuePhoneSecond2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second3: {text(2147483647)}
     * @param phoneSecond3 The value of phoneSecond3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond3_Equal(String phoneSecond3) {
        doSetPhoneSecond3_Equal(fRES(phoneSecond3));
    }

    protected void doSetPhoneSecond3_Equal(String phoneSecond3) {
        regPhoneSecond3(CK_EQ, phoneSecond3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second3: {text(2147483647)}
     * @param phoneSecond3 The value of phoneSecond3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond3_NotEqual(String phoneSecond3) {
        doSetPhoneSecond3_NotEqual(fRES(phoneSecond3));
    }

    protected void doSetPhoneSecond3_NotEqual(String phoneSecond3) {
        regPhoneSecond3(CK_NES, phoneSecond3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second3: {text(2147483647)}
     * @param phoneSecond3 The value of phoneSecond3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond3_GreaterThan(String phoneSecond3) {
        regPhoneSecond3(CK_GT, fRES(phoneSecond3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second3: {text(2147483647)}
     * @param phoneSecond3 The value of phoneSecond3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond3_LessThan(String phoneSecond3) {
        regPhoneSecond3(CK_LT, fRES(phoneSecond3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second3: {text(2147483647)}
     * @param phoneSecond3 The value of phoneSecond3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond3_GreaterEqual(String phoneSecond3) {
        regPhoneSecond3(CK_GE, fRES(phoneSecond3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone_second3: {text(2147483647)}
     * @param phoneSecond3 The value of phoneSecond3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond3_LessEqual(String phoneSecond3) {
        regPhoneSecond3(CK_LE, fRES(phoneSecond3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone_second3: {text(2147483647)}
     * @param phoneSecond3List The collection of phoneSecond3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond3_InScope(Collection<String> phoneSecond3List) {
        doSetPhoneSecond3_InScope(phoneSecond3List);
    }

    protected void doSetPhoneSecond3_InScope(Collection<String> phoneSecond3List) {
        regINS(CK_INS, cTL(phoneSecond3List), xgetCValuePhoneSecond3(), "phone_second3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone_second3: {text(2147483647)}
     * @param phoneSecond3List The collection of phoneSecond3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneSecond3_NotInScope(Collection<String> phoneSecond3List) {
        doSetPhoneSecond3_NotInScope(phoneSecond3List);
    }

    protected void doSetPhoneSecond3_NotInScope(Collection<String> phoneSecond3List) {
        regINS(CK_NINS, cTL(phoneSecond3List), xgetCValuePhoneSecond3(), "phone_second3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_second3: {text(2147483647)} <br>
     * <pre>e.g. setPhoneSecond3_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param phoneSecond3 The value of phoneSecond3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhoneSecond3_LikeSearch(String phoneSecond3, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhoneSecond3_LikeSearch(phoneSecond3, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_second3: {text(2147483647)} <br>
     * <pre>e.g. setPhoneSecond3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phoneSecond3 The value of phoneSecond3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPhoneSecond3_LikeSearch(String phoneSecond3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phoneSecond3), xgetCValuePhoneSecond3(), "phone_second3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_second3: {text(2147483647)}
     * @param phoneSecond3 The value of phoneSecond3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhoneSecond3_NotLikeSearch(String phoneSecond3, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhoneSecond3_NotLikeSearch(phoneSecond3, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone_second3: {text(2147483647)}
     * @param phoneSecond3 The value of phoneSecond3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPhoneSecond3_NotLikeSearch(String phoneSecond3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phoneSecond3), xgetCValuePhoneSecond3(), "phone_second3", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * phone_second3: {text(2147483647)}
     */
    public void setPhoneSecond3_IsNull() { regPhoneSecond3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * phone_second3: {text(2147483647)}
     */
    public void setPhoneSecond3_IsNullOrEmpty() { regPhoneSecond3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * phone_second3: {text(2147483647)}
     */
    public void setPhoneSecond3_IsNotNull() { regPhoneSecond3(CK_ISNN, DOBJ); }

    protected void regPhoneSecond3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhoneSecond3(), "phone_second3"); }
    protected abstract ConditionValue xgetCValuePhoneSecond3();

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
     * postal_code: {bpchar(7)}
     * @param postalCode The value of postalCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostalCode_Equal(String postalCode) {
        doSetPostalCode_Equal(fRES(postalCode));
    }

    protected void doSetPostalCode_Equal(String postalCode) {
        regPostalCode(CK_EQ, postalCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * postal_code: {bpchar(7)}
     * @param postalCode The value of postalCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostalCode_NotEqual(String postalCode) {
        doSetPostalCode_NotEqual(fRES(postalCode));
    }

    protected void doSetPostalCode_NotEqual(String postalCode) {
        regPostalCode(CK_NES, postalCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * postal_code: {bpchar(7)}
     * @param postalCode The value of postalCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostalCode_GreaterThan(String postalCode) {
        regPostalCode(CK_GT, fRES(postalCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * postal_code: {bpchar(7)}
     * @param postalCode The value of postalCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostalCode_LessThan(String postalCode) {
        regPostalCode(CK_LT, fRES(postalCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * postal_code: {bpchar(7)}
     * @param postalCode The value of postalCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostalCode_GreaterEqual(String postalCode) {
        regPostalCode(CK_GE, fRES(postalCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * postal_code: {bpchar(7)}
     * @param postalCode The value of postalCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostalCode_LessEqual(String postalCode) {
        regPostalCode(CK_LE, fRES(postalCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * postal_code: {bpchar(7)}
     * @param postalCodeList The collection of postalCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostalCode_InScope(Collection<String> postalCodeList) {
        doSetPostalCode_InScope(postalCodeList);
    }

    protected void doSetPostalCode_InScope(Collection<String> postalCodeList) {
        regINS(CK_INS, cTL(postalCodeList), xgetCValuePostalCode(), "postal_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * postal_code: {bpchar(7)}
     * @param postalCodeList The collection of postalCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostalCode_NotInScope(Collection<String> postalCodeList) {
        doSetPostalCode_NotInScope(postalCodeList);
    }

    protected void doSetPostalCode_NotInScope(Collection<String> postalCodeList) {
        regINS(CK_NINS, cTL(postalCodeList), xgetCValuePostalCode(), "postal_code");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * postal_code: {bpchar(7)} <br>
     * <pre>e.g. setPostalCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param postalCode The value of postalCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPostalCode_LikeSearch(String postalCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPostalCode_LikeSearch(postalCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * postal_code: {bpchar(7)} <br>
     * <pre>e.g. setPostalCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param postalCode The value of postalCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPostalCode_LikeSearch(String postalCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(postalCode), xgetCValuePostalCode(), "postal_code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * postal_code: {bpchar(7)}
     * @param postalCode The value of postalCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPostalCode_NotLikeSearch(String postalCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPostalCode_NotLikeSearch(postalCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * postal_code: {bpchar(7)}
     * @param postalCode The value of postalCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPostalCode_NotLikeSearch(String postalCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(postalCode), xgetCValuePostalCode(), "postal_code", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * postal_code: {bpchar(7)}
     */
    public void setPostalCode_IsNull() { regPostalCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * postal_code: {bpchar(7)}
     */
    public void setPostalCode_IsNullOrEmpty() { regPostalCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * postal_code: {bpchar(7)}
     */
    public void setPostalCode_IsNotNull() { regPostalCode(CK_ISNN, DOBJ); }

    protected void regPostalCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePostalCode(), "postal_code"); }
    protected abstract ConditionValue xgetCValuePostalCode();

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
    public HpSLCFunction<MUserCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MUserCB.class);
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
    public HpSLCFunction<MUserCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MUserCB.class);
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
    public HpSLCFunction<MUserCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MUserCB.class);
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
    public HpSLCFunction<MUserCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MUserCB.class);
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
    public HpSLCFunction<MUserCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MUserCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MUserCB&gt;() {
     *     public void query(MUserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MUserCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MUserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MUserCQ sq);

    protected MUserCB xcreateScalarConditionCB() {
        MUserCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MUserCB xcreateScalarConditionPartitionByCB() {
        MUserCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MUserCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserCB cb = new MUserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "user_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MUserCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MUserCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MUserCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserCB cb = new MUserCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "user_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MUserCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserCB cb = new MUserCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MUserCQ sq);

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
    protected MUserCB newMyCB() {
        return new MUserCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MUserCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

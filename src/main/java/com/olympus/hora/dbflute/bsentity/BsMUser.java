package com.olympus.hora.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.olympus.hora.dbflute.allcommon.EntityDefinedCommonColumn;
import com.olympus.hora.dbflute.allcommon.DBMetaInstanceHandler;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The entity of m_user as TABLE. <br>
 * <pre>
 * [primary-key]
 *     user_id
 *
 * [column]
 *     user_id, family_name, given_name, family_name_kana, given_name_kana, sex, birthday, phone_first1, phone_first2, phone_first3, phone_second1, phone_second2, phone_second3, email1, email2, postal_code, prefecture, city, address1, address2, remarks, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_user_user_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     t_reservation
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     tReservationList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer userId = entity.getUserId();
 * String familyName = entity.getFamilyName();
 * String givenName = entity.getGivenName();
 * String familyNameKana = entity.getFamilyNameKana();
 * String givenNameKana = entity.getGivenNameKana();
 * Integer sex = entity.getSex();
 * java.time.LocalDate birthday = entity.getBirthday();
 * String phoneFirst1 = entity.getPhoneFirst1();
 * String phoneFirst2 = entity.getPhoneFirst2();
 * String phoneFirst3 = entity.getPhoneFirst3();
 * String phoneSecond1 = entity.getPhoneSecond1();
 * String phoneSecond2 = entity.getPhoneSecond2();
 * String phoneSecond3 = entity.getPhoneSecond3();
 * String email1 = entity.getEmail1();
 * String email2 = entity.getEmail2();
 * String postalCode = entity.getPostalCode();
 * Integer prefecture = entity.getPrefecture();
 * String city = entity.getCity();
 * String address1 = entity.getAddress1();
 * String address2 = entity.getAddress2();
 * String remarks = entity.getRemarks();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setUserId(userId);
 * entity.setFamilyName(familyName);
 * entity.setGivenName(givenName);
 * entity.setFamilyNameKana(familyNameKana);
 * entity.setGivenNameKana(givenNameKana);
 * entity.setSex(sex);
 * entity.setBirthday(birthday);
 * entity.setPhoneFirst1(phoneFirst1);
 * entity.setPhoneFirst2(phoneFirst2);
 * entity.setPhoneFirst3(phoneFirst3);
 * entity.setPhoneSecond1(phoneSecond1);
 * entity.setPhoneSecond2(phoneSecond2);
 * entity.setPhoneSecond3(phoneSecond3);
 * entity.setEmail1(email1);
 * entity.setEmail2(email2);
 * entity.setPostalCode(postalCode);
 * entity.setPrefecture(prefecture);
 * entity.setCity(city);
 * entity.setAddress1(address1);
 * entity.setAddress2(address2);
 * entity.setRemarks(remarks);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMUser extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** user_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _userId;

    /** family_name: {text(2147483647)} */
    protected String _familyName;

    /** given_name: {text(2147483647)} */
    protected String _givenName;

    /** family_name_kana: {text(2147483647)} */
    protected String _familyNameKana;

    /** given_name_kana: {text(2147483647)} */
    protected String _givenNameKana;

    /** sex: {int4(10)} */
    protected Integer _sex;

    /** birthday: {date(13)} */
    protected java.time.LocalDate _birthday;

    /** phone_first1: {text(2147483647)} */
    protected String _phoneFirst1;

    /** phone_first2: {text(2147483647)} */
    protected String _phoneFirst2;

    /** phone_first3: {text(2147483647)} */
    protected String _phoneFirst3;

    /** phone_second1: {text(2147483647)} */
    protected String _phoneSecond1;

    /** phone_second2: {text(2147483647)} */
    protected String _phoneSecond2;

    /** phone_second3: {text(2147483647)} */
    protected String _phoneSecond3;

    /** email1: {text(2147483647)} */
    protected String _email1;

    /** email2: {text(2147483647)} */
    protected String _email2;

    /** postal_code: {bpchar(7)} */
    protected String _postalCode;

    /** prefecture: {int2(5)} */
    protected Integer _prefecture;

    /** city: {text(2147483647)} */
    protected String _city;

    /** address1: {text(2147483647)} */
    protected String _address1;

    /** address2: {text(2147483647)} */
    protected String _address2;

    /** remarks: {text(2147483647)} */
    protected String _remarks;

    /** delete_flag: {NotNull, bool(1), default=[false]} */
    protected Boolean _deleteFlag;

    /** register_datetime: {NotNull, timestamp(26, 3), default=[now()]} */
    protected java.time.LocalDateTime _registerDatetime;

    /** update_datetime: {timestamp(26, 3)} */
    protected java.time.LocalDateTime _updateDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "m_user";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** t_reservation by user_id, named 'TReservationList'. */
    protected List<TReservation> _tReservationList;

    /**
     * [get] t_reservation by user_id, named 'TReservationList'.
     * @return The entity list of referrer property 'TReservationList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReservation> getTReservationList() {
        if (_tReservationList == null) { _tReservationList = newReferrerList(); }
        return _tReservationList;
    }

    /**
     * [set] t_reservation by user_id, named 'TReservationList'.
     * @param tReservationList The entity list of referrer property 'TReservationList'. (NullAllowed)
     */
    public void setTReservationList(List<TReservation> tReservationList) {
        _tReservationList = tReservationList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMUser) {
            BsMUser other = (BsMUser)obj;
            if (!xSV(_userId, other._userId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tReservationList != null) { for (TReservation et : _tReservationList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReservationList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_familyName));
        sb.append(dm).append(xfND(_givenName));
        sb.append(dm).append(xfND(_familyNameKana));
        sb.append(dm).append(xfND(_givenNameKana));
        sb.append(dm).append(xfND(_sex));
        sb.append(dm).append(xfND(_birthday));
        sb.append(dm).append(xfND(_phoneFirst1));
        sb.append(dm).append(xfND(_phoneFirst2));
        sb.append(dm).append(xfND(_phoneFirst3));
        sb.append(dm).append(xfND(_phoneSecond1));
        sb.append(dm).append(xfND(_phoneSecond2));
        sb.append(dm).append(xfND(_phoneSecond3));
        sb.append(dm).append(xfND(_email1));
        sb.append(dm).append(xfND(_email2));
        sb.append(dm).append(xfND(_postalCode));
        sb.append(dm).append(xfND(_prefecture));
        sb.append(dm).append(xfND(_city));
        sb.append(dm).append(xfND(_address1));
        sb.append(dm).append(xfND(_address2));
        sb.append(dm).append(xfND(_remarks));
        sb.append(dm).append(xfND(_deleteFlag));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_updateDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_tReservationList != null && !_tReservationList.isEmpty())
        { sb.append(dm).append("tReservationList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MUser clone() {
        return (MUser)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] user_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {PK, ID, NotNull, serial(10)} <br>
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] family_name: {text(2147483647)} <br>
     * @return The value of the column 'family_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getFamilyName() {
        checkSpecifiedProperty("familyName");
        return _familyName;
    }

    /**
     * [set] family_name: {text(2147483647)} <br>
     * @param familyName The value of the column 'family_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFamilyName(String familyName) {
        registerModifiedProperty("familyName");
        _familyName = familyName;
    }

    /**
     * [get] given_name: {text(2147483647)} <br>
     * @return The value of the column 'given_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getGivenName() {
        checkSpecifiedProperty("givenName");
        return _givenName;
    }

    /**
     * [set] given_name: {text(2147483647)} <br>
     * @param givenName The value of the column 'given_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGivenName(String givenName) {
        registerModifiedProperty("givenName");
        _givenName = givenName;
    }

    /**
     * [get] family_name_kana: {text(2147483647)} <br>
     * @return The value of the column 'family_name_kana'. (NullAllowed even if selected: for no constraint)
     */
    public String getFamilyNameKana() {
        checkSpecifiedProperty("familyNameKana");
        return _familyNameKana;
    }

    /**
     * [set] family_name_kana: {text(2147483647)} <br>
     * @param familyNameKana The value of the column 'family_name_kana'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFamilyNameKana(String familyNameKana) {
        registerModifiedProperty("familyNameKana");
        _familyNameKana = familyNameKana;
    }

    /**
     * [get] given_name_kana: {text(2147483647)} <br>
     * @return The value of the column 'given_name_kana'. (NullAllowed even if selected: for no constraint)
     */
    public String getGivenNameKana() {
        checkSpecifiedProperty("givenNameKana");
        return _givenNameKana;
    }

    /**
     * [set] given_name_kana: {text(2147483647)} <br>
     * @param givenNameKana The value of the column 'given_name_kana'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGivenNameKana(String givenNameKana) {
        registerModifiedProperty("givenNameKana");
        _givenNameKana = givenNameKana;
    }

    /**
     * [get] sex: {int4(10)} <br>
     * @return The value of the column 'sex'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getSex() {
        checkSpecifiedProperty("sex");
        return _sex;
    }

    /**
     * [set] sex: {int4(10)} <br>
     * @param sex The value of the column 'sex'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSex(Integer sex) {
        registerModifiedProperty("sex");
        _sex = sex;
    }

    /**
     * [get] birthday: {date(13)} <br>
     * @return The value of the column 'birthday'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getBirthday() {
        checkSpecifiedProperty("birthday");
        return _birthday;
    }

    /**
     * [set] birthday: {date(13)} <br>
     * @param birthday The value of the column 'birthday'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthday(java.time.LocalDate birthday) {
        registerModifiedProperty("birthday");
        _birthday = birthday;
    }

    /**
     * [get] phone_first1: {text(2147483647)} <br>
     * @return The value of the column 'phone_first1'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhoneFirst1() {
        checkSpecifiedProperty("phoneFirst1");
        return _phoneFirst1;
    }

    /**
     * [set] phone_first1: {text(2147483647)} <br>
     * @param phoneFirst1 The value of the column 'phone_first1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhoneFirst1(String phoneFirst1) {
        registerModifiedProperty("phoneFirst1");
        _phoneFirst1 = phoneFirst1;
    }

    /**
     * [get] phone_first2: {text(2147483647)} <br>
     * @return The value of the column 'phone_first2'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhoneFirst2() {
        checkSpecifiedProperty("phoneFirst2");
        return _phoneFirst2;
    }

    /**
     * [set] phone_first2: {text(2147483647)} <br>
     * @param phoneFirst2 The value of the column 'phone_first2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhoneFirst2(String phoneFirst2) {
        registerModifiedProperty("phoneFirst2");
        _phoneFirst2 = phoneFirst2;
    }

    /**
     * [get] phone_first3: {text(2147483647)} <br>
     * @return The value of the column 'phone_first3'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhoneFirst3() {
        checkSpecifiedProperty("phoneFirst3");
        return _phoneFirst3;
    }

    /**
     * [set] phone_first3: {text(2147483647)} <br>
     * @param phoneFirst3 The value of the column 'phone_first3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhoneFirst3(String phoneFirst3) {
        registerModifiedProperty("phoneFirst3");
        _phoneFirst3 = phoneFirst3;
    }

    /**
     * [get] phone_second1: {text(2147483647)} <br>
     * @return The value of the column 'phone_second1'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhoneSecond1() {
        checkSpecifiedProperty("phoneSecond1");
        return _phoneSecond1;
    }

    /**
     * [set] phone_second1: {text(2147483647)} <br>
     * @param phoneSecond1 The value of the column 'phone_second1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhoneSecond1(String phoneSecond1) {
        registerModifiedProperty("phoneSecond1");
        _phoneSecond1 = phoneSecond1;
    }

    /**
     * [get] phone_second2: {text(2147483647)} <br>
     * @return The value of the column 'phone_second2'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhoneSecond2() {
        checkSpecifiedProperty("phoneSecond2");
        return _phoneSecond2;
    }

    /**
     * [set] phone_second2: {text(2147483647)} <br>
     * @param phoneSecond2 The value of the column 'phone_second2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhoneSecond2(String phoneSecond2) {
        registerModifiedProperty("phoneSecond2");
        _phoneSecond2 = phoneSecond2;
    }

    /**
     * [get] phone_second3: {text(2147483647)} <br>
     * @return The value of the column 'phone_second3'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhoneSecond3() {
        checkSpecifiedProperty("phoneSecond3");
        return _phoneSecond3;
    }

    /**
     * [set] phone_second3: {text(2147483647)} <br>
     * @param phoneSecond3 The value of the column 'phone_second3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhoneSecond3(String phoneSecond3) {
        registerModifiedProperty("phoneSecond3");
        _phoneSecond3 = phoneSecond3;
    }

    /**
     * [get] email1: {text(2147483647)} <br>
     * @return The value of the column 'email1'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmail1() {
        checkSpecifiedProperty("email1");
        return _email1;
    }

    /**
     * [set] email1: {text(2147483647)} <br>
     * @param email1 The value of the column 'email1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmail1(String email1) {
        registerModifiedProperty("email1");
        _email1 = email1;
    }

    /**
     * [get] email2: {text(2147483647)} <br>
     * @return The value of the column 'email2'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmail2() {
        checkSpecifiedProperty("email2");
        return _email2;
    }

    /**
     * [set] email2: {text(2147483647)} <br>
     * @param email2 The value of the column 'email2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmail2(String email2) {
        registerModifiedProperty("email2");
        _email2 = email2;
    }

    /**
     * [get] postal_code: {bpchar(7)} <br>
     * @return The value of the column 'postal_code'. (NullAllowed even if selected: for no constraint)
     */
    public String getPostalCode() {
        checkSpecifiedProperty("postalCode");
        return _postalCode;
    }

    /**
     * [set] postal_code: {bpchar(7)} <br>
     * @param postalCode The value of the column 'postal_code'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPostalCode(String postalCode) {
        registerModifiedProperty("postalCode");
        _postalCode = postalCode;
    }

    /**
     * [get] prefecture: {int2(5)} <br>
     * @return The value of the column 'prefecture'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPrefecture() {
        checkSpecifiedProperty("prefecture");
        return _prefecture;
    }

    /**
     * [set] prefecture: {int2(5)} <br>
     * @param prefecture The value of the column 'prefecture'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrefecture(Integer prefecture) {
        registerModifiedProperty("prefecture");
        _prefecture = prefecture;
    }

    /**
     * [get] city: {text(2147483647)} <br>
     * @return The value of the column 'city'. (NullAllowed even if selected: for no constraint)
     */
    public String getCity() {
        checkSpecifiedProperty("city");
        return _city;
    }

    /**
     * [set] city: {text(2147483647)} <br>
     * @param city The value of the column 'city'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCity(String city) {
        registerModifiedProperty("city");
        _city = city;
    }

    /**
     * [get] address1: {text(2147483647)} <br>
     * @return The value of the column 'address1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress1() {
        checkSpecifiedProperty("address1");
        return _address1;
    }

    /**
     * [set] address1: {text(2147483647)} <br>
     * @param address1 The value of the column 'address1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress1(String address1) {
        registerModifiedProperty("address1");
        _address1 = address1;
    }

    /**
     * [get] address2: {text(2147483647)} <br>
     * @return The value of the column 'address2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress2() {
        checkSpecifiedProperty("address2");
        return _address2;
    }

    /**
     * [set] address2: {text(2147483647)} <br>
     * @param address2 The value of the column 'address2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress2(String address2) {
        registerModifiedProperty("address2");
        _address2 = address2;
    }

    /**
     * [get] remarks: {text(2147483647)} <br>
     * @return The value of the column 'remarks'. (NullAllowed even if selected: for no constraint)
     */
    public String getRemarks() {
        checkSpecifiedProperty("remarks");
        return _remarks;
    }

    /**
     * [set] remarks: {text(2147483647)} <br>
     * @param remarks The value of the column 'remarks'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRemarks(String remarks) {
        registerModifiedProperty("remarks");
        _remarks = remarks;
    }

    /**
     * [get] delete_flag: {NotNull, bool(1), default=[false]} <br>
     * @return The value of the column 'delete_flag'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getDeleteFlag() {
        checkSpecifiedProperty("deleteFlag");
        return _deleteFlag;
    }

    /**
     * [set] delete_flag: {NotNull, bool(1), default=[false]} <br>
     * @param deleteFlag The value of the column 'delete_flag'. (basically NotNull if update: for the constraint)
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        registerModifiedProperty("deleteFlag");
        _deleteFlag = deleteFlag;
    }

    /**
     * [get] register_datetime: {NotNull, timestamp(26, 3), default=[now()]} <br>
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, timestamp(26, 3), default=[now()]} <br>
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] update_datetime: {timestamp(26, 3)} <br>
     * @return The value of the column 'update_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {timestamp(26, 3)} <br>
     * @param updateDatetime The value of the column 'update_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }
}

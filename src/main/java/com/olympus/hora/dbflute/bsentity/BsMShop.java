package com.olympus.hora.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.olympus.hora.dbflute.allcommon.EntityDefinedCommonColumn;
import com.olympus.hora.dbflute.allcommon.DBMetaInstanceHandler;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The entity of m_shop as TABLE. <br>
 * <pre>
 * [primary-key]
 *     shop_id
 *
 * [column]
 *     shop_id, company_id, shop_abbreviated_name, shop_name, phone1_1, phone1_2, phone1_3, phone2_1, phone2_2, phone2_3, fax_1, fax_2, fax_3, email1, email2, url, prefecture, city, address1, address2, remarks, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_shop_shop_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     m_company
 *
 * [referrer table]
 *     m_course_group, m_working_day, m_working_day_deff, m_working_staff, t_reservation
 *
 * [foreign property]
 *     mCompany
 *
 * [referrer property]
 *     mCourseGroupList, mWorkingDayList, mWorkingDayDeffList, mWorkingStaffList, tReservationList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer shopId = entity.getShopId();
 * Integer companyId = entity.getCompanyId();
 * String shopAbbreviatedName = entity.getShopAbbreviatedName();
 * String shopName = entity.getShopName();
 * String phone11 = entity.getPhone11();
 * String phone12 = entity.getPhone12();
 * String phone13 = entity.getPhone13();
 * String phone21 = entity.getPhone21();
 * String phone22 = entity.getPhone22();
 * String phone23 = entity.getPhone23();
 * String fax1 = entity.getFax1();
 * String fax2 = entity.getFax2();
 * String fax3 = entity.getFax3();
 * String email1 = entity.getEmail1();
 * String email2 = entity.getEmail2();
 * String url = entity.getUrl();
 * Integer prefecture = entity.getPrefecture();
 * String city = entity.getCity();
 * String address1 = entity.getAddress1();
 * String address2 = entity.getAddress2();
 * String remarks = entity.getRemarks();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setShopId(shopId);
 * entity.setCompanyId(companyId);
 * entity.setShopAbbreviatedName(shopAbbreviatedName);
 * entity.setShopName(shopName);
 * entity.setPhone11(phone11);
 * entity.setPhone12(phone12);
 * entity.setPhone13(phone13);
 * entity.setPhone21(phone21);
 * entity.setPhone22(phone22);
 * entity.setPhone23(phone23);
 * entity.setFax1(fax1);
 * entity.setFax2(fax2);
 * entity.setFax3(fax3);
 * entity.setEmail1(email1);
 * entity.setEmail2(email2);
 * entity.setUrl(url);
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
public abstract class BsMShop extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** shop_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _shopId;

    /** company_id: {int4(10), FK to m_company} */
    protected Integer _companyId;

    /** shop_abbreviated_name: {text(2147483647)} */
    protected String _shopAbbreviatedName;

    /** shop_name: {text(2147483647)} */
    protected String _shopName;

    /** phone1_1: {text(2147483647)} */
    protected String _phone11;

    /** phone1_2: {text(2147483647)} */
    protected String _phone12;

    /** phone1_3: {text(2147483647)} */
    protected String _phone13;

    /** phone2_1: {text(2147483647)} */
    protected String _phone21;

    /** phone2_2: {text(2147483647)} */
    protected String _phone22;

    /** phone2_3: {text(2147483647)} */
    protected String _phone23;

    /** fax_1: {text(2147483647)} */
    protected String _fax1;

    /** fax_2: {text(2147483647)} */
    protected String _fax2;

    /** fax_3: {text(2147483647)} */
    protected String _fax3;

    /** email1: {text(2147483647)} */
    protected String _email1;

    /** email2: {text(2147483647)} */
    protected String _email2;

    /** url: {text(2147483647)} */
    protected String _url;

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
        return "m_shop";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_shopId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** m_company by my company_id, named 'MCompany'. */
    protected OptionalEntity<MCompany> _mCompany;

    /**
     * [get] m_company by my company_id, named 'MCompany'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'MCompany'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MCompany> getMCompany() {
        if (_mCompany == null) { _mCompany = OptionalEntity.relationEmpty(this, "MCompany"); }
        return _mCompany;
    }

    /**
     * [set] m_company by my company_id, named 'MCompany'.
     * @param mCompany The entity of foreign property 'MCompany'. (NullAllowed)
     */
    public void setMCompany(OptionalEntity<MCompany> mCompany) {
        _mCompany = mCompany;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** m_course_group by shop_id, named 'MCourseGroupList'. */
    protected List<MCourseGroup> _mCourseGroupList;

    /**
     * [get] m_course_group by shop_id, named 'MCourseGroupList'.
     * @return The entity list of referrer property 'MCourseGroupList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCourseGroup> getMCourseGroupList() {
        if (_mCourseGroupList == null) { _mCourseGroupList = newReferrerList(); }
        return _mCourseGroupList;
    }

    /**
     * [set] m_course_group by shop_id, named 'MCourseGroupList'.
     * @param mCourseGroupList The entity list of referrer property 'MCourseGroupList'. (NullAllowed)
     */
    public void setMCourseGroupList(List<MCourseGroup> mCourseGroupList) {
        _mCourseGroupList = mCourseGroupList;
    }

    /** m_working_day by shop_id, named 'MWorkingDayList'. */
    protected List<MWorkingDay> _mWorkingDayList;

    /**
     * [get] m_working_day by shop_id, named 'MWorkingDayList'.
     * @return The entity list of referrer property 'MWorkingDayList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MWorkingDay> getMWorkingDayList() {
        if (_mWorkingDayList == null) { _mWorkingDayList = newReferrerList(); }
        return _mWorkingDayList;
    }

    /**
     * [set] m_working_day by shop_id, named 'MWorkingDayList'.
     * @param mWorkingDayList The entity list of referrer property 'MWorkingDayList'. (NullAllowed)
     */
    public void setMWorkingDayList(List<MWorkingDay> mWorkingDayList) {
        _mWorkingDayList = mWorkingDayList;
    }

    /** m_working_day_deff by shop_id, named 'MWorkingDayDeffList'. */
    protected List<MWorkingDayDeff> _mWorkingDayDeffList;

    /**
     * [get] m_working_day_deff by shop_id, named 'MWorkingDayDeffList'.
     * @return The entity list of referrer property 'MWorkingDayDeffList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MWorkingDayDeff> getMWorkingDayDeffList() {
        if (_mWorkingDayDeffList == null) { _mWorkingDayDeffList = newReferrerList(); }
        return _mWorkingDayDeffList;
    }

    /**
     * [set] m_working_day_deff by shop_id, named 'MWorkingDayDeffList'.
     * @param mWorkingDayDeffList The entity list of referrer property 'MWorkingDayDeffList'. (NullAllowed)
     */
    public void setMWorkingDayDeffList(List<MWorkingDayDeff> mWorkingDayDeffList) {
        _mWorkingDayDeffList = mWorkingDayDeffList;
    }

    /** m_working_staff by shop_id, named 'MWorkingStaffList'. */
    protected List<MWorkingStaff> _mWorkingStaffList;

    /**
     * [get] m_working_staff by shop_id, named 'MWorkingStaffList'.
     * @return The entity list of referrer property 'MWorkingStaffList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MWorkingStaff> getMWorkingStaffList() {
        if (_mWorkingStaffList == null) { _mWorkingStaffList = newReferrerList(); }
        return _mWorkingStaffList;
    }

    /**
     * [set] m_working_staff by shop_id, named 'MWorkingStaffList'.
     * @param mWorkingStaffList The entity list of referrer property 'MWorkingStaffList'. (NullAllowed)
     */
    public void setMWorkingStaffList(List<MWorkingStaff> mWorkingStaffList) {
        _mWorkingStaffList = mWorkingStaffList;
    }

    /** t_reservation by shop_id, named 'TReservationList'. */
    protected List<TReservation> _tReservationList;

    /**
     * [get] t_reservation by shop_id, named 'TReservationList'.
     * @return The entity list of referrer property 'TReservationList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReservation> getTReservationList() {
        if (_tReservationList == null) { _tReservationList = newReferrerList(); }
        return _tReservationList;
    }

    /**
     * [set] t_reservation by shop_id, named 'TReservationList'.
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
        if (obj instanceof BsMShop) {
            BsMShop other = (BsMShop)obj;
            if (!xSV(_shopId, other._shopId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shopId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCompany != null && _mCompany.isPresent())
        { sb.append(li).append(xbRDS(_mCompany, "mCompany")); }
        if (_mCourseGroupList != null) { for (MCourseGroup et : _mCourseGroupList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCourseGroupList")); } } }
        if (_mWorkingDayList != null) { for (MWorkingDay et : _mWorkingDayList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mWorkingDayList")); } } }
        if (_mWorkingDayDeffList != null) { for (MWorkingDayDeff et : _mWorkingDayDeffList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mWorkingDayDeffList")); } } }
        if (_mWorkingStaffList != null) { for (MWorkingStaff et : _mWorkingStaffList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mWorkingStaffList")); } } }
        if (_tReservationList != null) { for (TReservation et : _tReservationList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReservationList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shopId));
        sb.append(dm).append(xfND(_companyId));
        sb.append(dm).append(xfND(_shopAbbreviatedName));
        sb.append(dm).append(xfND(_shopName));
        sb.append(dm).append(xfND(_phone11));
        sb.append(dm).append(xfND(_phone12));
        sb.append(dm).append(xfND(_phone13));
        sb.append(dm).append(xfND(_phone21));
        sb.append(dm).append(xfND(_phone22));
        sb.append(dm).append(xfND(_phone23));
        sb.append(dm).append(xfND(_fax1));
        sb.append(dm).append(xfND(_fax2));
        sb.append(dm).append(xfND(_fax3));
        sb.append(dm).append(xfND(_email1));
        sb.append(dm).append(xfND(_email2));
        sb.append(dm).append(xfND(_url));
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
        if (_mCompany != null && _mCompany.isPresent())
        { sb.append(dm).append("mCompany"); }
        if (_mCourseGroupList != null && !_mCourseGroupList.isEmpty())
        { sb.append(dm).append("mCourseGroupList"); }
        if (_mWorkingDayList != null && !_mWorkingDayList.isEmpty())
        { sb.append(dm).append("mWorkingDayList"); }
        if (_mWorkingDayDeffList != null && !_mWorkingDayDeffList.isEmpty())
        { sb.append(dm).append("mWorkingDayDeffList"); }
        if (_mWorkingStaffList != null && !_mWorkingStaffList.isEmpty())
        { sb.append(dm).append("mWorkingStaffList"); }
        if (_tReservationList != null && !_tReservationList.isEmpty())
        { sb.append(dm).append("tReservationList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MShop clone() {
        return (MShop)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] shop_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'shop_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getShopId() {
        checkSpecifiedProperty("shopId");
        return _shopId;
    }

    /**
     * [set] shop_id: {PK, ID, NotNull, serial(10)} <br>
     * @param shopId The value of the column 'shop_id'. (basically NotNull if update: for the constraint)
     */
    public void setShopId(Integer shopId) {
        registerModifiedProperty("shopId");
        _shopId = shopId;
    }

    /**
     * [get] company_id: {int4(10), FK to m_company} <br>
     * @return The value of the column 'company_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCompanyId() {
        checkSpecifiedProperty("companyId");
        return _companyId;
    }

    /**
     * [set] company_id: {int4(10), FK to m_company} <br>
     * @param companyId The value of the column 'company_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanyId(Integer companyId) {
        registerModifiedProperty("companyId");
        _companyId = companyId;
    }

    /**
     * [get] shop_abbreviated_name: {text(2147483647)} <br>
     * @return The value of the column 'shop_abbreviated_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getShopAbbreviatedName() {
        checkSpecifiedProperty("shopAbbreviatedName");
        return _shopAbbreviatedName;
    }

    /**
     * [set] shop_abbreviated_name: {text(2147483647)} <br>
     * @param shopAbbreviatedName The value of the column 'shop_abbreviated_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShopAbbreviatedName(String shopAbbreviatedName) {
        registerModifiedProperty("shopAbbreviatedName");
        _shopAbbreviatedName = shopAbbreviatedName;
    }

    /**
     * [get] shop_name: {text(2147483647)} <br>
     * @return The value of the column 'shop_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getShopName() {
        checkSpecifiedProperty("shopName");
        return _shopName;
    }

    /**
     * [set] shop_name: {text(2147483647)} <br>
     * @param shopName The value of the column 'shop_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShopName(String shopName) {
        registerModifiedProperty("shopName");
        _shopName = shopName;
    }

    /**
     * [get] phone1_1: {text(2147483647)} <br>
     * @return The value of the column 'phone1_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhone11() {
        checkSpecifiedProperty("phone11");
        return _phone11;
    }

    /**
     * [set] phone1_1: {text(2147483647)} <br>
     * @param phone11 The value of the column 'phone1_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhone11(String phone11) {
        registerModifiedProperty("phone11");
        _phone11 = phone11;
    }

    /**
     * [get] phone1_2: {text(2147483647)} <br>
     * @return The value of the column 'phone1_2'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhone12() {
        checkSpecifiedProperty("phone12");
        return _phone12;
    }

    /**
     * [set] phone1_2: {text(2147483647)} <br>
     * @param phone12 The value of the column 'phone1_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhone12(String phone12) {
        registerModifiedProperty("phone12");
        _phone12 = phone12;
    }

    /**
     * [get] phone1_3: {text(2147483647)} <br>
     * @return The value of the column 'phone1_3'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhone13() {
        checkSpecifiedProperty("phone13");
        return _phone13;
    }

    /**
     * [set] phone1_3: {text(2147483647)} <br>
     * @param phone13 The value of the column 'phone1_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhone13(String phone13) {
        registerModifiedProperty("phone13");
        _phone13 = phone13;
    }

    /**
     * [get] phone2_1: {text(2147483647)} <br>
     * @return The value of the column 'phone2_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhone21() {
        checkSpecifiedProperty("phone21");
        return _phone21;
    }

    /**
     * [set] phone2_1: {text(2147483647)} <br>
     * @param phone21 The value of the column 'phone2_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhone21(String phone21) {
        registerModifiedProperty("phone21");
        _phone21 = phone21;
    }

    /**
     * [get] phone2_2: {text(2147483647)} <br>
     * @return The value of the column 'phone2_2'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhone22() {
        checkSpecifiedProperty("phone22");
        return _phone22;
    }

    /**
     * [set] phone2_2: {text(2147483647)} <br>
     * @param phone22 The value of the column 'phone2_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhone22(String phone22) {
        registerModifiedProperty("phone22");
        _phone22 = phone22;
    }

    /**
     * [get] phone2_3: {text(2147483647)} <br>
     * @return The value of the column 'phone2_3'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhone23() {
        checkSpecifiedProperty("phone23");
        return _phone23;
    }

    /**
     * [set] phone2_3: {text(2147483647)} <br>
     * @param phone23 The value of the column 'phone2_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhone23(String phone23) {
        registerModifiedProperty("phone23");
        _phone23 = phone23;
    }

    /**
     * [get] fax_1: {text(2147483647)} <br>
     * @return The value of the column 'fax_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFax1() {
        checkSpecifiedProperty("fax1");
        return _fax1;
    }

    /**
     * [set] fax_1: {text(2147483647)} <br>
     * @param fax1 The value of the column 'fax_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFax1(String fax1) {
        registerModifiedProperty("fax1");
        _fax1 = fax1;
    }

    /**
     * [get] fax_2: {text(2147483647)} <br>
     * @return The value of the column 'fax_2'. (NullAllowed even if selected: for no constraint)
     */
    public String getFax2() {
        checkSpecifiedProperty("fax2");
        return _fax2;
    }

    /**
     * [set] fax_2: {text(2147483647)} <br>
     * @param fax2 The value of the column 'fax_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFax2(String fax2) {
        registerModifiedProperty("fax2");
        _fax2 = fax2;
    }

    /**
     * [get] fax_3: {text(2147483647)} <br>
     * @return The value of the column 'fax_3'. (NullAllowed even if selected: for no constraint)
     */
    public String getFax3() {
        checkSpecifiedProperty("fax3");
        return _fax3;
    }

    /**
     * [set] fax_3: {text(2147483647)} <br>
     * @param fax3 The value of the column 'fax_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFax3(String fax3) {
        registerModifiedProperty("fax3");
        _fax3 = fax3;
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
     * [get] url: {text(2147483647)} <br>
     * @return The value of the column 'url'. (NullAllowed even if selected: for no constraint)
     */
    public String getUrl() {
        checkSpecifiedProperty("url");
        return _url;
    }

    /**
     * [set] url: {text(2147483647)} <br>
     * @param url The value of the column 'url'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUrl(String url) {
        registerModifiedProperty("url");
        _url = url;
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

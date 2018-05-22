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
 * The entity of t_reservation as TABLE. <br>
 * <pre>
 * [primary-key]
 *     reservation_id
 *
 * [column]
 *     reservation_id, shop_id, staff_id, hist_staff_family_name, hist_shop_name, hist_shop_abbreviated_name, hist_staff_given_name, reservation_date, reservation_time, user_id, total_amount, remarks, status, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     t_reservation_reservation_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     m_shop, m_staff, m_user
 *
 * [referrer table]
 *     t_reservation_detail
 *
 * [foreign property]
 *     mShop, mStaff, mUser
 *
 * [referrer property]
 *     tReservationDetailList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long reservationId = entity.getReservationId();
 * Integer shopId = entity.getShopId();
 * Integer staffId = entity.getStaffId();
 * String histStaffFamilyName = entity.getHistStaffFamilyName();
 * String histShopName = entity.getHistShopName();
 * String histShopAbbreviatedName = entity.getHistShopAbbreviatedName();
 * String histStaffGivenName = entity.getHistStaffGivenName();
 * java.time.LocalDate reservationDate = entity.getReservationDate();
 * java.time.LocalTime reservationTime = entity.getReservationTime();
 * Integer userId = entity.getUserId();
 * Integer totalAmount = entity.getTotalAmount();
 * String remarks = entity.getRemarks();
 * Integer status = entity.getStatus();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setReservationId(reservationId);
 * entity.setShopId(shopId);
 * entity.setStaffId(staffId);
 * entity.setHistStaffFamilyName(histStaffFamilyName);
 * entity.setHistShopName(histShopName);
 * entity.setHistShopAbbreviatedName(histShopAbbreviatedName);
 * entity.setHistStaffGivenName(histStaffGivenName);
 * entity.setReservationDate(reservationDate);
 * entity.setReservationTime(reservationTime);
 * entity.setUserId(userId);
 * entity.setTotalAmount(totalAmount);
 * entity.setRemarks(remarks);
 * entity.setStatus(status);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTReservation extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** reservation_id: {PK, ID, NotNull, bigserial(19)} */
    protected Long _reservationId;

    /** shop_id: {int4(10), FK to m_shop} */
    protected Integer _shopId;

    /** staff_id: {NotNull, int4(10), FK to m_staff} */
    protected Integer _staffId;

    /** hist_staff_family_name: {text(2147483647)} */
    protected String _histStaffFamilyName;

    /** hist_shop_name: {text(2147483647)} */
    protected String _histShopName;

    /** hist_shop_abbreviated_name: {text(2147483647)} */
    protected String _histShopAbbreviatedName;

    /** hist_staff_given_name: {text(2147483647)} */
    protected String _histStaffGivenName;

    /** reservation_date: {date(13)} */
    protected java.time.LocalDate _reservationDate;

    /** reservation_time: {time(15, 6)} */
    protected java.time.LocalTime _reservationTime;

    /** user_id: {int4(10), FK to m_user} */
    protected Integer _userId;

    /** total_amount: {int4(10)} */
    protected Integer _totalAmount;

    /** remarks: {text(2147483647)} */
    protected String _remarks;

    /** status: {int4(10)} */
    protected Integer _status;

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
        return "t_reservation";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_reservationId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** m_shop by my shop_id, named 'MShop'. */
    protected OptionalEntity<MShop> _mShop;

    /**
     * [get] m_shop by my shop_id, named 'MShop'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'MShop'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MShop> getMShop() {
        if (_mShop == null) { _mShop = OptionalEntity.relationEmpty(this, "MShop"); }
        return _mShop;
    }

    /**
     * [set] m_shop by my shop_id, named 'MShop'.
     * @param mShop The entity of foreign property 'MShop'. (NullAllowed)
     */
    public void setMShop(OptionalEntity<MShop> mShop) {
        _mShop = mShop;
    }

    /** m_staff by my staff_id, named 'MStaff'. */
    protected OptionalEntity<MStaff> _mStaff;

    /**
     * [get] m_staff by my staff_id, named 'MStaff'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'MStaff'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MStaff> getMStaff() {
        if (_mStaff == null) { _mStaff = OptionalEntity.relationEmpty(this, "MStaff"); }
        return _mStaff;
    }

    /**
     * [set] m_staff by my staff_id, named 'MStaff'.
     * @param mStaff The entity of foreign property 'MStaff'. (NullAllowed)
     */
    public void setMStaff(OptionalEntity<MStaff> mStaff) {
        _mStaff = mStaff;
    }

    /** m_user by my user_id, named 'MUser'. */
    protected OptionalEntity<MUser> _mUser;

    /**
     * [get] m_user by my user_id, named 'MUser'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'MUser'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MUser> getMUser() {
        if (_mUser == null) { _mUser = OptionalEntity.relationEmpty(this, "MUser"); }
        return _mUser;
    }

    /**
     * [set] m_user by my user_id, named 'MUser'.
     * @param mUser The entity of foreign property 'MUser'. (NullAllowed)
     */
    public void setMUser(OptionalEntity<MUser> mUser) {
        _mUser = mUser;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** t_reservation_detail by reservation_id, named 'TReservationDetailList'. */
    protected List<TReservationDetail> _tReservationDetailList;

    /**
     * [get] t_reservation_detail by reservation_id, named 'TReservationDetailList'.
     * @return The entity list of referrer property 'TReservationDetailList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReservationDetail> getTReservationDetailList() {
        if (_tReservationDetailList == null) { _tReservationDetailList = newReferrerList(); }
        return _tReservationDetailList;
    }

    /**
     * [set] t_reservation_detail by reservation_id, named 'TReservationDetailList'.
     * @param tReservationDetailList The entity list of referrer property 'TReservationDetailList'. (NullAllowed)
     */
    public void setTReservationDetailList(List<TReservationDetail> tReservationDetailList) {
        _tReservationDetailList = tReservationDetailList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTReservation) {
            BsTReservation other = (BsTReservation)obj;
            if (!xSV(_reservationId, other._reservationId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _reservationId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mShop != null && _mShop.isPresent())
        { sb.append(li).append(xbRDS(_mShop, "mShop")); }
        if (_mStaff != null && _mStaff.isPresent())
        { sb.append(li).append(xbRDS(_mStaff, "mStaff")); }
        if (_mUser != null && _mUser.isPresent())
        { sb.append(li).append(xbRDS(_mUser, "mUser")); }
        if (_tReservationDetailList != null) { for (TReservationDetail et : _tReservationDetailList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReservationDetailList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_reservationId));
        sb.append(dm).append(xfND(_shopId));
        sb.append(dm).append(xfND(_staffId));
        sb.append(dm).append(xfND(_histStaffFamilyName));
        sb.append(dm).append(xfND(_histShopName));
        sb.append(dm).append(xfND(_histShopAbbreviatedName));
        sb.append(dm).append(xfND(_histStaffGivenName));
        sb.append(dm).append(xfND(_reservationDate));
        sb.append(dm).append(xfND(_reservationTime));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_totalAmount));
        sb.append(dm).append(xfND(_remarks));
        sb.append(dm).append(xfND(_status));
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
        if (_mShop != null && _mShop.isPresent())
        { sb.append(dm).append("mShop"); }
        if (_mStaff != null && _mStaff.isPresent())
        { sb.append(dm).append("mStaff"); }
        if (_mUser != null && _mUser.isPresent())
        { sb.append(dm).append("mUser"); }
        if (_tReservationDetailList != null && !_tReservationDetailList.isEmpty())
        { sb.append(dm).append("tReservationDetailList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TReservation clone() {
        return (TReservation)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] reservation_id: {PK, ID, NotNull, bigserial(19)} <br>
     * @return The value of the column 'reservation_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getReservationId() {
        checkSpecifiedProperty("reservationId");
        return _reservationId;
    }

    /**
     * [set] reservation_id: {PK, ID, NotNull, bigserial(19)} <br>
     * @param reservationId The value of the column 'reservation_id'. (basically NotNull if update: for the constraint)
     */
    public void setReservationId(Long reservationId) {
        registerModifiedProperty("reservationId");
        _reservationId = reservationId;
    }

    /**
     * [get] shop_id: {int4(10), FK to m_shop} <br>
     * @return The value of the column 'shop_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getShopId() {
        checkSpecifiedProperty("shopId");
        return _shopId;
    }

    /**
     * [set] shop_id: {int4(10), FK to m_shop} <br>
     * @param shopId The value of the column 'shop_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShopId(Integer shopId) {
        registerModifiedProperty("shopId");
        _shopId = shopId;
    }

    /**
     * [get] staff_id: {NotNull, int4(10), FK to m_staff} <br>
     * @return The value of the column 'staff_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getStaffId() {
        checkSpecifiedProperty("staffId");
        return _staffId;
    }

    /**
     * [set] staff_id: {NotNull, int4(10), FK to m_staff} <br>
     * @param staffId The value of the column 'staff_id'. (basically NotNull if update: for the constraint)
     */
    public void setStaffId(Integer staffId) {
        registerModifiedProperty("staffId");
        _staffId = staffId;
    }

    /**
     * [get] hist_staff_family_name: {text(2147483647)} <br>
     * @return The value of the column 'hist_staff_family_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getHistStaffFamilyName() {
        checkSpecifiedProperty("histStaffFamilyName");
        return _histStaffFamilyName;
    }

    /**
     * [set] hist_staff_family_name: {text(2147483647)} <br>
     * @param histStaffFamilyName The value of the column 'hist_staff_family_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHistStaffFamilyName(String histStaffFamilyName) {
        registerModifiedProperty("histStaffFamilyName");
        _histStaffFamilyName = histStaffFamilyName;
    }

    /**
     * [get] hist_shop_name: {text(2147483647)} <br>
     * @return The value of the column 'hist_shop_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getHistShopName() {
        checkSpecifiedProperty("histShopName");
        return _histShopName;
    }

    /**
     * [set] hist_shop_name: {text(2147483647)} <br>
     * @param histShopName The value of the column 'hist_shop_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHistShopName(String histShopName) {
        registerModifiedProperty("histShopName");
        _histShopName = histShopName;
    }

    /**
     * [get] hist_shop_abbreviated_name: {text(2147483647)} <br>
     * @return The value of the column 'hist_shop_abbreviated_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getHistShopAbbreviatedName() {
        checkSpecifiedProperty("histShopAbbreviatedName");
        return _histShopAbbreviatedName;
    }

    /**
     * [set] hist_shop_abbreviated_name: {text(2147483647)} <br>
     * @param histShopAbbreviatedName The value of the column 'hist_shop_abbreviated_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHistShopAbbreviatedName(String histShopAbbreviatedName) {
        registerModifiedProperty("histShopAbbreviatedName");
        _histShopAbbreviatedName = histShopAbbreviatedName;
    }

    /**
     * [get] hist_staff_given_name: {text(2147483647)} <br>
     * @return The value of the column 'hist_staff_given_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getHistStaffGivenName() {
        checkSpecifiedProperty("histStaffGivenName");
        return _histStaffGivenName;
    }

    /**
     * [set] hist_staff_given_name: {text(2147483647)} <br>
     * @param histStaffGivenName The value of the column 'hist_staff_given_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHistStaffGivenName(String histStaffGivenName) {
        registerModifiedProperty("histStaffGivenName");
        _histStaffGivenName = histStaffGivenName;
    }

    /**
     * [get] reservation_date: {date(13)} <br>
     * @return The value of the column 'reservation_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getReservationDate() {
        checkSpecifiedProperty("reservationDate");
        return _reservationDate;
    }

    /**
     * [set] reservation_date: {date(13)} <br>
     * @param reservationDate The value of the column 'reservation_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReservationDate(java.time.LocalDate reservationDate) {
        registerModifiedProperty("reservationDate");
        _reservationDate = reservationDate;
    }

    /**
     * [get] reservation_time: {time(15, 6)} <br>
     * @return The value of the column 'reservation_time'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalTime getReservationTime() {
        checkSpecifiedProperty("reservationTime");
        return _reservationTime;
    }

    /**
     * [set] reservation_time: {time(15, 6)} <br>
     * @param reservationTime The value of the column 'reservation_time'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReservationTime(java.time.LocalTime reservationTime) {
        registerModifiedProperty("reservationTime");
        _reservationTime = reservationTime;
    }

    /**
     * [get] user_id: {int4(10), FK to m_user} <br>
     * @return The value of the column 'user_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {int4(10), FK to m_user} <br>
     * @param userId The value of the column 'user_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] total_amount: {int4(10)} <br>
     * @return The value of the column 'total_amount'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTotalAmount() {
        checkSpecifiedProperty("totalAmount");
        return _totalAmount;
    }

    /**
     * [set] total_amount: {int4(10)} <br>
     * @param totalAmount The value of the column 'total_amount'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalAmount(Integer totalAmount) {
        registerModifiedProperty("totalAmount");
        _totalAmount = totalAmount;
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
     * [get] status: {int4(10)} <br>
     * @return The value of the column 'status'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getStatus() {
        checkSpecifiedProperty("status");
        return _status;
    }

    /**
     * [set] status: {int4(10)} <br>
     * @param status The value of the column 'status'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStatus(Integer status) {
        registerModifiedProperty("status");
        _status = status;
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

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
 * The entity of m_working_day as TABLE. <br>
 * <pre>
 * [primary-key]
 *     working_day_id
 *
 * [column]
 *     working_day_id, shop_id, working_date, start_time, end_time, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_working_day_working_day_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     m_shop
 *
 * [referrer table]
 *     t_shift
 *
 * [foreign property]
 *     mShop
 *
 * [referrer property]
 *     tShiftList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer workingDayId = entity.getWorkingDayId();
 * Integer shopId = entity.getShopId();
 * java.time.LocalDate workingDate = entity.getWorkingDate();
 * java.time.LocalTime startTime = entity.getStartTime();
 * java.time.LocalTime endTime = entity.getEndTime();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setWorkingDayId(workingDayId);
 * entity.setShopId(shopId);
 * entity.setWorkingDate(workingDate);
 * entity.setStartTime(startTime);
 * entity.setEndTime(endTime);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMWorkingDay extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** working_day_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _workingDayId;

    /** shop_id: {int4(10), FK to m_shop} */
    protected Integer _shopId;

    /** working_date: {date(13)} */
    protected java.time.LocalDate _workingDate;

    /** start_time: {time(15, 6)} */
    protected java.time.LocalTime _startTime;

    /** end_time: {time(15, 6)} */
    protected java.time.LocalTime _endTime;

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
        return "m_working_day";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_workingDayId == null) { return false; }
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

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** t_shift by working_day_id, named 'TShiftList'. */
    protected List<TShift> _tShiftList;

    /**
     * [get] t_shift by working_day_id, named 'TShiftList'.
     * @return The entity list of referrer property 'TShiftList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShift> getTShiftList() {
        if (_tShiftList == null) { _tShiftList = newReferrerList(); }
        return _tShiftList;
    }

    /**
     * [set] t_shift by working_day_id, named 'TShiftList'.
     * @param tShiftList The entity list of referrer property 'TShiftList'. (NullAllowed)
     */
    public void setTShiftList(List<TShift> tShiftList) {
        _tShiftList = tShiftList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMWorkingDay) {
            BsMWorkingDay other = (BsMWorkingDay)obj;
            if (!xSV(_workingDayId, other._workingDayId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _workingDayId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mShop != null && _mShop.isPresent())
        { sb.append(li).append(xbRDS(_mShop, "mShop")); }
        if (_tShiftList != null) { for (TShift et : _tShiftList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShiftList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_workingDayId));
        sb.append(dm).append(xfND(_shopId));
        sb.append(dm).append(xfND(_workingDate));
        sb.append(dm).append(xfND(_startTime));
        sb.append(dm).append(xfND(_endTime));
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
        if (_tShiftList != null && !_tShiftList.isEmpty())
        { sb.append(dm).append("tShiftList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MWorkingDay clone() {
        return (MWorkingDay)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] working_day_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'working_day_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getWorkingDayId() {
        checkSpecifiedProperty("workingDayId");
        return _workingDayId;
    }

    /**
     * [set] working_day_id: {PK, ID, NotNull, serial(10)} <br>
     * @param workingDayId The value of the column 'working_day_id'. (basically NotNull if update: for the constraint)
     */
    public void setWorkingDayId(Integer workingDayId) {
        registerModifiedProperty("workingDayId");
        _workingDayId = workingDayId;
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
     * [get] working_date: {date(13)} <br>
     * @return The value of the column 'working_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getWorkingDate() {
        checkSpecifiedProperty("workingDate");
        return _workingDate;
    }

    /**
     * [set] working_date: {date(13)} <br>
     * @param workingDate The value of the column 'working_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkingDate(java.time.LocalDate workingDate) {
        registerModifiedProperty("workingDate");
        _workingDate = workingDate;
    }

    /**
     * [get] start_time: {time(15, 6)} <br>
     * @return The value of the column 'start_time'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalTime getStartTime() {
        checkSpecifiedProperty("startTime");
        return _startTime;
    }

    /**
     * [set] start_time: {time(15, 6)} <br>
     * @param startTime The value of the column 'start_time'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStartTime(java.time.LocalTime startTime) {
        registerModifiedProperty("startTime");
        _startTime = startTime;
    }

    /**
     * [get] end_time: {time(15, 6)} <br>
     * @return The value of the column 'end_time'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalTime getEndTime() {
        checkSpecifiedProperty("endTime");
        return _endTime;
    }

    /**
     * [set] end_time: {time(15, 6)} <br>
     * @param endTime The value of the column 'end_time'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEndTime(java.time.LocalTime endTime) {
        registerModifiedProperty("endTime");
        _endTime = endTime;
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

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
 * The entity of m_working_day_deff as TABLE. <br>
 * <pre>
 * [primary-key]
 *     m_working_day_deff_id
 *
 * [column]
 *     m_working_day_deff_id, shop_id, start_day, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_working_day_deff_m_working_day_deff_id_seq
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer mWorkingDayDeffId = entity.getMWorkingDayDeffId();
 * Integer shopId = entity.getShopId();
 * java.time.LocalDate startDay = entity.getStartDay();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setMWorkingDayDeffId(mWorkingDayDeffId);
 * entity.setShopId(shopId);
 * entity.setStartDay(startDay);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMWorkingDayDeff extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** m_working_day_deff_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _mWorkingDayDeffId;

    /** shop_id: {NotNull, int4(10)} */
    protected Integer _shopId;

    /** start_day: {NotNull, date(13)} */
    protected java.time.LocalDate _startDay;

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
        return "m_working_day_deff";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_mWorkingDayDeffId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMWorkingDayDeff) {
            BsMWorkingDayDeff other = (BsMWorkingDayDeff)obj;
            if (!xSV(_mWorkingDayDeffId, other._mWorkingDayDeffId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _mWorkingDayDeffId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_mWorkingDayDeffId));
        sb.append(dm).append(xfND(_shopId));
        sb.append(dm).append(xfND(_startDay));
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
        return "";
    }

    @Override
    public MWorkingDayDeff clone() {
        return (MWorkingDayDeff)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] m_working_day_deff_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'm_working_day_deff_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMWorkingDayDeffId() {
        checkSpecifiedProperty("MWorkingDayDeffId");
        return _mWorkingDayDeffId;
    }

    /**
     * [set] m_working_day_deff_id: {PK, ID, NotNull, serial(10)} <br>
     * @param mWorkingDayDeffId The value of the column 'm_working_day_deff_id'. (basically NotNull if update: for the constraint)
     */
    public void setMWorkingDayDeffId(Integer mWorkingDayDeffId) {
        registerModifiedProperty("MWorkingDayDeffId");
        _mWorkingDayDeffId = mWorkingDayDeffId;
    }

    /**
     * [get] shop_id: {NotNull, int4(10)} <br>
     * @return The value of the column 'shop_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getShopId() {
        checkSpecifiedProperty("shopId");
        return _shopId;
    }

    /**
     * [set] shop_id: {NotNull, int4(10)} <br>
     * @param shopId The value of the column 'shop_id'. (basically NotNull if update: for the constraint)
     */
    public void setShopId(Integer shopId) {
        registerModifiedProperty("shopId");
        _shopId = shopId;
    }

    /**
     * [get] start_day: {NotNull, date(13)} <br>
     * @return The value of the column 'start_day'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getStartDay() {
        checkSpecifiedProperty("startDay");
        return _startDay;
    }

    /**
     * [set] start_day: {NotNull, date(13)} <br>
     * @param startDay The value of the column 'start_day'. (basically NotNull if update: for the constraint)
     */
    public void setStartDay(java.time.LocalDate startDay) {
        registerModifiedProperty("startDay");
        _startDay = startDay;
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

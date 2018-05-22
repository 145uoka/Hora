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
 * The entity of m_working_day_detail_deff as TABLE. <br>
 * <pre>
 * [primary-key]
 *     working_day_detail_deff_id
 *
 * [column]
 *     working_day_detail_deff_id, m_working_day_deff_id, effective_flag, working_day_flg, week_1_flag, week_2_flag, week_3_flag, week4_flag, week5_flag, mon_flg, tue_flg, web_flg, thu_flg, fri_flg, sat_flg, sun_flg, holiday_flg, day_of_month, specified_day, start_time, end_time, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_working_day_detail_deff_working_day_detail_deff_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     m_working_day_deff
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mWorkingDayDeff
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer workingDayDetailDeffId = entity.getWorkingDayDetailDeffId();
 * Integer mWorkingDayDeffId = entity.getMWorkingDayDeffId();
 * Boolean effectiveFlag = entity.getEffectiveFlag();
 * Boolean workingDayFlg = entity.getWorkingDayFlg();
 * Boolean week1Flag = entity.getWeek1Flag();
 * Boolean week2Flag = entity.getWeek2Flag();
 * Boolean week3Flag = entity.getWeek3Flag();
 * Boolean week4Flag = entity.getWeek4Flag();
 * Boolean week5Flag = entity.getWeek5Flag();
 * Boolean monFlg = entity.getMonFlg();
 * Boolean tueFlg = entity.getTueFlg();
 * Boolean webFlg = entity.getWebFlg();
 * Boolean thuFlg = entity.getThuFlg();
 * Boolean friFlg = entity.getFriFlg();
 * Boolean satFlg = entity.getSatFlg();
 * Boolean sunFlg = entity.getSunFlg();
 * Boolean holidayFlg = entity.getHolidayFlg();
 * Integer dayOfMonth = entity.getDayOfMonth();
 * java.time.LocalDate specifiedDay = entity.getSpecifiedDay();
 * java.time.LocalTime startTime = entity.getStartTime();
 * java.time.LocalTime endTime = entity.getEndTime();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setWorkingDayDetailDeffId(workingDayDetailDeffId);
 * entity.setMWorkingDayDeffId(mWorkingDayDeffId);
 * entity.setEffectiveFlag(effectiveFlag);
 * entity.setWorkingDayFlg(workingDayFlg);
 * entity.setWeek1Flag(week1Flag);
 * entity.setWeek2Flag(week2Flag);
 * entity.setWeek3Flag(week3Flag);
 * entity.setWeek4Flag(week4Flag);
 * entity.setWeek5Flag(week5Flag);
 * entity.setMonFlg(monFlg);
 * entity.setTueFlg(tueFlg);
 * entity.setWebFlg(webFlg);
 * entity.setThuFlg(thuFlg);
 * entity.setFriFlg(friFlg);
 * entity.setSatFlg(satFlg);
 * entity.setSunFlg(sunFlg);
 * entity.setHolidayFlg(holidayFlg);
 * entity.setDayOfMonth(dayOfMonth);
 * entity.setSpecifiedDay(specifiedDay);
 * entity.setStartTime(startTime);
 * entity.setEndTime(endTime);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMWorkingDayDetailDeff extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** working_day_detail_deff_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _workingDayDetailDeffId;

    /** m_working_day_deff_id: {NotNull, int4(10), FK to m_working_day_deff} */
    protected Integer _mWorkingDayDeffId;

    /** effective_flag: {NotNull, bool(1)} */
    protected Boolean _effectiveFlag;

    /** working_day_flg: {NotNull, bool(1)} */
    protected Boolean _workingDayFlg;

    /** week_1_flag: {bool(1)} */
    protected Boolean _week1Flag;

    /** week_2_flag: {bool(1)} */
    protected Boolean _week2Flag;

    /** week_3_flag: {bool(1)} */
    protected Boolean _week3Flag;

    /** week4_flag: {bool(1)} */
    protected Boolean _week4Flag;

    /** week5_flag: {bool(1)} */
    protected Boolean _week5Flag;

    /** mon_flg: {bool(1)} */
    protected Boolean _monFlg;

    /** tue_flg: {bool(1)} */
    protected Boolean _tueFlg;

    /** web_flg: {bool(1)} */
    protected Boolean _webFlg;

    /** thu_flg: {bool(1)} */
    protected Boolean _thuFlg;

    /** fri_flg: {bool(1)} */
    protected Boolean _friFlg;

    /** sat_flg: {bool(1)} */
    protected Boolean _satFlg;

    /** sun_flg: {bool(1)} */
    protected Boolean _sunFlg;

    /** holiday_flg: {bool(1)} */
    protected Boolean _holidayFlg;

    /** day_of_month: {int2(5)} */
    protected Integer _dayOfMonth;

    /** specified_day: {date(13)} */
    protected java.time.LocalDate _specifiedDay;

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
        return "m_working_day_detail_deff";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_workingDayDetailDeffId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** m_working_day_deff by my m_working_day_deff_id, named 'MWorkingDayDeff'. */
    protected OptionalEntity<MWorkingDayDeff> _mWorkingDayDeff;

    /**
     * [get] m_working_day_deff by my m_working_day_deff_id, named 'MWorkingDayDeff'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'MWorkingDayDeff'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MWorkingDayDeff> getMWorkingDayDeff() {
        if (_mWorkingDayDeff == null) { _mWorkingDayDeff = OptionalEntity.relationEmpty(this, "MWorkingDayDeff"); }
        return _mWorkingDayDeff;
    }

    /**
     * [set] m_working_day_deff by my m_working_day_deff_id, named 'MWorkingDayDeff'.
     * @param mWorkingDayDeff The entity of foreign property 'MWorkingDayDeff'. (NullAllowed)
     */
    public void setMWorkingDayDeff(OptionalEntity<MWorkingDayDeff> mWorkingDayDeff) {
        _mWorkingDayDeff = mWorkingDayDeff;
    }

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
        if (obj instanceof BsMWorkingDayDetailDeff) {
            BsMWorkingDayDetailDeff other = (BsMWorkingDayDetailDeff)obj;
            if (!xSV(_workingDayDetailDeffId, other._workingDayDetailDeffId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _workingDayDetailDeffId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mWorkingDayDeff != null && _mWorkingDayDeff.isPresent())
        { sb.append(li).append(xbRDS(_mWorkingDayDeff, "mWorkingDayDeff")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_workingDayDetailDeffId));
        sb.append(dm).append(xfND(_mWorkingDayDeffId));
        sb.append(dm).append(xfND(_effectiveFlag));
        sb.append(dm).append(xfND(_workingDayFlg));
        sb.append(dm).append(xfND(_week1Flag));
        sb.append(dm).append(xfND(_week2Flag));
        sb.append(dm).append(xfND(_week3Flag));
        sb.append(dm).append(xfND(_week4Flag));
        sb.append(dm).append(xfND(_week5Flag));
        sb.append(dm).append(xfND(_monFlg));
        sb.append(dm).append(xfND(_tueFlg));
        sb.append(dm).append(xfND(_webFlg));
        sb.append(dm).append(xfND(_thuFlg));
        sb.append(dm).append(xfND(_friFlg));
        sb.append(dm).append(xfND(_satFlg));
        sb.append(dm).append(xfND(_sunFlg));
        sb.append(dm).append(xfND(_holidayFlg));
        sb.append(dm).append(xfND(_dayOfMonth));
        sb.append(dm).append(xfND(_specifiedDay));
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
        if (_mWorkingDayDeff != null && _mWorkingDayDeff.isPresent())
        { sb.append(dm).append("mWorkingDayDeff"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MWorkingDayDetailDeff clone() {
        return (MWorkingDayDetailDeff)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] working_day_detail_deff_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'working_day_detail_deff_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getWorkingDayDetailDeffId() {
        checkSpecifiedProperty("workingDayDetailDeffId");
        return _workingDayDetailDeffId;
    }

    /**
     * [set] working_day_detail_deff_id: {PK, ID, NotNull, serial(10)} <br>
     * @param workingDayDetailDeffId The value of the column 'working_day_detail_deff_id'. (basically NotNull if update: for the constraint)
     */
    public void setWorkingDayDetailDeffId(Integer workingDayDetailDeffId) {
        registerModifiedProperty("workingDayDetailDeffId");
        _workingDayDetailDeffId = workingDayDetailDeffId;
    }

    /**
     * [get] m_working_day_deff_id: {NotNull, int4(10), FK to m_working_day_deff} <br>
     * @return The value of the column 'm_working_day_deff_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMWorkingDayDeffId() {
        checkSpecifiedProperty("MWorkingDayDeffId");
        return _mWorkingDayDeffId;
    }

    /**
     * [set] m_working_day_deff_id: {NotNull, int4(10), FK to m_working_day_deff} <br>
     * @param mWorkingDayDeffId The value of the column 'm_working_day_deff_id'. (basically NotNull if update: for the constraint)
     */
    public void setMWorkingDayDeffId(Integer mWorkingDayDeffId) {
        registerModifiedProperty("MWorkingDayDeffId");
        _mWorkingDayDeffId = mWorkingDayDeffId;
    }

    /**
     * [get] effective_flag: {NotNull, bool(1)} <br>
     * @return The value of the column 'effective_flag'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getEffectiveFlag() {
        checkSpecifiedProperty("effectiveFlag");
        return _effectiveFlag;
    }

    /**
     * [set] effective_flag: {NotNull, bool(1)} <br>
     * @param effectiveFlag The value of the column 'effective_flag'. (basically NotNull if update: for the constraint)
     */
    public void setEffectiveFlag(Boolean effectiveFlag) {
        registerModifiedProperty("effectiveFlag");
        _effectiveFlag = effectiveFlag;
    }

    /**
     * [get] working_day_flg: {NotNull, bool(1)} <br>
     * @return The value of the column 'working_day_flg'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getWorkingDayFlg() {
        checkSpecifiedProperty("workingDayFlg");
        return _workingDayFlg;
    }

    /**
     * [set] working_day_flg: {NotNull, bool(1)} <br>
     * @param workingDayFlg The value of the column 'working_day_flg'. (basically NotNull if update: for the constraint)
     */
    public void setWorkingDayFlg(Boolean workingDayFlg) {
        registerModifiedProperty("workingDayFlg");
        _workingDayFlg = workingDayFlg;
    }

    /**
     * [get] week_1_flag: {bool(1)} <br>
     * @return The value of the column 'week_1_flag'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getWeek1Flag() {
        checkSpecifiedProperty("week1Flag");
        return _week1Flag;
    }

    /**
     * [set] week_1_flag: {bool(1)} <br>
     * @param week1Flag The value of the column 'week_1_flag'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWeek1Flag(Boolean week1Flag) {
        registerModifiedProperty("week1Flag");
        _week1Flag = week1Flag;
    }

    /**
     * [get] week_2_flag: {bool(1)} <br>
     * @return The value of the column 'week_2_flag'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getWeek2Flag() {
        checkSpecifiedProperty("week2Flag");
        return _week2Flag;
    }

    /**
     * [set] week_2_flag: {bool(1)} <br>
     * @param week2Flag The value of the column 'week_2_flag'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWeek2Flag(Boolean week2Flag) {
        registerModifiedProperty("week2Flag");
        _week2Flag = week2Flag;
    }

    /**
     * [get] week_3_flag: {bool(1)} <br>
     * @return The value of the column 'week_3_flag'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getWeek3Flag() {
        checkSpecifiedProperty("week3Flag");
        return _week3Flag;
    }

    /**
     * [set] week_3_flag: {bool(1)} <br>
     * @param week3Flag The value of the column 'week_3_flag'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWeek3Flag(Boolean week3Flag) {
        registerModifiedProperty("week3Flag");
        _week3Flag = week3Flag;
    }

    /**
     * [get] week4_flag: {bool(1)} <br>
     * @return The value of the column 'week4_flag'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getWeek4Flag() {
        checkSpecifiedProperty("week4Flag");
        return _week4Flag;
    }

    /**
     * [set] week4_flag: {bool(1)} <br>
     * @param week4Flag The value of the column 'week4_flag'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWeek4Flag(Boolean week4Flag) {
        registerModifiedProperty("week4Flag");
        _week4Flag = week4Flag;
    }

    /**
     * [get] week5_flag: {bool(1)} <br>
     * @return The value of the column 'week5_flag'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getWeek5Flag() {
        checkSpecifiedProperty("week5Flag");
        return _week5Flag;
    }

    /**
     * [set] week5_flag: {bool(1)} <br>
     * @param week5Flag The value of the column 'week5_flag'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWeek5Flag(Boolean week5Flag) {
        registerModifiedProperty("week5Flag");
        _week5Flag = week5Flag;
    }

    /**
     * [get] mon_flg: {bool(1)} <br>
     * @return The value of the column 'mon_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getMonFlg() {
        checkSpecifiedProperty("monFlg");
        return _monFlg;
    }

    /**
     * [set] mon_flg: {bool(1)} <br>
     * @param monFlg The value of the column 'mon_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMonFlg(Boolean monFlg) {
        registerModifiedProperty("monFlg");
        _monFlg = monFlg;
    }

    /**
     * [get] tue_flg: {bool(1)} <br>
     * @return The value of the column 'tue_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getTueFlg() {
        checkSpecifiedProperty("tueFlg");
        return _tueFlg;
    }

    /**
     * [set] tue_flg: {bool(1)} <br>
     * @param tueFlg The value of the column 'tue_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTueFlg(Boolean tueFlg) {
        registerModifiedProperty("tueFlg");
        _tueFlg = tueFlg;
    }

    /**
     * [get] web_flg: {bool(1)} <br>
     * @return The value of the column 'web_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getWebFlg() {
        checkSpecifiedProperty("webFlg");
        return _webFlg;
    }

    /**
     * [set] web_flg: {bool(1)} <br>
     * @param webFlg The value of the column 'web_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWebFlg(Boolean webFlg) {
        registerModifiedProperty("webFlg");
        _webFlg = webFlg;
    }

    /**
     * [get] thu_flg: {bool(1)} <br>
     * @return The value of the column 'thu_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getThuFlg() {
        checkSpecifiedProperty("thuFlg");
        return _thuFlg;
    }

    /**
     * [set] thu_flg: {bool(1)} <br>
     * @param thuFlg The value of the column 'thu_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setThuFlg(Boolean thuFlg) {
        registerModifiedProperty("thuFlg");
        _thuFlg = thuFlg;
    }

    /**
     * [get] fri_flg: {bool(1)} <br>
     * @return The value of the column 'fri_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getFriFlg() {
        checkSpecifiedProperty("friFlg");
        return _friFlg;
    }

    /**
     * [set] fri_flg: {bool(1)} <br>
     * @param friFlg The value of the column 'fri_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFriFlg(Boolean friFlg) {
        registerModifiedProperty("friFlg");
        _friFlg = friFlg;
    }

    /**
     * [get] sat_flg: {bool(1)} <br>
     * @return The value of the column 'sat_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getSatFlg() {
        checkSpecifiedProperty("satFlg");
        return _satFlg;
    }

    /**
     * [set] sat_flg: {bool(1)} <br>
     * @param satFlg The value of the column 'sat_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSatFlg(Boolean satFlg) {
        registerModifiedProperty("satFlg");
        _satFlg = satFlg;
    }

    /**
     * [get] sun_flg: {bool(1)} <br>
     * @return The value of the column 'sun_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getSunFlg() {
        checkSpecifiedProperty("sunFlg");
        return _sunFlg;
    }

    /**
     * [set] sun_flg: {bool(1)} <br>
     * @param sunFlg The value of the column 'sun_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSunFlg(Boolean sunFlg) {
        registerModifiedProperty("sunFlg");
        _sunFlg = sunFlg;
    }

    /**
     * [get] holiday_flg: {bool(1)} <br>
     * @return The value of the column 'holiday_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getHolidayFlg() {
        checkSpecifiedProperty("holidayFlg");
        return _holidayFlg;
    }

    /**
     * [set] holiday_flg: {bool(1)} <br>
     * @param holidayFlg The value of the column 'holiday_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHolidayFlg(Boolean holidayFlg) {
        registerModifiedProperty("holidayFlg");
        _holidayFlg = holidayFlg;
    }

    /**
     * [get] day_of_month: {int2(5)} <br>
     * @return The value of the column 'day_of_month'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDayOfMonth() {
        checkSpecifiedProperty("dayOfMonth");
        return _dayOfMonth;
    }

    /**
     * [set] day_of_month: {int2(5)} <br>
     * @param dayOfMonth The value of the column 'day_of_month'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDayOfMonth(Integer dayOfMonth) {
        registerModifiedProperty("dayOfMonth");
        _dayOfMonth = dayOfMonth;
    }

    /**
     * [get] specified_day: {date(13)} <br>
     * @return The value of the column 'specified_day'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getSpecifiedDay() {
        checkSpecifiedProperty("specifiedDay");
        return _specifiedDay;
    }

    /**
     * [set] specified_day: {date(13)} <br>
     * @param specifiedDay The value of the column 'specified_day'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpecifiedDay(java.time.LocalDate specifiedDay) {
        registerModifiedProperty("specifiedDay");
        _specifiedDay = specifiedDay;
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

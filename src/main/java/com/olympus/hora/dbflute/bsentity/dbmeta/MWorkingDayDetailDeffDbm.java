package com.olympus.hora.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.olympus.hora.dbflute.allcommon.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The DB meta of m_working_day_detail_deff. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MWorkingDayDetailDeffDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MWorkingDayDetailDeffDbm _instance = new MWorkingDayDetailDeffDbm();
    private MWorkingDayDetailDeffDbm() {}
    public static MWorkingDayDetailDeffDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getWorkingDayDetailDeffId(), (et, vl) -> ((MWorkingDayDetailDeff)et).setWorkingDayDetailDeffId(cti(vl)), "workingDayDetailDeffId");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getMWorkingDayDeffId(), (et, vl) -> ((MWorkingDayDetailDeff)et).setMWorkingDayDeffId(cti(vl)), "MWorkingDayDeffId");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getEffectiveFlag(), (et, vl) -> ((MWorkingDayDetailDeff)et).setEffectiveFlag((Boolean)vl), "effectiveFlag");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getWorkingDayFlg(), (et, vl) -> ((MWorkingDayDetailDeff)et).setWorkingDayFlg((Boolean)vl), "workingDayFlg");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getWeek1Flag(), (et, vl) -> ((MWorkingDayDetailDeff)et).setWeek1Flag((Boolean)vl), "week1Flag");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getWeek2Flag(), (et, vl) -> ((MWorkingDayDetailDeff)et).setWeek2Flag((Boolean)vl), "week2Flag");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getWeek3Flag(), (et, vl) -> ((MWorkingDayDetailDeff)et).setWeek3Flag((Boolean)vl), "week3Flag");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getWeek4Flag(), (et, vl) -> ((MWorkingDayDetailDeff)et).setWeek4Flag((Boolean)vl), "week4Flag");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getWeek5Flag(), (et, vl) -> ((MWorkingDayDetailDeff)et).setWeek5Flag((Boolean)vl), "week5Flag");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getMonFlg(), (et, vl) -> ((MWorkingDayDetailDeff)et).setMonFlg((Boolean)vl), "monFlg");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getTueFlg(), (et, vl) -> ((MWorkingDayDetailDeff)et).setTueFlg((Boolean)vl), "tueFlg");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getWebFlg(), (et, vl) -> ((MWorkingDayDetailDeff)et).setWebFlg((Boolean)vl), "webFlg");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getThuFlg(), (et, vl) -> ((MWorkingDayDetailDeff)et).setThuFlg((Boolean)vl), "thuFlg");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getFriFlg(), (et, vl) -> ((MWorkingDayDetailDeff)et).setFriFlg((Boolean)vl), "friFlg");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getSatFlg(), (et, vl) -> ((MWorkingDayDetailDeff)et).setSatFlg((Boolean)vl), "satFlg");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getSunFlg(), (et, vl) -> ((MWorkingDayDetailDeff)et).setSunFlg((Boolean)vl), "sunFlg");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getHolidayFlg(), (et, vl) -> ((MWorkingDayDetailDeff)et).setHolidayFlg((Boolean)vl), "holidayFlg");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getDayOfMonth(), (et, vl) -> ((MWorkingDayDetailDeff)et).setDayOfMonth(cti(vl)), "dayOfMonth");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getSpecifiedDay(), (et, vl) -> ((MWorkingDayDetailDeff)et).setSpecifiedDay(ctld(vl)), "specifiedDay");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getStartTime(), (et, vl) -> ((MWorkingDayDetailDeff)et).setStartTime(ctlt(vl)), "startTime");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getEndTime(), (et, vl) -> ((MWorkingDayDetailDeff)et).setEndTime(ctlt(vl)), "endTime");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getDeleteFlag(), (et, vl) -> ((MWorkingDayDetailDeff)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getRegisterDatetime(), (et, vl) -> ((MWorkingDayDetailDeff)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((MWorkingDayDetailDeff)et).getUpdateDatetime(), (et, vl) -> ((MWorkingDayDetailDeff)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_working_day_detail_deff";
    protected final String _tableDispName = "m_working_day_detail_deff";
    protected final String _tablePropertyName = "MWorkingDayDetailDeff";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_working_day_detail_deff", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWorkingDayDetailDeffId = cci("working_day_detail_deff_id", "working_day_detail_deff_id", null, null, Integer.class, "workingDayDetailDeffId", null, true, true, true, "serial", 10, 0, null, "nextval('m_working_day_detail_deff_working_day_detail_deff_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMWorkingDayDeffId = cci("m_working_day_deff_id", "m_working_day_deff_id", null, null, Integer.class, "MWorkingDayDeffId", null, false, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEffectiveFlag = cci("effective_flag", "effective_flag", null, null, Boolean.class, "effectiveFlag", null, false, false, true, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkingDayFlg = cci("working_day_flg", "working_day_flg", null, null, Boolean.class, "workingDayFlg", null, false, false, true, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWeek1Flag = cci("week_1_flag", "week_1_flag", null, null, Boolean.class, "week1Flag", null, false, false, false, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWeek2Flag = cci("week_2_flag", "week_2_flag", null, null, Boolean.class, "week2Flag", null, false, false, false, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWeek3Flag = cci("week_3_flag", "week_3_flag", null, null, Boolean.class, "week3Flag", null, false, false, false, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWeek4Flag = cci("week4_flag", "week4_flag", null, null, Boolean.class, "week4Flag", null, false, false, false, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWeek5Flag = cci("week5_flag", "week5_flag", null, null, Boolean.class, "week5Flag", null, false, false, false, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMonFlg = cci("mon_flg", "mon_flg", null, null, Boolean.class, "monFlg", null, false, false, false, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTueFlg = cci("tue_flg", "tue_flg", null, null, Boolean.class, "tueFlg", null, false, false, false, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWebFlg = cci("web_flg", "web_flg", null, null, Boolean.class, "webFlg", null, false, false, false, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnThuFlg = cci("thu_flg", "thu_flg", null, null, Boolean.class, "thuFlg", null, false, false, false, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFriFlg = cci("fri_flg", "fri_flg", null, null, Boolean.class, "friFlg", null, false, false, false, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSatFlg = cci("sat_flg", "sat_flg", null, null, Boolean.class, "satFlg", null, false, false, false, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSunFlg = cci("sun_flg", "sun_flg", null, null, Boolean.class, "sunFlg", null, false, false, false, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHolidayFlg = cci("holiday_flg", "holiday_flg", null, null, Boolean.class, "holidayFlg", null, false, false, false, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDayOfMonth = cci("day_of_month", "day_of_month", null, null, Integer.class, "dayOfMonth", null, false, false, false, "int2", 5, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpecifiedDay = cci("specified_day", "specified_day", null, null, java.time.LocalDate.class, "specifiedDay", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStartTime = cci("start_time", "start_time", null, null, java.time.LocalTime.class, "startTime", null, false, false, false, "time", 15, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEndTime = cci("end_time", "end_time", null, null, java.time.LocalTime.class, "endTime", null, false, false, false, "time", 15, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * working_day_detail_deff_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkingDayDetailDeffId() { return _columnWorkingDayDetailDeffId; }
    /**
     * m_working_day_deff_id: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMWorkingDayDeffId() { return _columnMWorkingDayDeffId; }
    /**
     * effective_flag: {NotNull, bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEffectiveFlag() { return _columnEffectiveFlag; }
    /**
     * working_day_flg: {NotNull, bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkingDayFlg() { return _columnWorkingDayFlg; }
    /**
     * week_1_flag: {bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWeek1Flag() { return _columnWeek1Flag; }
    /**
     * week_2_flag: {bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWeek2Flag() { return _columnWeek2Flag; }
    /**
     * week_3_flag: {bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWeek3Flag() { return _columnWeek3Flag; }
    /**
     * week4_flag: {bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWeek4Flag() { return _columnWeek4Flag; }
    /**
     * week5_flag: {bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWeek5Flag() { return _columnWeek5Flag; }
    /**
     * mon_flg: {bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMonFlg() { return _columnMonFlg; }
    /**
     * tue_flg: {bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTueFlg() { return _columnTueFlg; }
    /**
     * web_flg: {bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWebFlg() { return _columnWebFlg; }
    /**
     * thu_flg: {bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnThuFlg() { return _columnThuFlg; }
    /**
     * fri_flg: {bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFriFlg() { return _columnFriFlg; }
    /**
     * sat_flg: {bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSatFlg() { return _columnSatFlg; }
    /**
     * sun_flg: {bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSunFlg() { return _columnSunFlg; }
    /**
     * holiday_flg: {bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHolidayFlg() { return _columnHolidayFlg; }
    /**
     * day_of_month: {int2(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDayOfMonth() { return _columnDayOfMonth; }
    /**
     * specified_day: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpecifiedDay() { return _columnSpecifiedDay; }
    /**
     * start_time: {time(15, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStartTime() { return _columnStartTime; }
    /**
     * end_time: {time(15, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEndTime() { return _columnEndTime; }
    /**
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeleteFlag() { return _columnDeleteFlag; }
    /**
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * update_datetime: {timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnWorkingDayDetailDeffId());
        ls.add(columnMWorkingDayDeffId());
        ls.add(columnEffectiveFlag());
        ls.add(columnWorkingDayFlg());
        ls.add(columnWeek1Flag());
        ls.add(columnWeek2Flag());
        ls.add(columnWeek3Flag());
        ls.add(columnWeek4Flag());
        ls.add(columnWeek5Flag());
        ls.add(columnMonFlg());
        ls.add(columnTueFlg());
        ls.add(columnWebFlg());
        ls.add(columnThuFlg());
        ls.add(columnFriFlg());
        ls.add(columnSatFlg());
        ls.add(columnSunFlg());
        ls.add(columnHolidayFlg());
        ls.add(columnDayOfMonth());
        ls.add(columnSpecifiedDay());
        ls.add(columnStartTime());
        ls.add(columnEndTime());
        ls.add(columnDeleteFlag());
        ls.add(columnRegisterDatetime());
        ls.add(columnUpdateDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnWorkingDayDetailDeffId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "m_working_day_detail_deff_working_day_detail_deff_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnUpdateDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.olympus.hora.dbflute.exentity.MWorkingDayDetailDeff"; }
    public String getConditionBeanTypeName() { return "com.olympus.hora.dbflute.cbean.MWorkingDayDetailDeffCB"; }
    public String getBehaviorTypeName() { return "com.olympus.hora.dbflute.exbhv.MWorkingDayDetailDeffBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MWorkingDayDetailDeff> getEntityType() { return MWorkingDayDetailDeff.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MWorkingDayDetailDeff newEntity() { return new MWorkingDayDetailDeff(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MWorkingDayDetailDeff)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MWorkingDayDetailDeff)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

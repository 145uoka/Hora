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
 * The DB meta of m_working_day. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MWorkingDayDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MWorkingDayDbm _instance = new MWorkingDayDbm();
    private MWorkingDayDbm() {}
    public static MWorkingDayDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MWorkingDay)et).getWorkingDayId(), (et, vl) -> ((MWorkingDay)et).setWorkingDayId(cti(vl)), "workingDayId");
        setupEpg(_epgMap, et -> ((MWorkingDay)et).getShopId(), (et, vl) -> ((MWorkingDay)et).setShopId(cti(vl)), "shopId");
        setupEpg(_epgMap, et -> ((MWorkingDay)et).getWorkingDate(), (et, vl) -> ((MWorkingDay)et).setWorkingDate(ctld(vl)), "workingDate");
        setupEpg(_epgMap, et -> ((MWorkingDay)et).getStartTime(), (et, vl) -> ((MWorkingDay)et).setStartTime(ctlt(vl)), "startTime");
        setupEpg(_epgMap, et -> ((MWorkingDay)et).getEndTime(), (et, vl) -> ((MWorkingDay)et).setEndTime(ctlt(vl)), "endTime");
        setupEpg(_epgMap, et -> ((MWorkingDay)et).getDeleteFlag(), (et, vl) -> ((MWorkingDay)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((MWorkingDay)et).getRegisterDatetime(), (et, vl) -> ((MWorkingDay)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((MWorkingDay)et).getUpdateDatetime(), (et, vl) -> ((MWorkingDay)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_working_day";
    protected final String _tableDispName = "m_working_day";
    protected final String _tablePropertyName = "MWorkingDay";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_working_day", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWorkingDayId = cci("working_day_id", "working_day_id", null, null, Integer.class, "workingDayId", null, true, true, true, "serial", 10, 0, null, "nextval('m_working_day_working_day_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShopId = cci("shop_id", "shop_id", null, null, Integer.class, "shopId", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkingDate = cci("working_date", "working_date", null, null, java.time.LocalDate.class, "workingDate", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStartTime = cci("start_time", "start_time", null, null, java.time.LocalTime.class, "startTime", null, false, false, false, "time", 15, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEndTime = cci("end_time", "end_time", null, null, java.time.LocalTime.class, "endTime", null, false, false, false, "time", 15, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * working_day_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkingDayId() { return _columnWorkingDayId; }
    /**
     * shop_id: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShopId() { return _columnShopId; }
    /**
     * working_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkingDate() { return _columnWorkingDate; }
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
        ls.add(columnWorkingDayId());
        ls.add(columnShopId());
        ls.add(columnWorkingDate());
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
    protected UniqueInfo cpui() { return hpcpui(columnWorkingDayId()); }
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
    public String getSequenceName() { return "m_working_day_working_day_id_seq"; }
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
    public String getEntityTypeName() { return "com.olympus.hora.dbflute.exentity.MWorkingDay"; }
    public String getConditionBeanTypeName() { return "com.olympus.hora.dbflute.cbean.MWorkingDayCB"; }
    public String getBehaviorTypeName() { return "com.olympus.hora.dbflute.exbhv.MWorkingDayBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MWorkingDay> getEntityType() { return MWorkingDay.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MWorkingDay newEntity() { return new MWorkingDay(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MWorkingDay)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MWorkingDay)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

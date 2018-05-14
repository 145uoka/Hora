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
 * The DB meta of t_reservation. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TReservationDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TReservationDbm _instance = new TReservationDbm();
    private TReservationDbm() {}
    public static TReservationDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TReservation)et).getReservationId(), (et, vl) -> ((TReservation)et).setReservationId(ctl(vl)), "reservationId");
        setupEpg(_epgMap, et -> ((TReservation)et).getShopId(), (et, vl) -> ((TReservation)et).setShopId(cti(vl)), "shopId");
        setupEpg(_epgMap, et -> ((TReservation)et).getStaffId(), (et, vl) -> ((TReservation)et).setStaffId(cti(vl)), "staffId");
        setupEpg(_epgMap, et -> ((TReservation)et).getHistStaffFamilyName(), (et, vl) -> ((TReservation)et).setHistStaffFamilyName((String)vl), "histStaffFamilyName");
        setupEpg(_epgMap, et -> ((TReservation)et).getHistShopName(), (et, vl) -> ((TReservation)et).setHistShopName((String)vl), "histShopName");
        setupEpg(_epgMap, et -> ((TReservation)et).getHistShopAbbreviatedName(), (et, vl) -> ((TReservation)et).setHistShopAbbreviatedName((String)vl), "histShopAbbreviatedName");
        setupEpg(_epgMap, et -> ((TReservation)et).getHistStaffGivenName(), (et, vl) -> ((TReservation)et).setHistStaffGivenName((String)vl), "histStaffGivenName");
        setupEpg(_epgMap, et -> ((TReservation)et).getReservationDate(), (et, vl) -> ((TReservation)et).setReservationDate(ctld(vl)), "reservationDate");
        setupEpg(_epgMap, et -> ((TReservation)et).getReservationTime(), (et, vl) -> ((TReservation)et).setReservationTime(ctlt(vl)), "reservationTime");
        setupEpg(_epgMap, et -> ((TReservation)et).getUserId(), (et, vl) -> ((TReservation)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((TReservation)et).getTotalAmount(), (et, vl) -> ((TReservation)et).setTotalAmount(cti(vl)), "totalAmount");
        setupEpg(_epgMap, et -> ((TReservation)et).getRemarks(), (et, vl) -> ((TReservation)et).setRemarks((String)vl), "remarks");
        setupEpg(_epgMap, et -> ((TReservation)et).getStatus(), (et, vl) -> ((TReservation)et).setStatus(cti(vl)), "status");
        setupEpg(_epgMap, et -> ((TReservation)et).getDeleteFlag(), (et, vl) -> ((TReservation)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((TReservation)et).getRegisterDatetime(), (et, vl) -> ((TReservation)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((TReservation)et).getUpdateDatetime(), (et, vl) -> ((TReservation)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_reservation";
    protected final String _tableDispName = "t_reservation";
    protected final String _tablePropertyName = "TReservation";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_reservation", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReservationId = cci("reservation_id", "reservation_id", null, null, Long.class, "reservationId", null, true, true, true, "bigserial", 19, 0, null, "nextval('t_reservation_reservation_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShopId = cci("shop_id", "shop_id", null, null, Integer.class, "shopId", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStaffId = cci("staff_id", "staff_id", null, null, Integer.class, "staffId", null, false, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHistStaffFamilyName = cci("hist_staff_family_name", "hist_staff_family_name", null, null, String.class, "histStaffFamilyName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHistShopName = cci("hist_shop_name", "hist_shop_name", null, null, String.class, "histShopName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHistShopAbbreviatedName = cci("hist_shop_abbreviated_name", "hist_shop_abbreviated_name", null, null, String.class, "histShopAbbreviatedName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHistStaffGivenName = cci("hist_staff_given_name", "hist_staff_given_name", null, null, String.class, "histStaffGivenName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReservationDate = cci("reservation_date", "reservation_date", null, null, java.time.LocalDate.class, "reservationDate", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReservationTime = cci("reservation_time", "reservation_time", null, null, java.time.LocalTime.class, "reservationTime", null, false, false, false, "time", 15, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, Integer.class, "userId", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalAmount = cci("total_amount", "total_amount", null, null, Integer.class, "totalAmount", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRemarks = cci("remarks", "remarks", null, null, String.class, "remarks", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStatus = cci("status", "status", null, null, Integer.class, "status", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * reservation_id: {PK, ID, NotNull, bigserial(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReservationId() { return _columnReservationId; }
    /**
     * shop_id: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShopId() { return _columnShopId; }
    /**
     * staff_id: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStaffId() { return _columnStaffId; }
    /**
     * hist_staff_family_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHistStaffFamilyName() { return _columnHistStaffFamilyName; }
    /**
     * hist_shop_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHistShopName() { return _columnHistShopName; }
    /**
     * hist_shop_abbreviated_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHistShopAbbreviatedName() { return _columnHistShopAbbreviatedName; }
    /**
     * hist_staff_given_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHistStaffGivenName() { return _columnHistStaffGivenName; }
    /**
     * reservation_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReservationDate() { return _columnReservationDate; }
    /**
     * reservation_time: {time(15, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReservationTime() { return _columnReservationTime; }
    /**
     * user_id: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * total_amount: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalAmount() { return _columnTotalAmount; }
    /**
     * remarks: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRemarks() { return _columnRemarks; }
    /**
     * status: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatus() { return _columnStatus; }
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
        ls.add(columnReservationId());
        ls.add(columnShopId());
        ls.add(columnStaffId());
        ls.add(columnHistStaffFamilyName());
        ls.add(columnHistShopName());
        ls.add(columnHistShopAbbreviatedName());
        ls.add(columnHistStaffGivenName());
        ls.add(columnReservationDate());
        ls.add(columnReservationTime());
        ls.add(columnUserId());
        ls.add(columnTotalAmount());
        ls.add(columnRemarks());
        ls.add(columnStatus());
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
    protected UniqueInfo cpui() { return hpcpui(columnReservationId()); }
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
    public String getSequenceName() { return "t_reservation_reservation_id_seq"; }
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
    public String getEntityTypeName() { return "com.olympus.hora.dbflute.exentity.TReservation"; }
    public String getConditionBeanTypeName() { return "com.olympus.hora.dbflute.cbean.TReservationCB"; }
    public String getBehaviorTypeName() { return "com.olympus.hora.dbflute.exbhv.TReservationBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TReservation> getEntityType() { return TReservation.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TReservation newEntity() { return new TReservation(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TReservation)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TReservation)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

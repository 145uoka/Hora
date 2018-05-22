package com.olympus.hora.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.olympus.hora.dbflute.allcommon.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The DB meta of m_working_day_deff. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MWorkingDayDeffDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MWorkingDayDeffDbm _instance = new MWorkingDayDeffDbm();
    private MWorkingDayDeffDbm() {}
    public static MWorkingDayDeffDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MWorkingDayDeff)et).getMWorkingDayDeffId(), (et, vl) -> ((MWorkingDayDeff)et).setMWorkingDayDeffId(cti(vl)), "MWorkingDayDeffId");
        setupEpg(_epgMap, et -> ((MWorkingDayDeff)et).getShopId(), (et, vl) -> ((MWorkingDayDeff)et).setShopId(cti(vl)), "shopId");
        setupEpg(_epgMap, et -> ((MWorkingDayDeff)et).getStartDay(), (et, vl) -> ((MWorkingDayDeff)et).setStartDay(ctld(vl)), "startDay");
        setupEpg(_epgMap, et -> ((MWorkingDayDeff)et).getDeleteFlag(), (et, vl) -> ((MWorkingDayDeff)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((MWorkingDayDeff)et).getRegisterDatetime(), (et, vl) -> ((MWorkingDayDeff)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((MWorkingDayDeff)et).getUpdateDatetime(), (et, vl) -> ((MWorkingDayDeff)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MWorkingDayDeff)et).getMShop(), (et, vl) -> ((MWorkingDayDeff)et).setMShop((OptionalEntity<MShop>)vl), "MShop");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_working_day_deff";
    protected final String _tableDispName = "m_working_day_deff";
    protected final String _tablePropertyName = "MWorkingDayDeff";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_working_day_deff", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMWorkingDayDeffId = cci("m_working_day_deff_id", "m_working_day_deff_id", null, null, Integer.class, "MWorkingDayDeffId", null, true, true, true, "serial", 10, 0, null, "nextval('m_working_day_deff_m_working_day_deff_id_seq'::regclass)", false, null, null, null, "MWorkingDayDetailDeffList", null, false);
    protected final ColumnInfo _columnShopId = cci("shop_id", "shop_id", null, null, Integer.class, "shopId", null, false, false, true, "int4", 10, 0, null, null, false, null, null, "MShop", null, null, false);
    protected final ColumnInfo _columnStartDay = cci("start_day", "start_day", null, null, java.time.LocalDate.class, "startDay", null, false, false, true, "date", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * m_working_day_deff_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMWorkingDayDeffId() { return _columnMWorkingDayDeffId; }
    /**
     * shop_id: {NotNull, int4(10), FK to m_shop}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShopId() { return _columnShopId; }
    /**
     * start_day: {NotNull, date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStartDay() { return _columnStartDay; }
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
        ls.add(columnMWorkingDayDeffId());
        ls.add(columnShopId());
        ls.add(columnStartDay());
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
    protected UniqueInfo cpui() { return hpcpui(columnMWorkingDayDeffId()); }
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
    /**
     * m_shop by my shop_id, named 'MShop'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShop() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShopId(), MShopDbm.getInstance().columnShopId());
        return cfi("idx_m_working_day_deff_fk0", "MShop", this, MShopDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "MWorkingDayDeffList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * m_working_day_detail_deff by m_working_day_deff_id, named 'MWorkingDayDetailDeffList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMWorkingDayDetailDeffList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMWorkingDayDeffId(), MWorkingDayDetailDeffDbm.getInstance().columnMWorkingDayDeffId());
        return cri("idx_m_working_day_detail_deff_fk1", "MWorkingDayDetailDeffList", this, MWorkingDayDetailDeffDbm.getInstance(), mp, false, "MWorkingDayDeff");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "m_working_day_deff_m_working_day_deff_id_seq"; }
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
    public String getEntityTypeName() { return "com.olympus.hora.dbflute.exentity.MWorkingDayDeff"; }
    public String getConditionBeanTypeName() { return "com.olympus.hora.dbflute.cbean.MWorkingDayDeffCB"; }
    public String getBehaviorTypeName() { return "com.olympus.hora.dbflute.exbhv.MWorkingDayDeffBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MWorkingDayDeff> getEntityType() { return MWorkingDayDeff.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MWorkingDayDeff newEntity() { return new MWorkingDayDeff(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MWorkingDayDeff)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MWorkingDayDeff)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

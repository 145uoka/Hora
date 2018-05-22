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
 * The DB meta of t_reservation_detail. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TReservationDetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TReservationDetailDbm _instance = new TReservationDetailDbm();
    private TReservationDetailDbm() {}
    public static TReservationDetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TReservationDetail)et).getReservationDetailId(), (et, vl) -> ((TReservationDetail)et).setReservationDetailId(ctl(vl)), "reservationDetailId");
        setupEpg(_epgMap, et -> ((TReservationDetail)et).getReservationId(), (et, vl) -> ((TReservationDetail)et).setReservationId(ctl(vl)), "reservationId");
        setupEpg(_epgMap, et -> ((TReservationDetail)et).getCourseId(), (et, vl) -> ((TReservationDetail)et).setCourseId(cti(vl)), "courseId");
        setupEpg(_epgMap, et -> ((TReservationDetail)et).getHistCourseName(), (et, vl) -> ((TReservationDetail)et).setHistCourseName((String)vl), "histCourseName");
        setupEpg(_epgMap, et -> ((TReservationDetail)et).getDeleteFlag(), (et, vl) -> ((TReservationDetail)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((TReservationDetail)et).getRegisterDatetime(), (et, vl) -> ((TReservationDetail)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((TReservationDetail)et).getUpdateDatetime(), (et, vl) -> ((TReservationDetail)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
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
        setupEfpg(_efpgMap, et -> ((TReservationDetail)et).getMCourse(), (et, vl) -> ((TReservationDetail)et).setMCourse((OptionalEntity<MCourse>)vl), "MCourse");
        setupEfpg(_efpgMap, et -> ((TReservationDetail)et).getTReservation(), (et, vl) -> ((TReservationDetail)et).setTReservation((OptionalEntity<TReservation>)vl), "TReservation");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_reservation_detail";
    protected final String _tableDispName = "t_reservation_detail";
    protected final String _tablePropertyName = "TReservationDetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_reservation_detail", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReservationDetailId = cci("reservation_detail_id", "reservation_detail_id", null, null, Long.class, "reservationDetailId", null, true, true, true, "bigserial", 19, 0, null, "nextval('t_reservation_detail_reservation_detail_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReservationId = cci("reservation_id", "reservation_id", null, null, Long.class, "reservationId", null, false, false, false, "int8", 19, 0, null, null, false, null, null, "TReservation", null, null, false);
    protected final ColumnInfo _columnCourseId = cci("course_id", "course_id", null, null, Integer.class, "courseId", null, false, false, false, "int4", 10, 0, null, null, false, null, null, "MCourse", null, null, false);
    protected final ColumnInfo _columnHistCourseName = cci("hist_course_name", "hist_course_name", null, null, String.class, "histCourseName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * reservation_detail_id: {PK, ID, NotNull, bigserial(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReservationDetailId() { return _columnReservationDetailId; }
    /**
     * reservation_id: {int8(19), FK to t_reservation}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReservationId() { return _columnReservationId; }
    /**
     * course_id: {int4(10), FK to m_course}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCourseId() { return _columnCourseId; }
    /**
     * hist_course_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHistCourseName() { return _columnHistCourseName; }
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
        ls.add(columnReservationDetailId());
        ls.add(columnReservationId());
        ls.add(columnCourseId());
        ls.add(columnHistCourseName());
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
    protected UniqueInfo cpui() { return hpcpui(columnReservationDetailId()); }
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
     * m_course by my course_id, named 'MCourse'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCourse() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCourseId(), MCourseDbm.getInstance().columnCourseId());
        return cfi("idx_t_reservation_detail_fk2", "MCourse", this, MCourseDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "TReservationDetailList", false);
    }
    /**
     * t_reservation by my reservation_id, named 'TReservation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTReservation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReservationId(), TReservationDbm.getInstance().columnReservationId());
        return cfi("idx_t_reservation_detail_fk0", "TReservation", this, TReservationDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "TReservationDetailList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "t_reservation_detail_reservation_detail_id_seq"; }
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
    public String getEntityTypeName() { return "com.olympus.hora.dbflute.exentity.TReservationDetail"; }
    public String getConditionBeanTypeName() { return "com.olympus.hora.dbflute.cbean.TReservationDetailCB"; }
    public String getBehaviorTypeName() { return "com.olympus.hora.dbflute.exbhv.TReservationDetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TReservationDetail> getEntityType() { return TReservationDetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TReservationDetail newEntity() { return new TReservationDetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TReservationDetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TReservationDetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

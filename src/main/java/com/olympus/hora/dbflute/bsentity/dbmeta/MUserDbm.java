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
 * The DB meta of m_user. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MUserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MUserDbm _instance = new MUserDbm();
    private MUserDbm() {}
    public static MUserDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MUser)et).getUserId(), (et, vl) -> ((MUser)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((MUser)et).getFamilyName(), (et, vl) -> ((MUser)et).setFamilyName((String)vl), "familyName");
        setupEpg(_epgMap, et -> ((MUser)et).getGivenName(), (et, vl) -> ((MUser)et).setGivenName((String)vl), "givenName");
        setupEpg(_epgMap, et -> ((MUser)et).getFamilyNameKana(), (et, vl) -> ((MUser)et).setFamilyNameKana((String)vl), "familyNameKana");
        setupEpg(_epgMap, et -> ((MUser)et).getGivenNameKana(), (et, vl) -> ((MUser)et).setGivenNameKana((String)vl), "givenNameKana");
        setupEpg(_epgMap, et -> ((MUser)et).getSex(), (et, vl) -> ((MUser)et).setSex(cti(vl)), "sex");
        setupEpg(_epgMap, et -> ((MUser)et).getBirthday(), (et, vl) -> ((MUser)et).setBirthday(ctld(vl)), "birthday");
        setupEpg(_epgMap, et -> ((MUser)et).getPhoneFirst1(), (et, vl) -> ((MUser)et).setPhoneFirst1((String)vl), "phoneFirst1");
        setupEpg(_epgMap, et -> ((MUser)et).getPhoneFirst2(), (et, vl) -> ((MUser)et).setPhoneFirst2((String)vl), "phoneFirst2");
        setupEpg(_epgMap, et -> ((MUser)et).getPhoneFirst3(), (et, vl) -> ((MUser)et).setPhoneFirst3((String)vl), "phoneFirst3");
        setupEpg(_epgMap, et -> ((MUser)et).getPhoneSecond1(), (et, vl) -> ((MUser)et).setPhoneSecond1((String)vl), "phoneSecond1");
        setupEpg(_epgMap, et -> ((MUser)et).getPhoneSecond2(), (et, vl) -> ((MUser)et).setPhoneSecond2((String)vl), "phoneSecond2");
        setupEpg(_epgMap, et -> ((MUser)et).getPhoneSecond3(), (et, vl) -> ((MUser)et).setPhoneSecond3((String)vl), "phoneSecond3");
        setupEpg(_epgMap, et -> ((MUser)et).getEmail1(), (et, vl) -> ((MUser)et).setEmail1((String)vl), "email1");
        setupEpg(_epgMap, et -> ((MUser)et).getEmail2(), (et, vl) -> ((MUser)et).setEmail2((String)vl), "email2");
        setupEpg(_epgMap, et -> ((MUser)et).getPostalCode(), (et, vl) -> ((MUser)et).setPostalCode((String)vl), "postalCode");
        setupEpg(_epgMap, et -> ((MUser)et).getPrefecture(), (et, vl) -> ((MUser)et).setPrefecture(cti(vl)), "prefecture");
        setupEpg(_epgMap, et -> ((MUser)et).getCity(), (et, vl) -> ((MUser)et).setCity((String)vl), "city");
        setupEpg(_epgMap, et -> ((MUser)et).getAddress1(), (et, vl) -> ((MUser)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((MUser)et).getAddress2(), (et, vl) -> ((MUser)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((MUser)et).getRemarks(), (et, vl) -> ((MUser)et).setRemarks((String)vl), "remarks");
        setupEpg(_epgMap, et -> ((MUser)et).getDeleteFlag(), (et, vl) -> ((MUser)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((MUser)et).getRegisterDatetime(), (et, vl) -> ((MUser)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((MUser)et).getUpdateDatetime(), (et, vl) -> ((MUser)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_user";
    protected final String _tableDispName = "m_user";
    protected final String _tablePropertyName = "MUser";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_user", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, Integer.class, "userId", null, true, true, true, "serial", 10, 0, null, "nextval('m_user_user_id_seq'::regclass)", false, null, null, null, "TReservationList", null, false);
    protected final ColumnInfo _columnFamilyName = cci("family_name", "family_name", null, null, String.class, "familyName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGivenName = cci("given_name", "given_name", null, null, String.class, "givenName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFamilyNameKana = cci("family_name_kana", "family_name_kana", null, null, String.class, "familyNameKana", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGivenNameKana = cci("given_name_kana", "given_name_kana", null, null, String.class, "givenNameKana", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSex = cci("sex", "sex", null, null, Integer.class, "sex", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBirthday = cci("birthday", "birthday", null, null, java.time.LocalDate.class, "birthday", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhoneFirst1 = cci("phone_first1", "phone_first1", null, null, String.class, "phoneFirst1", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhoneFirst2 = cci("phone_first2", "phone_first2", null, null, String.class, "phoneFirst2", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhoneFirst3 = cci("phone_first3", "phone_first3", null, null, String.class, "phoneFirst3", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhoneSecond1 = cci("phone_second1", "phone_second1", null, null, String.class, "phoneSecond1", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhoneSecond2 = cci("phone_second2", "phone_second2", null, null, String.class, "phoneSecond2", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhoneSecond3 = cci("phone_second3", "phone_second3", null, null, String.class, "phoneSecond3", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmail1 = cci("email1", "email1", null, null, String.class, "email1", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmail2 = cci("email2", "email2", null, null, String.class, "email2", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPostalCode = cci("postal_code", "postal_code", null, null, String.class, "postalCode", null, false, false, false, "bpchar", 7, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrefecture = cci("prefecture", "prefecture", null, null, Integer.class, "prefecture", null, false, false, false, "int2", 5, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCity = cci("city", "city", null, null, String.class, "city", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress1 = cci("address1", "address1", null, null, String.class, "address1", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress2 = cci("address2", "address2", null, null, String.class, "address2", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRemarks = cci("remarks", "remarks", null, null, String.class, "remarks", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * user_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * family_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFamilyName() { return _columnFamilyName; }
    /**
     * given_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGivenName() { return _columnGivenName; }
    /**
     * family_name_kana: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFamilyNameKana() { return _columnFamilyNameKana; }
    /**
     * given_name_kana: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGivenNameKana() { return _columnGivenNameKana; }
    /**
     * sex: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSex() { return _columnSex; }
    /**
     * birthday: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthday() { return _columnBirthday; }
    /**
     * phone_first1: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhoneFirst1() { return _columnPhoneFirst1; }
    /**
     * phone_first2: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhoneFirst2() { return _columnPhoneFirst2; }
    /**
     * phone_first3: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhoneFirst3() { return _columnPhoneFirst3; }
    /**
     * phone_second1: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhoneSecond1() { return _columnPhoneSecond1; }
    /**
     * phone_second2: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhoneSecond2() { return _columnPhoneSecond2; }
    /**
     * phone_second3: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhoneSecond3() { return _columnPhoneSecond3; }
    /**
     * email1: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmail1() { return _columnEmail1; }
    /**
     * email2: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmail2() { return _columnEmail2; }
    /**
     * postal_code: {bpchar(7)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPostalCode() { return _columnPostalCode; }
    /**
     * prefecture: {int2(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrefecture() { return _columnPrefecture; }
    /**
     * city: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCity() { return _columnCity; }
    /**
     * address1: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress1() { return _columnAddress1; }
    /**
     * address2: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress2() { return _columnAddress2; }
    /**
     * remarks: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRemarks() { return _columnRemarks; }
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
        ls.add(columnUserId());
        ls.add(columnFamilyName());
        ls.add(columnGivenName());
        ls.add(columnFamilyNameKana());
        ls.add(columnGivenNameKana());
        ls.add(columnSex());
        ls.add(columnBirthday());
        ls.add(columnPhoneFirst1());
        ls.add(columnPhoneFirst2());
        ls.add(columnPhoneFirst3());
        ls.add(columnPhoneSecond1());
        ls.add(columnPhoneSecond2());
        ls.add(columnPhoneSecond3());
        ls.add(columnEmail1());
        ls.add(columnEmail2());
        ls.add(columnPostalCode());
        ls.add(columnPrefecture());
        ls.add(columnCity());
        ls.add(columnAddress1());
        ls.add(columnAddress2());
        ls.add(columnRemarks());
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
    protected UniqueInfo cpui() { return hpcpui(columnUserId()); }
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
    /**
     * t_reservation by user_id, named 'TReservationList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReservationList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TReservationDbm.getInstance().columnUserId());
        return cri("idx_t_reservation_fk0", "TReservationList", this, TReservationDbm.getInstance(), mp, false, "MUser");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "m_user_user_id_seq"; }
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
    public String getEntityTypeName() { return "com.olympus.hora.dbflute.exentity.MUser"; }
    public String getConditionBeanTypeName() { return "com.olympus.hora.dbflute.cbean.MUserCB"; }
    public String getBehaviorTypeName() { return "com.olympus.hora.dbflute.exbhv.MUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MUser> getEntityType() { return MUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MUser newEntity() { return new MUser(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MUser)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MUser)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

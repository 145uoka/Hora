package com.olympus.hora.dbflute.cbean.nss;

import com.olympus.hora.dbflute.cbean.cq.TShiftCQ;

/**
 * The nest select set-upper of t_shift.
 * @author DBFlute(AutoGenerator)
 */
public class TShiftNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TShiftCQ _query;
    public TShiftNss(TShiftCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_staff by my staff_id, named 'MStaff'.
     */
    public void withMStaff() {
        _query.xdoNss(() -> _query.queryMStaff());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_working_day by my working_day_id, named 'MWorkingDay'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MWorkingDayNss withMWorkingDay() {
        _query.xdoNss(() -> _query.queryMWorkingDay());
        return new MWorkingDayNss(_query.queryMWorkingDay());
    }
}

package com.olympus.hora.dbflute.cbean.nss;

import com.olympus.hora.dbflute.cbean.cq.MWorkingDayDetailDeffCQ;

/**
 * The nest select set-upper of m_working_day_detail_deff.
 * @author DBFlute(AutoGenerator)
 */
public class MWorkingDayDetailDeffNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MWorkingDayDetailDeffCQ _query;
    public MWorkingDayDetailDeffNss(MWorkingDayDetailDeffCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_working_day_deff by my m_working_day_deff_id, named 'MWorkingDayDeff'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MWorkingDayDeffNss withMWorkingDayDeff() {
        _query.xdoNss(() -> _query.queryMWorkingDayDeff());
        return new MWorkingDayDeffNss(_query.queryMWorkingDayDeff());
    }
}

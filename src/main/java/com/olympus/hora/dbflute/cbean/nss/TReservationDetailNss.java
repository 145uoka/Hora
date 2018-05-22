package com.olympus.hora.dbflute.cbean.nss;

import com.olympus.hora.dbflute.cbean.cq.TReservationDetailCQ;

/**
 * The nest select set-upper of t_reservation_detail.
 * @author DBFlute(AutoGenerator)
 */
public class TReservationDetailNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TReservationDetailCQ _query;
    public TReservationDetailNss(TReservationDetailCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_course by my course_id, named 'MCourse'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCourseNss withMCourse() {
        _query.xdoNss(() -> _query.queryMCourse());
        return new MCourseNss(_query.queryMCourse());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_reservation by my reservation_id, named 'TReservation'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TReservationNss withTReservation() {
        _query.xdoNss(() -> _query.queryTReservation());
        return new TReservationNss(_query.queryTReservation());
    }
}

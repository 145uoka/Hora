package com.olympus.hora.dbflute.cbean.nss;

import com.olympus.hora.dbflute.cbean.cq.MCourseCQ;

/**
 * The nest select set-upper of m_course.
 * @author DBFlute(AutoGenerator)
 */
public class MCourseNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCourseCQ _query;
    public MCourseNss(MCourseCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_course_group by my course_group_id, named 'MCourseGroup'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCourseGroupNss withMCourseGroup() {
        _query.xdoNss(() -> _query.queryMCourseGroup());
        return new MCourseGroupNss(_query.queryMCourseGroup());
    }
}

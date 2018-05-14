package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The referrer loader of m_company as TABLE. <br>
 * <pre>
 * [primary key]
 *     company_id
 *
 * [column]
 *     company_id, company_name, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_company_company_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCompany {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCompany> _selectedList;
    protected BehaviorSelector _selector;
    protected MCompanyBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCompany ready(List<MCompany> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCompanyBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCompanyBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCompany> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The referrer loader of m_code as TABLE. <br>
 * <pre>
 * [primary key]
 *     code_id
 *
 * [column]
 *     code_id, group_code, code1, code2, name, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_code_code_id_seq
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
public class LoaderOfMCode {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCode> _selectedList;
    protected BehaviorSelector _selector;
    protected MCodeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCode ready(List<MCode> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCodeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCodeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCode> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

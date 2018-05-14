package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The referrer loader of m_user as TABLE. <br>
 * <pre>
 * [primary key]
 *     user_id
 *
 * [column]
 *     user_id, family_name, given_name, family_name_kana, given_name_kana, sex, birthday, phone_first1, phone_first2, phone_first3, phone_second1, phone_second2, phone_second3, email1, email2, postal_code, prefecture, city, address1, address2, remarks, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_user_user_id_seq
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
public class LoaderOfMUser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MUser> _selectedList;
    protected BehaviorSelector _selector;
    protected MUserBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMUser ready(List<MUser> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MUserBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MUserBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MUser> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

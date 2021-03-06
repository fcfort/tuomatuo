package com.lami.tuomatuo.dao.impl;

import com.lami.tuomatuo.base.BaseDaoMysqlImpl;
import com.lami.tuomatuo.dao.UserPropertyDaoInterface;
import com.lami.tuomatuo.dao.WeiXinAccountDaoInterface;
import com.lami.tuomatuo.model.UserProperty;
import com.lami.tuomatuo.model.WeiXinAccount;
import org.springframework.stereotype.Repository;

/**
 * Created by xujiankang on 2016/1/18.
 */
@Repository("weiXinAccountDaoInterface")
public class WeXinAccountDaoImpl extends BaseDaoMysqlImpl<WeiXinAccount, Long> implements WeiXinAccountDaoInterface {
    public WeXinAccountDaoImpl(){
        super(WeiXinAccount.class);
    }
}

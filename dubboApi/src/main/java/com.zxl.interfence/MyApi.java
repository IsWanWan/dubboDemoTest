package com.zxl.interfence;

import com.zxl.common.bean.User;

/**
 * Created by c_zhangyayun-001 on 2018/7/5.
 */
public interface MyApi {
    String HelloWord();

    User getById(String userId);
}

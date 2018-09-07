package com.zxl.service;

import com.zxl.common.bean.User;
import com.zxl.dao.UserMapper;
import com.zxl.interfence.MyApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by c_zhangyayun-001 on 2018/7/5.
 */
@Service
public class MyServiceImpl implements MyApi {
@Autowired
private UserMapper userMapper;
    public String HelloWord() {
        return  "hello  I'm methodHelloWord !!!";
    }

    @Override
    public User getById(String userId) {
      User user =  userMapper.selectByPrimaryKey(userId);
        return user;
    }


}

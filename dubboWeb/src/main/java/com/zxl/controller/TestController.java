package com.zxl.controller;

import com.zxl.common.bean.User;
import com.zxl.common.util.DataBean;
import com.zxl.interfence.MyApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by c_zhangyayun-001 on 2018/7/9.
 */
@Controller
public class TestController {

    @Autowired
    private MyApi myApi;

    @RequestMapping(value = "/test",method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    @ResponseBody
    private  DataBean TestController(String userId){
        System.out.println("userId:" +userId);
        User user = myApi.getById(userId);

        return new DataBean("200","SUCCESS",user);
    }


    @RequestMapping("/index")
    private  String index(){

        System.out.println(myApi.HelloWord());
        return "index";
    }

//   @RequestMapping(value = "/testPost",method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
//    @ResponseBody
//    private  DataBean PostController(@RequestBody User user){
//
//        user.setPassword("11223232");
//        user.setUsername("wanwan");
//
//        return new DataBean("200","SUCCESS",user);
//    }

}

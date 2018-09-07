package com.zxl.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by c_zhangyayun-001 on 2018/7/6.
 */
public class BeginProdiver {
    public  static void main(String args[]) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/provider.xml");
        classPathXmlApplicationContext.start();
        System.out.print("服务提供方开始提供服务");
        System.in.read();

    }
}

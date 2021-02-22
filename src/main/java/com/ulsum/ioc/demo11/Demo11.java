package com.ulsum.ioc.demo11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo11 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext09.xml");
//        UserDao userDao1 = context.getBean("userDao", UserDao.class);
//        UserDao userDao2 = context.getBean("userDao", UserDao.class);
//        UserDao userDao3 = context.getBean("userDao", UserDao.class);
    }

}

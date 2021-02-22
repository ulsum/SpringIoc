package com.ulsum.ioc.demo13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo13 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext11.xml");
//        String[] ids = context.getBeanDefinitionNames();
//        for (String id : ids) {
//            System.out.println(id + " : " + context.getBean(id));
//        }
    }

}

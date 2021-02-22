package com.ulsum.ioc.demo12;

import com.ulsum.ioc.entity.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo12 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext10.xml");
        Order order1 = context.getBean("order1", Order.class);
        order1.pay();
        // 释放资源
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }

}

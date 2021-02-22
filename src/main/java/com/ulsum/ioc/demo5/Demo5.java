package com.ulsum.ioc.demo5;

import com.ulsum.ioc.entity.Apple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo5 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext04.xml");
        Apple apple1 = context.getBean("apple1", Apple.class);
        System.out.println(apple1.getTitle());
        Apple apple2 = (Apple) context.getBean("apple2");
        System.out.println(apple2.getTitle());
    }

}

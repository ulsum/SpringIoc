package com.ulsum.ioc.demo8;

import com.ulsum.ioc.entity.Child;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo8 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext07.xml");
        Child andy = context.getBean("andy", Child.class);
        andy.eat();
    }

}

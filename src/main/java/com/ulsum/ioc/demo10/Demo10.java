package com.ulsum.ioc.demo10;

import com.ulsum.ioc.entity.Computer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo10 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext08.xml");
        // 获取容器内所有beanId数组
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
            System.out.println(context.getBean(beanName).getClass().getName());
        }
        Computer c0 = context.getBean("com.ulsum.ioc.entity.Computer", Computer.class);
        System.out.println(c0.getPrice());
        Computer c1 = context.getBean("com.ulsum.ioc.entity.Computer#1", Computer.class);
        System.out.println(c1.getPrice());
    }

}

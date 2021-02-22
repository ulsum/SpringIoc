package com.ulsum.ioc.demo2;

import com.ulsum.ioc.entity.Apple;
import com.ulsum.ioc.entity.Child;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {

    public static void main(String[] args) {
        // 创建IoC容器，并根据配置文件在容器中实例化对象
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext01.xml");
        Apple sweetApple = context.getBean("sweetApple", Apple.class);
        System.out.println(sweetApple.getTitle());
        // 从IoC容器中提取beanId=lily的对象
        Child lily = context.getBean("lily", Child.class);
        lily.eat();
        Child andy = context.getBean("andy", Child.class);
        andy.eat();
        Child luna = context.getBean("luna", Child.class);
        luna.eat();
    }

}

package com.ulsum.ioc.demo14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo14 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext11.xml");
        DepartmentService departmentService = context.getBean("departmentService", DepartmentService.class);
        departmentService.joinDepartment();
    }

}

package com.ulsum.ioc.demo9;

import com.ulsum.ioc.entity.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo9 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext08.xml");
        Company company = context.getBean("company", Company.class);
        System.out.println(company);
        System.out.println(company.getInfo().getProperty("address"));
    }

}

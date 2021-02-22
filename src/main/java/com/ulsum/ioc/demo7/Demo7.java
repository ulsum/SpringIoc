package com.ulsum.ioc.demo7;

import com.ulsum.ioc.demo7.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo7 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext06-*.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.purchase();
    }

}

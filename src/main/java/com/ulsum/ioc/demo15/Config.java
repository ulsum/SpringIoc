package com.ulsum.ioc.demo15;

import com.ulsum.ioc.demo15.controller.UserController;
import com.ulsum.ioc.demo15.dao.UserDao;
import com.ulsum.ioc.demo15.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.ulsum")
@Configuration      // 当前类是一个配置类，用于替代applicationContext.xml
public class Config {

    // Java Config利用方法创建对象，将方法返回对象放入容器，beanId=方法名
    @Bean
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        System.out.println("已创建UserDao" + userDao);
        return userDao;
    }

    @Bean
    public UserService userService(UserDao userDao) {
        UserService userService = new UserService();
        userService.setUserDao(userDao);
        System.out.println("已创建UserService" + userService);
        return userService;
    }

    @Bean
    public UserController userController(UserService userService) {
        UserController userController = new UserController();
        userController.setUserService(userService);
        System.out.println("已创建UserController" + userController);
        return userController;
    }

}

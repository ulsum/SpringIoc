package com.ulsum.ioc.demo13.dao;

import org.springframework.stereotype.Repository;

// 组件类型注解默认beanId为类名首字母小写，当前类为userDao，也可以通过@Repository("XXX")进行重写
@Repository
public class UserDao implements IUserDao {

    public UserDao() {
        System.out.println("正在创建UserDao：" + this);
    }

}

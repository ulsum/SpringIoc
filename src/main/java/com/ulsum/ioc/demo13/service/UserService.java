package com.ulsum.ioc.demo13.service;

import com.ulsum.ioc.demo13.dao.IUserDao;
import com.ulsum.ioc.demo13.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Scope("prototype")     // 设置单例或多例，XML中bean scope完全相同
public class UserService {

    // Spring IoC容器会自动通过反射技术将属性private修饰符自动改为public，直接进行赋值，不再执行set方法，所以set方法可以省略
    // 当UserDao与UserOracleDao同时实现IUerDao时，Spring无法区分赋值UserDao或者UserOracleDao，可以增加@Primary注解优先匹配
    @Autowired
    private IUserDao uDao;

    @Value("${metaData}")
    private String metaData;

    public UserService() {
        System.out.println("正在创建UserService：" + this);
    }

    public UserService(UserDao uDao) {
        this.uDao = uDao;
    }

    @PostConstruct      // XML中bean init-method完全相同
    public void init(){
        System.out.println("初始化UserService对象");
    }

    public IUserDao getUserDao() {
        return uDao;
    }

    // 如果装配注解放在set方法上，则自动按类型、名称对set方法参数进行注入
//    @Autowired
//    public void setIUserDao(IUserDao userDao) {
//        System.out.println("setIUserDao" + userDao);
//        this.userDao = userDao;
//    }

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + uDao +
                '}';
    }

}

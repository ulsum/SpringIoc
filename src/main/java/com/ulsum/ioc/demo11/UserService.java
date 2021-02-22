package com.ulsum.ioc.demo11;

public class UserService {

    private UserDao userDao;

    public UserService() {
        System.out.println("UserService已创建" + this);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        System.out.println("调用setUserDao方法" + userDao);
        this.userDao = userDao;
    }

}

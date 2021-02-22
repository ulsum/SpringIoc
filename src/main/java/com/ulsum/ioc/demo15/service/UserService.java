package com.ulsum.ioc.demo15.service;

import com.ulsum.ioc.demo15.dao.UserDao;

public class UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}

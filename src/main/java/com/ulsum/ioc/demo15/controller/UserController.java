package com.ulsum.ioc.demo15.controller;

import com.ulsum.ioc.demo15.service.UserService;

public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}

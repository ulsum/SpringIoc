package com.ulsum.ioc.demo16;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

// 将JUnit4的执行权交由Spring Test，在测试用例执行前自动初始化IoC容器
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext12.xml"})
public class SpringTester {

    @Resource
    private UserService userService;

    @Test
    public void testUserService(){
        userService.createUser();
    }

}

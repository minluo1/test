package com.test.my;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.my.model.User;
import com.test.my.service.UserService;

public class UserTest {

    private UserService userService;

    @Before
    public void before() {
        @SuppressWarnings("resource")
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"classpath:conf/spring.xml",
                        "classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setNickname("hello");
        user.setState(2);
        System.out.println(userService.insertUser(user));
    }
}

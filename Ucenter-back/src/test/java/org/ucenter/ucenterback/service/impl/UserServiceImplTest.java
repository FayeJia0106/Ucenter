package org.ucenter.ucenterback.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.ucenter.ucenterback.service.UserService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    void userRegisterTest(){
        String username = "test";
        String password = "test1234";
        String email = "test@test.com";
        String phone = "123456789";
        String checkPassword = "test1234";

        long result=userService.userRegister(username,password,checkPassword,phone,email);

        Assertions.assertEquals(result,-5);

    }
}
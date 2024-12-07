package org.ucenter.ucenterback.service;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.ucenter.ucenterback.model.User;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testInsertUser(){
        User user = User.builder()
                .id("234")
                .username("234")
                .avatarUrl("https://example.com/avatar.png")
                .gender(2)
                .password("temppassword")
                .phone("234")
                .email("tempuser234@example.com")
                .isValid(true)
                .isAdmin(false)
                .build();


        userService.createUser(user);
        System.out.println(user.getId());
        Assertions.assertNotNull(user.getId());
        Assertions.assertEquals("234", user.getUsername());
    }


}
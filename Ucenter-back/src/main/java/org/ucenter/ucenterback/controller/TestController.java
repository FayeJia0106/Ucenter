package org.ucenter.ucenterback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ucenter.ucenterback.mapper.UserMapper;
import org.ucenter.ucenterback.model.User;

import java.util.UUID;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping("/insertUser")
    public String insertUser() {
        // 使用构建器模式创建用户对象
//        User user = User.builder()
//                .id(UUID.randomUUID().toString())
//                .username("tempuser")
//                .avatarUrl("https://example.com/avatar.png")
//                .gender(2)
//                .password("temppassword")
//                .phone("0987654321")
//                .email("tempuser@example.com")
//                .isValid(true)
//                .isAdmin(false)
//                .build();
//
//        // 插入数据
//        int rowsAffected = userMapper.insert(user);
        return "null";
    }
}


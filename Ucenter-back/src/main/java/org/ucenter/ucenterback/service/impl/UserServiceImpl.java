package org.ucenter.ucenterback.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ucenter.ucenterback.mapper.UserMapper;
import org.ucenter.ucenterback.model.User;
import org.ucenter.ucenterback.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.findAll();
    }

    @Override
    public User getUserById(String id) {
        return userMapper.findById(id);
    }

    @Override
    public void createUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void deleteUser(String id) {
        userMapper.deleteById(id);
    }
}

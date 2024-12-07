package org.ucenter.ucenterback.service;

import org.ucenter.ucenterback.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(String id);
    void createUser(User user);
    void deleteUser(String id);
}

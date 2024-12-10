package org.ucenter.ucenterback.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.ucenter.ucenterback.model.User;

import java.util.List;

public interface UserService extends IService<User> {

    long userRegister(String username, String password, String checkPassword, String phone, String email);
}

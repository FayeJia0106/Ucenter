package org.ucenter.ucenterback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ucenter.ucenterback.mapper.UserMapper;
import org.ucenter.ucenterback.model.User;
import org.ucenter.ucenterback.service.UserService;
import org.ucenter.ucenterback.utils.PasswordUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    private PasswordUtils passwordUtils;
    @Autowired
    private UserMapper userMapper;

    @Override
    public long userRegister(String username, String password, String checkPassword, String phone, String email) {
        if(username==null||password==null || checkPassword==null || phone==null || email==null){
            return -1;
        }


        if(username!=null && username.length()<4){
            return -2;
        }

        if(password.length()<8||checkPassword.length()<8){
            return -3;
        }

        String regex = "^[a-zA-Z0-9_]+$";
        Matcher matcher=Pattern.compile(regex).matcher(username);
        if (!matcher.find()) {
            return (long) -4;
        }

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("phone", phone)
                .eq("email", email)
                .eq("username", username);

        long count = this.count(queryWrapper);

        if(count>0){
            return -5;
        }

        String encodedPassword = passwordUtils.encryptPassword(password);

        User newUser = User.builder()
                .username(username)
                .avatarUrl("https://example.com/avatar.png")
                .gender(2)
                .password(encodedPassword)
                .phone(phone)
                .email(email)
                .isValid(true)
                .isAdmin(false)
                .isDeleted(false)
                .build();

        this.save(newUser);
        return newUser.getId();
    }

}

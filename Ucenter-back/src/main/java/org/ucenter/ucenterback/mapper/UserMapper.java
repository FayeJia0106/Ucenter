package org.ucenter.ucenterback.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.ucenter.ucenterback.model.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    // 查询所有未被删除的用户
    List<User> findAll();

    // 根据 ID 查询未被删除的用户
    User findById(Long id);

    // 根据用户名查询未被删除的用户
    User findByUsername(String username);

    // 插入用户
    int insert(User user);

    // 更新用户信息
    void update(User user);

    // 逻辑删除用户
    void deleteById(long id);
}


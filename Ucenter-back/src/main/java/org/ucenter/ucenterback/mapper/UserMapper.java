package org.ucenter.ucenterback.mapper;

import org.apache.ibatis.annotations.*;
import org.ucenter.ucenterback.model.User;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM user WHERE isDeleted = FALSE")
    List<User> findAll();

    @Select("SELECT * FROM user WHERE id = #{id} AND isDeleted = FALSE")
    User findById(String id);

    @Select("SELECT * FROM user WHERE username = #{username} AND isDeleted = FALSE")
    User findByUsername(String username);

    @Insert("INSERT INTO user (id, username, avatarUrl, gender, password, phone, email, isValid, isAdmin, createTime, updateTime, isDeleted) " +
            "VALUES (#{id}, #{username}, #{avatarUrl}, #{gender}, #{password}, #{phone}, #{email}, #{isValid}, #{isAdmin}, #{createTime}, #{updateTime}, #{isDeleted})")
    int insert(User user);

    @Update("UPDATE user SET " +
            "username = #{username}, " +
            "avatarUrl = #{avatarUrl}, " +
            "gender = #{gender}, " +
            "password = #{password}, " +
            "phone = #{phone}, " +
            "email = #{email}, " +
            "isValid = #{isValid}, " +
            "isAdmin = #{isAdmin}, " +
            "updateTime = CURRENT_TIMESTAMP " +
            "WHERE id = #{id}")
    void update(User user);

    @Update("UPDATE user SET isDeleted = TRUE WHERE id = #{id}")
    void deleteById(String id);
}


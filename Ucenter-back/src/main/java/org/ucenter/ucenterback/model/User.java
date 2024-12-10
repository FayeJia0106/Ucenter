package org.ucenter.ucenterback.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;


import java.time.LocalDateTime;

@Data
@ToString
@Builder
public class User {
    @TableId(type = IdType.ASSIGN_ID) // 使用雪花算法生成全局唯一 ID
    private long id;
    private String username; // 用户名
    private String avatarUrl; // 用户头像 URL
    private Integer gender; // 性别：0-未知，1-男，2-女
    private String password; // 用户密码
    private String phone; // 手机号
    private String email; // 邮箱
    private Boolean isValid; // 账号是否有效
    private Boolean isAdmin; // 是否为管理员
    private LocalDateTime createTime; // 创建时间
    private LocalDateTime updateTime; // 更新时间
    private Boolean isDeleted; // 逻辑删除标志
}

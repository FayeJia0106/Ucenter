package entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@TableName("`user`")
@ToString
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}

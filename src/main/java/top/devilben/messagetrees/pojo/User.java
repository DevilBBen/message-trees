package top.devilben.messagetrees.pojo;

import com.alibaba.fastjson2.annotation.JSONField;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(name = "用户信息",description = "用户信息实体",title = "User")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @JSONField(serialize = false, deserialize = false, name = "username")
    @Schema(required = true, title = "username", name = "username", description = "账户",defaultValue = "miaobenben")
    private String username;

    @JSONField(serialize = false, deserialize = false, name = "password")
    @Schema(required = true, title = "password", name = "password", description = "密码",defaultValue = "123456")
    private String password;

    @JSONField(serialize = false, deserialize = false, name = "email")
    @Schema(required = true, title = "email", name = "email", description = "邮箱",defaultValue = "miaobenben@gmail.com")
    private String email;

    @JSONField(serialize = false, deserialize = false, name = "username")
    @Schema(required = true, title = "phone", name = "phone", description = "手机号",defaultValue = "15346824562")
    private String phone;

    @JSONField(serialize = false, deserialize = false, name = "idCard")
    @Schema(required = true, title = "idCard", name = "idCard", description = "身份证号",defaultValue = "xxxxxxxxxxx")
    private String idCard;

    @JSONField(serialize = false, deserialize = false, name = "gender")
    @Schema(required = true, title = "gender", name = "gender", description = "性别",defaultValue = "男")
    private String gender;

    @JSONField(serialize = false, deserialize = false, name = "description")
    @Schema(required = false, title = "description", name = "description", description = "备注",defaultValue = "123")
    private String description;

    @JSONField(serialize = false, deserialize = false, name = "address")
    @Schema(required = true, title = "address", name = "address", description = "用户地址",defaultValue = "上海市")
    private String address;
}

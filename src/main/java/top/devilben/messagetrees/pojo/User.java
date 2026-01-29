package top.devilben.messagetrees.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(name = "用户信息表",description = "用户信息实体")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonProperty(value = "", required = false)
    @Schema(required = true, title = "username", name = "result", description = "响应码 200--成功 其他Integer--失败")
    private String username;
    private String password;
    private String email;
    private String phone;
    private String avatar;
    private String token;
    private String refreshToken;
    private String address;
}

package top.devilben.messagetrees.controller;

import com.alibaba.fastjson2.JSONObject;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.enums.ParameterStyle;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.devilben.messagetrees.pojo.User;

@RestController
@RequestMapping("body")
@Tag(name = "body参数")
public class BodyController {

    @Operation(summary = "普通body请求")
    @PostMapping("/body")
    public ResponseEntity<JSONObject> body(@RequestBody JSONObject fileResp){
        return ResponseEntity.ok(fileResp);
    }

    @Operation(summary = "普通body请求+Param+Header+Path")
    @Parameters({
            @Parameter(name = "id",description = "文件id",in = ParameterIn.PATH),
            @Parameter(name = "token",description = "请求token",required = true,in = ParameterIn.HEADER),
            @Parameter(name = "name",description = "文件名称",required = true,in=ParameterIn.QUERY)
    })
    @PostMapping("/bodyParamHeaderPath/{id}")
    public ResponseEntity<JSONObject> bodyParamHeaderPath(@PathVariable("id") String id, @RequestHeader("token") String token, @RequestParam("name")String name, @RequestBody JSONObject fileResp){
//        User.setName(fileResp.getName()+",receiveName:"+name+",token:"+token+",pathID:"+id);
        return ResponseEntity.ok(fileResp);
    }

    @Operation(summary = "用户请求")
    @Parameters({
            @Parameter(name = "body",
                    description = "请求对象",
                    required = true,
                    in = ParameterIn.QUERY,
                    style = ParameterStyle.DEEPOBJECT
//                    ,content = @Content(schema = @Schema(implementation = User.class)),
//                    schema = @Schema(implementation = User.class)
                    )
    })

    @ApiResponses(@ApiResponse())
    @PostMapping("/insertUser")
    public ResponseEntity insertUser(@RequestBody User fileResp){
//        User.setName(fileResp.getName()+",receiveName:"+name+",token:"+token+",pathID:"+id);
        return ResponseEntity.ok(fileResp);
    }
}

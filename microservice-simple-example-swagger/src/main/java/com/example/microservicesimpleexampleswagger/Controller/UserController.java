package com.example.microservicesimpleexampleswagger.Controller;

import com.example.microservicesimpleexampleswagger.BeanFactory.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@Api(tags = "用户管理相关接口")
@RequestMapping("/user")
public class UserController {

    @PostMapping("/")
    @ApiOperation(" add a user ")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "用户名",defaultValue = "李四"),
            @ApiImplicitParam(name="address",value = "地址",defaultValue = "深圳",required = true)
    })
    public Map<String,Object> addUser(String username, @RequestParam(required = true) String address){
        Map<String,Object> returnMsg = new HashMap<String,Object>();
        returnMsg.put("returnCode","1");
        returnMsg.put("returnMsg","success");
        returnMsg.put("username",username);
        returnMsg.put("address",address);
        returnMsg.put("id",UUID.randomUUID());
        return returnMsg;
    }

    @GetMapping("/")
    @ApiOperation("get a User by username")
    @ApiImplicitParam(name = "username",value = "用户名",defaultValue = "yugang.nie")
    public User  getUserByUserName(String username){
        User user = User.getInstance();
        user.setUsername(username);
        user.setId(UUID.randomUUID().toString());
        user.setAddress("AnHui AnQing");
        return  user;
    }

}

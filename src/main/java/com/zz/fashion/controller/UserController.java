package com.zz.fashion.controller;

import com.zz.fashion.service.UserService;
import com.zz.fashion.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是Java编写的接口文档" ,value = "接口文档")
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     * @param phone
     * @param password
     * @return
     */
    @ApiOperation(notes = "name/email/phone中的一个键和值和密码键值对",tags = "登录",value = "用户登录接口")
    @PostMapping("login.do")
    public ResultVo login(@ApiParam(value = "name/email/phone中的一个")String phone, String password){
        return userService.findUserByName(phone,password);
    }
}

package com.zz.fashion.controller;

import com.zz.fashion.pojo.User;
import com.zz.fashion.service.UserService;
import com.zz.fashion.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @ApiOperation(notes = "微信/支付宝(全是使用的电话号码登录)中的一个键和值和密码键值对",value = "用户登录接口")
    @PostMapping("login.do")
    public ResultVo login(@ApiParam(value = "微信/支付宝中的一个")String phone, String password){
        return userService.findUserByName(phone,password);
    }

    //注册
    @ApiOperation(notes = "使用手机号注册",value = "用户注册接口")
    @PostMapping("addUser.do")
    public  ResultVo addUser(@ApiParam(value = "phone对应账号，password对应密码")User user){
        return userService.addUser(user);
    }

    //判断该手机号是否注册过用户
    @ApiOperation(notes = "通过输入的手机号判断该手机号是否注册过用户",value = "判断是否为已注册用户接口")
    @PostMapping("IsUser.do")
    public ResultVo IsUser(String phone){
        return userService.IsUser(phone);
    }

    //修改密码
    @ApiOperation(notes = "输入手机号,修改该用户的密码",value = "用户修改密码接口")
    @PostMapping("updatePassword.do")
    public ResultVo updatePassword(User user){
        return userService.updatePassword(user);
    }




}

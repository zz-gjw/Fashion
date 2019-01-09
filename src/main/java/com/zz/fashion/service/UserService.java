package com.zz.fashion.service;

import com.zz.fashion.pojo.User;
import com.zz.fashion.vo.ResultVo;

public interface UserService {

    //登录
    ResultVo findUserByName(String phone, String password);

    //注册
    ResultVo addUser(User user);

    //判断该手机号是否注册过用户
    ResultVo IsUser(String phone);

    //修改密码
    ResultVo updatePassword(User user);

}

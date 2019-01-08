package com.zz.fashion.service;

import com.zz.fashion.vo.ResultVo;

public interface UserService {

    //登录
    ResultVo findUserByName(String phone, String password);

}

package com.zz.fashion.serviceimpl;


import com.zz.fashion.consts.SystemConst;
import com.zz.fashion.dao.UserMapper;
import com.zz.fashion.pojo.User;
import com.zz.fashion.service.UserService;
import com.zz.fashion.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //登录
    @Override
    public ResultVo findUserByName(String phone, String password) {

        User user = userMapper.selectByName(phone);
        if (user!=null){
            if (user.getPassword().equals(password)){
                SystemConst.currUsers.put("user", user);
                return ResultVo.setOK(user);
            }
        }
        return ResultVo.setERROR();
    }

    //注册
    @Override
    public ResultVo addUser(User user) {
        int a = userMapper.insertUser(user);
        if(a > 0){
            return ResultVo.setOK(user);
        }
        return ResultVo.setERROR();
    }

    //判断该手机号是否注册过用户
    @Override
    public ResultVo IsUser(String phone) {
        User user = userMapper.selectByName(phone);
        if (user != null){
            return ResultVo.setOK(user);
        }
        return ResultVo.setERROR();
    }

    //修改密码
    @Override
    public ResultVo updatePassword(User user) {
        int a = userMapper.updateByName(user);
        if (a > 0){
            return ResultVo.setOK(user);
        }
        return ResultVo.setERROR();
    }
}

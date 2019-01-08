package com.zz.fashion.serviceimpl;


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

    @Override
    public ResultVo findUserByName(String phone, String password) {
        User user = userMapper.selectByName(phone);
        if (user!=null){
            if (user.getPassword().equals(password)){
                return ResultVo.setOK(user);
            }
        }
        return ResultVo.setERROR();
    }
}

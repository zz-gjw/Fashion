package com.zz.fashion.service;

import com.zz.fashion.pojo.FashionUser;
import com.zz.fashion.vo.ResultVo;

import java.util.List;
import java.util.Map;

public interface FashionUserService {

    //查询时尚的信息
    ResultVo queryByCondition(Integer id);

}

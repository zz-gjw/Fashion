package com.zz.fashion.dao;

import com.zz.fashion.pojo.Fashion;
import com.zz.fashion.pojo.FashionUser;

import java.util.List;
import java.util.Map;

public interface FashionUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FashionUser record);

    int insertSelective(FashionUser record);

    FashionUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FashionUser record);

    int updateByPrimaryKey(FashionUser record);

    //查询时尚的信息
    List<FashionUser> queryByCondition(Map<String,Object> map);

    //查询时尚的信息
    List<FashionUser> queryByCondition2();
}
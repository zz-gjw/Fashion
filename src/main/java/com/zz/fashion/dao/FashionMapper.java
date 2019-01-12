package com.zz.fashion.dao;

import com.zz.fashion.pojo.Fashion;

import java.util.List;

public interface FashionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fashion record);

    int insertSelective(Fashion record);

    Fashion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fashion record);

    int updateByPrimaryKey(Fashion record);


}
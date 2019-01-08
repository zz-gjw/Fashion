package com.zz.fashion.dao;

import com.zz.fashion.pojo.Color;

public interface ColorMapper {
    int deleteByPrimaryKey(Integer colorId);

    int insert(Color record);

    int insertSelective(Color record);

    Color selectByPrimaryKey(Integer colorId);

    int updateByPrimaryKeySelective(Color record);

    int updateByPrimaryKey(Color record);
}
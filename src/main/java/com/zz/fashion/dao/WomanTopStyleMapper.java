package com.zz.fashion.dao;

import com.zz.fashion.pojo.WomanTopStyle;

public interface WomanTopStyleMapper {
    int deleteByPrimaryKey(Integer womanTopStyleId);

    int insert(WomanTopStyle record);

    int insertSelective(WomanTopStyle record);

    WomanTopStyle selectByPrimaryKey(Integer womanTopStyleId);

    int updateByPrimaryKeySelective(WomanTopStyle record);

    int updateByPrimaryKey(WomanTopStyle record);
}
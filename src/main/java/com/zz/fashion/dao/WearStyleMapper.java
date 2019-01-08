package com.zz.fashion.dao;

import com.zz.fashion.pojo.WearStyle;

public interface WearStyleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WearStyle record);

    int insertSelective(WearStyle record);

    WearStyle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WearStyle record);

    int updateByPrimaryKey(WearStyle record);
}
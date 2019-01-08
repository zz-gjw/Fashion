package com.zz.fashion.dao;

import com.zz.fashion.pojo.WomanDownStyle;

public interface WomanDownStyleMapper {
    int deleteByPrimaryKey(Integer womanDownStyleId);

    int insert(WomanDownStyle record);

    int insertSelective(WomanDownStyle record);

    WomanDownStyle selectByPrimaryKey(Integer womanDownStyleId);

    int updateByPrimaryKeySelective(WomanDownStyle record);

    int updateByPrimaryKey(WomanDownStyle record);
}
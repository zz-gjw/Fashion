package com.zz.fashion.dao;

import com.zz.fashion.pojo.Focus;

public interface FocusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Focus record);

    int insertSelective(Focus record);

    Focus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Focus record);

    int updateByPrimaryKey(Focus record);
}
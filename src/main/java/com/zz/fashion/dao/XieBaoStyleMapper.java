package com.zz.fashion.dao;

import com.zz.fashion.pojo.XieBaoStyle;

public interface XieBaoStyleMapper {
    int deleteByPrimaryKey(Integer xiebaoStyleId);

    int insert(XieBaoStyle record);

    int insertSelective(XieBaoStyle record);

    XieBaoStyle selectByPrimaryKey(Integer xiebaoStyleId);

    int updateByPrimaryKeySelective(XieBaoStyle record);

    int updateByPrimaryKey(XieBaoStyle record);
}
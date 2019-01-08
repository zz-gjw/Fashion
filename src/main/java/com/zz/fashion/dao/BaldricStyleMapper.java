package com.zz.fashion.dao;

import com.zz.fashion.pojo.BaldricStyle;

public interface BaldricStyleMapper {
    int deleteByPrimaryKey(Integer baldricStyleId);

    int insert(BaldricStyle record);

    int insertSelective(BaldricStyle record);

    BaldricStyle selectByPrimaryKey(Integer baldricStyleId);

    int updateByPrimaryKeySelective(BaldricStyle record);

    int updateByPrimaryKey(BaldricStyle record);
}
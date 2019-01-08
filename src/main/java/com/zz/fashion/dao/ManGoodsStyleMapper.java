package com.zz.fashion.dao;

import com.zz.fashion.pojo.ManGoodsStyle;

public interface ManGoodsStyleMapper {
    int deleteByPrimaryKey(Integer manStyleId);

    int insert(ManGoodsStyle record);

    int insertSelective(ManGoodsStyle record);

    ManGoodsStyle selectByPrimaryKey(Integer manStyleId);

    int updateByPrimaryKeySelective(ManGoodsStyle record);

    int updateByPrimaryKey(ManGoodsStyle record);
}
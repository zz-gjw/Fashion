package com.zz.fashion.dao;

import com.zz.fashion.pojo.GoodsStyles;

public interface GoodsStylesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsStyles record);

    int insertSelective(GoodsStyles record);

    GoodsStyles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsStyles record);

    int updateByPrimaryKey(GoodsStyles record);
}
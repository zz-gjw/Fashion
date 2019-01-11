package com.zz.fashion.dao;

import com.zz.fashion.pojo.Shop;

public interface ShopMapper {
    int deleteByPrimaryKey(Integer aShopId);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer aShopId);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}
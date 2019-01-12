package com.zz.fashion.dao;

import com.zz.fashion.pojo.Goods;
import com.zz.fashion.pojo.Shop;

import java.util.List;

public interface ShopMapper {
    int deleteByPrimaryKey(Integer aShopId);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer aShopId);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);

    //根据商店的id获取该商店下的信息
    Shop findShopById(Integer id);

}
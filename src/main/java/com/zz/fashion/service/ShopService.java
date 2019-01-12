package com.zz.fashion.service;

import com.zz.fashion.pojo.Goods;
import com.zz.fashion.vo.ResultVo;

import java.util.List;

public interface ShopService {

    //根据商店id获取商店下的信息
    ResultVo findShopById(Integer id);
}

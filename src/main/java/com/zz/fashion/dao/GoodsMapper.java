package com.zz.fashion.dao;

import com.zz.fashion.pojo.Goods;
import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    //查询女士首页的图片
    List<Goods> findClothImg();

    //查询女士套装图片
    List<Goods> findMatch();

    //展示所有服饰
    List<Goods> findAll();
}
package com.zz.fashion.dao;

import com.zz.fashion.pojo.Goods;
import java.util.List;
import java.util.Map;

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

    //展示所有男装服饰
    List<Goods> findAllMen();

    //根据男装类型查询该类型的所有商品
    List<Goods> findAllMenByStyleId(Integer manStyleId);

    //展示所有佩饰
    List<Goods> selectAllPeiShi();

    //各种佩饰排序展示筛选
    List<Goods> sortOrSelectDetail(Map<String, Object> map);
}
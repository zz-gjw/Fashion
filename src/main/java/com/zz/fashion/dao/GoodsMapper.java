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
    //按照销量进行查询
    List<Goods> findSaleVolume();
    //女装按照价格升序排序
    List<Goods> findSortByPriceAsc();
    //女装按照价格升序排序
    List<Goods> findSortByPriceDesc();
    //按照价格进行筛选查询
    List<Goods> filterByPrice(Integer price);

    //展示所有男装服饰
    List<Goods> findAllMen();

    //根据男装类型查询该类型的所有商品
    List<Goods> findAllMenByStyleId(Integer manStyleId);

    //展示所有服饰
    List<Goods> findAll();
    //展示所有佩饰
    List<Goods> selectAllPeiShi();

    //各种佩饰排序展示筛选
    List<Goods> sortOrSelectDetail(Map<String, Object> map);

    //按照最新的上架时间进行查询
    List<Goods> clothByNew();
    //按照最新的单品进行查询
    List<Goods> colthByNewDan();
    //按照最新的套装进行查询
    List<Goods> colthByNewBoth();
    //按照搭配更多的进行查询
    List<Goods> matchMore();

}
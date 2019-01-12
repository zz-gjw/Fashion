package com.zz.fashion.serviceimpl;

import com.zz.fashion.dao.GoodsMapper;
import com.zz.fashion.pojo.Goods;
import com.zz.fashion.service.GoodsService;
import com.zz.fashion.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//商品
@Service
public class GoodsServiceImpl  implements GoodsService {

    @Autowired
    private  GoodsMapper goodsMapper;

    @Override
    public ResultVo findImg() {
        List<Goods> list = goodsMapper.findClothImg();


        if (list.size() >= 1){
           return ResultVo.setOK(list);
        }
        else {
            return  ResultVo.setERROR();
        }
    }
    @Override
    public ResultVo findMatch() {
        List<Goods> match = goodsMapper.findMatch();
        if(match.size() >= 1){
          return   ResultVo.setOK(match);
        }else {
            return ResultVo.setERROR();
        }
    }

    @Override
    public ResultVo findSaleVolume() {
        List<Goods> saleVolume = goodsMapper.findSaleVolume();
        if(saleVolume.size() >= 1){
            return   ResultVo.setOK(saleVolume);
        }else {

            return ResultVo.setERROR();

        }
    }

    @Override
    public ResultVo findSortByPriceAsc() {
        List<Goods> priceAsc = goodsMapper.findSortByPriceAsc();
        if(priceAsc.size() >= 1){
            return   ResultVo.setOK(priceAsc);
        }else {

            return ResultVo.setERROR();

        }
    }

    @Override
    public ResultVo findSortByPriceDesc() {
        List<Goods> priceAsc = goodsMapper.findSortByPriceDesc();
        if(priceAsc.size() >= 1){
            return   ResultVo.setOK(priceAsc);
        }else {

            return ResultVo.setERROR();

        }
    }

    @Override
    public ResultVo filterByPrice(Integer price) {
        if(price == null || price.equals("")){
            return  ResultVo.setERROR();
        }
        if (price > 0){
            List<Goods> filterByPrice = goodsMapper.filterByPrice(price);
            if(filterByPrice.size() >= 1){
                return   ResultVo.setOK(filterByPrice);
            }else {

                return ResultVo.setERROR();

            }

        }else {
            return  ResultVo.setERROR();
        }
    }

    @Override
    public ResultVo findAll() {
        return null;
    }

    //展示所有男装
    @Override
    public ResultVo findMenWear() {
        List<Goods> a = goodsMapper.findAllMen();
        if(a != null){
            return ResultVo.setOK(a);
        }
        return ResultVo.setERROR();
    }

    //根据男装类型查询该类型的所有商品
    @Override
    public ResultVo findMenWearById(Integer manStyleId) {
        List<Goods> a = goodsMapper.findAllMenByStyleId(manStyleId);
        if (a != null){
            return ResultVo.setOK(a);
        }
        return ResultVo.setERROR();
    }

    //按照销量降序进行查询男装
    @Override
    public ResultVo findMenBySales() {
        List<Goods> a = goodsMapper.findBySales();
        if (a != null){
            return ResultVo.setOK(a);
        }else {
            return ResultVo.setERROR();
        }
    }

    //按照价格升降序、价格区间动态查询男装
    @Override
    public ResultVo findMenByPrice(String price, String priceStyle) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (price != null && !price.equals("")) {
            Double price1 = Double.parseDouble(price);
            map.put("price", price1);
        }
        if (priceStyle != null && !priceStyle.equals("")) {
            Integer priceStyle1 = Integer.parseInt(priceStyle);
            map.put("priceStyle",priceStyle1);
        }
        List<Goods> list = goodsMapper.findByPrice(map);

        if (list != null){
            return ResultVo.setOK(list);
        }
        return ResultVo.setERROR();
    }

    //男装服饰最新上架
    @Override
    public ResultVo findMenByTime() {
        List<Goods> list = goodsMapper.findByTime();
        if (list != null){
            return ResultVo.setOK(list);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo selectAllPeiShi() {
        List<Goods> list = goodsMapper.selectAllPeiShi();

        if (list != null) {
          return  ResultVo.setOK(list);
        }

        return ResultVo.setERROR();
    }

    @Override
    public ResultVo sortOrSelectDetail(String price, String detailStyleId, String saleStyle, String priceStyle) {

        Map<String, Object> map = new HashMap<String, Object>();
        if (price != null && !price.equals("")) {
            Double price1 = Double.parseDouble(price);
            map.put("price", price1);
        }

        if (detailStyleId != null && !detailStyleId.equals("")) {
            Integer detailStyleId1 = Integer.parseInt(detailStyleId);
            map.put("detailStyleId",detailStyleId1);
        }

        if (saleStyle != null && !saleStyle.equals("")) {
            Integer saleStyle1 = Integer.parseInt(saleStyle);
            map.put("saleStyle",saleStyle1);
        }

        if (priceStyle != null && !priceStyle.equals("")) {
            Integer priceStyle1 = Integer.parseInt(priceStyle);
            map.put("priceStyle",priceStyle1);
        }

        List<Goods> list = goodsMapper.sortOrSelectDetail(map);

        return ResultVo.setOK(list);
    }

    @Override
    public ResultVo clothByNew() {
        List<Goods> clothByNew = goodsMapper.clothByNew();
        if(clothByNew != null){
            return ResultVo.setOK(clothByNew);
        }
        return  ResultVo.setERROR();

    }

    @Override
    public ResultVo colthByNewDan() {

        List<Goods> clothByNewDan = goodsMapper.colthByNewDan();
        if(clothByNewDan != null){
            return ResultVo.setOK(clothByNewDan);
        }
        return  ResultVo.setERROR();
    }

    @Override
    public ResultVo colthByNewBoth() {
        List<Goods> clothByNewBoth = goodsMapper.colthByNewBoth();
        if(clothByNewBoth != null){
            return ResultVo.setOK(clothByNewBoth);
        }
        return  ResultVo.setERROR();
    }

    @Override
    public ResultVo matchMore() {
        List<Goods> matchMore = goodsMapper.matchMore();
        if(matchMore != null){
            return ResultVo.setOK(matchMore);
        }
        return  ResultVo.setERROR();

    }


}

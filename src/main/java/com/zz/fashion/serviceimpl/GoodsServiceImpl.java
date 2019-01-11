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

        for (Goods li : list){
            System.out.println(li.getGoodsPicUrl());
        }
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

    @Override
    public ResultVo selectAllPeiShi() {
        List<Goods> list = goodsMapper.selectAllPeiShi();

        if (list != null) {
            ResultVo.setOK(list);
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
}

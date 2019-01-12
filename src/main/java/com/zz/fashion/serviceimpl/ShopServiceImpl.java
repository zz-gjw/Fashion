package com.zz.fashion.serviceimpl;

import com.zz.fashion.dao.ShopMapper;
import com.zz.fashion.pojo.Shop;
import com.zz.fashion.service.ShopService;
import com.zz.fashion.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService{

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public ResultVo findShopById(Integer id) {

        if(id == null || id.equals("")){
             return  ResultVo.setERROR();
        }
        Shop shop = shopMapper.findShopById(id);
        if (shop != null){
            return  ResultVo.setOK(shop);        }

        return ResultVo.setERROR();
    }
}

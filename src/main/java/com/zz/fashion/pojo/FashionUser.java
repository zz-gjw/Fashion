package com.zz.fashion.pojo;

import java.util.List;

public class FashionUser {
    private Integer id;

    private String fashionName;

    private String fashionWeight;

    private Integer goodsId;
    private Goods goodsList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFashionName() {
        return fashionName;
    }

    public void setFashionName(String fashionName) {
        this.fashionName = fashionName == null ? null : fashionName.trim();
    }

    public String getFashionWeight() {
        return fashionWeight;
    }

    public void setFashionWeight(String fashionWeight) {
        this.fashionWeight = fashionWeight == null ? null : fashionWeight.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Goods getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(Goods goodsList) {
        this.goodsList = goodsList;
    }
}
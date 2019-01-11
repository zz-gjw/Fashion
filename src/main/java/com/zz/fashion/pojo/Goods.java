package com.zz.fashion.pojo;

import java.util.Date;
//商品
public class Goods {
    private Integer id;

    private String goodsName;

    private Integer goodsStyleId;

    private Integer goodsSales;

    private Integer loveNum;

    private Integer flag;

    private Double goodsPrice;

    private String goodsPicUrl;

    private Integer goodsShopId;

    private Date goodsCreateDate;

    private GoodsDetail goodsDetail;

    private GoodsStyles goodsStyles;

    public GoodsStyles getGoodsStyles() {
        return goodsStyles;
    }

    public void setGoodsStyles(GoodsStyles goodsStyles) {
        this.goodsStyles = goodsStyles;
    }

    public GoodsDetail getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(GoodsDetail goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsStyleId() {
        return goodsStyleId;
    }

    public void setGoodsStyleId(Integer goodsStyleId) {
        this.goodsStyleId = goodsStyleId;
    }

    public Integer getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(Integer goodsSales) {
        this.goodsSales = goodsSales;
    }

    public Integer getLoveNum() {
        return loveNum;
    }

    public void setLoveNum(Integer loveNum) {
        this.loveNum = loveNum;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsPicUrl() {
        return goodsPicUrl;
    }

    public void setGoodsPicUrl(String goodsPicUrl) {
        this.goodsPicUrl = goodsPicUrl == null ? null : goodsPicUrl.trim();
    }

    public Integer getGoodsShopId() {
        return goodsShopId;
    }

    public void setGoodsShopId(Integer goodsShopId) {
        this.goodsShopId = goodsShopId;
    }

    public Date getGoodsCreateDate() {
        return goodsCreateDate;
    }

    public void setGoodsCreateDate(Date goodsCreateDate) {
        this.goodsCreateDate = goodsCreateDate;
    }
}
package com.zz.fashion.pojo;

import java.util.List;

public class Shop {
    private Integer aShopId;

    private String shopName;

    private String shopPicUrl;

    private String shopWeixing;

    private Integer shopGuanzhu;

    private Integer shopFengsi;

    private Integer shopXiaoliang;

    private Integer flag;

    private String shopInfo;

    private String shopYouhui;
    private List<Goods> list;

    public Integer getaShopId() {
        return aShopId;
    }

    public void setaShopId(Integer aShopId) {
        this.aShopId = aShopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopPicUrl() {
        return shopPicUrl;
    }

    public void setShopPicUrl(String shopPicUrl) {
        this.shopPicUrl = shopPicUrl == null ? null : shopPicUrl.trim();
    }

    public String getShopWeixing() {
        return shopWeixing;
    }

    public void setShopWeixing(String shopWeixing) {
        this.shopWeixing = shopWeixing == null ? null : shopWeixing.trim();
    }

    public Integer getShopGuanzhu() {
        return shopGuanzhu;
    }

    public void setShopGuanzhu(Integer shopGuanzhu) {
        this.shopGuanzhu = shopGuanzhu;
    }

    public Integer getShopFengsi() {
        return shopFengsi;
    }

    public void setShopFengsi(Integer shopFengsi) {
        this.shopFengsi = shopFengsi;
    }

    public Integer getShopXiaoliang() {
        return shopXiaoliang;
    }

    public void setShopXiaoliang(Integer shopXiaoliang) {
        this.shopXiaoliang = shopXiaoliang;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getShopInfo() {
        return shopInfo;
    }

    public void setShopInfo(String shopInfo) {
        this.shopInfo = shopInfo == null ? null : shopInfo.trim();
    }

    public String getShopYouhui() {
        return shopYouhui;
    }

    public void setShopYouhui(String shopYouhui) {
        this.shopYouhui = shopYouhui == null ? null : shopYouhui.trim();
    }

    public List<Goods> getList() {
        return list;
    }

    public void setList(List<Goods> list) {
        this.list = list;
    }
}
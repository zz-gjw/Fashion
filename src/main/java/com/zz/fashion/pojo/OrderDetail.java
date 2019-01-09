package com.zz.fashion.pojo;

public class OrderDetail {
    private Integer orderDetailId;

    private Integer dOrderId;

    private Integer oGoodsId;

    private Integer goodsNum;

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Integer getdOrderId() {
        return dOrderId;
    }

    public void setdOrderId(Integer dOrderId) {
        this.dOrderId = dOrderId;
    }

    public Integer getoGoodsId() {
        return oGoodsId;
    }

    public void setoGoodsId(Integer oGoodsId) {
        this.oGoodsId = oGoodsId;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }
}
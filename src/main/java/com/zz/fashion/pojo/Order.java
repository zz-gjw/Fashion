package com.zz.fashion.pojo;

import java.util.List;

public class Order {
    private Integer orderId;

    private Integer userId;

    private Integer orderStatus;

    private Integer orderPeisongStyleId;

    private String orderLiuyan;

    private Integer flag;

    private User user;

    private List<OrderDetail> orderDetailList;

    private OrderStatus orderstatus;

    private PeiSongStatus peiSongStatus;

    public OrderStatus getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(OrderStatus orderstatus) {
        this.orderstatus = orderstatus;
    }

    public PeiSongStatus getPeiSongStatus() {
        return peiSongStatus;
    }

    public void setPeiSongStatus(PeiSongStatus peiSongStatus) {
        this.peiSongStatus = peiSongStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderPeisongStyleId() {
        return orderPeisongStyleId;
    }

    public void setOrderPeisongStyleId(Integer orderPeisongStyleId) {
        this.orderPeisongStyleId = orderPeisongStyleId;
    }

    public String getOrderLiuyan() {
        return orderLiuyan;
    }

    public void setOrderLiuyan(String orderLiuyan) {
        this.orderLiuyan = orderLiuyan == null ? null : orderLiuyan.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
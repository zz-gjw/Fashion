package com.zz.fashion.pojo;

public class Comment {
    private Integer id;

    private Integer goodsstyleid;

    private Integer goodsid;

    private String commentsinfo;

    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsstyleid() {
        return goodsstyleid;
    }

    public void setGoodsstyleid(Integer goodsstyleid) {
        this.goodsstyleid = goodsstyleid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getCommentsinfo() {
        return commentsinfo;
    }

    public void setCommentsinfo(String commentsinfo) {
        this.commentsinfo = commentsinfo == null ? null : commentsinfo.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
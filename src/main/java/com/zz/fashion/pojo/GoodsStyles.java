package com.zz.fashion.pojo;

public class GoodsStyles {
    private Integer id;

    private String goodsstyle;

    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsstyle() {
        return goodsstyle;
    }

    public void setGoodsstyle(String goodsstyle) {
        this.goodsstyle = goodsstyle == null ? null : goodsstyle.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
package com.zz.fashion.pojo;

public class ManGoodsStyle {
    private Integer manStyleId;

    private String manStyleName;

    public Integer getManStyleId() {
        return manStyleId;
    }

    public void setManStyleId(Integer manStyleId) {
        this.manStyleId = manStyleId;
    }

    public String getManStyleName() {
        return manStyleName;
    }

    public void setManStyleName(String manStyleName) {
        this.manStyleName = manStyleName == null ? null : manStyleName.trim();
    }
}
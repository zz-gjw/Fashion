package com.zz.fashion.pojo;

public class WomanTopStyle {
    private Integer womanTopStyleId;

    private String womanTopStyleName;

    public Integer getWomanTopStyleId() {
        return womanTopStyleId;
    }

    public void setWomanTopStyleId(Integer womanTopStyleId) {
        this.womanTopStyleId = womanTopStyleId;
    }

    public String getWomanTopStyleName() {
        return womanTopStyleName;
    }

    public void setWomanTopStyleName(String womanTopStyleName) {
        this.womanTopStyleName = womanTopStyleName == null ? null : womanTopStyleName.trim();
    }
}
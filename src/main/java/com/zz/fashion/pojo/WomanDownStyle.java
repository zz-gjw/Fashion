package com.zz.fashion.pojo;

public class WomanDownStyle {
    private Integer womanDownStyleId;

    private String womanDownStyleName;

    public Integer getWomanDownStyleId() {
        return womanDownStyleId;
    }

    public void setWomanDownStyleId(Integer womanDownStyleId) {
        this.womanDownStyleId = womanDownStyleId;
    }

    public String getWomanDownStyleName() {
        return womanDownStyleName;
    }

    public void setWomanDownStyleName(String womanDownStyleName) {
        this.womanDownStyleName = womanDownStyleName == null ? null : womanDownStyleName.trim();
    }
}
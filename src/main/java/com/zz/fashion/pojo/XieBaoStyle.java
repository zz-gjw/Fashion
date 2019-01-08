package com.zz.fashion.pojo;

public class XieBaoStyle {
    private Integer xiebaoStyleId;

    private String xiebaoStyleName;

    public Integer getXiebaoStyleId() {
        return xiebaoStyleId;
    }

    public void setXiebaoStyleId(Integer xiebaoStyleId) {
        this.xiebaoStyleId = xiebaoStyleId;
    }

    public String getXiebaoStyleName() {
        return xiebaoStyleName;
    }

    public void setXiebaoStyleName(String xiebaoStyleName) {
        this.xiebaoStyleName = xiebaoStyleName == null ? null : xiebaoStyleName.trim();
    }
}
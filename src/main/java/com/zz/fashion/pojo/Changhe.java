package com.zz.fashion.pojo;

public class Changhe {
    private Integer changheId;

    private String changheName;

    public Integer getChangheId() {
        return changheId;
    }

    public void setChangheId(Integer changheId) {
        this.changheId = changheId;
    }

    public String getChangheName() {
        return changheName;
    }

    public void setChangheName(String changheName) {
        this.changheName = changheName == null ? null : changheName.trim();
    }
}
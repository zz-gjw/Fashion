package com.zz.fashion.pojo;

public class BaldricStyle {
    private Integer baldricStyleId;

    private String baldricStyleName;

    public Integer getBaldricStyleId() {
        return baldricStyleId;
    }

    public void setBaldricStyleId(Integer baldricStyleId) {
        this.baldricStyleId = baldricStyleId;
    }

    public String getBaldricStyleName() {
        return baldricStyleName;
    }

    public void setBaldricStyleName(String baldricStyleName) {
        this.baldricStyleName = baldricStyleName == null ? null : baldricStyleName.trim();
    }
}
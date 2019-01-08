package com.zz.fashion.pojo;

public class WearStyle {
    private Integer id;

    private String wearstylename;

    private Integer focusnum;

    private Integer flag;

    private String wearstylestyle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWearstylename() {
        return wearstylename;
    }

    public void setWearstylename(String wearstylename) {
        this.wearstylename = wearstylename == null ? null : wearstylename.trim();
    }

    public Integer getFocusnum() {
        return focusnum;
    }

    public void setFocusnum(Integer focusnum) {
        this.focusnum = focusnum;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getWearstylestyle() {
        return wearstylestyle;
    }

    public void setWearstylestyle(String wearstylestyle) {
        this.wearstylestyle = wearstylestyle == null ? null : wearstylestyle.trim();
    }
}
package com.zz.fashion.pojo;

public class PeiSongStatus {
    private Integer peisongId;

    private String peisongName;

    public Integer getPeisongId() {
        return peisongId;
    }

    public void setPeisongId(Integer peisongId) {
        this.peisongId = peisongId;
    }

    public String getPeisongName() {
        return peisongName;
    }

    public void setPeisongName(String peisongName) {
        this.peisongName = peisongName == null ? null : peisongName.trim();
    }
}
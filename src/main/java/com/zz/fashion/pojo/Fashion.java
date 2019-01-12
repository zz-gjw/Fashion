package com.zz.fashion.pojo;

import java.util.List;

public class Fashion {
    private Integer id;

    private String tFashionStayle;

    private Integer tFashionStyleId;

    private Integer tFocusId;

    private FashionUser userList;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettFashionStayle() {
        return tFashionStayle;
    }

    public void settFashionStayle(String tFashionStayle) {
        this.tFashionStayle = tFashionStayle == null ? null : tFashionStayle.trim();
    }

    public Integer gettFashionStyleId() {
        return tFashionStyleId;
    }

    public void settFashionStyleId(Integer tFashionStyleId) {
        this.tFashionStyleId = tFashionStyleId;
    }

    public Integer gettFocusId() {
        return tFocusId;
    }

    public void settFocusId(Integer tFocusId) {
        this.tFocusId = tFocusId;
    }

    public FashionUser getUserList() {
        return userList;
    }

    public void setUserList(FashionUser userList) {
        this.userList = userList;
    }
}
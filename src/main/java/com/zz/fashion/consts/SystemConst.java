package com.zz.fashion.consts;

import com.zz.fashion.pojo.User;

import java.util.LinkedHashMap;
import java.util.Map;

public class SystemConst {
    public static Map<String, User> currUsers;
    static {
        currUsers=new LinkedHashMap<String, User>();
    }
}

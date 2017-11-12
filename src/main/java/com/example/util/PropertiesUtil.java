package com.example.util;

import java.util.ResourceBundle;


public class PropertiesUtil {

    private static final ResourceBundle keyBundle = ResourceBundle.getBundle("appConfig");

    /**
     * 通过键获取值
     * @param key
     * @return
     */
    public static final String getKey(String key) {
        return keyBundle.getString(key);
    }

}
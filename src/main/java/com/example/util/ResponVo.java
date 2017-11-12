package com.example.util;

public class ResponVo {
    private String status="1";//1正常，0异常
    private String message="";
    private Object data="";

    public ResponVo(String message) {
        this.status = "0";
        this.message = message;
    }

    public ResponVo(Object data) {
        this.status = "1";
        this.message="success";
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

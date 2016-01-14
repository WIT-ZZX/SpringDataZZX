package com.wit.zzx.entity;

/**
 * Created by Administrator on 2016/1/14.
 */
public class ObjectResult {

    private String status;
    private Object message;

    public ObjectResult(String status, Object message) {
        this.status = status;
        this.message = message;
    }

    public Object toResult(String webflag){
        if(webflag != null)
            return this;
        else
            return this.getMessage();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
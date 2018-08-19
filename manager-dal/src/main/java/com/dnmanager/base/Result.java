package com.dnmanager.base;

import java.util.ArrayList;
import java.util.List;

public class Result {

    private int code;

    private List<Object> list;
    private Object data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static Result ok() {
        Result r = new Result();
        r.setCode(200);
        return r;
    }

    public static Result ok(Object data) {
        Result r = new Result();
        r.setCode(200);
        r.setData(data);
        return r;
    }

    public static Result okList(List l) {
        Result r = new Result();
        r.setCode(200);
        if (l == null) {
            l = new ArrayList();
        }
        r.setList(l);
        return r;
    }

    public static Result error(int errorCode, String msg) {
        Result r = new Result();
        r.setCode(errorCode);
        r.setMessage(msg);
        return r;
    }

    public static Result error(String msg) {
        Result r = new Result();
        r.setCode(101);
        r.setMessage(msg);
        return r;
    }
}

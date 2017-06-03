package com.scyllakeeper.wechat.gift.utils.response;

/**
 * Created by zhuozi on 17/6/3.
 */
public class ResponseStatus {
    private int code = 1001;

    private String msg = "success";

    public ResponseStatus(){}

    public ResponseStatus(int code, String message) {
        this.code = code;
        this.msg = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return msg;
    }

    public void setMessage(String message) {
        this.msg = message;
    }
}

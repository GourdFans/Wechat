package com.scyllakeeper.wechat.gift.utils.response;

/**
 * Created by zhuozi on 17/6/3.
 */
public class AjaxResponse {
    private ResponseStatus status;

    private Object result;

    public static AjaxResponse success(Object result){
        AjaxResponse ajaxResponse = success();
        ajaxResponse.setResult(result);
        return ajaxResponse;
    }

    public static AjaxResponse success(){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setStatus(new ResponseStatus());
        return ajaxResponse;
    }


    public static AjaxResponse fail(int code, String msg){
        ResponseStatus responseStatus = new ResponseStatus(code, msg);
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setStatus(responseStatus);
        return ajaxResponse;
    }

    public static AjaxResponse fail(int code, String msg, Object result){
        AjaxResponse ajaxResponse = fail(code, msg);
        ajaxResponse.setResult(result);
        return ajaxResponse;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}

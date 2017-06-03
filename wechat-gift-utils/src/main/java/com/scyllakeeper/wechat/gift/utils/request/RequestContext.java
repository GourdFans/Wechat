package com.scyllakeeper.wechat.gift.utils.request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhuozi on 17/6/3.
 */
public class RequestContext {
    /**
     * Request
     */
    private HttpServletRequest request;

    /**
     * Response
     */
    private HttpServletResponse response;

    /**
     * 无参构造函数
     */
    public RequestContext(){}

    /**
     * 有参构造函数
     * @param request  请求
     * @param response 相应
     */
    public RequestContext(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }
}

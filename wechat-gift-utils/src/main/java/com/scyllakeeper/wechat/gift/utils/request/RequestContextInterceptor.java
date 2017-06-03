package com.scyllakeeper.wechat.gift.utils.request;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhuozi on 17/6/3.
 */
public class RequestContextInterceptor extends HandlerInterceptorAdapter {
    private static final Logger logger = LoggerFactory.getLogger(RequestContextInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        RequestContext requestContext = new RequestContext();
        requestContext.setRequest(request);
        requestContext.setResponse(response);
        RequestContextHolder.requestContextThreadLocal.set(requestContext);
        return super.preHandle(request, response, handler);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        RequestContextHolder.requestContextThreadLocal.remove();
        super.afterCompletion(request, response, handler, ex);
    }
}
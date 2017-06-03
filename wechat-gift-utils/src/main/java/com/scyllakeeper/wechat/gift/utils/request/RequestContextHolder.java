package com.scyllakeeper.wechat.gift.utils.request;

import com.scyllakeeper.wechat.gift.utils.request.RequestContext;

/**
 * Created by zhuozi on 17/6/3.
 */
public class RequestContextHolder {
    static ThreadLocal<RequestContext> requestContextThreadLocal = new ThreadLocal<RequestContext>();

    public static RequestContext get(){
            return requestContextThreadLocal.get();
        }
}

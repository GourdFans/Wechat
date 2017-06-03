package com.scyllakeeper.wechat.gift.web.controller;

import com.alibaba.fastjson.JSON;
import com.scyllakeeper.wechat.gift.utils.request.RequestContextHolder;
import com.scyllakeeper.wechat.gift.utils.response.AjaxResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zhuozi on 17/6/3.
 * 基础的controller，将来用户信息也会放在这里面
 */

public class BaseController {
    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    //获取当前请求的Request
    public HttpServletRequest getRequest(){
        return RequestContextHolder.get().getRequest();
    }

    //获取当前请求的Response
    public HttpServletResponse getResponse(){
        return RequestContextHolder.get().getResponse();
    }

    public void jsonReturn(AjaxResponse ajaxResponse){
        try {
            HttpServletResponse response = getResponse();
            PrintWriter printWriter = response.getWriter();
            response.setContentType("application/json;charset=UTF-8");
            printWriter.write(JSON.toJSONString(ajaxResponse));
            printWriter.close();
        } catch (IOException ioException){
            logger.error(ioException.getMessage());
        }
    }
}

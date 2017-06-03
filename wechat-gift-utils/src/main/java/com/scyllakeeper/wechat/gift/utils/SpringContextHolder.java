package com.scyllakeeper.wechat.gift.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by zhuozi on 17/6/3.
 */
public class SpringContextHolder implements ApplicationContextAware {
    private ApplicationContext applicationContext;


    public ApplicationContext getApplicationContext(){
        if (this.applicationContext != null){
            return this.applicationContext;
        } else {
            throw new RuntimeException("applicationContext 为空");
        }
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

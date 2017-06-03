package com.scyllakeeper.wechat.gift.web.controller;

import com.scyllakeeper.wechat.gift.api.GiftService;
import com.scyllakeeper.wechat.gift.dto.AddressDTO;
import com.scyllakeeper.wechat.gift.utils.response.AjaxResponse;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.Beans;

/**
 * Created by zhuozi on 17/6/3.
 */
@Controller
public class UserIndexController  extends BaseController{
    private static final Logger logger = LoggerFactory.getLogger(UserIndexController.class);

    @Autowired
    GiftService giftService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    public void index(){
        jsonReturn(AjaxResponse.success("验证活动和用户资格"));
    }


    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    @ResponseBody
    public void submit(){
        jsonReturn(AjaxResponse.success("提交结果"));
    }


    @RequestMapping(value = "/sendToken", method = RequestMethod.POST)
    @ResponseBody
    public void sendToken(){
        jsonReturn(AjaxResponse.success("发送验证码"));
    }
}

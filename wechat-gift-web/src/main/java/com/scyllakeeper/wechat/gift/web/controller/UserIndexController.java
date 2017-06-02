package com.scyllakeeper.wechat.gift.web.controller;

import com.scyllakeeper.wechat.gift.api.GiftService;
import com.scyllakeeper.wechat.gift.dto.AddressDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.Beans;

/**
 * Created by zhuozi on 17/6/3.
 */
@Controller
public class UserIndexController {

    @Autowired
    GiftService giftService;

    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response){
    }


    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    @ResponseBody
    public String submit(AddressDTO addressDTO, HttpServletResponse response){
    }
}

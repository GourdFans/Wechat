package com.scyllakeeper.wechat.gift.dto;
import java.io.Serializable;

/**
 * Created by zhuozi on 17/6/3.
 */

public class AddressDTO implements Serializable{

    private static final long serialVersionUID = 6118766680561688541L;

    /**
     * 收获地址
     */
    private String address;

    /**
     * 微信号码
     */
    private String account;

    /**
     * 收件人姓名
     */
    private String name;

    /**
     * 电话号码
     */
    private String mobile;

    /**
     * 电话验证码
     */
    private String token;
}

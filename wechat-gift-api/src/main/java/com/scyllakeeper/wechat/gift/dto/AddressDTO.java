package com.scyllakeeper.wechat.gift.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by zhuozi on 17/6/3.
 */
@Getter
@Setter
@ToString
public class AddressDTO implements Serializable{

    private static final long serialVersionUID = 6118766680561688541L;

    private String name;

    private String address;

    private String accountId;

    private String mobile;

    private boolean payed;
}

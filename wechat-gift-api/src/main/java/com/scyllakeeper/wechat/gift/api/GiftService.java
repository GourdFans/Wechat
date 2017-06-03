package com.scyllakeeper.wechat.gift.api;

import com.scyllakeeper.wechat.gift.dto.AddressDTO;
import com.scyllakeeper.wechat.gift.utils.result.DataResult;

/**
 * Created by zhuozi on 17/6/3.
 */
public interface GiftService {

    /**
     * 判断活动是否在进行中
     * @return false活动结束 true表示活动还在进行中
     */
    public Boolean isActiveOpen();

    /**
     * 添加用户地址
     * @param addressDTO 用户地址信息
     * @return true表示添加成功
     */
    public DataResult<Boolean> addUserAddress(AddressDTO addressDTO);

    /**
     * @param userId 根据用户ID来判断
     * @return 判断用户是否已经领取过了
     */
    public Boolean userVerify(String userId);
}

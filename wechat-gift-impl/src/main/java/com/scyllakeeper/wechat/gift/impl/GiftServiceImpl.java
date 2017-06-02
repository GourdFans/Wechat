package com.scyllakeeper.wechat.gift.impl;

import com.scyllakeeper.wechat.gift.api.GiftService;
import com.scyllakeeper.wechat.gift.dto.AddressDTO;
import com.scyllakeeper.wechat.gift.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisSentinelPool;

/**
 * Created by zhuozi on 17/6/3.
 */
@Service
public class GiftServiceImpl implements GiftService{

    @Autowired
    JedisPool jedisPool;
    /**
     * 判断活动是否在进行中
     * @return false活动结束 true表示活动还在进行中
     */
    public Boolean isActiveOpen() {
        Boolean returnValue = false;
        try {
            Jedis jedis = jedisSentinelPool.getResource();
            String startTimeStr = jedis.get("startTime");
            String endTimeStr = jedis.get("endTime");

            Long startTime = Long.MAX_VALUE;
            if (StringUtils.isNotBlank(startTimeStr)){
                startTime = Long.valueOf(startTime);
            }

            Long endTime = Long.MIN_VALUE;
            if (StringUtils.isNotBlank(endTimeStr)){
                endTime = Long.valueOf(endTime);
            }

            Long currentTime = System.currentTimeMillis();
            if ()

        } catch (Exception exception){

        }
        return returnValue;
    }

    /**
     * 添加用户地址
     * @param addressDTO 用户地址信息
     * @return true表示添加成功
     */
    public DataResult<Boolean> addUserAddress(AddressDTO addressDTO) {
        DataResult<Boolean> dataResult = new DataResult<Boolean>();
        dataResult.setValue(Boolean.TRUE);
        return dataResult;
    }

    /**
     * @param userId 根据用户ID来判断
     *               判断用户是否已经领取过了
     */
    public Boolean userVerify(String userId) {
        return false;
    }
}

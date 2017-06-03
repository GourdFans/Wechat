package com.scyllakeeper.wechat.gift.utils.result;

import com.scyllakeeper.wechat.gift.utils.result.Result;

/**
 * Created by zhuozi on 17/6/3.
 */
public class DataResult<T> extends Result {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DataResult{" +
                "value=" + value +
                '}' + super.toString();
    }
}

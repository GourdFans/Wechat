package com.scyllakeeper.wechat.gift.utils;

/**
 * Created by zhuozi on 17/6/3.
 */
public class DataResult<T> extends Result {

    T value;

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

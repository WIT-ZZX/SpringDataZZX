package com.wit.zzx.redis;

/**
 * Created by zxZhang on 16/01/19.
 */
public interface IRedisCacheService {
    void addMessage(String key, String value);
}

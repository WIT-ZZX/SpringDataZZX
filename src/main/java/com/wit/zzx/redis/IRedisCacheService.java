package com.wit.zzx.redis;

import com.wit.zzx.entity.Visitor;

import java.util.List;

/**
 * Created by zxZhang on 16/01/19.
 */
public interface IRedisCacheService {
    void addMessage(String key, String value);

    List<byte[]> getMessage(String key);

    void clear(String key);

    public void putObject(Visitor visitor);
}

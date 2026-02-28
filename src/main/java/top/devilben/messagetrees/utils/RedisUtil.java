package top.devilben.messagetrees.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {

//    默认超时时间为一天
    private static final int REDIS_KEY_TIMEOUT = 24;
    private static final TimeUnit TIME_UNIT = TimeUnit.HOURS;

    private static RedisTemplate<String, Object> redisTemplate;

    @Autowired
    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        RedisUtil.redisTemplate = redisTemplate;
    }


    public static void putString(String key, String value) {
        putString(key,value,REDIS_KEY_TIMEOUT,TIME_UNIT);
    }

    /**
     * 向redis中加入缓存数据，缓存时间，事件类型
     * @param key
     * @param value
     * @param timeout
     * @param timeUnit
     */
    public static void putString(String key, String value, long timeout, TimeUnit timeUnit) {
        redisTemplate.opsForValue().set(key, value);
        redisTemplate.expire(key,timeout, timeUnit);
    }

    public static String getString(String key) {
        Object o = redisTemplate.opsForValue().get(key);
        if (o != null) {
            return o.toString();
        }

        return null;
    }
}

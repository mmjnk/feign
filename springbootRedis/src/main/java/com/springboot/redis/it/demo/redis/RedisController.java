package com.springboot.redis.it.demo.redis;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class RedisController {
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/redis/{key}/{value}")
    private Boolean setValue(@PathVariable("key") String key, @PathVariable("value") String value) {
        boolean flag = true;
        try {
            stringRedisTemplate.opsForValue().set(key, value);
        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }

    @RequestMapping("/redis/{key}")
    private String getValue(@PathVariable("key") String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }
}



package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.dao.UserEntityMapper;
import com.example.entity.UserEntity;
import com.example.exception.ResultException;
import com.example.util.ResponVo;
import com.example.util.redis.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class HelloController {

    @Autowired
    UserEntityMapper userEntityMapper;
    @Autowired
    RedisCache redisCache;
    @Autowired
    ThreadPoolTaskExecutor taskExecutor;



    @RequestMapping(value = "/hello")
    public ResponVo hello() {
        UserEntity userEntity =userEntityMapper.selectByPrimaryKey(1010650);
        return  new ResponVo(userEntity);
    }
    @RequestMapping(value = "/test")
    public ResponVo test() {
        UserEntity userEntity =userEntityMapper.selectByPrimaryKey(1010650);
        JSON.toJSONString(userEntity);
        return new ResponVo(userEntity);
    }
    @RequestMapping(value = "/errordemo")
    public ResponVo errordemo() throws ResultException {
        UserEntity userEntity =userEntityMapper.selectByPrimaryKey(1010650);
        if(true){
            throw new ResultException("sql异常");
        }
        return new ResponVo(userEntity);
    }
    @RequestMapping(value = "/exception")
    public ResponVo exception() throws Exception {
        UserEntity userEntity =userEntityMapper.selectByPrimaryKey(1010650);
        if(true){
            throw new NullPointerException("exception异常");
        }
        return new ResponVo(userEntity);
    }
    @RequestMapping(value = "/redis")
    public ResponVo redis() throws Exception {
        UserEntity userEntity =userEntityMapper.selectByPrimaryKey(1010650);
        String uuid = UUID.randomUUID().toString();
        redisCache.setString(uuid,JSON.toJSONString(userEntity),60*60);
        String userInfo = redisCache.getString(uuid);
        System.out.println("userInfo="+userInfo);
        return new ResponVo(userEntity);
    }
    @RequestMapping(value = "/taskExecutor")
    public ResponVo taskExecutor() throws Exception {
        System.out.println(taskExecutor.getCorePoolSize());
        System.out.println(taskExecutor.getMaxPoolSize());
        System.out.println(taskExecutor.getKeepAliveSeconds());
        taskExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("2222222222222222222222222222222222222");
            }
        });
        return new ResponVo("");
    }
}
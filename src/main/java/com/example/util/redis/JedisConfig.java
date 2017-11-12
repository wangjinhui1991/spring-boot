package com.example.util.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedisPool;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan({"com.example.util.redis"}) // 解决 Configuration 注解中使用 Autowired 注解 IDE 报错
public class JedisConfig {
    private final RedisConfig redisConfig;

    @Autowired
    public JedisConfig(RedisConfig redisConfig) {
        this.redisConfig = redisConfig;
    }

    @Bean
    public ShardedJedisPool convertJedisPool() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(redisConfig.getMaxTotal());
        jedisPoolConfig.setMaxIdle(redisConfig.getMaxIdle());
        jedisPoolConfig.setMaxWaitMillis(redisConfig.getMaxWaitMillis());
        List<JedisShardInfo> jedisShardInfoList = new ArrayList<JedisShardInfo>();
        JedisShardInfo jedisShardInfo = new JedisShardInfo(redisConfig.getIp(),redisConfig.getPort());
        jedisShardInfo.setPassword(redisConfig.getPassword());
        jedisShardInfoList.add(jedisShardInfo);
        return new ShardedJedisPool(jedisPoolConfig, jedisShardInfoList);
    }
}

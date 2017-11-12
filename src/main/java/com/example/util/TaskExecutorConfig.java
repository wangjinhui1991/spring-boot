package com.example.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class TaskExecutorConfig {

    @Bean
    public ThreadPoolTaskExecutor threadPoolTaskExecutor(@Value("${thread.corePoolSize}") Integer corePoolSize,
                                                   @Value("${thread.maxPoolSize}") Integer maxPoolSize,
                                                   @Value("${thread.keepAliveSeconds}") Integer keepAliveSeconds,
                                                   @Value("${thread.queueCapacity}") Integer queueCapacity) {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(corePoolSize);
        taskExecutor.setMaxPoolSize(maxPoolSize);
        taskExecutor.setKeepAliveSeconds(keepAliveSeconds);
        taskExecutor.setQueueCapacity(queueCapacity);
        return taskExecutor;
    }


}

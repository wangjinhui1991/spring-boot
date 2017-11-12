package com.example.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class AppInterceptor extends WebMvcConfigurerAdapter {

    @Value("${Interceptor.excludePaths}")
    private String excludePath;


    @Autowired
    DemoInterceptor demoInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] excludePaths = {};
        if (!StringUtils.isEmpty(excludePath)) {
            excludePaths = excludePath.split(";");
        }
        registry.addInterceptor(demoInterceptor).addPathPatterns("/*").excludePathPatterns(excludePaths);
    }
}

package com.example.aspect;

import com.alibaba.fastjson.JSON;
import com.example.interceptor.DemoInterceptor;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect   //定义一个切面
@Configuration
public class DemoAspect {

    private static Logger logger = Logger.getLogger(DemoAspect.class);


    /**
     * 前置通知 用于拦截Controller层结果返回日志记录
     */
    @AfterReturning(pointcut = "execution(* com.example.controller..*(..))", returning = "rvt")
    public void doAfterReturning(Object rvt) throws Exception {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        // begin 将 Controller 的方法结果 打出日志
        String result = "";
        if (rvt instanceof String) {
            result = (String) rvt;
        } else if (null != rvt) {
            result = JSON.toJSONString(rvt);
        }
        logger.info("\n"+"[reqURL]：" + request.getRequestURI()+",[result]：" + result);
    }
}

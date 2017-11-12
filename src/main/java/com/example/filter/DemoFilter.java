package com.example.filter;

import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter
public class DemoFilter implements Filter {

    private static Logger logger = Logger.getLogger(DemoFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long startTime = System.currentTimeMillis();
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String uri = req.getRequestURI();
        filterChain.doFilter(servletRequest, servletResponse);//执行业务代码
        logger.info("[" + uri + "] take time：" + ((System.currentTimeMillis() - startTime)));//打印接口花费时间
    }

    @Override
    public void destroy() {

    }
}

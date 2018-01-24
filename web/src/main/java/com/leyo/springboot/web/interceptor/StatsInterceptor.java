package com.leyo.springboot.web.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by leyo on 2018/1/16.
 * 【拦截器】监控每一个完整的请求所需要的时间
 */
public class StatsInterceptor implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(StatsInterceptor.class);

    private ThreadLocal<StopWatch> threadLocal = new ThreadLocal<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        StopWatch stopWatch = new StopWatch("StatsInterceptor");
        threadLocal.set(stopWatch);
        stopWatch.start();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // code for posthandle
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // code for posthandle
        StopWatch stopWatch = threadLocal.get();
        stopWatch.stop();
        String uri = request.getRequestURI();
        logger.info(" url: {}, request time : {} ms ", uri, stopWatch.shortSummary());
        stopWatch = null;
    }
}
package com.leyo.springboot.web.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by leyo on 2018/1/16.
 */
@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {

    //配置拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new StatsInterceptor()).addPathPatterns("/**").excludePathPatterns("/*/static/**", "*.js", "*.css", "/*/webjars/**");
    }
}
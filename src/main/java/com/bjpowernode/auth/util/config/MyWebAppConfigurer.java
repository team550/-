package com.bjpowernode.auth.util.config;

import com.bjpowernode.auth.util.interceptor.AuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName InterceptorConfig
 * @Description 对拦截器进行注册
 * @Author PowerNode
 * @Date 2020/11/29 16:11
 * @Version 1.0
 */
@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer  {

    @Autowired
    AuthInterceptor authInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //选择过滤的url请求
        registry.addInterceptor(authInterceptor).addPathPatterns("/**").excludePathPatterns("/**/*.html"+"/**/*.js"+"/**/*.css"+"/**/*.woff"+"/**/*.ttf"+"/**/*.jpg"+"/**/*.png");
    }
}
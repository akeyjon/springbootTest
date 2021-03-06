package com.cn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.cn.scala.interceptor.SessionInterceptor;

/**
 * 添加自定义拦截器
 * @author dailw
 *
 */
@SpringBootConfiguration
public class MySpringMVCConfig extends WebMvcConfigurerAdapter{

    @Autowired
    private SessionInterceptor sessionInterceptor;
    
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(sessionInterceptor).addPathPatterns("/**");
    }
    
}

package com.cn.scala.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class SessionInterceptor implements HandlerInterceptor{

    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse arg1, Object arg2) throws Exception {
        // TODO Auto-generated method stub
        String url = request.getRequestURL().toString();
        String uri = request.getRequestURI();
        System.out.println("====== url  = " + url);
        System.out.println("====== uri = " + uri);
        System.out.println("自定义拦截器。。。");
        return true;
    }

}

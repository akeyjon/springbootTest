package com.cn.scala.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAop {

    @Pointcut("@annotation(com.cn.scala.anotion.BusesAnotion)")
    public void myPointCut(){};
    
    @Around("myPointCut()")
    public Object pasth(ProceedingJoinPoint point) throws Throwable{
        String className = point.getTarget().getClass().getName();
        String methodName = point.getSignature().getName();
        
        Long start = System.currentTimeMillis();
        
        Object o = point.proceed();
        Long time = System.currentTimeMillis() - start;
        System.out.println(className + "-"+methodName +"耗时："+time);
        return o;
    }
}

package com.cn.scala.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.cn.scala.anotion.BusesAnotion;

@Aspect
@Component
public class TimeAop {

    @Pointcut("@annotation(com.cn.scala.anotion.BusesAnotion)")
    public void myPointCut(){};
    
    @Around("myPointCut()")
    public Object pasth(ProceedingJoinPoint point) throws Throwable{
        //获取拦截的方法
        Signature signature = point.getSignature();
        MethodSignature msig = (MethodSignature) signature;
        Class<? extends Object> class1 = point.getTarget().getClass();
        String className = point.getTarget().getClass().getName();
        String methodName = point.getSignature().getName();
        Method currentMethod = point.getTarget().getClass().getMethod(msig.getName(), msig.getParameterTypes());
//        String currentMethodName = currentMethod.getName();
//        BusesAnotion annotation = point.getTarget().getClass().getMethod(methodName, class1).getAnnotation(BusesAnotion.class);
        BusesAnotion annotation = currentMethod.getAnnotation(BusesAnotion.class);
        String action = annotation.action();
        System.out.println("注解中的内容是 " + action);
        Long start = System.currentTimeMillis();
        Object o = point.proceed();
        Long time = System.currentTimeMillis() - start;
        System.out.println(className + "-"+methodName +"耗时："+time);
        return o;
    }
}

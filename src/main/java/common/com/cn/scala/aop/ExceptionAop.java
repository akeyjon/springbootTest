package com.cn.scala.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.cn.scala.anotion.BusesAnotion;


/**
 * 异常处理
 * @author chances
 *
 */

@Aspect
@Component
public class ExceptionAop {
    public static  Logger log = LoggerFactory.getLogger(ExceptionAop.class);
    
    @Pointcut(value="@annotation(com.cn.scala.anotion.BusesAnotion)")
    private void myPointCut(){};
    
    @Around("myPointCut()")
    public Object recordActionLog(ProceedingJoinPoint point){
        Object ob = null;
        try {
            ob =  point.proceed();
        } catch (Throwable e) {
            String className = point.getTarget().getClass().getName();
            String methodName = point.getSignature().getName();
            // TODO Auto-generated catch block
            log.error(e.getMessage(),e);
            System.out.println("异常出现了" + className + methodName);
//            e.printStackTrace();
            
        }
        return ob;
    }

}

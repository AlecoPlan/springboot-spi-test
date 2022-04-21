package com.wzy.spi.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

/**
 * @author wzy
 * @date 2022/4/20 17:31
 */
@Aspect
public class PrintTestProcess {

    @Pointcut("@annotation(com.wzy.spi.annotation.PrintTest)")
    public void cut() {

    }

    @Around("cut()")
    public Object printCut(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("注解PrintTest方法: " + method.getName() + " 开始执行, 当前时间: " + LocalDateTime.now());
        Object proceed = joinPoint.proceed();
        System.out.println("注解PrintTest方法: " + method.getName() + " 执行结束, 当前时间: " + LocalDateTime.now());
        return proceed;
    }
}

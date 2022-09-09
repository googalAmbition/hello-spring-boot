package com.tcoding.demo.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author 陈天成
 * @date 2022/9/9.
 */
@Aspect
@Component
public class LogAopAspect {

    /**
     * execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern) throws-pattern?)
     */
    @Pointcut("execution(public * com.tcoding.demo.aop.controller.*.*(*))")
    public void exe() {}

    @Pointcut("@annotation(LogAop)")
    public void point() {}

    @Before("point()")
    public void before() {
        System.out.println("LogAopAspect ----> before");
    }

    @Before("exe()")
    public void beforeEx() {
        System.out.println("LogAopAspect ----> beforeEx");
    }

    @After("point()")
    public void after() {
        System.out.println("LogAopAspect ----> after");
    }

    @AfterReturning(value = "point()", returning = "returnVal")
    public void afterReturn(JoinPoint jp, Object returnVal) {

        System.out.println(jp.getKind());
        System.out.println("LogAopAspect ----> returnVal" + returnVal);
        System.out.println("LogAopAspect ----> afterReturn");
    }

    @Around("point()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("LogAopAspect ----> around start");
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        LogAop annotation = signature.getMethod().getAnnotation(LogAop.class);
        System.out.println(Arrays.asList(annotation.tags()));
        Object proceed = joinPoint.proceed();
        System.out.println("LogAopAspect ----> around end");
        return proceed;
    }
}


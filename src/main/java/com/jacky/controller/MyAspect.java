package com.jacky.controller;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
//@Pointcut("execution(* com.jacky.controller.*.*(..))")
@Around("execution(* com.jacky.controller.*.*(..))")
public Object handleControllerMethod(ProceedingJoinPoint pjp) throws Throwable {

    System.out.println("time aspect start");

    Object[] args = pjp.getArgs();
    for (Object arg : args) {
        System.out.println("arg is " + arg);
    }

    long startTime = System.currentTimeMillis();

    Object object = pjp.proceed();

    long endTime = System.currentTimeMillis();
    System.out.println("time aspect consume " + (endTime - startTime) + " ms");

    System.out.println("time aspect end");

    return object;
}

}

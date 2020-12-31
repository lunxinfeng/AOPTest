package com.lxf;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectDemo {
    //    @Pointcut("execution(* com.lxf.Service.log(..))")
    @Pointcut("execution(* com.lxf.Service.*(..))")
//    @Pointcut("execution(* com.lxf.*.*(..))")
//    @Pointcut("execution(* com.lxf.*.*())")
    public void addPointcut() {

    }

    @Before("addPointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before: " + joinPoint);
    }


    @AfterReturning(pointcut = "addPointcut()", returning = "result")
    public void afterReturn(Object result) {
        System.out.println("afterReturn: " + result);
    }

    @After("addPointcut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("after: " + joinPoint);
    }

}

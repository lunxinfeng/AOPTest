package com.lxf;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectDemo {
//            @Pointcut("execution(public * *(..))")
//    @Pointcut("execution( * *(..) throws ArrayIndexOutOfBoundsException)")
//    @Pointcut("execution(* com.lxf.Service.log(..))")
//    @Pointcut("execution(* com.lxf.Service.*(..))")
//    @Pointcut("execution(* com.lxf.Service.*(*))")
//    @Pointcut("execution(* com.lxf.*.*(..))")
//    @Pointcut("execution(* com.lxf.*.*())")
//    @Pointcut("execution(* com..*.*(..))")
//    @Pointcut("execution(* com..*.log*(..))")
//    @Pointcut("execution(* com..Service.*(..))")
//    @Pointcut("execution(* com.lxf.IService.*(..))")
//    @Pointcut("execution(* com.lxf.IService+.*(..))")
//    @Pointcut("execution(* (!com.lxf.Service).*(..))")
//    @Pointcut("execution(* (com.lxf.IService+ && com.lxf.IService2+).*(..))")
//    @Pointcut("execution(@java.lang.Deprecated * *(..))")
//    @Pointcut("execution(* *(int,..))")
//    @Pointcut("execution(* *(..,int,..))")
    @Pointcut("execution(* *(@java.lang.Deprecated (*),..))")
    public void addPointcut() {

    }

//    @Before(value = "addPointcut() && within(com.lxf.IService+)")
//    @Before(value = "this(com.lxf.Service)")
    @Before(value = "target(com.lxf.Service)")
    public void before(JoinPoint joinPoint) {
        System.out.println("before: " + joinPoint);
    }

//    @Before(value = "addPointcut() && args(a)",argNames = "joinPoint,a")
//    public void before(JoinPoint joinPoint,int a) {
//        System.out.println("before: " + joinPoint);
//    }


    @AfterReturning(pointcut = "addPointcut()", returning = "result")
    public void afterReturn(Object result) {
        System.out.println("afterReturn: " + result);
    }

    @After("addPointcut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("after: " + joinPoint);
    }

}

package com.hai.diy;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect  //标注这个类是一个切面
public class annotationPointcut {


    @Before("execution(* com.hai.service.UserviceImpl.*(..))")
    public void before(){
        System.out.println("方法执行之前---------------");

    }
    @After("execution(* com.hai.service.UserviceImpl.*(..))")
    public void after(){
        System.out.println("方法执行之后---------------");

    }

    @Around("execution(* com.hai.service.UserviceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前-------");

        Object proceed = jp.proceed();

        System.out.println("环绕后-------");
        System.out.println("环绕后-------");


    }

}

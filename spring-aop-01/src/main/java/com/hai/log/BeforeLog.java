package com.hai.log;


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {


    public void before(Method method, Object[] args, Object target) throws Throwable {


        System.out.println("执行的方法是"+method.getName()+"目标对象"+target.getClass().getName());




    }
}

package com.hai.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandlerTools implements InvocationHandler {

    public Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy(){

       return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }



    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    // 增加日志功能


    public void Log(String msg){

        System.out.println("info:进行了一项"+msg+"操作");


    }
}

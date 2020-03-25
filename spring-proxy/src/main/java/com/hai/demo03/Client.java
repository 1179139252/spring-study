package com.hai.demo03;

import com.hai.demo.UserService;

public class Client {

    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();


        ProxyInvocationHandlerTools pih = new ProxyInvocationHandlerTools();

        pih.setTarget(userService);


        UserService proxy = (UserService) pih.getProxy();
        proxy.add();


    }



}

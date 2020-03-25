package com.hai.demo;

public class Test {

    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        ProxyUserService proxyUserService = new ProxyUserService();
        proxyUserService.setUserService(userService);

        proxyUserService.add();




    }


}

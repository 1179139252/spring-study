package com.hai.demo02;

public class Client {

    public static void main(String[] args) {

        House house = new House();

        ProxyInvocationHandler pri = new ProxyInvocationHandler();

        pri.setRent(house);

        Rent proxy1 = (Rent) pri.getProxy();

        proxy1.rent();





    }


}

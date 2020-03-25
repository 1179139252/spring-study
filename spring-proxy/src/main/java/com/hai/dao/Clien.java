package com.hai.dao;

public class Clien {

    public static void main(String[] args) {

        Proxy proxy = new Proxy(new House());
        proxy.rent();


    }
}

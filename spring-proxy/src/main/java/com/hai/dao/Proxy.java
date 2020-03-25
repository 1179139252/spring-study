package com.hai.dao;

public class Proxy implements Rent{
    private House house;

    public Proxy() {
    }

    public Proxy(House house) {
        this.house = house;
    }


    public void rent() {
        System.out.println("中介");
        house.rent();
    }
}

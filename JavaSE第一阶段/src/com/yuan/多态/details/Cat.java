package com.yuan.多态.details;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-26 15:10
 **/
public class Cat extends Animal {
    private String name;
    public void cry(){
        System.out.println("小猫叫");
    }

    @Override
    public void eat() {
        System.out.println("小猫吃");
    }

    @Override
    public void run() {
        System.out.println("小猫跑");
    }
}

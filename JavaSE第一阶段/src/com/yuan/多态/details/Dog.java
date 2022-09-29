package com.yuan.多态.details;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-26 15:26
 **/
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗在吃");
    }
    public void study(){
        System.out.println("狗在学习");
    }
}

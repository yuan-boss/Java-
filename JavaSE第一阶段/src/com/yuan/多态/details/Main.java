package com.yuan.多态.details;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-26 15:11
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("================================");
        A a= new A();
        A b = new B();
        C c = new C();
        System.out.println(b instanceof C);//true
        System.out.println(65==65.0);
        int i = 10;double d = 10.0;
        System.out.println(i==d);


    }
}

class A{}
class B extends C{}
class C extends A{}

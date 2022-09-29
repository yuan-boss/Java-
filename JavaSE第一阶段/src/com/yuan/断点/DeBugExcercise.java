package com.yuan.断点;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-29 10:32
 **/
public class DeBugExcercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 20);
        System.out.println(jack);
    }
}

class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}

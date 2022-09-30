package com.yuan.继承;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-24 11:30
 **/
public class Base {
    String name = "base";
    String age;

        public Base() {
            System.out.println("Base----");
        }

    public Base(String name) {
        super();
        this.name = name;
        System.out.println("很好");
    }

    protected Object fugai() {
        return null;
    }

    @Override
    public String toString() {
        return "Base{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

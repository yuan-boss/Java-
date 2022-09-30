package com.yuan.练习.excersise01.homework13;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-30 16:34
 **/
public class Person {
    private String name;
    private int age;
    private char gender;

    public String basicInfo() {
        return "姓名:" + name + "\n年龄" + age + "\n性别:" + gender;
    }

    public String play() {
        return name + "爱玩";
    }

    public void study() {
        System.out.println(getName()+ "承诺我会好好学Java");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

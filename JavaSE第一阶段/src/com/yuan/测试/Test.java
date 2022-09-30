package com.yuan.测试;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-21 09:19
 **/
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person(1, "1");
        Person p2 = new Person(1, "1");
        System.out.println(p1.compareTo(p2));
        p1.name = "kdfk";
        System.out.println(p1.name);

        boolean flag = 2 > 3;

    }

}

class Person{
    int age;
    String name;
    public Person(int age,String name){
        this.age = age;
        this.name = name;
    }
    public boolean compareTo(Person person){
        return this.age==person.age && this.name.equals(person.name);
    }
}

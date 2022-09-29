package com.yuan.多态.method_;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-26 14:21
 **/
public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Dog dog = new Dog("大黄dd");
        Bone bone = new Bone("大棒骨dd");
        Cat cat = new Cat("小花猫dd");
        Fish fish = new Fish("黄花鱼dd");
        tom.feed(dog,bone);
        tom.feed(cat,fish);
    }
}

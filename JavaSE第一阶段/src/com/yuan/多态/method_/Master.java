package com.yuan.多态.method_;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-26 14:19
 **/
public class Master {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        this.name = name;
    }

    public void feed(Animal animal,Food food){
        System.out.println("主人 "+name+" 给 "+animal.getName()+" 吃 "+food.getName());
    }

//    //主人给小狗喂骨头
//    public void feed(Dog dog,Bone bone){
//        System.out.println("主人 "+name+" 给 "+dog.getName()+" 吃 "+bone.getName());
//    }
//    //主人给小猫喂鱼
//    public void feed(Cat cat,Fish fish){
//        System.out.println("主人 "+name+" 给 "+cat.getName()+" 吃 "+fish.getName());
//    }
}

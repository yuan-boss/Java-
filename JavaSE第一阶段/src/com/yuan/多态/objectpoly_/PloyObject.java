package com.yuan.多态.objectpoly_;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-26 14:41
 **/
public class PloyObject {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal sdog = new SDog();
        Animal animal2 = new Animal();
        animal.cry();
//        animal = new Cat();
        animal.cry();
        Animal dog = (Animal) animal;
        System.out.println(animal2 instanceof Dog);
        Dog animal21 = (Dog) animal;
        animal21.cry();
        Dog dd = (Dog)sdog;
        dd.cry();
        System.out.println(sdog instanceof Dog);

        Object o = "3";
        System.out.println(o.toString());
        System.out.println(animal);
        System.out.println(animal.toString());
        System.out.println("=================================");
        ((Animal)animal).cry();

    }
}
class A{
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

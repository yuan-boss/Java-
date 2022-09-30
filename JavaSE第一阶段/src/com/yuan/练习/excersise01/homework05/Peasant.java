package com.yuan.练习.excersise01.homework05;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-30 14:26
 **/
public class Peasant extends Employ{
    public Peasant(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void printSal() {
        System.out.print("农民:");
        super.printSal();
    }
}

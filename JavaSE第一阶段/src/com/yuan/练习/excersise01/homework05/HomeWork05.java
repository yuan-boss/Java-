package com.yuan.练习.excersise01.homework05;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-30 14:23
 **/
public class HomeWork05 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 10000);
        jack.setSalMonth(13);
        jack.printSal();
        Peasant smith = new Peasant("smith", 20000);
        smith.printSal();
        Teacher yuan = new Teacher("yuan", 20000);
        yuan.setClassDay(200);
        yuan.setClassSal(1000);
        yuan.printSal();
        Scientist boss = new Scientist("boss", 50000);
        boss.setBonus(1000000);
        boss.printSal();
    }
}

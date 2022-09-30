package com.yuan.练习.excersise01.homework08.homework10;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-30 16:14
 **/
public class HomeWork10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("牙医", 22, "hell", 39999, '男');
        Doctor doctor1 = new Doctor("牙医", 22, "hell", 39999, '男');
        Doctor doctor2 = new Doctor("牙医2", 22, "hell", 39999, '男');
        System.out.println(doctor.equals(doctor1));
        System.out.println(doctor.equals(doctor2));
    }
}

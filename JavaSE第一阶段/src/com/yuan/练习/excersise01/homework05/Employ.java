package com.yuan.练习.excersise01.homework05;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-30 14:22
 **/
public class Employ {

    private String name;
    private double sal;
    private int salMonth = 12;
    public Employ(){

    }

    public Employ(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    public void printSal(){
        System.out.println(name + " 年工资是 " + (sal * salMonth));
    }
}

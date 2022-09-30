package com.yuan.练习.excersise01.homework05;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-30 14:28
 **/
public class Teacher extends Employ {
    private double classSal;
    private int classDay;

    public Teacher(String name, double sal) {
        super(name, sal);
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    @Override
    public void printSal() {
        System.out.print("老师 ");
        System.out.println(getName() + " 年工资是: " + (getSal() * getSalMonth()+ classSal*classDay));
    }
}

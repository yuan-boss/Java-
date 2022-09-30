package com.yuan.练习.excersise01.homework13;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-30 16:34
 **/
public class Teacher extends Person {
    private int workAge;

    public void printInfo() {
        System.out.println("老师的信息");
        System.out.println(super.basicInfo());
        System.out.println("工龄：" + workAge);
        teach();
        System.out.println(play());
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    public void teach() {
        System.out.println(getName() + "承诺我会认真教Java");
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }


    public Teacher(String name, int age, int workAge, char gender) {
        super(name, age, gender);
        this.workAge = workAge;
    }

    @Override
    public String toString() {
        return   "Teacher{" +
                "workAge=" + workAge +
                '}' + super.toString();
    }
}

package com.yuan.练习.excersise01.homework13;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-30 16:32
 **/
public class Student extends Person {
    private String stu_id;


    public void printInfo() {
        System.out.println("学生信息");
        System.out.println(super.basicInfo());
        System.out.println("学号：" + stu_id);
        study();
        System.out.println(play());
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public Student(String name, int age, String stu_id, char gender) {
        super(name, age, gender);
        this.stu_id = stu_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}' + super.toString();
    }
}

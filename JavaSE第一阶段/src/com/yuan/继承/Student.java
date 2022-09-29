package com.yuan.继承;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-24 11:31
 **/
public class Student extends Base{
//    String name = "studentName";
    int ss = 3;
//    public Student() {
//        super("d");
//        System.out.println("student--");
//    }
    public Student(String name) {
        System.out.println("student--");
    }
    public Student(String name,String age) {
        String ddd = super.name;
        System.out.println("student--");
    }
    public void m(){
        System.out.println(name);
        System.out.println(this.name);
    }

    @Override
    protected String fugai() {
        super.fugai();
        return null;
    }
    private String fugai(int a){
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

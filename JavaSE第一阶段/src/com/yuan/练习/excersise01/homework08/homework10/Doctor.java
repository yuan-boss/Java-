package com.yuan.练习.excersise01.homework08.homework10;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-30 16:07
 **/
public class Doctor {
    private String name;
    private int age;
    private String job;
    private double sal;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Doctor(String name, int age, String job, double sal, char gender) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.sal = sal;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Doctor)) {
            return false;
        }
        Doctor doctor = (Doctor)obj;
        return this.age==doctor.age && this.name.equals(doctor.name) &&
                this.gender==doctor.gender && this.job.equals(doctor.job) && this.sal==doctor.sal;
    }
}

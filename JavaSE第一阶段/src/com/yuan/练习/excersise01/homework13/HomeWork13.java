package com.yuan.练习.excersise01.homework13;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-30 16:32
 **/
public class HomeWork13 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张飞", 30, 5, '男');
        teacher.printInfo();
        Student student = new Student("小明", 15, "00023102", '男');
        System.out.println("=====================================");
        student.printInfo();


        Person[] persons = new Person[4];
        persons[0] = new Student("Jack",10,"0001",'男');
        persons[1] = new Student("mary",20,"0002",'女');
        persons[2] = new Teacher("smith",36,5,'男');
        persons[3] = new Teacher("scott",26,1,'女');
        HomeWork13 homeWork13 = new HomeWork13();
        homeWork13.bubbleSort(persons);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

        System.out.println("======================");
        for (int i = 0; i < persons.length; i++) {
            homeWork13.test(persons[i]);
        }
    }

    public void bubbleSort(Person[] persons){
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() < persons[j+1].getAge()){
                    temp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = temp;
                }
            }
        }
    }

    public void test(Person person){
        if (person instanceof Student) {
            ((Student)person).study();
        }else if (person instanceof Teacher) {
            ((Teacher)person).teach();
        }else {
            System.out.println("do nothing......");
        }
    }
}

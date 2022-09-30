package com.yuan.继承;

import java.lang.reflect.Field;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-24 11:32
 **/
public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Base student = new Student("age");
        System.out.println("=======================");
        Class<? extends Base> stu = student.getClass();
        Field field = stu.getDeclaredField("age");
        field.setAccessible(true);
        Integer o = (Integer) field.get(student);
        System.out.println(o);

    }
}

package com.yuan.输入Scanner;

import java.util.Scanner;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-14 08:46
 **/
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.next();
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        System.out.println("请输入薪水：");
        double salary = scanner.nextDouble();
        System.out.println("个人信息如下：");
        System.out.println("名字 = " + name  +" 年龄 = " + age  + " 薪水 = " + salary);

    }
}

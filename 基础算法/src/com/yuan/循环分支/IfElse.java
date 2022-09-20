package com.yuan.循环分支;

import java.util.Scanner;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-15 10:19
 **/
public class IfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入月份不合法，请输入合法月份(1-12");
        }
        System.out.println("程序继续执行");

    }
}

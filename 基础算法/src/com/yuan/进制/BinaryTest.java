package com.yuan.进制;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-14 08:57
 **/
public class BinaryTest {
    public static void main(String[] args) {
        int n1 = 0b1010;
        int n2 = 1900;
        int n3 = 021;
        int n4 = 0x12;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        System.out.println("=========================================");
        System.out.println(1>>2);
        System.out.println(-1>>2);
        System.out.println(1<<2);
        System.out.println(-1<<2);
        System.out.println("=============================================");
        System.out.println(~2);
        System.out.println("=======================================");
        System.out.println(2|3);
        System.out.println(2 ^ 3);
        System.out.println("=======================================");
        System.out.println(-1 >> 1);
        System.out.println(-1 >> 5);
        System.out.println(1 << 2);
        System.out.println(-1 << 2);
        System.out.println(-3>>>2);
        System.out.println(-3>>2);
        System.out.println("=========================");
        System.out.println(7 >> 2);
        System.out.println(-10.5 % 3);
        System.out.println(-10 % 3);
        System.out.println(10 % -3);
        System.out.println(10 / 3);
        System.out.println(-10 / 3);
        System.out.println(-10 / -3);
        System.out.println(10 / -3);
        System.out.println("==============================");
        System.out.println(10.5 % 2.5);
        System.out.println(3d);
        char ch = '韩';
        String str = ch + "";
        System.out.println(str);
        System.out.println(ch);
    }
}

package com.yuan.二分查找;

/**
 * @module:
 * @description: 二分取中间值时整数溢出
 * @author: yuan_boss
 * @create: 2022-08-30 15:33
 **/
public class IntegerOverflow {
    public static void main(String[] args) {
        method1();
        System.out.println("===========================");
        method2();


    }

    //公式演变
    private static void method1() {
        int l = 0;
        int r = Integer.MAX_VALUE - 1;
        //int m = (l + r) / 2;
        // l/2 + r/2 ==> l - l/2 + r/2 ==>  l + (r - l) / 2
        int m = l + (r - l) / 2;
        System.out.println(m);

        //目标值在中间值的右侧
        l = m + 1;
        m = l + (r - l) / 2;
        System.out.println(m);
    }
    //无符号移位（推荐）
    private static void method2() {
        int l = 0;
        int r = Integer.MAX_VALUE - 1;
        int m = (l + r) >>> 1;
        System.out.println(m);

        //目标值在中间值的右侧
        l = m + 1;
        m = (l + r) >>> 1;
        System.out.println(m);
    }


}

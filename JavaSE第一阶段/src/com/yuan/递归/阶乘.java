package com.yuan.递归;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-20 14:57
 **/
public class 阶乘 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        if (n == 1){
            return 1;
        }else {
            return factorial(n - 1) * n;
        }
    }
}

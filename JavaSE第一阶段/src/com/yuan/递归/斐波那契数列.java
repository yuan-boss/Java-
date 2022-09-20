package com.yuan.递归;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-20 15:07
 **/
public class 斐波那契数列 {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    public static int fibonacci(int n){
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            }else{
                return fibonacci(n-1) + fibonacci(n-2);
            }
        }else {
            return -1;
        }
    }
}

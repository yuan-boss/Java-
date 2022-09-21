package com.yuan.排序;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-17 08:48
 **/
public class 数组的翻转 {
    public static void main(String[] args) {

        /**
         * 数组的翻转
         * 数组逆序赋值
         * 定义一个长度一样的数组
         * for循环，初始化两个变量，循环迭代两个变量，分别是原数组下标，新数组下标
         * 将逆序数组赋值给原来的数组，实现数组的反转
         */
        int arr1[] = {1,2,3};
        int arr2[] = new int[arr1.length];
        for (int i = arr1.length-1, j = 0; i >= 0 ; i--,j++) {
            arr2[j] = arr1[i];
        }
        arr1 = arr2;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print (arr1[i] + " ");
        }

    }
}

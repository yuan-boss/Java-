package com.yuan.选择排序;

import java.util.Arrays;

/**
 * @module:
 * @description: 选择排序
 * @author: yuan_boss
 * @create: 2022-08-31 11:12
 **/
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {5,9,7,4,1,3,2,8};
        selection(a);
    }

    private static void selection(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            // i 代表每轮选择最小元素要交换到目标索引
            int min = i; //代表最小元素的索引值
            for (int j = min + 1; j < a.length ; j++) {
                if (a[min] > a[j]){
                    min = j;
                }
            }

            if (min != i){
                swap(a,min,i);
            }
            System.out.println( Arrays.toString(a));

        }
    }

    public static void swap(int[] a ,int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

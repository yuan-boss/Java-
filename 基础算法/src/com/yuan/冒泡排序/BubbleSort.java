package com.yuan.冒泡排序;

import java.util.Arrays;

/**
 * @module:
 * @description: 冒泡排序
 * @author: yuan_boss
 * @create: 2022-08-30 17:43
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5,9,7,4,1,3,2,8};
        bubble_v2(a);
    }

    public static void bubble_v2(int[] a){
        int n = a.length - 1;
        while (true){
            int last = 0;  //表示最后一次交换索引的位置
            for (int i = 0; i < n; i++){
                System.out.println("比较次数:" + (i+1));
                if (a[i] > a[i+1]){
                    swap(a,i,i+1);
                    last = i;
                }
            }
            n = last;
            System.out.println("第" + "轮冒泡" + Arrays.toString(a));
            if (n == 0) {
                break;
            }
        }

    }
    public static void bubble(int[] a){

        for (int j = 0; j < a.length - 1; j++) {
            //一轮冒泡
            boolean swapped = false;
            for (int i = 0; i < a.length - 1 - j; i++) {
                System.out.println("比较次数:" + (i+1));
                if (a[i] > a[i+1]){
                    swap(a,i,i+1);
                    swapped = true;
                }
            }
            System.out.println("第" + (j+1) + "轮冒泡" + Arrays.toString(a));
            if (!swapped){
                break;
            }
        }


    }

    public static void swap(int[] a ,int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

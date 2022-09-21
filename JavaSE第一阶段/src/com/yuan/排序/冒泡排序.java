package com.yuan.排序;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-17 14:33
 **/
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,2,9,1,55};
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap){
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

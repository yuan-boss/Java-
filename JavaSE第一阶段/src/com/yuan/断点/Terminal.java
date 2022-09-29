package com.yuan.断点;

import java.util.Arrays;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-29 09:32
 **/
public class Terminal {
    public static void main(String[] args) {
        int[] arr = new int[]{1,7,4,66,3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}

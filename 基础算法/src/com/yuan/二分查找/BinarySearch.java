package com.yuan.二分查找;


/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-08-30 14:21
 **/
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,5,8,11,19,22,31,35,40,45,48,49,50,52};
        int target = 52;
        int index = binarySearch(array,target);
        System.out.println(index);
    }


    //二分查找，找到了即返回索引，未找到返回-1
    private static int binarySearch(int[] a, int t) {
        int l = 0, r = a.length - 1,m;
        while (l <= r) {
            m = (l+r) / 2;
            if (a[m] == t){
                return m;
            } else if (a[m] > t) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return -1;
    }
}

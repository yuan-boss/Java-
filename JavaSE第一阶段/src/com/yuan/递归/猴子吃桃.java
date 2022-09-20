package com.yuan.递归;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-20 15:18
 **/
public class 猴子吃桃 {
    /**
     * 猴子吃桃子问题:有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个!以后每天猴子都吃其中的一半，然后再多吃一个。当到第10天时
     * 想再吃时(即还没吃)，发现只有1个桃子了。问题:最初共多少个桃子?
     */
 /**   思路分析
        逆推
        1.day = 10时 有1个桃子
        2.day =9时 有(day10 +1)*2 =4
        3.day = 8时 有（(day9 + 1)* 2 = 10
        4.规律就是前一天的桃子=(后一天的桃子+1)*2
        5.递归
  */

    public static void main(String[] args) {
        System.out.println(  (1));
    }
    public static int peach(int day){
        if (day == 10){
            return 1;
        }else if (day>=1 && day<=9){
            return (peach(day + 1) + 1) * 2;
        }else {
            System.out.println("请输入1-10范围的数字");
            return -1;
        }
    }
}

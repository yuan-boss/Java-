package com.yuan.递归;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-20 17:16
 **/
public class 汉诺塔 {
    public static void main(String[] args) {
        TH th = new TH();
        th.move(3,'A','B','C');
    }
}

class TH{

    //num表示要移动的个数，a,b,c分别表示A，B，C塔
    public void move(int num,char a,char b,char c){
        if (num == 1) {
            System.out.println(a + "->" + c);
        }else {
            //如果有多个盘，可以看成两个，最下面的和上面的所有盘(num-1)
            //1.先移动上面所有盘到b,借助c
            move(num - 1,a,c,b);
            //2.把最下面的这个盘，移动到c
            System.out.println(a + "->" + c);
            //3.再把b塔的所有盘，移动到c，借助a
            move(num - 1,b,a,c);
        }
    }
}

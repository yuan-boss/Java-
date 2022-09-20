package com.yuan.递归;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-20 16:02
 **/
public class 迷宫 {


    public static void main(String[] args) {
        //思路：
        //1.先创建迷宫，用二维数组表示 int[][] map = new int[8][7];
        //2.先规定map数组的元素值：0表示可以走，1表示障碍物
        int[][] map = new int[8][7];
        //3.将最上面的一行和最下面的一行，全部设置为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //4.将最上左边的一行和最右边的一行，全部设置为1
        for (int i = 1; i < 7; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        //单独设置障碍物
        map[3][1] = 1;
        map[3][2] = 1;
//        map[1][2] = 1;
        map[2][2] = 1;
//        map[2][1] = 1;


        System.out.println("=================当前地图情况===============");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        //使用findWay给老鼠找路
        T t = new T();
        t.findWay(map,1,1);
        System.out.println("=================找路的情况如下===============");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
}

class T{
    //使用递归回溯的思想解决老鼠出迷宫
    //1. findWay方法就是找出迷宫的路径，
    //2. 找到返回true，没找到返回false
    //3. map是指二维数组，表示迷宫
    //4. i,j就是老鼠的位置，初始化位置为（1,1）
    //5.因为我们是递归的找路，所以我们先规定map数组的各个值的含义
    //  0表示可以走，1表示障碍物，2表示可以走通，3表示走过，但是走不通，是死路
    //6.当map[6][5] = 2，说明找到通路了，就可以结束，否则继续找
    //7.先确定老鼠找路的策略 下->右->-上->左
    public boolean findWay(int[][] map,int i,int j){
        if (map[6][5] == 2) {//说明已经找到
            return true;
        }else {
            if (map[i][j] == 0){//当前位置=0，说明路可以走
                //我们假定可以走通
                map[i][j] = 2;
                //使用找路策略，来确定该位置是否真的可以走通
                //下->右->-上->左
                if (findWay(map,i+1,j)) {//先走下
                    return true;
                } else if (findWay(map,i,j+1)) {//向右走
                    return true;
                } else if (findWay(map, i - 1, j)) {//向上走
                    return true;
                } else if (findWay(map, i, j-1)) {//向左走
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            }else {//map[i][j] == 1,2,3
                return false;
            }
        }

    }

    //修改找路策略，看看路径是否有变化
    //下->右->-上->左  ===>  上->右->-下->左
    public boolean findWay2(int[][] map,int i,int j){
        if (map[6][5] == 2) {//说明已经找到
            return true;
        }else {
            if (map[i][j] == 0){//当前位置=0，说明路可以走
                //我们假定可以走通
                map[i][j] = 2;
                //使用找路策略，来确定该位置是否真的可以走通
                //下->右->-上->左
                if (findWay2(map,i-1,j)) {//先走上
                    return true;
                } else if (findWay2(map,i,j+1)) {//向右走
                    return true;
                } else if (findWay2(map, i + 1, j)) {//向下走
                    return true;
                } else if (findWay2(map, i, j-1)) {//向左走
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            }else {//map[i][j] == 1,2,3
                return false;
            }
        }

    }
}

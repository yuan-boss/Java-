package com.yuan.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @module:
 * @description: 该类是完成零钱通的各个功能的类
 * 使用OOP（面向对象编程）
 * 将各个功能封装成一个方法
 * @author: yuan_boss
 * @create: 2022-09-29 16:00
 **/
public class SmallChangeOOP {

    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    //2.完成零钱通明细
    String details = "----------------零钱通明细---------------------";
    //3.完成收益入账
    //定义新变量
    double money = 0;//金额变化
    double balance = 0;//余额
    Date date = null;//时间
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    //4.消费
    //定义新变量，保存消费原因
    String note = "";

    //先完成显示菜单，并可以选择
    public void mainMenu(){
        do{
            System.out.println("\n===================选择零钱通菜单(OOP)==============");
            System.out.println("1 零钱通明细");
            System.out.println("2 收益入账");
            System.out.println("3 消费");
            System.out.println("4 退    出");
            System.out.print("请选择(1—4):");
            key = scanner.next();
            switch (key){
                case "1":
                    this.detail();
                    break;
                case "2":
                   this.income();
                    break;
                case "3":
                   this.pay();
                    break;
                case "4":
                   this.exit();
                   break;
                default:
                    System.out.println("选择有误，请重新选择");
            }

        }while (loop);
    }

    //完成零钱通明细
    public void detail(){
        System.out.println(details);
    }

    //完成收益入账
    public void income(){
        System.out.print("收益入账金额");
        money = scanner.nextDouble();
        if (money <= 0){
            System.out.println("收益入账金额需要大于0");
            return;
        }
        balance += money;
        //拼接收益入账信息到details
        date = new Date();//获取当前日期
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //完成消费
    public void pay(){
        System.out.print("消费金额:");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("你的消费金额 应该在 0-" + balance);
            return;
        }
        //money的值需要校验
        System.out.print("消费说明:");
        note = scanner.next();
        balance -= money;
        //拼接消费信息到details
        date = new Date();//获取当前日期
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
        return;
    }
    public void exit(){
        //1.定义一个变量
        //2.使用while + break，来处理接收到的输入时 y或者n
        //3.退出while后，再判断choice是y还是n，就可以决定是否退出
        String choice = "";
        while (true){
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if ("y".equals(choice)) {
            loop = false;
        }
        return;
    }



}

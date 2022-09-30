package com.yuan.练习.excersise01.homework08;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-30 15:16
 **/
public class HomeWork08 {
    public static void main(String[] args) {
//        CheckingAccount account = new CheckingAccount(1000);
//        account.deposit(10);
//        account.withdraw(9);
//        System.out.println(account.getBalance());

        SavingAccount account = new SavingAccount(1000);
        account.deposit(100);
        account.deposit(100);
        account.deposit(100);
        account.deposit(100);
        System.out.println(account.getBalance());

        account.earnMonthlyInsert();
        System.out.println(account.getBalance());
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        System.out.println(account.getBalance());
        account.deposit(100);
        System.out.println(account.getBalance());

    }
}

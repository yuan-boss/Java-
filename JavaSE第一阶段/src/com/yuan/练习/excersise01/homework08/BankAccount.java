package com.yuan.练习.excersise01.homework08;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-30 15:16
 **/
public class BankAccount {
    private double balance;//余额

    public BankAccount(double balance) {
        this.balance = balance;
    }

    //存款
    public void deposit(double amount) {
        balance += amount;

    }
    //取款
    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

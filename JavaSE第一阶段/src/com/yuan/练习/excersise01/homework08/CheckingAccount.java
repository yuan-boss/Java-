package com.yuan.练习.excersise01.homework08;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-30 15:18
 **/
public class CheckingAccount extends BankAccount{

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {//存款
        super.deposit(amount-1);
    }

    @Override
    public void withdraw(double amount) {//取款
        super.withdraw(amount + 1);
    }
}

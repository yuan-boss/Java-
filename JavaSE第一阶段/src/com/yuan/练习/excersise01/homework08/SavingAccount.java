package com.yuan.练习.excersise01.homework08;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-30 15:47
 **/
public class SavingAccount extends BankAccount{

    private int count = 3;
    private double rate = 0.01;

    public void earnMonthlyInsert(){
        count=3;
        super.deposit(getBalance() * rate);//存款
    }

    @Override
    public void deposit(double amount) {
        if (count > 0){
            super.deposit(amount);
            count--;
        }else {
            super.deposit(amount - 1);
        }


    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
            count--;
        }else {
            super.withdraw(amount + 1);
        }


    }

    public SavingAccount(double balance) {
        super(balance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}

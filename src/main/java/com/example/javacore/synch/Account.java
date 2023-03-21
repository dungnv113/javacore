package com.example.javacore.synch;

import java.util.concurrent.TimeUnit;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(String name, int money) throws InterruptedException {

        System.out.println(name + " is withdrawing ");

        if (balance >= money) {
            balance -= money;
            System.out.println(name + " success " + balance);
        } else {
            System.out.println(name + " not enough money " + balance);
        }
    }
}

package com.example.javacore.synch;

public class Customer implements Runnable {
    private String name;
    private Account acount;

    public Customer(String name, Account acount) {
        this.name = name;
        this.acount = acount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            acount.withdraw(name, 50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

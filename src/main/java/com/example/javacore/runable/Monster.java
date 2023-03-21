package com.example.javacore.runable;

import java.util.List;

public class Monster implements Runnable {
    private List<Monkey> monkeyList;

    public Monster(List<Monkey> monkeyList) {
        this.monkeyList = monkeyList;
    }

    @Override
    public void run() {
        if (monkeyList != null)
            System.out.println(Thread.currentThread().getName());
            System.out.println(monkeyList.size());
    }
}

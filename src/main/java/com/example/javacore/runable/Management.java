package com.example.javacore.runable;

import java.util.ArrayList;

public class Management {
    public static void main(String[] args) {
        Monster monster = new Monster(new ArrayList<Monkey>());

       Thread thread = new Thread(monster, "test");
       thread.start();
    }
}

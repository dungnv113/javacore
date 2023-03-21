package com.example.javacore.basic.oop;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("I am an animal.");
    }
}


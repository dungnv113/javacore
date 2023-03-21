package com.example.javacore.basic.oop;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("I am a dog named " + name);
    }
}
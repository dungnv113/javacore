package com.example.javacore.basic.oop;


public class Car extends Vehicle {
    @Override
    public void accelerate() {
        speed += 10;
    }
}
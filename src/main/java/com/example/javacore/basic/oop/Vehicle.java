package com.example.javacore.basic.oop;

public abstract class Vehicle {
    protected int speed;

    public abstract void accelerate();

    public void brake() {
        speed = 0;
    }
}

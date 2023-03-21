package com.example.javacore.functionalInterface;
@FunctionalInterface
interface Greeting {
    void say(String name);
}

public class Main {
    public static void main(String[] args) {
        Greeting greeting = (name) -> System.out.println( name );
        greeting.say("Dung");
    }
}

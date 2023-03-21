package com.example.javacore.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Dung");
        stringList.add("Ngoc");
        stringList.add("Java");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        System.out.println("String list" + stringList);
        System.out.println("Integer list" + integerList);
    }
}

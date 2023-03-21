package com.example.javacore.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");

        // Creating a LinkedHashSet
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("apple");
        linkedSet.add("banana");
        linkedSet.add("orange");

        // Printing the HashSet
        System.out.println("HashSet:");
        for (String s : set) {
            System.out.println(s);
        }

        // Printing the LinkedHashSet
        System.out.println("LinkedHashSet:");
        for (String s : linkedSet) {
            System.out.println(s);
        }
    }
}

package com.example.javacore.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        // Sorting the list
        Collections.sort(list);

        // Printing the sorted list
        for (String s : list) {
            System.out.println(s);
        }
    }

}

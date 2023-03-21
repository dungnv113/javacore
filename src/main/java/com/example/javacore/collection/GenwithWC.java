package com.example.javacore.collection;

import java.util.*;

public class GenwithWC {
    public static void printList(List<?> list) {
        for (Object elem : list)
            System.out.print(elem + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> strList = Arrays.asList("one", "two", "three");
        List<Object> objList = Arrays.asList("four", 5, 6.0);

        printList(intList);
        printList(strList);
        printList(objList);
    }
}

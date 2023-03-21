package com.example.javacore.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
        public static void main(String[] args) {
            Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            int sum = Arrays.stream(numbers)
                    .filter(n -> n % 2 == 0)
                    .mapToInt(Integer::intValue)
                    .sum();

            System.out.println("Sum of even numbers: " + sum);
        }
    }



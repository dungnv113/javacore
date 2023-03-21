package com.example.javacore.basic.controlflow;

public class ControlFlow {
    public static void main(String[] args) {
        int number = 5;

        // Cấu trúc điều khiển if-else
        if (number < 0) {
            System.out.println("Số âm");
        } else if (number == 0) {
            System.out.println("Số không");
        } else {
            System.out.println("Số dương");
        }

        // Cấu trúc điều khiển switch case
        switch (number) {
            case 0:
                System.out.println("Số không");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("Số nhỏ");
                break;
            default:
                System.out.println("Số lớn");
                break;
        }
    }
}


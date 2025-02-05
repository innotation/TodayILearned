package com.ino.section04.comparison;

public class Application1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        boolean result = a > b;

        System.out.println("a > b : " + result);
        boolean result2 = a < b;
        System.out.println("a < b : " + (a < b));
    }
}

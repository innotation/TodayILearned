package com.ino.section03.in_decrement;

public class Application2 {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        System.out.printf("a = %d, b = %d\n", a, b);
        int c = 20;
        int result1 = ++c * 3;

        int d = 20;
        int result2 = d++ * 3;

        System.out.printf("c = %d, d = %d\n", result1, result2);
    }
}

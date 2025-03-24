package com.ino.section05.logical;

public class Application1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println("a가  b보다 작으면서 c가 d보다 작은지: " + ( a < b && c < d));
        System.out.println("a가  b보다 작으면서 c가 d보다 큰지: " + ( a < b && c > d));
        System.out.println("a가  b보다 크면서 c가 d보다 큰지: " + ( a > b && c > d));
        System.out.println("a가  b보다 크거나 c가 d보다 큰지: " + ( a > b || c > d));
        System.out.println("b가  a보다 크거나 c가 a보다 작은지: " + ( a < b || c < a));
    }
}

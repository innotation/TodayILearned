package com.ino.section03.in_decrement;

public class Application3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = (++a) + b;
        int d = c/ a;
        int e = c % a;
        int f = e++;
        int g = (--b) + (d--);
        int h = 2;
        int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        System.out.println("e = " + e + ", g = " + g + ", h = " + h + ", i = " + i);
    }
}

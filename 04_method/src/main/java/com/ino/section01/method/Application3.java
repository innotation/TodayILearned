package com.ino.section01.method;

public class Application3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum1 = calc.sum(10, 20);
        double sum2 = calc.sum(20.0, 30.0);
        System.out.printf("sum1 = %d, sum2 = %.1f\n", sum1, sum2);
        calc.minus(10, 20);
    }
}

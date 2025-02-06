package com.ino.section01.method;

public class Calculator {
    public void info1() {
        System.out.println("it's a  calculator");
    }

    public void info2() {
        System.out.println("it's a calculator with minus operation");
    }

    public void printNumber(int num) {
        System.out.println(num);
    }
    public void printNumber(double num) {
        System.out.println(num);
    }
    public void printNumber(int num1, double num2) {
        System.out.println(num1 + " " + num2);
    }
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
    public double sum(double num1, double num2) {
        return num1 + num2;
    }
    public void minus(int num1, int num2) {
        System.out.println(num1 - num2);
    }
    public int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
    public int min(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
    }
}

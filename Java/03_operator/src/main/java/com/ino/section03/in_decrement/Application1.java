package com.ino.section03.in_decrement;

public class Application1 {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println("first number is " + num1);
        System.out.println("second number is " + ++num1);
        System.out.println("third number is " + ++num1);
        System.out.println("fourth number is " + ++num1);

        //후위 연산
        int num2 = 10;
        System.out.println("first number is " + num2);
        System.out.println("second number is " + num2++);
        System.out.println("third number is " + num2++);
        System.out.println("final number is " + num2);
    }
}

package com.ino.section06.ternary;

public class Application6 {
    public static void main(String[] args) {
        // 두 정수값과 하나의 연산기호를 통해 연산 결과 출력
        int num1 = 2;
        int num2 = 3;
        char ch = '-';
        String str = ch == '+' ? String.valueOf(num1+num2) : ch == '-' ? String.valueOf(num1-num2) : "wrong mark";
        System.out.println(str);
    }
}

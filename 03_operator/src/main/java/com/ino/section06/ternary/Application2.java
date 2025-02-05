package com.ino.section06.ternary;

public class Application2 {
    public static void main(String[] args) {
        // 특정 정수값 짝, 홀수 판별 후 출력
        int num = (int) Math.random();
        System.out.println(num);
        String answer = num % 2 == 0 ? "Even" : "Odd";
        System.out.println(answer);
    }
}

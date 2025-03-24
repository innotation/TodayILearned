package com.ino.section06.ternary;

public class Application4 {
    public static void main(String[] args) {
        // 특정 문자값이 영문자인지 아닌지 판단 후 출력
        char ch = 'F';
        System.out.println((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) ? "영문자이다" : "영문자가 아니다" );
    }
}

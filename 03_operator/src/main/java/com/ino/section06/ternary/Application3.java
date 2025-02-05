package com.ino.section06.ternary;

public class Application3 {
    public static void main(String[] args) {
        char ch = 'y';

        String result = (ch == 'y' || ch == 'Y' ? "프로그램 종료" : "계속 진행");
        System.out.println(result);
    }
}

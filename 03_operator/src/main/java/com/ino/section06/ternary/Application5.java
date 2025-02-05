package com.ino.section06.ternary;

public class Application5 {
    public static void main(String[] args) {
        int num = 0;
        String result = num > 0 ? "양수" : num == 0 ? "0" : "음수";
        System.out.println(result);
    }
}

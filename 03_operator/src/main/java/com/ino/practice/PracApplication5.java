package com.ino.practice;

public class PracApplication5 {
    public static void main(String[] args) {
        int randInt = (int) (Math.random() * 100);
        System.out.println(randInt <= 13 ? "어린이" : randInt<=19 ? "청소년" : "성인");
    }
}

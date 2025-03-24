package com.kangbroo.practice;

public class PracApplication5 {
    public static void main(String[] args) {
        double langScore = 80.5;
        double mathScore = 50.6;
        double englishScore = 70.8;

        System.out.printf("total Score: %d\n", (int)(langScore + mathScore + englishScore));
        System.out.printf("avg Score: %d\n", (int)(langScore + mathScore + englishScore) / 3);
    }
}

package com.ino.section03.etc.controller;

public class Continue {
    public void testBasicContinue() {
        for (int i=1; i<=10; i+=2) {
//            if (i % 2 == 0) {
//                continue;
//            }
            System.out.println(i + " ");
        }
    }

    public void testContinueExample1() {
        int sum = 0;
        for(int i=1; i<=100; i++) {
            if (i % 6 == 0) {
                continue;
            }
            sum += 1;
        }
    }
}

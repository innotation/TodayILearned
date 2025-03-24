package com.ino.section02.loop.controller;

import java.util.Scanner;

public class While {
    public void testBasicWhile() {
        int count = 0;
        while (count < 5) {
            System.out.println("Hi");
            count++;
        }
    }

    public void testBasicDoWhile() {
        do {
            System.out.println("DowhileEx");
        } while(false);
    }

    public void testDoWhileExample() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input int: ");
        int inputNum = sc.nextInt();

        int num = 1;

        do {
            System.out.println(num++);
        } while(num<=inputNum);
    }
}

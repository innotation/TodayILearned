package com.ino.section01.conditional.controller;

import java.util.Scanner;

public class If {

    public void testBasicIf(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Score: ");
        int score = sc.nextInt();
        if ( score >= 60 ) {
            System.out.println("pass");
        }
    }

    public void testBasicElse(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Score: ");
        int score = sc.nextInt();
        if ( score >= 60 ) {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
    }

    public void testBasicElseIf(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Score: ");
        int score = sc.nextInt();
        if ( score >= 80 ) {
            System.out.println("pass");
        }
        else if(score >= 60) {
            System.out.println("test again");
        }
        else {
            System.out.println("fail");
        }
    }
    public void testIfExample() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age <= 13) {
            System.out.println("어린이");
        }
        else if (age <= 19) {
            System.out.println("청소년");
        }
        else {
            System.out.println("성인");
        }
    }

    public void testIfExample2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("name: ");
        String name = sc.nextLine();
        String result;
        System.out.print("gender(M/F): ");
        char gender = sc.next().toUpperCase().charAt(0);

        if (gender == 'M') {
            result = "man";
        }
        else if (gender == 'F') {
            result = "woman";
        }
        else {
            result = "error";
        }

        System.out.println(name + " is " + result);
    }

    public void testIfExample3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("name: ");
        String name = sc.nextLine();
//        if (name == "홍길동") {
//            System.out.println("반갑습니다");
//        }
//        else {
//            System.out.println("안녕히가세요");
//        }
        if (name.equals("홍길동")) {
            System.out.println("반갑습니다");
        }
        else {
            System.out.println("안녕히가세요");
        }
    }

    public void testNestedIf() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수(양수) 입력: ");
        int num = sc.nextInt();
        if ( num < 0 ) {
            System.out.println("양수가 아닙니다. 잘못 입력하셨습니다.");
        }
        else if ( num % 3 == 0 ) {
            System.out.println("3의 배수입니다.");
        }
        else {
            System.out.println("3의 배수가 아닙니다.");
        }
    }
    public void testNestedIfExample() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학년(1-6): ");
        int grade = sc.nextInt();
//        if ( grade >= 1 && grade <= 3 ) {
//            System.out.print("점수: ");
//            int score = sc.nextInt();
//            if ( score >= 60 ) {
//                System.out.print("합격");
//            }
//            else {
//                System.out.println("불합격");
//            }
//        }
//        else if (grade >= 4 && grade <= 6) {
//            System.out.print("점수: ");
//            int score = sc.nextInt();
//            if ( score >= 70 ) {
//                System.out.print("합격");
//            }
//            else {
//                System.out.println("불합격");
//            }
//        }
//        else {
//            System.out.println("잘못된 숫자");
//        }
        System.out.print("점수: ");
        int score = sc.nextInt();
        int passScore = 0;
        if ( grade >= 1 && grade <= 3 ) {
            passScore = 60;
        }
        else if (grade >= 4 && grade <= 6) {
            passScore = 70;
        }
        else {
            System.out.println("잘못된 숫자");
        }
        if (score >= passScore) {
            System.out.println("합격");
        }
        else {
            System.out.println("불합격");
        }
    }
    public void testNestedIfExample2() {
        Scanner sc = new Scanner(System.in);
        String userId = sc.nextLine();
        if (userId.length() == 14) {
            char gender = userId.charAt(7);
            if (gender == '1' || gender == '3') {
                System.out.println("남자");
            }
            else if (gender == '2' || gender == '4') {
                System.out.println("여자");
            }
            else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
        else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
    public char getGender() {
        Scanner sc = new Scanner(System.in);
        char gender = sc.nextLine().toUpperCase().charAt(0);
        return gender;
    }
}

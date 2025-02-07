package com.ino.section01.conditional.controller;

import java.util.Scanner;

public class Switch {
    public void testBasicSwitch() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("red");
                break;
            case 2:
                System.out.println("blue");
                break;
            case 3:
                System.out.println("green");
                break;
            default:
                System.out.println("wrong number");
                break;
        }
    }

    //    public void testSwitchExample1() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print ("Enter a drink: ");
//        switch (sc.nextLine()) {
//            case "사이다":
//                System.out.println("500원을 투입해주세요.");
//                break;
//            case "콜라":
//                System.out.println("600원을 투입해주세요.");
//                break;
//            case "환타":
//                System.out.println("700원을 투입해주세요.");
//                break;
//            case "박카스":
//                System.out.println("2000원을 투입해주세요.");
//                break;
//            case "핫식스":
//                System.out.println("10000원을 투입해주세요.");
//                break;
//            default:
//                System.out.println("wrong drink");
//        }
//    }
    public void testSwitchExample1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a drink: ");
        int price = 0;
        switch (sc.nextLine()) {
            case "사이다":
                price = 500;
                break;
            case "콜라":
                price = 600;
                break;
            case "환타":
                price = 700;
                break;
            case "박카스":
                price = 2000;
                break;
            case "핫식스":
                price = 10000;
                break;
            default:
                System.out.println("wrong drink");
        }
        System.out.printf("%d원을 투입해주세요.", price);
    }

    public void testSwitchExample2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("성별(m/f): ");
        char gender = sc.nextLine().charAt(0); // 'm' 'M' 'f' 'F'

        String genderStr = "";

        switch (gender) {
            case 'm', 'M': genderStr = "남학생"; break;
            case 'f': case 'F': genderStr = "여학생"; break;
            default:
                System.out.println("wrong gender");
        }
        if (genderStr != "") System.out.println(genderStr);
    }

    public void testSwitchExample3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("month(1-12): ");
        int month = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("wrong month");
            return;
        }
        switch (month) {
            case 2: System.out.println(28); break;
            case 4, 6, 9, 11: System.out.println(30); break;
            default: System.out.println(31);;
        }
    }
}

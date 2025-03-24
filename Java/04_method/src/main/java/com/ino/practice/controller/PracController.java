package com.ino.practice.controller;

import java.util.Scanner;

public class PracController {

    public void practice1() {
        // 이름(String), 성별(char), 나이(int), 키(double)를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
        Scanner sc = new Scanner(System.in);
        System.out.print("name: ");
        String name = sc.nextLine();
        System.out.print("gender: ");
        char gender = sc.next().charAt(0);
        System.out.print("age: ");
        int age = sc.nextInt();
        System.out.print("height: ");
        double height = sc.nextDouble();
        System.out.printf("키 %.1f인 %d살 %c자 %s님 반갑습니다^^", height, age, gender, name);
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a word: ");
        String word = sc.nextLine();
        if (word.length() >= 3) {
            System.out.println(word.charAt(0));
            System.out.println(word.charAt(1));
            System.out.println(word.charAt(2));
        } else {
            System.out.println("Error Occured");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("name: ");
        String name = sc.nextLine();
        System.out.print("grade: ");
        int grade = sc.nextInt();
        System.out.print("class: ");
        int classroom = sc.nextInt();
        System.out.print("number: ");
        int number = sc.nextInt();
        System.out.print("gender(M/F): ");
        char gender = sc.next().charAt(0);
        System.out.print("output: ");
        double output = sc.nextDouble();
        System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.", grade, classroom, number, name, gender, output);
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호를 입력하세요(- 포함) :");
        String num = sc.nextLine();
        String[] numbers = num.split("-");
        if (numbers[1].charAt(0) == '2' || numbers[1].charAt(0) == '4') {
            System.out.println("여자");
        } else {
            System.out.println("남자");
        }
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수1 : ");
        int num1 = sc.nextInt();
        System.out.print("정수2 : ");
        int num2 = sc.nextInt();
        System.out.print("비교값 : ");
        int num3 = sc.nextInt();
        System.out.println(num3 <= num1 || num3 > num2 ? true : false);
    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수1 : ");
        int num1 = sc.nextInt();
        System.out.print("정수2 : ");
        int num2 = sc.nextInt();
        System.out.print("정수3 : ");
        int num3 = sc.nextInt();
        System.out.println(num1 == num2 && num2 == num3 ? true : false);
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 : ");
        System.out.println(sc.nextInt() > 89 ? "축하합니다" : "분발하세요");
    }
}

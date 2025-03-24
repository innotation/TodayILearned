package com.ino.practice.controller;

import com.ino.section01.conditional.controller.Switch;

import java.util.Scanner;

public class ConditionPractice {
    public void practice1() {
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("5. 종료");
        System.out.print("메뉴 번호를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String menu = "";
        switch (num) {
            case 1:
                menu = "입력";
                break;
            case 2:
                menu = "수정";
                break;
            case 3:
                menu = "조회";
                break;
            case 4:
                menu = "삭제";
                break;
            case 5:
                menu = "종료";
                break;
        }
        System.out.printf("%s 메뉴 입니다", menu);
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("짝수다");
            } else {
                System.out.println("홀수다");
            }
        } else {
            System.out.println("양수만 입력해주세요");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        int langScore = sc.nextInt();
        int mathScore = sc.nextInt();
        int engScore = sc.nextInt();
        int sumScore = langScore + mathScore + engScore;
        double avgScore = sumScore / 3.0;
        if (langScore >= 40 && mathScore >= 40 && engScore >= 40 && avgScore >= 60.0) {
            System.out.println("국어" + langScore);
            System.out.println("수학" + mathScore);
            System.out.println("영어" + engScore);
            System.out.println("합계" + sumScore);
            System.out.println("평균" + avgScore);
            System.out.println("축하합니다, 합격입니다!");
        } else {
            System.out.println("불합격입니다.");
        }
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~12 사이의 정수 입력: ");
        int num = sc.nextInt();
        String season = "";
        switch (num) {
            case 1, 2, 12:
                season = "겨울";
                break;
            case 3, 4, 5:
                season = "봄";
                break;
            case 6, 7, 8:
                season = "가을";
                break;
            default:
                season = "잘못 입력된 달";
        }
        System.out.printf("%d월은 %s입니다.", num, season);
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        String id = "ino";
        String passwd = "1234";
        System.out.print("아이디: ");
        if (!id.equals(sc.nextLine())) {
            System.out.println("아이디가 틀렸습니다.");
            return;
        }
        System.out.print("비밀번호: ");
        if (!passwd.equals(sc.nextLine())) {
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("권한을 확인하고자 하는 회원 등급 :");
        String authRank = sc.nextLine();
        String authority;
        switch (authRank) {
            case "관리자":
                authority = "회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성";
            case "회원":
                authority = "게시글 작성, 게시글 조회, 댓글 작성";
            case "비회원":
                authority = "게시글 조회";
            default:
                authority = "잘못 입력했습니다.";
        }
        System.out.println(authority);
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("키(m)를 입력해 주세요");
        double height = sc.nextDouble();
        System.out.print("몸무게(kg)를 입력해 주세요");
        double weight = sc.nextDouble();
        double bmi = height / weight;
        String status = "";
        if (bmi < 18.5) {
            status = "저체중";
        } else if (bmi >= 18.5 && bmi < 23.0) {
            status = "정상체중";
        } else if (bmi >= 23 && bmi < 25) {
            status = "과체중";
        } else if (bmi >= 25 && bmi < 30) {
            status = "비만";
        } else if (bmi >= 30) {
            status = "고도 비만";
        }
        System.out.print("BMI 지수 : " + status);
    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("피연산자1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("피연산자2 입력 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자를 입력(+,-,*,/,%) :");
        char ch = sc.nextLine().charAt(0);
        int sum = 0;
        if (num1 < 0 || num2 < 0) {
            System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
        }
        switch (ch) {
            case '+':
                sum = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + sum);
            case '-':
                sum = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + sum);
            case '*':
                sum = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + sum);
            case '/':
                sum = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + sum);
            case '%':
                sum = num1 % num2;
                System.out.println(num1 + "%" + num2 + "=" + sum);
            default:
                System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
        }
    }

    public void practice9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("중간 고사 점수 :");
        double midExam = sc.nextInt() * 0.2;
        System.out.print("기말 고사 점수 :");
        double finalExam = sc.nextInt() * 0.3;
        System.out.print("과제 점수 :");
        double homework = sc.nextInt() * 0.3;
        System.out.print("출석 회수 :");
        int attendance = sc.nextInt();
        System.out.println("===========결과==========");
        if (attendance < 14) {
            System.out.printf("FAIL [출석 횟수 부족] (%d/20)", attendance);
        }
        double sum = midExam + finalExam + homework + (double) (attendance * 0.2);
        if (sum < 70) {
            System.out.printf("FAIL [점수 미달] (총점 %.1f)", sum);
        } else {
            System.out.print("중간 고사 점수(20) :" + midExam);
            System.out.print("기말 고사 점수(30) :" + finalExam);
            System.out.print("과제 점수(30) :" + homework);
            System.out.print("출석 점수(20) :" + attendance * 0.2);
        }
    }
    public void menuView() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 메뉴 출력\n2. 짝수/홀수 \n3. 합격/불합격 \n4. 계절 \n5. 로그인 \n6. 권한 확인 \n7. BMI \n8. 계산기 \n9. 점수 결과 출력");
        System.out.print("선택: ");
        int num = sc.nextInt();
        switch (num) {
            case 1: practice1(); break;
            case 2: practice2(); break;
            case 3: practice3(); break;
            case 4: practice4(); break;
            case 5: practice5(); break;
            case 6: practice6(); break;
            case 7: practice7(); break;
            case 8: practice8(); break;
            case 9: practice9(); break;
        }
    }
}

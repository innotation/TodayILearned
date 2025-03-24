package com.ino.practice.controller;

import java.util.Scanner;

public class LoopPractice {
    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요: ");
        int num = sc.nextInt();
        if (num < 1) {
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        }
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("1이상의 숫자를 입력하세요: ");
            int num = sc.nextInt();
            if (num < 1) {
                System.out.println("잘못 입력하셨습니다.");
            }
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요: ");
        int num = sc.nextInt();
        if (num < 1) {
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        }
        for (int i = 1; i <= num; i++) {
            System.out.print(num - i + " ");
        }
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("1이상의 숫자를 입력하세요: ");
            int num = sc.nextInt();
            if (num < 1) {
                System.out.println("잘못 입력하셨습니다.");
            }
            for (int i = 0; i < num; i++) {
                System.out.print(num - i + " ");
            }
        }
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i == num) {
                System.out.print(i);
                sum += i;
                break;
            }
            System.out.print(i + " + ");
            sum += num;
        }
        System.out.println(" = " + sum);
    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int num2 = sc.nextInt();
        if (num1 < 1 || num2 < 1) {
            System.out.println("1이상의 숫자만을 입력해주세요");
            return;
        }
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            System.out.print(i + " ");
        }
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("첫 번째 숫자 : ");
            int num1 = sc.nextInt();
            if (num1 < 1) {
                System.out.println("1이상의 숫자만을 입력해주세요");
                continue;
            }
            System.out.print("두 번째 숫자 : ");
            int num2 = sc.nextInt();
            if (num2 < 1) {
                System.out.println("1이상의 숫자만을 입력해주세요");
                continue;
            }
            for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
                System.out.print(i + " ");
            }
        }
    }

    public void practice8() {
        System.out.print("숫자 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("===== %d단 =====\n", num);
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d", num, i, num * i);
        }
    }

    public void practice9() {
        while (true) {
            System.out.print("숫자 : ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (!(num >= 2 && num <= 9)) {
                continue;
            }
            for (int i = num; i <= 9; i++) {
                System.out.printf("===== %d단 =====\n", i);
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d * %d = %d\n", i, j, j * i);
                }
            }
        }
    }

    public void practice10() {
        while (true) {
            System.out.print("숫자 : ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (!(num >= 2 && num <= 9)) {
                continue;
            }
            for (int i = num; i <= 9; i++) {
                System.out.printf("===== %d단 =====\n", i);
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d * %d = %d\n", i, j, j * i);
                }
            }
        }
    }

    public void practice11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("시작 숫자 : ");
        int sNum = sc.nextInt();
        System.out.print("공차  : ");
        int dNum = sc.nextInt();
        for (int i = sNum; i < sNum + 10*dNum ; i+=dNum) {
            System.out.print(i + " ");
        }
    }

    public void practice12() {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산자(+, -, *, /, %) : ");
        char mark = sc.nextLine().charAt(0);
        System.out.print("정수1: ");
        int num1 = sc.nextInt();
        System.out.print("정수2: ");
        int num2 = sc.nextInt();
        switch (mark) {
            case '+':
                System.out.print(num1 + " + " + num2 + " = " + (num1+num2));
            case '-':
                System.out.print(num1 + " - " + num2 + " = " + (num1-num2));
            case '*':
                System.out.print(num1 + " * " + num2 + " = " + (num1*num2));
            case '/':
                System.out.print(num1 + " / " + num2 + " = " + (num1/num2));
            case '%':
                System.out.print(num1 + " % " +num2 + " = " + (num1%num2));
        }
    }

    public void practice13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 :");
        String str = sc.nextLine();
        System.out.print("찾고자하는 문자 :");
        int cnt = 0;
        char target = sc.nextLine().charAt(0);
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == target) {
                cnt ++;
            }
        }

    }

    public void practice14() {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        System.out.println("-------------------- ");
        while (answer < 10000) {
            cnt++;
            System.out.printf("%d회 모금액 : ", cnt);
            int amount = sc.nextInt();
            answer += amount;
        }
        System.out.println("총 모금횟수: " + cnt);
    }
}

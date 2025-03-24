package com.ino.section03.etc.controller;

import java.util.Scanner;

public class Break {
    public void testBreakExample() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("문자열 입력(종료 시 exit 입력):");
            String str = sc.nextLine();

            System.out.println(str + "의 글자수는" + str.length() + "입니다.");
            if (str.equals("exit")) {
                break;
            }
        }
    }

    public void testBreakExample2() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("정수 2 ~ 9 입력: ");
            int num = sc.nextInt();
            if (!(num >= 2 && num <= 9)) {
                System.out.print("재입력");
                continue;
            }
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d x %d = %d", num, i, num * i);
            }
            break;
        }
    }
}

package com.ino.practice.controller;

import java.util.Scanner;

public class ArrayPractice {
    public void practice1() {
        int[] arr = new int[10];
        for(int i=0; i<10; i++) {
            arr[i] = i+1;
            System.out.print(arr[i] + " ");
        }
    }

    public void practice2() {
        int[] arr = new int[10];
        for(int i=0; i<10; i++) {
            arr[i] = 10-i;
            System.out.print(arr[i] + " ");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i< arr.length; i++) {
            arr[i] = i+1;
            System.out.print(arr[i] + " ");
        }
    }

    public void practice4() {
        String[] arr = new String[] { "사과", "귤", "포도", "복숭아", "참외"};
        System.out.println(arr[1]);
    }
    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 : ");
        String str = sc.nextLine();
        System.out.print("문자 : ");
        char c = sc.nextLine().charAt(0);
        int answer = 0;
        for(int i=0;i<str.length();i++) {
            if(c == str.charAt(i)) {
                answer++;
            }
        }
        System.out.println(c + "개수 : " + answer);
    }
    public void practice6() {
        String[] days =  new String[] {"월", "화", "수", "목", "금", "토", "일"};
        System.out.print("0 ~ 6 사이 숫자 입력 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0 || num > 6) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }
        System.out.println(days[num]);
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        int sum = 0;
        for (int i=0; i<num; i++) {
            System.out.print("배열" + i + "번째 인덱스에 넣을 값 : \n");
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<num; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        System.out.print("총 합: " + sum);
    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("정수 : ");
            int num = sc.nextInt();
            if (num > 2 && num % 2 == 1) {
                int[] arr = new int[num];
                int init = 1;
                for (int i=0; i<num; i++) {
                    if  (i+1 < num / 2 + 1) {
                        arr[i] = init++;
                    }
                    else {
                        arr[i] = init--;
                    }
                }
                for(int i=0; i<num; i++) {
                    if (i == num-1) {
                        System.out.print(arr[i]);
                    }
                    else {
                        System.out.print(arr[i] + " , ");
                    }
                }
                break;
            }
            else {
                System.out.println("다시 입력하세요.");
            }
        }
    }
    public void practice9() {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[] {"양념", "불닭"};
        System.out.print("치킨 이름을 입력하세요 : ");
        String target = sc.nextLine();
        for (int i=0; i< str.length;i++) {
            if (str[i].equals(target)) {
                System.out.println(target + "치킨 배달 가능");
                return;
            }
        }
        System.out.println(target + "치킨은 없는 메뉴입니다.");
    }
    public void practice10() {
        int[] arr = new int[10];
        for (int i=0; i<10;i++) {
            arr[i] = (int)(Math.random() * 10 + 1);
            System.out.print(arr[i] + " ");
        }
    }

    public void practice11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호(-포함) : ");
        String id = sc.nextLine();
        char[] ids = new char[14];
        for(int i=0; i<14; i++) {
            if (i <= 7) {
                ids[i] = id.charAt(i);
            }
            else {
                ids[i] = '*';
            }
        }
        System.out.print(ids);
    }
}

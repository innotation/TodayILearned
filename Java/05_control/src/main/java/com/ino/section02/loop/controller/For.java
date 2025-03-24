package com.ino.section02.loop.controller;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class For {
    public void testBasicFor() {
        for (int i = 0; i < 5; i++) {
            System.out.println("안녕하세요");
        }
    }

    public void testForExample1() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1);
        }
    }

    public void testForExample2() {
    }

    public void testForExample3() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void testForExample4() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.printf("1에서부터 %d까지의 총 합계 %d: ", num, sum);
    }

    public void testForExample5() {
        int randInt = (int)(Math.random()*100);
        System.out.println(randInt);
        int sum = 0;
        for (int i = 0 ; i <= randInt ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void testForExample7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력");
        String str = sc.nextLine();
        System.out.println("문자열 길이" + str.length());

        for(int i=0;i<str.length()-1;i++) {
            System.out.println(str.charAt(i));
        }
    }

    public void testForExample8() {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<10;i++) {
            System.out.printf("2 x %d = %d\n", i, 2*i);
        }
    }

    public void testForExample9() {
        int randInt = (int) (Math.random()*10) + 2;
        for(int i=1;i<10;i++) {
            System.out.printf("%d x %d = %d\n",randInt, i, randInt*i);
        }
    }

    public void testNestedFor() {
        for(int i=1;i<=3;i++) {
            System.out.print(i + " ");
            for(int j=1; j<=5; j++) {
                System.out.println();
            }
        }
    }

    public void testNestedForExample1() {
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=4;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void testNestedForExample2() {
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=4;j++) {
                if (j == i) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void testNestedForExample3() {
        for(int i=1;i<=9;i++) {
            for(int j=1;j<=9;j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }
        System.out.println();
    }

    public void testNestedForExample4() {
        for(int i=1;i<=5;i++) {
            System.out.printf("< %d일차 수업 >\n", i);
            for(int j=1;j<=8;j++) {
                System.out.printf("%d교시\n", j);
            }
            System.out.println();
        }
    }

    public void testInfinityLoop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Menu ====");
        System.out.println("1. print 1~5");
        System.out.println("2. sum of 1 to Select");
        System.out.println("3. some str's each char");
        System.out.println(">> select menu");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                testForExample1();
                break;
            case 2:
                testForExample2();
                break;
            case 3:
                testForExample3();
                break;
            case 4:
                testForExample4();
                break;
            case 5:
                testForExample5();
                break;
            default:
                break;
        }
    }
}

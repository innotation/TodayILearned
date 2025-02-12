package com.ino.section03.dimensional;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionalArray {


    public void testDimensionalArray1() {
        int[][] arr = new int[3][5];

//        System.out.println(arr.length);
//        System.out.println(arr[0].length);
//        System.out.println(arr[1].length);
//        System.out.println(arr[2].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = i + j;
                System.out.println(arr[i][j]);
            }
        }
    }

    public void testDimensionalArray2() {
        int[][] arr = new int[3][5];

//        System.out.println(arr.length);
//        System.out.println(arr[0].length);
//        System.out.println(arr[1].length);
//        System.out.println(arr[2].length);
        int value = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void testDimensionalArray3() {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void testDimensionalArray4() {
        int[][] arr = new int[5][];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void testDimensionalArray5() {
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[2][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0) {
                    if (j == 3) {
                        continue;
                    } else {
                        System.out.print("국어 점수: ");
                        score[i][j] = sc.nextInt();
                        score[i][3] += score[i][j];
                    }
                } else {
                    if (j == 3) {
                        continue;
                    } else {
                        System.out.print("영어 점수: ");
                        score[i][j] = sc.nextInt();
                        score[i][3] += score[i][j];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(score[0]));
        System.out.println(score[0][3] / 3);
        System.out.println(Arrays.toString(score[1]));
        System.out.println(score[1][3] / 3);
    }
}

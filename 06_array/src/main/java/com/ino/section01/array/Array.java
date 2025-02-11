package com.ino.section01.array;

import java.util.Scanner;

public class Array {
    public void whyUseArray() {
        int sum1 = 1;
        int sum2 = 1;
        int sum3 = 1;
        int sum4 = 1;
        int sum5 = 1;

        int sum = 0;

        System.out.println(sum + sum1 + sum2 + sum3 + sum4 + sum5);
    }

    public void testBasicArray1() {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += arr[i];
        }

        System.out.println("sum: " + sum);
    }

    public void testBasicArray2() {
        int[] intArr = new int[3];
        double[] doubleArr = new double[4];
        String[] strArr = new String[5];

        for (int i = 0; i < 3; i++) {
            System.out.print(intArr[i]);
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(doubleArr[i]);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(strArr[i]);
        }

        System.out.println(strArr.hashCode());
    }

    public void testBasicArray3() {

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
    }

    public void testArrayException() {
        int[] arr = null;
        System.out.println(arr.length);
    }

    public void testArrayExample1() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
            System.out.println(arr[i]);
        }
    }

    public void testArrayExample2() {
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
            if (arr[i] % 2 == 1) {
                System.out.println(arr[i]);
            }
            else {
                sum += arr[i];
            }
        }
        System.out.println("sum : " + sum + " " + "count: " + arr.length);
    }

    public void testArrayExample3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("과일 개수: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("과일명 입력: ");
            arr[i] = sc.nextLine();
        }
    }

    public void testArrayExample4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input string: ");
        String str = sc.nextLine();
        char[] arr = new char[str.length()];
        for(int i=0; i<arr.length;i++) {
            arr[i] = str.charAt(i);
        }
        System.out.println(arr);
    }

    public void testArrayFault() {
        int[] arr = new int[5];
        for(int i=1;i<=5;i++) {
            arr[i-1] = i*2;
        }
        for(int i=0; i<5;i++) {
            System.out.println(arr[i]);
        }
    }

    public void testEnhancedFor() {
        int[] arr = new int[5];
        for(int i=1;i<=5;i++) {
            arr[i-1] = i*2;
        }
        for(int n : arr) {
            System.out.println(n);
        }
    }

    public void homework() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = new char[str.length()];
        int idx = 0;
        for(char ch : str.toCharArray()) {
            arr[idx] = (char) (ch + 1);
            idx++;
        }
        System.out.println(arr);
    }
}

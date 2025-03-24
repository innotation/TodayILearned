package com.ino.section03.scanner;

import java.util.Scanner;

public class KeyboardInput {

    public void testBasicScanner() {
        Scanner sc = new Scanner(System.in);
        printScanner(sc);
        testScanner(sc);
        getAge(sc);
        sc.close();
    }
    public void printScanner(Scanner sc) {
        int num = sc.nextInt();
        System.out.println(num);
    }
    public void testScanner(Scanner sc) {
        System.out.print("인사말 입력: ");
        String greeting = sc.nextLine();
        System.out.println(greeting);
        sc.close();
    }

    public void getAge(Scanner sc) {
        System.out.print("나이 입력");
        int age = sc.nextInt();
        System.out.println(age);
        sc.close();
    }

    public void testScannerExam1() {
        // user -> name, school, grade, class
        Scanner sc = new Scanner(System.in);
        System.out.print("name:");
        sc.next();
        System.out.print("school:");
        sc.next();
        System.out.print("grade:");
        sc.nextInt();
        System.out.print("class:");
        sc.nextInt();
    }

    public void testWarningCase1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Address:");
        sc.next();
        System.out.print("name:");
        sc.next();
    }

    public void testWarningCase2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("name:");
        String name = sc.next();
        System.out.print("age: ");
        String age = sc.next();
        System.out.print("address: ");
        String address = sc.nextLine();
        System.out.println(age + "살" + name + "is living" + address);
    }

    public void testSpecialCase() {
        Scanner sc = new Scanner(System.in);
        char gender = sc.nextLine().charAt(0);
        System.out.println(gender);
    }

    public void testScannerExample2() {
        // 등록 상품 정보 입력받기
        // 품명, 브랜드명, 가격, 제조국가, 할인율, 등급
        //순으로 입력 후 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("name:");
        String pName = sc.nextLine();
        System.out.print("price:");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.print("country: ");
        String country = sc.nextLine();
        System.out.print("discount: ");
        double discount = sc.nextDouble();
        sc.nextLine();
        System.out.print("rank: ");
        char rank = sc.nextLine().charAt(0);
        System.out.printf("name: %s, price: %d, country: %s, discount: %.2f, rank: %c", pName, price, country, discount, rank);
    }
}


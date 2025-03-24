package com.ino.practice7.controller;

import com.ino.practice7.dto.Product;

import java.util.Scanner;

public class ProductManager {

    private Product[] pro = new Product[10];
    public static int count;
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("===== 제품 관리 메뉴 =====\n1. 제품 정보 추가\n2. 제품 전체 조회\n3. 제품 정보 수정\n 0. 프로그램 종료");
        switch (sc.nextInt()) {
            case 1: productInput(); break;
            case 2: productPrint(); break;
            case 3: productUpdate(); break;
            case 0: break;
            default:
                System.out.println("wrong input");; break;
        }
    }

    public void productInput() {
        System.out.print("Enter Product ID: ");
        int pId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String pName = sc.nextLine();
        System.out.print("Enter Price: ");
        int price = sc.nextInt();
        System.out.print("Enter Tax rate : ");
        double tax = sc.nextDouble();
        pro[count++] = new Product(pId, pName, price, tax);
    }

    public void productPrint() {
        for (int i = 0; i < count; i++) {
            pro[i].getInfo();
        }
    }

    public void productUpdate() {
        System.out.println("product name: ");
        String pName = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (pro[i].getpName().equals(pName)) {
                System.out.print("Enter Product ID: ");
                int pId = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Product Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Price: ");
                int price = sc.nextInt();
                System.out.print("Enter Tax rate : ");
                double tax = sc.nextDouble();
                pro[i] = new Product(pId, pName, price, tax);
            }
        }
    }
}

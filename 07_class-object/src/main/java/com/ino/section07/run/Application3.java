package com.ino.section07.run;

import com.ino.practice2.controller.PhoneManager;
import com.ino.section07.dto.Phone;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        PhoneManager pm = new PhoneManager();
        Scanner sc = new Scanner(System.in);
        Phone[] pArr = { new Phone("samsung", "galaxy", "zflip", 16000000),
                new Phone("apple", "iphone", "16pro", 16000000),
                new Phone("samsung", "galaxy", "zflip2", 16000000)};
        while(true) {
            System.out.println("===========폰 판매점 ============");
            System.out.println("1. 폰 조회");
            System.out.println("2. 폰 평균가 조회");
            System.out.println("3. 구매 의사 폰 가격 조회");
            System.out.println("4. 구매 의사 폰 배열 가격 조회");
            System.out.println("0. 종료");
            System.out.print(">> 메뉴번호: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    pm.getInfo(pArr);
                    break;
                case 2:
                    pm.getSum(pArr);
                    break;
                case 3:
                    System.out.print("input : ");
                    String name = sc.nextLine();
                    pm.getDetailPrice(pArr, name);
                    break;
                case 4:
                    System.out.print("input : ");
                    String keyword = sc.nextLine();
                    pm.getPhoneVal(pArr, keyword);
                    break;
                case 0:
                    System.out.println("ends program");return;
                default:
                    System.out.println("잘못 입력했습니다.");
            }
        }
    }
}

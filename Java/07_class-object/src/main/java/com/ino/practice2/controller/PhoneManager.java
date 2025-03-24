package com.ino.practice2.controller;

import com.ino.section07.dto.Phone;

import java.util.Scanner;

public class PhoneManager {

    /**
     * @param arr
     * @return
     */
    Scanner sc = new Scanner(System.in);
    public void getInfo(Phone[] pArr) {
        for (int i = 0; i < pArr.length; i++) {
            System.out.println(pArr[i].getInfo());
        }
    }
    public void getSum(Phone[] pArr) {
        int sum = 0;
        for (int i = 0; i < pArr.length; i++) {
            sum += pArr[i].getPrice();
        }
        System.out.println(sum / pArr.length);
    }
    public void getDetailPrice(Phone[] pArr, String name) {
        for (int i = 0; i < pArr.length; i++) {
            if (name.equals(pArr[i].getName())) {
                System.out.println(pArr[i].getPrice());
            };
        }
    }

    // 판매중 핸드폰 목록, 검색어 -> 검색된 핸드폰 가격 반환
    public void getPhoneVal (Phone[] pArr, String name) {
        for (int i = 0; i < pArr.length; i++) {
            if ((pArr[i].getName() + pArr[i].getSeries()).contains(name)) {
                System.out.println(pArr[i].getPrice());
            };
        }
    }
}

package com.ino.practice6.run;

import com.ino.practice6.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Student[] st = new Student[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("classroom");
            st[count].setClassroom(sc.nextInt());
            System.out.println("eng");
            st[count].setEng(sc.nextInt());
            System.out.println("grade");
            st[count].setGrade(sc.nextInt());
            System.out.println("kor");
            st[count].setKor(sc.nextInt());
            System.out.println("math");
            st[count].setMath(sc.nextInt());
            sc.nextLine();
            st[count].setName(sc.nextLine());
            if (sc.nextLine().charAt(0) == 'n') {
                break;
            }
            count++;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(st[i].getInfo());
        }
    }
}

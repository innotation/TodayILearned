package com.ino.practice1.run;

import com.ino.practice1.dto.Employee;
import com.ino.practice1.dto.Person;
import com.ino.practice1.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Person person = new Person(25, 175.0, 70.0);
        person.setName("hi");
        System.out.println(person.toString());
        Scanner sc = new Scanner(System.in);
        Student[] students = { new Student(20, 178.2, 70.0, 1, "정보시스템공학"), new Student(21, 187.3, 80.0, 2, "경영")
                ,new Student(23, 167.0, 45.0, 4, "정보통신공학") };
        students[0].setName("홍길동");
        students[1].setName("김말똥");
        students[2].setName("강개순");
        Employee[] employees = new Employee[10];

        for (int i = 0; i < 3; i++) {
            System.out.println(students[i].toString());
        }
        int empCnt = 0;
        while(true) {
            System.out.println("사람 " + (empCnt + 1) + "의 정보를 입력하세요.");

            System.out.print("이름: ");
            String name = sc.nextLine();
            System.out.print("나이: ");
            int age = sc.nextInt();

            System.out.print("키: ");
            double height = sc.nextDouble();

            System.out.print("몸무게: ");
            double weight = sc.nextDouble();

            System.out.print("급여: ");
            int salary = sc.nextInt();

            System.out.print("부서: ");
            sc.nextLine();
            String department = sc.nextLine();

            employees[empCnt] = new Employee(age, height, weight, salary, department);
            employees[empCnt++].setName(name);

            System.out.print("keep going?");
            char c = Character.toUpperCase(sc.nextLine().charAt(0));
            if (c == 'Y') {
                continue;
            }
            else if (c == 'N') {
                break;
            }
        }
        for (int i = 0; i < empCnt; i++) {
            System.out.println(employees[i].toString());
        }
    }
}

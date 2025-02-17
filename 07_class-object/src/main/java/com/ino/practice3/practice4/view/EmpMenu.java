package com.ino.practice3.practice4.view;

import com.ino.practice3.practice4.dto.Employee;

import java.util.Scanner;

public class EmpMenu {

    Scanner sc = new Scanner(System.in);
    public EmpMenu() {}

    public void mainMenu() {
        Employee employee = new Employee();
        while(true) {
            System.out.print("===== 사원 정보 관리 프로그램 ===== \n1. 새 사원 정보 입력\n2. 사원 정보 수정\n3. 사원 정보 삭제\n4. 사원 정보 출력\n0. 프로그램 종료\n메뉴 번호 선택 : ");
            int num = sc.nextInt();
            sc.nextLine();
            switch (num) {
                case 0: return;
                case 1: employee = inputEmployee(); break;
                case 2: modEmployee(employee); break;
                case 3: employee = null; break;
                case 4: employee.getInformation(); break;
            }
        }
    }

    public Employee inputEmployee() {
        System.out.print("empName: ");
        String empName = sc.nextLine();
        System.out.print("dept: ");
        String dept = sc.nextLine();
        System.out.print("job: ");
        String job = sc.nextLine();
        System.out.print("age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("gender: ");
        char gender = sc.nextLine().charAt(0);
        System.out.print("salary: ");
        int salary = sc.nextInt();
        System.out.print("bonusPoint: ");
        double bonusPoint = sc.nextInt();
        sc.nextLine();
        System.out.print("phone: ");
        String phone = sc.nextLine();
        System.out.print("address: ");
        String address = sc.nextLine();
        Employee em = new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, address);
        return em;
    }

    public void modEmployee(Employee emp) {
        while(true) {
            System.out.println("==== 사원 정보 수정 메뉴 ====\n1. 이름 변경\n2. 급여 변경\n3. 부서 변경\n4. 직급 변경\n0. 이전 메뉴로)");
            int num = sc.nextInt();
            sc.nextLine();
            switch (num) {
                case 0: return;
                case 1: emp.setEmpName(sc.nextLine()); break;
                case 2: emp.setSalary(sc.nextInt()); sc.nextLine(); break;
                case 3: emp.setDept(sc.nextLine()); break;
                case 4: emp.setJob(sc.nextLine()); break;
            }
        }
    }
}

package com.ino.practice5.run;

import com.ino.practice5.dto.Employee;

public class Application {
    public static void main(String[] args) {
        Employee[] employee = new Employee[3];
        employee[0] = new Employee();
        employee[1] = new Employee(1, "123", 3, 'A', "asddf", "asfasf");
        employee[2] = new Employee(1, "123", "1234", "123124", 3, 'A', 123124, 1532.0, "asfasf", "123124");
        System.out.println(employee[0].getInformation());
        System.out.println(employee[1].getInformation());
        System.out.println(employee[2].getInformation());
        employee[0].setEmpNo(2);
        employee[0].setEmpName("12412");
        employee[0].setAge(2);
        employee[0].setGender('e');
        employee[0].setPhone("123124");
        employee[0].setAddress("124124124");
        employee[0].setDept("1234214");
        employee[0].setJob("hi");
        employee[0].setSalary(124211241);
        employee[0].setBonusPoint(12421124);
        employee[1].setDept("1234214");
        employee[1].setJob("hi");
        employee[1].setSalary(124211241);
        employee[1].setBonusPoint(12421124);
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getEmpName() + "의 연봉: " + (employee[i].getSalary() + (int) employee[i].getBonusPoint()));
            sum += (employee[i].getSalary() + (int) employee[i].getBonusPoint());
        }
        System.out.println("==================================================");
        System.out.println("직원들의 연봉의 평균 : " + (int) (sum / 3));
    }
}

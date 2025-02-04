package com.kangbroo.section2.variable;

public class Application1 {

    public static void main(String[] args) {
        System.out.println(9860 * 8);
        System.out.println(9860 * 8 * 5);
        System.out.println(9860 * 8 * 5 * 4);
        System.out.println(9860 * 8 * 5 * 4 * 0.1);
        /*
        1. RAM
        2. 프로그램 동작시 필요한 값이 저장되는 장소
        3. 휘발성 -> 종료시 메모리상에 존재하는 것들은 사라짐
        4. 특정 값을 메모리에 보관하고자 할 경우 변수 생성 필요
         */
        System.out.println("변수 사용 후");
        int pay = 9860;
        int hour = 8;
        int day = 5;
        int week = 4;
        double tax = 0.1;

//        ##변수 사용 목적 ##
//        1. 값에 의미 부여(가독성 증진)
//        2. 자주 사용하는 값을 변수에 담아둘 경우 동일한 값 계속 사용 가능
//        3. 유지보수에 용이
    }
}

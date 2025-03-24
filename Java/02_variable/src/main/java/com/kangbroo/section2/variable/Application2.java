package com.kangbroo.section2.variable;

public class Application2 {
    public static void main(String[] args) {
        /*
            ## 변수 선언 및 값 초기화 ##
            1. 변수 선언
                메모리상에 특정 값 기록을 위한 공간을 만드는 과정
                [표현법] 자료형 변수명
            2. 변수에 값 대입
                선언해둔 변수에 값 담는 과정
                [표현법] 변수명 = 값;
            3. 변수 선언과 동시에 초기화(값 대입)
                [표현법] 자료형 변수명 = 값;

                >> 자료형 : 어떤 종류의 값을 담아낼건지, 어떤 크기의 값을 담아낼건지에 대해
                변수의 크기 및 모양 정하는 부분
         */
        byte b = 100;
        short s = 100;
        int i = 100;
        long l = 100;
        System.out.println("b: " + b);
        System.out.println("s: " + s);
        System.out.println("i: " + i);
        System.out.println("l: " + l);
        float f = 100.0f;
        double d = 100.0d;
        boolean bool = true;
        char c1 = 'A';
        String str1 = "abc";
        System.out.println("str1: " + str1);
        int etc = 999_999_999;
        System.out.println("etc: " + etc);
    }
}

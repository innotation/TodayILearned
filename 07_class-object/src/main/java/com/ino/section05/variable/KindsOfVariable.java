package com.ino.section05.variable;

public class KindsOfVariable {

    private int globalNum;

    private static int staticNum;

    public void test(int paramNum) {
        int localNum = 200;

        System.out.println("localNum: " + localNum);
        System.out.println("globalNum: " + globalNum);
        System.out.println("staticNum: " + staticNum);
    }
}

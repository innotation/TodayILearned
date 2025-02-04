package com.kangbroo.section04.casting;

public class Application2 {
    public static void main(String[] args) {
        // double(8byte) -> int(4byte)
        int iNum = 10;
        double dNum = 5.89;

        int iSum = iNum + (int)dNum;
        System.out.println(iSum);
    }
}

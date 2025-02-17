package com.ino.section05.finalkeyword;

public class Application {
    public static void main(String[] args) {
        FinalKeyword fk = new FinalKeyword("ino");
        System.out.println(fk.getNUM());
        System.out.println(fk.getNAME());

        System.out.println(FinalKeyword.TEAM);
        System.out.println("PI: " + Math.PI);
    }
}

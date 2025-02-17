package com.ino.section05.finalkeyword;

public class FinalKeyword {
//    private final int NON_STATIC_NUM;
    private final int NUM = 1;
    private final String NAME;
    public FinalKeyword(String name) {
        this.NAME = name;
    }

    public int getNUM() {
        return NUM;
    }
    public String getNAME() {
        return NAME;
    }

    // 상수 필드
    public static final String TEAM = "SSG";
}

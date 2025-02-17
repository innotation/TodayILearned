package com.ino.section05.statickeyword;

public class Application {
    public static void main(String[] args) {
        StaticKeyword.setStaticCount(100);
        StaticKeyword sk = new StaticKeyword();
        StaticKeyword sk2 = new StaticKeyword();
        sk.setNonStaticCount(1);
        sk2.setNonStaticCount(3);
        System.out.println(sk2.getInfo());
        System.out.println(sk.getInfo());
    }
}

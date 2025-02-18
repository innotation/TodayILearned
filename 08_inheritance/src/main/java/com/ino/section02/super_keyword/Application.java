package com.ino.section02.super_keyword;

public class Application {
    public static void main(String[] args) {

        Product p1 = new Product();
        System.out.println(p1.getInformation());

        Product p2 = new Product("S-1234", "samsung" , "galaxyzfold2", 2398000);
        System.out.println(p2.getInformation());

        System.out.println("=========================");

        Computer cp1 = new Computer();
        System.out.println(cp1.getInformation());
    }
}

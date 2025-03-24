package com.ino.section04.dto;

public class Application3 {
    public static void main(String[] args) {
        Book b1 = new Book(1, "gildong", "heo", 50000);
        Book b2 = new Book(1, "gildong", "heo", 50000);

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(b1.equals(b2));
        System.out.println("b1 hashcode : " + b1.hashCode());
        System.out.println("b2 hashcode : " + b2.hashCode());
    }
}

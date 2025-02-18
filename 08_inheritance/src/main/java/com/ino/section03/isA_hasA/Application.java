package com.ino.section03.isA_hasA;

public class Application {
    public static void main(String[] args) {
        Student st1 = new Student("ino", 20, 65, 75, new Pen("highlight", "yellow"));
        System.out.println(st1.getInformation());
    }
}

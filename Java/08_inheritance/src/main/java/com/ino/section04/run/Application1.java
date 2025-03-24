package com.ino.section04.run;

import com.ino.section04.dto.Book;

public class Application1 {
    public static void main(String[] args) {

        Book b1 = new Book(1, "gildong", "heo", 50000);
        Book b2 = new Book(2, "mokmin", "jung", 40000);

        System.out.println(b1.toString());
        System.out.println(b2);
    }
}

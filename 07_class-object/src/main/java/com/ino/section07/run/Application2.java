package com.ino.section07.run;

import com.ino.section07.dto.Book;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();
            System.out.print("Enter title : ");
            books[i].setTitle(sc.nextLine());
            System.out.print("Enter authro : ");
            books[i].setAuthor(sc.nextLine());
            System.out.print("Enter publisher : ");
            books[i].setPublisher(sc.nextLine());
            System.out.print("Enter price : ");
            books[i].setPrice(sc.nextInt());
            sc.nextLine();
        }

        System.out.print("책 제목 : ");
        String search = sc.nextLine();
        for( Book b : books ) {
            if (b.getTitle().equals(search)) {
                System.out.println(b.getInformation());
            }
        }
    }
}

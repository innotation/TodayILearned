package com.ino.section04.dto;

import java.util.Objects;

public class Book {

    private int no;
    private String title;
    private String author;
    private int price;

    public Book(int no, String title, String author, int price) {
        this.no = no;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        Book other = (Book)obj;

        return this.no == other.no && this.title == other.title && this.author == other.author && this.price == other.price;
    }

//    public int hashCode() {
//        return (title + author + no + price).hashCode();
//    }
    @Override public int hashCode() {
        return Objects.hash(no, title, author, price);
    }
}

package com.ino.section04.dto;

public class BreadDTO {
    private String name;
    private int price;

    public BreadDTO() {

    }

    public BreadDTO(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo() {
        return "[Bread] name : " + name + "price: " + price;
    }
}

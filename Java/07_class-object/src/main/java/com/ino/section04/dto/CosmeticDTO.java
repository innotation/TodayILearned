package com.ino.section04.dto;

public class CosmeticDTO {
    private String name;
    private int price;
    private String brand;
    private String category;
    private boolean isDC;

    public CosmeticDTO() {

    }
    public CosmeticDTO(String name, int price, String brand, String category, boolean isDC) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.isDC = isDC;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    public void setDC(boolean isDC) {
        this.isDC = isDC;
    }
    public boolean isDC() {
        return isDC;
    }
}

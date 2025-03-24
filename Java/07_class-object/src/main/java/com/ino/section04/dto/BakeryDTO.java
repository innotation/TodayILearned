package com.ino.section04.dto;

public class BakeryDTO {

    private String name;
    private String address;
    private BreadDTO bread; // has - a relation , arr가질 경우 has many 관계

    public BakeryDTO() {

    }

    public BakeryDTO(String name, String address, BreadDTO bread) {
        this.name = name;
        this.address = address;
        this.bread = bread;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        String str = "[Bakery] name : " + name + " address: " + address;
        if(bread == null) {
            str += " bread : is null ";
        }
        else {
            str += "bread : " + bread.getInfo();
        }
        return str;
    }

    public BreadDTO getBread() {
        return bread;
    }

    public void setBread(BreadDTO bread) {
        this.bread = bread;
    }
}

package com.ino.section07.dto;

public class Car {
    private String model;
    private String brand;
    private int maxSpeed;

    public Car(String model, String brand, int maxSpeed) {
        this.model = model;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getInformation() {
        return "model : " + model + " brand : " + brand + " maxSpeed : " + maxSpeed;
    }
}

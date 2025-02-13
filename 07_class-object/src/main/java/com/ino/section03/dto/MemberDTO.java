package com.ino.section03.dto;

public class MemberDTO {
    private int number;
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private boolean isActivated;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber(int number) {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(int age) {
        return age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender(char gender) {
        return gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight(double height) {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight(double weight) {
        return weight;
    }

    public void setActivated(boolean isActivated) {
        this.isActivated = isActivated;
    }

    public boolean isActivated(boolean isActivated) {
        return isActivated;
    }
}

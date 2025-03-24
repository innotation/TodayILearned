package com.ino.section01.extend;

public class FireCar extends Car {
    public FireCar() {
        System.out.println("fireCar class base constructor called");
    }

    @Override
    public void soundHorn() {

        if(super.isRunningStatus()) {

        }
        else {
            System.out.println("not on running");
        }
    }
}

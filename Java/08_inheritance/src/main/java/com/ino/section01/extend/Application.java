package com.ino.section01.extend;

public class Application {
    public static void main(String[] args) {
        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        FireCar fCar = new FireCar();
        fCar.soundHorn();
    }
}

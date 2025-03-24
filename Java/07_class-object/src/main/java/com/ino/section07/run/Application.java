package com.ino.section07.run;

import com.ino.section07.dto.Car;

public class Application {
    public static void main(String[] args) {
        Car c1 = new Car("911", "Porche", 300);
        Car c2 = new Car("aventador", "lamborgini", 350);
        Car c3 = new Car("720s", "mclaren", 320);
        Car c4 = new Car("m4", "bmw", 250);
        Car c5 = new Car("488", "perarri", 300);

        System.out.println(c1.getInformation());
        System.out.println(c2.getInformation());
        System.out.println(c3.getInformation());
        System.out.println(c4.getInformation());
        System.out.println(c5.getInformation());

        int sum = c1.getMaxSpeed() + c2.getMaxSpeed() + c3.getMaxSpeed() + c4.getMaxSpeed() + c5.getMaxSpeed();

        Car[] cArr = new Car[5];

        Car[] cArr2 = {new Car("911", "Porche", 300)
                ,new Car("720s", "mclaren", 320)
                ,new Car("aventador", "lamborgini", 350)};

        int sum2 = 0;
        for( Car c : cArr2 ) {
            sum2 += c.getMaxSpeed();
        }
    }
}

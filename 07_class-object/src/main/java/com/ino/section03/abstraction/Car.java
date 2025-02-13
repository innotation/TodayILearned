package com.ino.section03.abstraction;

public class Car {
    private boolean isOn;
    private int speed;

    public void startUp() {
        if (this.isOn) {
            System.out.println("already on");
        } else {
            this.isOn = true;
            System.out.println("turn on");
        }
    }

    public void go() {
        if (isOn) {
            speed += 10;
        } else {
            System.out.println("turn on first");
        }
    }

    public void stop() {
        if (isOn) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("break");
            } else {
                System.out.println("already stopped");
            }
        } else {
            System.out.println("turn on first");
        }
    }

    public void turnOff() {
        if (this.isOn) {
            if(this.speed > 0) {
                System.out.println("stop first");
            }
            else {
                this.isOn = false;
                System.out.println("turn off. turn on to drive again");
            }
        } else {
            System.out.println("already turned off");
        }
    }
}

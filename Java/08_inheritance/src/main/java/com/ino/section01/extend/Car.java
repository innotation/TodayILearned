package com.ino.section01.extend;

public class Car {

    public boolean isRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(boolean runningStatus) {
        this.runningStatus = runningStatus;
    }

    private boolean runningStatus;

    public Car() {
        System.out.println("Car base constructor called");
    }

    public void run() {
        runningStatus = true;
        System.out.println("Car runs");
    }

    // while running , bark method
    public void soundHorn() {
        if (runningStatus) {
            System.out.println("bbang bbang");
        }
        else {
            System.out.println("not on running, cant boozer");
        }
    }

    public void stop(){
        runningStatus = false;
        System.out.println("car stops");
    }
}


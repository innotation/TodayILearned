package com.ino.section03.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarRacer cr = new CarRacer();
        while(true) {
            System.out.println("\n === car racing program ===");
            System.out.println("1. turn on");
            System.out.println("2. go");
            System.out.println("3. stop");
            System.out.println("4. turn off");
            System.out.println("0. exit");
            System.out.println(">> select menu: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1: cr.turnOn(); break;
                case 2: cr.stepAccelator(); break;
                case 3: cr.stepBreak(); break;
                case 4: cr.turnOff(); break;
                case 0:
                    System.out.println("exti program");
                    return;
                default:
                    System.out.println("wrong menu, select again");
            }
        }
    }
}

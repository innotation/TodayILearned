package com.ino.section02.encapsulation.prob2;

public class Application {
    public static void main(String[] args) {
        Monster_Bad mon1 = new Monster_Bad();
        mon1.name = "drakula";
        mon1.setHp(200);

        Monster_Bad mon2 = new Monster_Bad();
        mon2.name = "frank";
        mon2.setHp(-200);

        System.out.println("name: " + mon1.name + "hp: " + mon1.hp);
        System.out.println("name: " + mon2.name + "hp: " + mon2.hp);
        Monster_Good mon3 = new Monster_Good();
        mon3.name = "mira";
        mon3.setHp(400);
        System.out.println(mon3.getInfo());
    }
}

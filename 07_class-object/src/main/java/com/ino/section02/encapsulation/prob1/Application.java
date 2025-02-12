package com.ino.section02.encapsulation.prob1;

public class Application {
    public static void main(String[] args) {
        Monster_Bad mon1 = new Monster_Bad();
        mon1.name = "duchi";
        mon1.hp = 200;

        System.out.println(mon1.name);
        System.out.println(mon1.hp);

        Monster_Bad mon2 = new Monster_Bad();
        mon2.name = "bbukku";
        mon2.hp = -200;

        System.out.println(mon2.name);
        System.out.println(mon2.hp);

        Monster mon3 = new Monster();

        mon3.name = "drakula";
        mon3.setHp(-200);

        System.out.println(mon3.name);
        System.out.println(mon3.hp);

        Monster mon4 = new Monster();

        mon4.name = "frankenstein";
        mon4.setHp(-200);

        System.out.println(mon4.name);
        System.out.println(mon4.hp);
    }

}

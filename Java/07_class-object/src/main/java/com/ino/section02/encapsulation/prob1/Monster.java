package com.ino.section02.encapsulation.prob1;

public class Monster {
    String name;
    int hp;

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }
}

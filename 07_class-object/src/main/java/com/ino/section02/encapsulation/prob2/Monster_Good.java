package com.ino.section02.encapsulation.prob2;

public class Monster_Good {
    String name;
    int hp;

    public void setName(String name) {
        this.name = name;
    }
    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public String getInfo() {
        return "name : " + this.name + "hp : " + this.hp;
    }
}

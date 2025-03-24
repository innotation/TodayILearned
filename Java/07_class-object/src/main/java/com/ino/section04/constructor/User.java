package com.ino.section04.constructor;

public class User {
    private String id;
    private String pwd;
    private String name;

    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public User(String id, String pwd, String name) {
        this(id, pwd);
        this.name = name;
    }

    public String getInfo() {
        return "id: " + id + "pwd: " + pwd;
    }
}

package com.ino.section04.dto;

public class UserDTO {
    private String id;
    private String pwd;
    private String name;

    public UserDTO(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public UserDTO(String id, String pwd, String name) {
        this(id, pwd);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }
    public String getInfo() {
        return "id: " + id + "pwd: " + pwd;
    }
}

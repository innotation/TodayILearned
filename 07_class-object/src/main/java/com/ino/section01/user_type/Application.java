package com.ino.section01.user_type;

public class Application {
    public static void main(String[] args) {
//        String id = "user01";
//        String pwd = "pwd123";
//        int age = 20;
//        char gender = '남';
//        String[] hobby = {"축구", "볼링", "테니스"};

        Member member = new Member();
        System.out.println("id : " + member.id);
        System.out.println("pwd : " + member.pwd);
        System.out.println("age : " + member.age);
        System.out.println("gender : " + member.gender);
        System.out.println("hobby : " + member.hobby);

        member.id = "user01";
        member.pwd = "pwd123";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[]{"축구", "볼링", "테니스"};
        System.out.println("id : " + member.id);
        System.out.println("pwd : " + member.pwd);
        System.out.println("age : " + member.age);
        System.out.println("gender : " + member.gender);
        System.out.println("hobby : " + member.hobby);
    }
}

package com.ino.section03.dto;

public class Application {
    public static void main(String[] args) {
        MemberDTO member = new MemberDTO();

        member.setNumber(1);
        member.setName("홍길동");
        member.setAge(20);
        member.setGender('남');
        member.setHeight(124.2);
        member.setWeight(21.2);
        member.setActivated(true);
    }
}

package com.ino.practice;

public class PracApplication6 {
    public static void main(String[] args) {
        int langScore = (int) (Math.random() * 100);
        int mathScore = (int) (Math.random() * 100);
        int engScore = (int) (Math.random() * 100);
        int sumScore = langScore + mathScore + engScore;
        System.out.println(langScore >= 40 && mathScore >= 40 && engScore >= 40 && sumScore >= 40 && sumScore >= 60 ? "합격" : "불합격");
    }
}

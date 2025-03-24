package com.ino.section03.isA_hasA;

public class Student extends Person {

//    private String name;
//    private int age; -> is a field

    private int korScore;
    private int mathScore;

//    private String kind;
//    private String color; -> has a field
    private Pen pen; // has - a relation
    public Student() {}

    public Student(String name, int age, int korScore, int mathScore, Pen pen) {
        super(name, age);
        this.korScore = korScore;
        this.mathScore = mathScore;
        this.pen = pen;
    }

    public int getKorScore() {
        return korScore;
    }

    public void setKorScore(int korScore) {
        this.korScore = korScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    @Override
    public String getInformation() {
        return "Student[" + super.getInformation() + ", korScore=" + korScore + ", ,mathScore=" + mathScore + ", pen=" + pen.getInformation() + "]";
    }
}

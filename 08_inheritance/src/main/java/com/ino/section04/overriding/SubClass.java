package com.ino.section04.overriding;

public class SubClass extends SuperClass{

    @Override
    public void method(int num) {
        super.method(num);
    }

//    @Override
//    void protectedMethod(){} -> 접근 제어자가 protected보다 좁은 default로 기본 설정되어 오버라이딩 x

    @Override
    protected void protectedMethod() {}


}

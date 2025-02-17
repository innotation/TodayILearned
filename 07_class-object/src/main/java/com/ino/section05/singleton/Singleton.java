package com.ino.section05.singleton;

public class Singleton {
    // eager initialization

    private static Singleton eager = new Singleton(); // 프로그램 실행시 static 메모리에 바로 할당되는데 인스턴스도 생성하여 할당

    private Singleton() {} // 외부에서의 생성자 호출을 통한 생성을 제한

    // 인스턴스가 필요로 할 때 호출 시킬 메소드( 통상적으로 getInstance 라고 함)
    public static Singleton getInstance() {
        return eager;
    }
}

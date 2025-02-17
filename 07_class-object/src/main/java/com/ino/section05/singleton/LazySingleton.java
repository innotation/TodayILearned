package com.ino.section05.singleton;

public class LazySingleton {

    // 프로그램 실행시 static 메모리에 참조변수만 할당 ( 인스턴스 생성 x ,  현재 상태 lazy == null)
    private static LazySingleton lazy;

    private LazySingleton() {}

    //인스턴스가 필요할 때 호출 되는 메소드
    //인스턴스가 생성되지 않은 상태(최초) 라면 인스턴스를 생성하여 반환
    // 이미 생성돼잇을 경우 기존 인스턴스 반환
    public static LazySingleton getInstance() {
        if(lazy == null) {
            return lazy = new LazySingleton();
        }
        else {
            return lazy;
        }
    }
}

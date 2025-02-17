package com.ino.section05.singleton;

public class Application {
    public static void main(String[] args) {
        NonSingleton non1 = new NonSingleton();
        NonSingleton non2 = new NonSingleton();

        System.out.println("non1: " + non1.hashCode());
        System.out.println("non2: " + non2.hashCode());

        Singleton eager = Singleton.getInstance();
        Singleton eager2 = Singleton.getInstance();

        LazySingleton lazy = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println("lazy: " + lazy.hashCode());
        System.out.println("lazy2: " + lazy2.hashCode());
    }
}

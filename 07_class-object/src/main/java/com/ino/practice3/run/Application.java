package com.ino.practice3.run;

import com.ino.practice3.controller.Function;

public class Application {
    public static void main(String[] args) {
        Function f = new Function();
        f.printLottoNumbers();
        f.outputChar(3, 'c');
        f.alphabette();
        System.out.println(f.mySubstring("abc", 0, 1));
    }
}

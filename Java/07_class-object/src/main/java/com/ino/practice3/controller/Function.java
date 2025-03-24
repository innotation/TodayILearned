package com.ino.practice3.controller;

public class Function {
    public void printLottoNumbers() {
        for (int i = 0; i < 6; i++) {
            int randInt = (int) (Math.random() * 45 + 1);
            System.out.print(randInt + " ");
        }
    }

    public void outputChar(int num, char c) {
        for (int i = 0; i < num; i++) {
            System.out.print(c + " ");
        }
    }

    public char alphabette() {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int randInt = (int)(Math.random() * 51);
        return alphabet.charAt(randInt);
    }

    public String mySubstring(String str, int index1, int index2) {
        String s = "";
        for (int i = index1; i <= index2; i++) {
            s += str.charAt(i);
        }
        return s;
    }

}

package com.ino.section05.userexception;

public class IncorrectScoreException extends RuntimeException {

  public IncorrectScoreException(){}

    public IncorrectScoreException(String message) {
        super(message);
    }
}

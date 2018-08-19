package com.dnmanager;

public class HaltException extends RuntimeException{

    public HaltException(String message) {
        super(message);
    }
}

package com.company.lesson10.magaz.exception;

public class WrongPasswordException extends Exception {
    private String detail;

    public WrongPasswordException() {
        detail = "Некорректный пароль!";
    }

    public WrongPasswordException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + detail;
    }
}

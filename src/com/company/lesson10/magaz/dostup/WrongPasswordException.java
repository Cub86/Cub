package com.company.lesson10.magaz.dostup;

public class WrongPasswordException {
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

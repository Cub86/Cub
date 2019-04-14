package com.company.lesson12;

public class FormaterDemo {
    public static void main(String[] args) {
        printString("Иванов", 5, "Программирование");
        printString("Петров", 45, "Математика");
    }

    public static void printString(String fullName, int mark, String subject) {
        System.out.printf(("Студент %15s получил %3s по %10s.%n"), fullName, mark, subject);
    }
}


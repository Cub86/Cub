package com.company.lesson12;

public class FormaterDemo {
    public static void main(String[] args) {
        printString("������", 5, "����������������");
        printString("������", 45, "����������");
    }

    public static void printString(String fullName, int mark, String subject) {
        System.out.printf(("������� %15s ������� %3s �� %10s.%n"), fullName, mark, subject);
    }
}


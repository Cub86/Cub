package com.company.lesson12;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(getResult(3, 56));
    }

    private static StringBuilder getResult(int a, int b) {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        stringBuilder.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        stringBuilder.append(a).append(" / ").append(b).append(" = ").append(a / b).append("\n");
        return stringBuilder;
    }
}

package com.company.Lesson4;

import java.util.Scanner;

public class SredneeZnachenie {

    public static void main(String[] srgs) {

        Scanner in = new Scanner(System.in);
        double a, b, c;
        System.out.println("Введите Первое число ");
        a = in.nextDouble();
        System.out.println("Введите второе число ");
        b = in.nextDouble();
        System.out.println("Введите третье число");
        c = in.nextDouble();

        String str1 = "13.7";
        String str2 = "5.1";
        String str3 = "120.22";
        try {
            a = Double.parseDouble(str1);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат");
        }
        try {
            a = Double.parseDouble(str2);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат");
        }
        try {
            a = Double.parseDouble(str3);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат");
        }
        double srednee = (a + b + c) / 3;
        System.out.println("Среднее арифметическое= " + srednee);
    }
}
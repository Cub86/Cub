package com.company.lesson6;

public class Phone {
    private static int count;
    String number, model;
    double weight;

    Phone(String n, String m, double w) {
        number = n;
        model = m;
        weight = w;
    }

    Phone(String n, String m) {
        number = n;
        model = m;
        count++;
    }

    Phone() {
    }

    void receineCall(String name) {
        System.out.println("Имя звонящего" + name);
    }

    String getNumber() {
        return number;
    }
}

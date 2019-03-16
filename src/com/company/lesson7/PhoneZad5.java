package com.company.lesson7;

public class PhoneZad5 {
    String number, model;
    int weight;

    PhoneZad5(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    PhoneZad5(String number, String model) {
        this.number = number;
        this.model = model;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + "с номером телефона" + number);
    }

    public static void main(String[] args) {
        PhoneZad5 phone = new PhoneZad5("+380971135910", "Nokia", 6);
        phone.receiveCall("Мама", "+380634708370");
    }
}


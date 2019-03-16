package com.company.lesson7;

public class PhoneZad5 {
    private String number, model;
    private int weight;

    public PhoneZad5(String number, String model, int weight) {
        this (number,model);
        this.weight = weight;
    }

    public PhoneZad5(String number, String model) {
        this.number = number;
        this.model = model;
    }
}
}

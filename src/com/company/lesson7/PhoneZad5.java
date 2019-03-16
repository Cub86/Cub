package com.company.lesson7;

public class PhoneZad5 {
    private static int count;
    private String number, model;
    private int weight;

    PhoneZad5(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    PhoneZad5(String number, String model) {
        this.number = number;
        this.model = model;
        count++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public static int getCount() {
        return count;
    }

    void receiveCall(String name, String number) {
        System.out.println("Мой номер телефона " + this.number);
        System.out.println("Звонит " + name + " с номера телефона" + number);
    }

    void sendMessage(String... numbers) {
        System.out.println("Отправляю сообщение номерам: ");
        for (String number : numbers) {
            System.out.println(number + " ");
            System.out.println();
        }
    }

    ;

    public static void main(String[] args) {
        PhoneZad5 phone = new PhoneZad5("+380971135910", "Nokia", 6);
        phone.receiveCall("Мама", " +380634708370");
        phone.sendMessage("0678575555", "0735966896");
        phone.sendMessage("0638523551");

        System.out.println(getCount());
    }
}


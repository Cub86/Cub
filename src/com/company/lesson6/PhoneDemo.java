package com.company.lesson6;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+380971135910", "Apple", 4.5);
        Phone phone2 = new Phone("+380634708370","Samsung");
        Phone phone3 = new Phone();

        phone2.weight = 5.0;

        phone3.number = "+380671431879";
        phone3.model = "Lenovo";
        phone3.weight = 5.5;



        System.out.println(phone1.number + " " + phone1.model + " " + phone1.weight);
        System.out.println(phone2.number + " " + phone2.model + " " + phone2.weight);
        System.out.println(phone3.number + " " + phone3.model + " " + phone3.weight);

        phone1.receineCall (" Мама");
        System.out.println(phone1.getNumber());
    }
}

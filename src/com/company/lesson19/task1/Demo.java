package com.company.lesson19.task1;

import com.company.lesson8.task5.Horse;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        Horse horse = new Horse("Овес", "Конеферма", 450.0);
        File file = new File("src\\lesson8\\task5\\horse.ser");
        Serializer.serialize(horse, file);
        Horse newHorse = (Horse) Serializer.deserialize(file);
        System.out.println(newHorse);
    }
}

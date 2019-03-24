package com.company.lesson10.Task4;

public interface IMaleClothes {
    default void dressMale() {
        System.out.println("Одеваем мужчину");
    }
}
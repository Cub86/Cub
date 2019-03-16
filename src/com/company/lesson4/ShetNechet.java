package com.company.lesson4;

import java.util.Scanner;

public class ShetNechet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём Scanner
        int i;
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) { // возвращает если целое число
            i = sc.nextInt(); // считываю целое число
            if (i % 2 == 0) {
                System.out.println("Число" + " " + i + " " + "четное");
            } else {
                System.out.println("Вы ввели не четное целое число");
            }
        }
    }
}


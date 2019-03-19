package com.company.lesson7;

public class Rekursia {
    public static void Rek(int a, int b) {
        if (a < b) {
            Rek(a + 1, b);
        } else if (a>b){
            Rek(b - 1, a);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        Rek (0,10);
    }
}

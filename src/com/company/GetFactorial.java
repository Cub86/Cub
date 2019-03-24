package com.company;

public class GetFactorial {
    public static int fact(int n) {
        int a = 1;
        for (int i = 2; i <= n; i++) {
            a = a * i;
        }
        return a;
    }

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10);
        System.out.println("Номер - " + n);
        System.out.println(fact(n));
    }
}

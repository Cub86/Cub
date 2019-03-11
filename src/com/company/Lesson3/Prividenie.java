package com.company.Lesson3;

public class Prividenie {
    public static void toByte() {
        byte a = 13;
        short b = a;
        char c = (char) 'a';
        int d = a;
        long e = a;
        float a1 = a;
        double b1 = a;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a1);
        System.out.println(b1);
    }

    public static void toShort() {
        short a = 14;
        byte b = (byte) a;
        char c = (char) 'a';
        int d = a;
        long e = a;
        float a1 = a;
        double b1 = a;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a1);
        System.out.println(b1);
    }

    public static void tochar() {
        char a = 15;
        byte b = (char) 'a';
        short c = (char) 'a';
        char d = (char) 'a';
        int e = (char) 'a';
        long a1 = (char) 'a';
        float b1 = (char) 'a';
        double c1 = (char) 'a';
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a1);
        System.out.println(c1);
    }
    public static void toint() {
        int a = 16;
        byte b = (byte) a;
        short c = (short) a;
        char d = (char) 'a';
        long e = a;
        float a1 = (float)a;
        double b1 = a;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a1);
        System.out.println(b1);
    }
    public static void tolong() {
        long a = 17;
        byte b = (byte) a;
        short c = (short) a;
        char d = (char) 'a';
        int e = (int) a;
        float a1 = (float) a;
        double b1 = (double) a;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a1);
        System.out.println(b1);
    }
    public static void tofloat() {
        float a = 18;
        byte b = (byte) a;
        short c = (short) a;
        char d = (char) 'a';
        int e = (int) a;
        long a1 = (long) a;
        double b1 = a;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a1);
        System.out.println(b1);
    }
    public static void todouble() {
        double a = 19;
        byte b = (byte) a;
        short c = (short) a;
        char d = (char) 'a';
        int e = (int) a;
        long a1 = (long) a;
        float b1 = (float) a;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a1);
        System.out.println(b1);
    }
    public static void main(String[] args) {

        toByte();
        toShort();
        tochar();
        toint();
        tofloat();
        todouble();
    }


}




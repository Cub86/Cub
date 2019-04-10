package com.company.lesson12;

public class Task1 {
    public static void main(String[] args) {
        check("I like Java!!!");
        check("I like C++");
        check("I like ETM!!!");
        String str = "ETM";
        System.out.println();
        System.out.println("Java".replace('a', 'o'));
        System.out.println("Java".toLowerCase());
        System.out.println("Java".toUpperCase());
        System.out.println();
        System.out.println("I like Java!!!".substring(1, 10));
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.replace("J", "C"));
        System.out.println("I like Java!!!".substring(1, 10));
    }

    public static void check(String str) {
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("I like"));

        //System.out.println(str.regionMatches(2, "like", 0, 4));

    }
}

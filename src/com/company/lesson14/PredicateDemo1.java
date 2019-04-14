package com.company.lesson14;

import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {
        Predicate<String> predicateJ = s -> s.startsWith("J");
        Predicate<String> predicateN = s -> s.startsWith("N");
        Predicate<String> predicateA = s -> s.endsWith("A");

        System.out.println(predicateJ.or(predicateN).and(predicateA).test("Java"));
        System.out.println(predicateJ.or(predicateN).and(predicateA).test("Jana"));
        System.out.println(predicateJ.or(predicateN).and(predicateA).test("Gala"));
        System.out.println(predicateJ.or(predicateN).and(predicateA).test("Dudu"));
    }

}

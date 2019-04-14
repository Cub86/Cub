package com.company.lesson14;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate1 = (String s) -> s != null;
        Predicate<String> predicate2 = (String s) -> s.isEmpty();
        Predicate<String> andpredicate = predicate1.and(predicate2);

        System.out.println(andpredicate.test(null));
        System.out.println(andpredicate.test("adasa"));
        System.out.println(andpredicate.test(""));

    }
}

package com.company.lesson14;

import java.util.function.IntFunction;

public class References {
    public static void main(String[] args) {
        IntFunction<String> function = String::valueOf;
        System.out.println(function.apply(450));
    }
}

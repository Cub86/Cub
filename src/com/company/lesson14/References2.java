package com.company.lesson14;
/**

import java.util.function.Supplier;

public class SupplierDemo2 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random() * 10);
        System.out.println(supplier.get());

        Supplier<String> newString = String::new;
        System.out.println(newString.get());

    }
}
*/

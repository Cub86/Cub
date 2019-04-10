package com.company.lesson14;

import java.io.Serializable;

public class ThreeGen<T extends Comparable, V extends Animal&Serializable, K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;

    public ThreeGen(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;

    }

    public void showTypes() {
        System.out.println("Тип T: " + ob1.getClass().getName());
        System.out.println("Тип V: " + ob2.getClass().getName());
        System.out.println("Тип K: " + ob3.getClass().getName());
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public static void main(String[] args) {
        ThreeGen<String, Dog, Integer> threeGen2 = new ThreeGen<>("str", new Dog(), 34);
        threeGen2.showTypes();
    }

}


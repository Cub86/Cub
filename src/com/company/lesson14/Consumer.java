/**package com.company.lesson14;

public class Consumer {
    String weight;  вес коробки

    public Consumer(int i3, int i2, int i1, int i) {
        java.util.function.Consumer consumer1 = box -> System.out.println("Отгрузили ящик" + box.weight);
        java.util.function.Consumer consumer2 = box -> System.out.println("Отправили ящик" + box.weight);
        consumer1.andThen(consumer2).accept(new Consumer(2, 2, 2, 2));
    }
}
*/




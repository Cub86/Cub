package com.company.lesson14;

import java.util.ArrayList;
import java.util.List;

public class HeavyBox {
    private int weight;

    public HeavyBox extends Box6 implements Comparable() {


        public static void main (String[]args){
            list<HeavyBox> list = new ArrayList<>();
            List.add(new HeavyBox(1, 1, 1));
            List.add(new HeavyBox(2, 2, 2));
            List.add(new HeavyBox(3, 3, 3));
            HeavyBox1 box = new HeavyBox(4, 4, 4, 4);
            list.add(box);
            System.out.println(list);
        /*for (HeavyBox heavyBox:list) {
            System.out.println(heavyBox.weight);
        }*/
            list.forEach(b -> System.out.println(b.weight)); //лямбда выражение вместо верхнего
            //удаление последнего єлемента
            list.remove(list.size() - 1);
            System.out.println("Size" + list.size());
            list.forEach(b -> System.out.println(b.weight));
            //добавление одного элемента
            list.get(0).weight += 1;

        }

    }
}
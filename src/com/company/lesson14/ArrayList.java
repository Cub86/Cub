package com.company.lesson14;

import java.util.Iterator;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
        List<HeavyBox1> list = new java.util.ArrayList<>();
        List.add(new HeavyBox1(1, 1, 2, 450);
        List.add(new HeavyBox1(2, 2, 2, 2);
        List.add(new HeavyBox1(3, 3, 3, 400);
        List.add(new HeavyBox1(5, 5, 5, 5);
        List<HeavyBox1> heavyBoxes = getSuperHeavyBoxes(list);
        heavyBoxes.forEach(b -> System.out.println(b.weight));
        System.out.println();
        list.forEach(b -> System.out.println(b.weight));
    }

    private static List<HeavyBox1> getSuperHeavyBoxes(List<HeavyBox1> list);

    List<HeavyBox1> result = new ArrayList<>();
    Iterator<HeavyBox1> iterator = list.iterator;
    while(iterator.hasNext())

    {
        HeavyBox1 box = iterator.next();
        if (box.weight > 300) {
            iterator remove ();
            result.add(box)
        }
    }

}

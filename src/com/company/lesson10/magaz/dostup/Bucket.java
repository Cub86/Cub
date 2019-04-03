package com.company.lesson10.magaz.dostup;

import java.util.Arrays;

public class Bucket {
    Item[] MisItems;

    public Bucket(Item[] Items) {
        this.MisItems = MisItems;
    }

    public Bucket() {

    }

    public Item[] getMisItems() {
        return MisItems;
    }

    public void setMisItems(Item[] Items) {
        this.MisItems = Items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bucket)) return false;

        Bucket bucket = (Bucket) o;

        return MisItems.equals(bucket.MisItems);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(MisItems);
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "MisItems=" + Arrays.toString(MisItems) +
                '}';
    }
}
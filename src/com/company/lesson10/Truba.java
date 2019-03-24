package com.company.lesson10;

import java.util.Objects;

public class Truba implements Instrument {
    private int diametr;

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public void play() {
        System.out.println("Играет труба с диаметром: " + diametr);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truba truba = (Truba) o;
        return diametr == truba.diametr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diametr);
    }

    @Override
    public String toString() {
        return "Truba{" +
                "diametr=" + diametr +
                '}';
    }
}

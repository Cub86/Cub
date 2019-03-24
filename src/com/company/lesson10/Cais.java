package com.company.lesson10;

public class Cais implements Instrument {

    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан с размером - " + size);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cais)) return false;

        Cais caisse = (Cais) o;

        return size != null ? size.equals(caisse.size) : caisse.size == null;
    }

    @Override
    public int hashCode() {
        return size != null ? size.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Caisse{" +
                "size='" + size + '\'' +
                '}';
    }
}

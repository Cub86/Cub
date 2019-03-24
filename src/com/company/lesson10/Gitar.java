package com.company.lesson10;

public class Gitar implements Instrument {
    private int strunaNumber;

    public int getCordNumber() {
        return strunaNumber;
    }

    public void setCordNumber(int cordNumber) {
        this.strunaNumber = cordNumber;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн - " + strunaNumber );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gitar)) return false;

        Gitar guitar = (Gitar) o;

        return strunaNumber == guitar.strunaNumber;
    }

    @Override
    public int hashCode() {
        return strunaNumber;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "cordNumber=" + strunaNumber +
                '}';
    }
}

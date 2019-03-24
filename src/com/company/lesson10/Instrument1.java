package com.company.lesson10;

public class Instrument1 {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Gitar();
        instruments[1] = new Cais();
        instruments[2] = new Truba();

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}

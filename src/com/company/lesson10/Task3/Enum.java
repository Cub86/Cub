package com.company.lesson10.Task3;
import java.util.Locale;
public class Enum {

    public static void main(String[] args) {
        for (Seasons season : Seasons.values()) {
            printInfo(season);
        }
        System.out.print("\nЛюбимое время года: ");
        printInfo(Seasons.valueOf("WINTER"));
    }

    public static void printInfo(Seasons season) {
        System.out.printf(Locale.ROOT, "%s %s, ", season.name(), season);
        season.getDescription();
        }
}

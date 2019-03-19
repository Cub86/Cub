package com.company.lesson7.Biblioteka;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Изучение JAVA.", "Кейси");
        Reader reader = new Reader( "Петров П.П.", 13, "ЭМС",
                "01.01.1544", "0501238899" );
        System.out.println( "ФИО"+Reader.getFIO() );


    }
}

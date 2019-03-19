package com.company.lesson7.Biblioteka;

public class Reader {
    private String FIO;
    private int numberBilet;
    private String fakultet;
    private String dataRogdenia;
    private String callNumber;
    private int quantyBook;


    public Reader(String FIO, int numberBilet, String fakultet, String dataRogdenia, String callNumber) {
        this.FIO = FIO;
        this.numberBilet = numberBilet;
        this.fakultet = fakultet;
        this.dataRogdenia = dataRogdenia;
        this.callNumber = callNumber;

    }

    public int getQuantyBook() {
        return quantyBook;
    }

    public void setQuantyBook(int quantyBook) {
        this.quantyBook = quantyBook;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getNumberBilet() {
        return numberBilet;
    }

    public void setNumberBilet(int numberBilet) {
        this.numberBilet = numberBilet;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public String getDataRogdenia() {
        return dataRogdenia;
    }

    public void setDataRogdenia(String dataRogdenia) {
        this.dataRogdenia = dataRogdenia;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public void takeBook(int quantyBook) {
        if (quantyBook == 3)
            System.out.println("Петров взял 3 книги" + quantyBook);
        else if (quantyBook != 3)
            System.out.println("Петров обязан взять 3 книги" + quantyBook);

                   }

    /*public void takeBook(String a, String b) {
        System.out.println("Петров В. В. взял книги: Приключения, Словарь, Энциклопедия" + a);
        for (b:
             a)
            System.out.println(b + "");
    }

    public void takeBook(String a, String b) {
        System.out.println("Петров В. В. взял книги: Приключения, Словарь, Энциклопедия" + a);
        for (b:
             a)
            System.out.println(b + "");
    }

  /**  public void returnBook(int quantyBook) {
        if (quantyBook == 3)
            System.out.println("Петров вернул 3 книги" + quantyBook);
        else if (quantyBook != 3)
            System.out.println("Петров обязан вернуть 3 книги" + Book.getName());
    }*/


}


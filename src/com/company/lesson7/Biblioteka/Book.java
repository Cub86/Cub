package com.company.lesson7.Biblioteka;

public class Book {
    private String name;
    private String autor;

    public Book(String name, String autor) {
        System.out.println("Петров В. В. взял такие книги:" + " " + "Название книги - " + name + " " + "Автор - " + autor);
        this.name = name;
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

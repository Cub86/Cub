package com.company.lesson8;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Maks", "Maksimov", "G1", 3);
        Aspirant aspirant = new Aspirant("Fedor", "Fedorov", "G2", 4.2, "23");
        Student student2 = new Aspirant("Ivan", "Ivanov", "A2", 4.8, "13");
        Student[] students = {student1, aspirant, student2};
        System.out.println("Name: " + student1.getFirstName());
        System.out.println("Name: " + aspirant.getFirstName());
        System.out.println("Information: " + student2.getFirstName() + " " + student2.getLastName()
                + " " + student2.getGroup() + " " + student2.getAverageMark());

        for (Student student : students) {
            System.out.println(student.getLastName() + " " + student.getScholarship());
        }
    }
}
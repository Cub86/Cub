package com.company.lesson12.Task6;

public class Demo {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов И.И.", 3500),
                new Employee("Петров П. П.", 3600),
                new Employee("Сидоров С. С.", 3750),
                new Employee("Федоров Ф. Ф.", 3900),
                new Employee("Андреев А. А.", 6000),
        };

        Report.generateReport(employees);
    }
}

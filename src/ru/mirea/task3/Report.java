package ru.mirea.task3;

public class Report {
    static void generateReport(Employee[] empls) {
        System.out.printf("|        FullName       | %-10s |%n", "    Salary");
        for (Employee empl : empls){
            System.out.printf("|  %-20s |%12.2f|%n",empl.getFullname(), empl.getSalary());
        }
    }
}

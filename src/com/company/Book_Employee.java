package com.company;
import java.time.LocalDate;

public class Book_Employee extends Book_Person {
    private double salary;
    private LocalDate hireDay;
    public Book_Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }
    public double getSalary() {
        return salary;
    }
    public LocalDate getHireDay() {
        return hireDay;
    }
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

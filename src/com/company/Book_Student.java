package com.company;

public class Book_Student extends Book_Person {
    private String major;
    /**
    * @param name Имя студента
    * @param major Специализация студента
    */
    public Book_Student(String name, String major) {
    // передать строку name конструктору суперкласса
    // в качестве его параметра
        super(name);
        this.major = major;
    }
    public String getDescription() {
       return "a student majoring in " + major;
    }
}

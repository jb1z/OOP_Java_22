package com.company;

public class Book_Main {

    public static void main(String[] args) {
        Book_Person[] people = new Book_Person[2];
        // заполнить массив people объектами типа Student и Employee
        people[0] = new Book_Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Book_Student("Maria Morris", "computer science");
        // вывести имена и описания всех лиц,
        // представленных объектами типа Person
        for (Book_Person p : people) {
            System.out.println(p.getName() + ',' + p.getDescription());
        }
    }
}

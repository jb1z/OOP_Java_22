package com.company;


public abstract class Book_Person {
    public abstract String getDescription();
    private String name;
    public Book_Person(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}

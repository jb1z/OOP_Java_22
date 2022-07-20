package com.video;

public class Student {
    private Specialization specialization;

    Student(Specialization specialization){
        this.specialization = specialization;
    }

    public Specialization getSpecialization(){
        return this.specialization;
    }

    enum Specialization{
        ComputerScience, Biology, Astronomy
    }
}

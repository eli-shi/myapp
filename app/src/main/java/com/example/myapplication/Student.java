package com.example.myapplication;

import java.util.List;

public class Student {
    String name;
    String surname;
    List<List<String>> schedule;

    Student(){}
    Student(String name, String surname, List<List<String>> schedule) {
        this.name = name;
        this.surname = surname;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<List<String>> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<List<String>> schedule) {
        this.schedule = schedule;
    }
}

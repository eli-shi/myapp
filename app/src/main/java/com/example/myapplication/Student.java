package com.example.myapplication;

public class Student {
    String name;
    String surname;
    String[][] schedule;

    Student(){}
    Student(String name, String surname, String[][] schedule) {
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

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }
}

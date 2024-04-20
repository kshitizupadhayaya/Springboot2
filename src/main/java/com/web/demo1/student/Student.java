package com.web.demo1.student;

import java.time.LocalDate;

public class Student
{
    private int id;
    private String name;
    private int age;
    private String eamil;
    private LocalDate dob;

    public Student()
    {
    }

    public Student(int id, String name, int age, String eamil, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.eamil = eamil;
        this.dob = dob;
    }

    public Student(String name, int age, String eamil, LocalDate dob) {
        this.name = name;
        this.age = age;
        this.eamil = eamil;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", eamil='" + eamil + '\'' +
                ", dob=" + dob +
                '}';
    }
}

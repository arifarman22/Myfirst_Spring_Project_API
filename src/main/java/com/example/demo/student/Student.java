package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private long Id;
    private  String name;
    private int age;
    private LocalDate dob;
    private String email;
    //constructor1
    public Student(long id, String name, int age, LocalDate dob, String email) {
        Id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }
    //constructor2
    public Student()
    {

    }
//constructor 3
    public Student(String name, int age, LocalDate dob, String email) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }
//getters and setters
    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                '}';
    }
}

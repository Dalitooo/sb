package com.dalitoo.springDemo.student;

import net.bytebuddy.asm.Advice;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lasName;

    private LocalDate dateOfBirth;

    private String email;

    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Student(String firstName, String lasName, LocalDate dateOfBirth, String email, int age) {
        this.firstName = firstName;
        this.lasName = lasName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.age = age;
    }
}

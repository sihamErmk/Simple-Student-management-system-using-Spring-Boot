package com.example.studentsmanagementsystem.Controller;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String email;

    private LocalDate dateOfBirth;

    @Transient
    private int age;

    // Constructor with all fields except ID (for saving new students)
    public Student(String firstName, String lastName, String email, LocalDate dateOfBirth, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    // Default constructor (required by JPA)
    public Student() {}

    // Getter and Setter for ID
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Getters and Setters for fields
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return Period.between(dateOfBirth,LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }
}

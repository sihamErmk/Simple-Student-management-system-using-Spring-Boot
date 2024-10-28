package com.example.studentsmanagementsystem.Controller;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    private String Fname;
    private  String Lname;
    @Column(unique = true)
    private  String Email;
    private  String DateOfBirth;
    @Transient
    private  int age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Student(String fname, String lname, String email, LocalDate dateOfBirth, int age){
        this.Fname = fname;
        this.Lname = lname;
        this.Email = email;
        this.DateOfBirth = String.valueOf(dateOfBirth);
        this.age=age;
    }
    public Student(){

    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
    public String getDateOfBirth(){
        return DateOfBirth;
    }
    public  void setDateOfBirth(String dateOfBirth){
        DateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

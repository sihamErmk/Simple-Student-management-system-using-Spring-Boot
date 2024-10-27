package com.example.studentsmanagementsystem.Controller;

import java.time.LocalDate;

public class Student {
    private String Fname;
    private  String Lname;
    private  String Email;
    private  String DateOfBirth;
    private  int age;



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

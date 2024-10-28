package com.example.studentsmanagementsystem.Repository;

import com.example.studentsmanagementsystem.Controller.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findEmail(String email);
    void deleteByEmail(String email);



}

package com.example.studentsmanagementsystem.Controller;

import com.example.studentsmanagementsystem.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private StudentService studentService ;

    @Autowired //inject the studentservice into student controller
    public StudentController(StudentService studentService){
        this.studentService = studentService;

    }

    @GetMapping
    public List<Student> findAllStudents(){

        return studentService.findAllStudents();
    }


}

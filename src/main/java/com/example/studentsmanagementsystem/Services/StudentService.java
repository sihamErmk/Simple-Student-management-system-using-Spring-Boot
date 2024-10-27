package com.example.studentsmanagementsystem.Services;

import com.example.studentsmanagementsystem.Controller.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public interface StudentService {
 Student save(Student student);
List<Student> findAllStudents();
 Student findEmail(String email);
 Student updateStudent(Student student);
 void deleteStudent(String email);

}

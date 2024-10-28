package com.example.studentsmanagementsystem.Controller;

import com.example.studentsmanagementsystem.Services.InMemoryStudentService;
import com.example.studentsmanagementsystem.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService ;

    //@Autowired //inject the studentservice into student controller
    public StudentController(@Qualifier("DBStudentService") StudentService studentService){
        this.studentService = studentService;

    }
    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }
@GetMapping("/{email}")
    public Student findEmail( @PathVariable String email){
        return  studentService.findEmail(email);

    }
    @GetMapping
    public List<Student> findAllStudents(){

        return studentService.findAllStudents();
    }
    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }


    @DeleteMapping("/{email}")
    public void deleteStudent( @PathVariable String email){
        studentService.deleteStudent(email);
    }

}

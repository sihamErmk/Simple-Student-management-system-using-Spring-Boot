package com.example.studentsmanagementsystem.Services;

import com.example.studentsmanagementsystem.Controller.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){

        return List.of(
                new Student(
                        "Siham",
                        "Ereh",
                        "sereh@gmil.com",
                        LocalDate.of(2004,1,23),
                        20
                ),
                new Student(
                        "Eren",
                        "Yeager ",
                        "yeager@gmil.com",
                        LocalDate.now(),
                        23
                )





        );
    }

}

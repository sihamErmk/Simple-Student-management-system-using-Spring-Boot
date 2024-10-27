package com.example.studentsmanagementsystem.dao;

import com.example.studentsmanagementsystem.Controller.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


@Repository
public class InMemoryStudentDao {

    private final List<Student> Students =new ArrayList<>();

    public Student save(Student student) {
        Students.add(student);
        return student ;
    }

    public List<Student> findAllStudents() {
        return Students;
    }


    public Student findEmail(String email) {

        return Students.stream().filter(s -> email.equals(s.getEmail()))
                .findFirst()
                .orElse(null);
    }


    public Student updateStudent(Student student) {
        var StudentIndex = IntStream.range(0,Students.size()).filter(index ->Students.get(index).getEmail().equals(student.getEmail()) )
                .findFirst()
                .orElse(-1);
        if( StudentIndex > -1){
            Students.set(StudentIndex,student);
            return student;
        }

     return  null;
    }


    public void deleteStudent(String email) {
        var student = findEmail(email);
        if(student!=null){
            Students.remove(student);
        }

    }
}

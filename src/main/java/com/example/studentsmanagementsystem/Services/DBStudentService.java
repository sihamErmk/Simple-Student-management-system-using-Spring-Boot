package com.example.studentsmanagementsystem.Services;

import com.example.studentsmanagementsystem.Controller.Student;
import com.example.studentsmanagementsystem.Repository.StudentRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Primary
@Service
public class DBStudentService implements StudentService{
    private final StudentRepository studentRepository;

    public DBStudentService(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student findEmail(String email) {

        return studentRepository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(String email) {
        studentRepository.deleteByEmail( email);

    }
}

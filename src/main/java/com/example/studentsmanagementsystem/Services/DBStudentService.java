package com.example.studentsmanagementsystem.Services;

import com.example.studentsmanagementsystem.Controller.Student;
import com.example.studentsmanagementsystem.Repository.StudentRepository;

import java.util.List;

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

        return studentRepository.findEmail(email);
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

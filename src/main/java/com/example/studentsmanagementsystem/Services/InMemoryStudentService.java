package com.example.studentsmanagementsystem.Services;

import com.example.studentsmanagementsystem.Controller.Student;
import com.example.studentsmanagementsystem.dao.InMemoryStudentDao;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InMemoryStudentService implements StudentService {

    private final InMemoryStudentDao doa;

    public InMemoryStudentService(InMemoryStudentDao doa) {
        this.doa = doa;
    }


    @Override
    public List<Student> findAllStudents() {
        return doa.findAllStudents();
    }
    @Override
    public Student save(Student student) {
        return doa.save(student);
    }

    @Override
    public Student findEmail(String email) {
        return doa.findEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return doa.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        doa.deleteStudent(email);

    }
}

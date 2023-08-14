package com.example.CRUD.service;



import com.example.CRUD.model.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Long id);
}


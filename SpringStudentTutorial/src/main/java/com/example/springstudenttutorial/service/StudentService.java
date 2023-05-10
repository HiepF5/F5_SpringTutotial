package com.example.springstudenttutorial.service;

import com.example.springstudenttutorial.entity.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}

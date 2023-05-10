package com.example.springstudenttutorial.service.impl;

import com.example.springstudenttutorial.entity.Student;
import com.example.springstudenttutorial.repository.StudentRepository;
import com.example.springstudenttutorial.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
//    public StudentServiceImpl(StudentRepository studentRepository){
//        this.studentRepository=studentRepository;
//    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}

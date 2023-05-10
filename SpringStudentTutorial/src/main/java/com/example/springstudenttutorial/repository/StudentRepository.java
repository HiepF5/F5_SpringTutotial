package com.example.springstudenttutorial.repository;

import com.example.springstudenttutorial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public interface StudentRepository extends JpaRepository<Student,Integer> {


}

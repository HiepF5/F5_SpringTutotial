package com.example.springentitymanagetutorial.service;

import com.example.springentitymanagetutorial.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();
    List<Customer> saveAll();
    Optional<Customer> findById(Long id);
    List<Customer> findByFirstName(String firstName);
}

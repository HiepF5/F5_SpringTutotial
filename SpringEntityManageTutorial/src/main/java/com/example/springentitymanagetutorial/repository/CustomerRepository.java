package com.example.springentitymanagetutorial.repository;

import com.example.springentitymanagetutorial.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findAll();

    Optional<Customer> findById(Long id);
    List<Customer> findByFirstName(String firstName);
}
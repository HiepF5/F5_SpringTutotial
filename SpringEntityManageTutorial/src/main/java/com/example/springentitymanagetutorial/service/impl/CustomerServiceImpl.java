package com.example.springentitymanagetutorial.service.impl;

import com.example.springentitymanagetutorial.entity.Customer;
import com.example.springentitymanagetutorial.repository.CustomerRepository;
import com.example.springentitymanagetutorial.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    public CustomerServiceImpl (CustomerRepository customerRepository)
    {
        this.customerRepository=customerRepository;
    }
    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
    @Override
    public Optional<Customer>findById(Long id){
        return customerRepository.findById(id);
    }
    @Override
    public List<Customer>findByFirstName(String firstName){
        return customerRepository.findByFirstName(firstName);
    }

}

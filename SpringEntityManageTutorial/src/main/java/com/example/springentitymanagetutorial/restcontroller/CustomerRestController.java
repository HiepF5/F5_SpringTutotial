package com.example.springentitymanagetutorial.restcontroller;

import com.example.springentitymanagetutorial.entity.Customer;
import com.example.springentitymanagetutorial.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class CustomerRestController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/customers")
    public List<Customer>getCustomer(){
        return customerService.findAll();
    }
    @GetMapping("/customers/{id}")
    public Optional<Customer> getIdCustomer(@PathVariable Long id){
        return customerService.findById(id);
    }
//    @GetMapping("/customer")
//    public List<Customer> getFirstName(@RequestParam(name="firstName", required = true)String firstName){
//        return customerService.findByFirstName(firstName);
//    }
    @GetMapping("/customers/find/{firstName}")
    public List<Customer> getFirstName(@PathVariable String firstName){
        return customerService.findByFirstName(firstName);
    }

}

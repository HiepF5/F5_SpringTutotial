package com.example.spring_laptop.service;

import com.example.spring_laptop.entity.Laptop;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface LaptopService {
    List<Laptop>findAllLaptop();
    Optional<Laptop> findById(Integer id);

    List<Laptop> findByNameAndBrand(String name, String brand);
    Laptop save(Laptop laptop);
//    Void delete(Integer id);

}

package com.example.spring_laptop.service.impl;

import com.example.spring_laptop.entity.Laptop;
import com.example.spring_laptop.repository.LaptopRepository;
import com.example.spring_laptop.service.LaptopService;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class LaptopServiceImpl implements LaptopService {
    private final LaptopRepository laptopRepository;

    public LaptopServiceImpl(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @Override
    public List<Laptop> findAllLaptop() {
        return laptopRepository.findAll();
    }

    @Override
    public Optional<Laptop> findById(Integer id) {
        return laptopRepository.findById(id);
    }

    @Override
    public List<Laptop> findByNameAndBrand(String name, String brand) {
        return laptopRepository.findByNameAndBrand(name,brand);
    }

    @Override
    public Laptop save(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

//    @Override
//    public Void delete(Integer id) {
//        return laptopRepository.delete(id);
//    }
}

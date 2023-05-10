package com.example.spring_laptop.repository;

import com.example.spring_laptop.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
    List<Laptop> findAll();
    Optional<Laptop> findById(Integer id);

    List<Laptop> findByNameAndBrand(String name, String brand);

   Laptop save(Laptop laptop);

//   Void delete(Integer id);

}

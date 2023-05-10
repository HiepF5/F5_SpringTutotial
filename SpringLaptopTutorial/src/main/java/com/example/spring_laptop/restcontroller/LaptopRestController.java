package com.example.spring_laptop.restcontroller;

import com.example.spring_laptop.entity.Laptop;
import com.example.spring_laptop.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")

public class LaptopRestController {
    @Autowired
    private LaptopService laptopService;
    @GetMapping("/laptop")
    public List<Laptop> getLaptops(){

        return laptopService.findAllLaptop();
    }
    @PostMapping("/add")
    public Laptop  newLaptop (@RequestBody Laptop newlaptop){
        return laptopService.save(newlaptop);
    }
    @GetMapping("/laptop/{id}")
    public Optional<Laptop> getIdLaptops(@PathVariable int id){
        return laptopService.findById(id);
    }

    @GetMapping("/laptops")
    public List<Laptop> getNameandBrand(@RequestParam(name ="name", required = true ) String name, @RequestParam(name="brand", required = true ) String brand){
        return laptopService.findByNameAndBrand(name,brand);
    }
    @GetMapping("/laptops/search")
    public List<Laptop> searchLaptops(@RequestParam(name ="name", required = false ) String name, @RequestParam(name="brand", required = false ) String brand){
        if (name == null) {
            name = "";
        }
        if (brand == null) {
            brand = "";
        }
        return laptopService.findByNameAndBrand(name,brand);
    }
//    @DeleteMapping("/laptop/{id}")
//    void deleteLaptop(@PathVariable int id){
//        laptopService.delete(id);
//    }

}

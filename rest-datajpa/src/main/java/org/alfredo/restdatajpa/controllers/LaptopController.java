package org.alfredo.restdatajpa.controllers;

import org.alfredo.restdatajpa.models.Laptop;
import org.alfredo.restdatajpa.services.LaptopService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class LaptopController {
    final LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @GetMapping("/laptops")
    public ResponseEntity<List<Laptop>>  findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(laptopService.findAllLaptops()) ;
    }


    @PostMapping("/laptops")
    public ResponseEntity<Laptop> addLaptop(@RequestBody Laptop laptop){
        System.out.println("laptop = " + laptop);
        return ResponseEntity.status(HttpStatus.CREATED).body(laptopService.addLaptop(laptop));
    }

    @GetMapping("/laptops/{id}")
    public ResponseEntity<Object>  getById(@PathVariable UUID id){
        Optional<Laptop> optionalLaptop = laptopService.findById(id);
        if (!optionalLaptop.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Laptop solicitado no existe!");
        }else {
            return ResponseEntity.status(HttpStatus.OK).body(optionalLaptop.get());
        }
    }
}

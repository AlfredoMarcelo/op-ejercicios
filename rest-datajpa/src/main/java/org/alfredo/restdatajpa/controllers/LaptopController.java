package org.alfredo.restdatajpa.controllers;

import org.alfredo.restdatajpa.models.Laptop;
import org.alfredo.restdatajpa.services.LaptopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class LaptopController {

    /*
    * Logger de slf4j permite crear mensajes para utilizarlos en el back, sirve para
    * hacer registros de solicitudes y respuestas.
    * Se pueden generar .info, .warn, .danger
    * */
    private final Logger log = LoggerFactory.getLogger(LaptopController.class);
    final LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @GetMapping("/laptops")
    public ResponseEntity<List<Laptop>>  findAll(){
        log.info("Se esta solicitando los laptops disponibles");
        return ResponseEntity.status(HttpStatus.OK).body(laptopService.findAllLaptops()) ;
    }


    @PostMapping("/laptops")
    public ResponseEntity<Laptop> addLaptop(@RequestBody Laptop laptop){
        System.out.println("laptop = " + laptop);
        return ResponseEntity.status(HttpStatus.CREATED).body(laptopService.addLaptop(laptop));
    }

    @GetMapping("/laptops/{id}")
    public ResponseEntity<Object>  getById(@PathVariable(value = "id") Long id){
        Optional<Laptop> optionalLaptop = laptopService.findById(id);
        if (!optionalLaptop.isPresent()){
            log.warn("Solicitud de producto no existente");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Laptop solicitado no existe!");
        }else {
            log.info("Solicitud de producto exitoso");
            return ResponseEntity.status(HttpStatus.OK).body(optionalLaptop.get());
        }
    }

    @PutMapping("/laptops/{id}")
    public ResponseEntity<Object> updateLaptop(@PathVariable(value = "id") Long id, @RequestBody Laptop laptop){
        Optional<Laptop> laptopOptional = laptopService.findById(id);
        if(!laptopOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Laptop no encontrado");
        }
        var laptopCopy = new Laptop();
        BeanUtils.copyProperties(laptop,laptopCopy);
        laptopCopy.setId(laptopOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(laptopService.addLaptop(laptopCopy));
    }

    @DeleteMapping("/laptops/{id}")
    public ResponseEntity<Object> deleteLaptop(@PathVariable(value = "id") Long id){
        Optional<Laptop> optionalLaptop = laptopService.findById(id);
        if(!optionalLaptop.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Laptop no existe o ya fue eliminada");
        }
        laptopService.deleteLaptop(id);
        return ResponseEntity.status(HttpStatus.OK).body("Laptop eliminada del sistema");
    }

}

package org.alfredo.restdatajpa.services;

import org.alfredo.restdatajpa.models.Laptop;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LaptopService{
    Laptop addLaptop(Laptop laptop);
    List<Laptop> findAllLaptops();
    Optional<Laptop> findById(Long id);
    Long deleteLaptop(Long id);
    Laptop updateLaptop(Laptop laptop);

}

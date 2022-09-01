package org.alfredo.restdatajpa.services;

import org.alfredo.restdatajpa.models.Laptop;

import java.util.List;
import java.util.Optional;

public interface LaptopService{
    Laptop add(Laptop laptop);
    List<Laptop> findAll();
    Optional<Laptop> findById(Long id);
    Long delete(Long id);
    Laptop update(Laptop laptop);

}

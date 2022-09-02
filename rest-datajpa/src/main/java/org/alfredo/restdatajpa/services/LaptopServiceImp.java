package org.alfredo.restdatajpa.services;

import org.alfredo.restdatajpa.models.Laptop;
import org.alfredo.restdatajpa.repository.LaptopRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LaptopServiceImp implements LaptopService {

    final LaptopRepository laptopRepository;

    public LaptopServiceImp(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @Transactional
    @Override
    public Laptop addLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    @Override
    public List<Laptop> findAllLaptops() {
        return laptopRepository.findAll();
    }

    @Override
    public Optional<Laptop> findById(UUID id) {
        return laptopRepository.findById(id);
    }

    @Override
    public Long deleteLaptop(Long id) {
        return null;
    }

    @Override
    public Laptop updateLaptop(Laptop laptop) {
        return null;
    }
}

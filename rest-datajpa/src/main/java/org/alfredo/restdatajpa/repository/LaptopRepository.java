package org.alfredo.restdatajpa.repository;

import org.alfredo.restdatajpa.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, UUID> {

}

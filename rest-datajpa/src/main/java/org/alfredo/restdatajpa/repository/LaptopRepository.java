package org.alfredo.restdatajpa.repository;

import org.alfredo.restdatajpa.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}

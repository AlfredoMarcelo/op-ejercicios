package com.op.ejerciciotres.repositories;

import com.op.ejerciciotres.models.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AutomovilRepository extends JpaRepository<Automovil, Long> {
}

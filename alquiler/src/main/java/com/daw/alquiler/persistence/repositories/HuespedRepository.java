package com.daw.alquiler.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.alquiler.persistence.entities.Propiedad;

public interface HuespedRepository extends JpaRepository<Propiedad, Integer>{

}

package com.daw.alquiler.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.alquiler.persistence.entities.Mensaje;


public interface MensajeRepository extends JpaRepository<Mensaje, Integer>{

}

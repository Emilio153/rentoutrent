package com.daw.alquiler.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.alquiler.persistence.entities.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

}

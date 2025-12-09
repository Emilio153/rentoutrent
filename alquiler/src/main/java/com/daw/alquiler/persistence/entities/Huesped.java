package com.daw.alquiler.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "huesped")
@Getter @Setter @NoArgsConstructor
public class Huesped extends Persona {

    // Un huesped tiene muchas reservas
    @OneToMany(mappedBy = "huesped")
    @JsonIgnore
    private List<Reserva> reservas;
}

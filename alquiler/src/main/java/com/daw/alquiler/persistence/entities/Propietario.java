package com.daw.alquiler.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "propietario")
@Getter 
@Setter 
@NoArgsConstructor
public class Propietario extends Persona {

    // Un propietario tiene muchas propiedades
    @OneToMany(mappedBy = "propietario", cascade = CascadeType.ALL)
    @JsonIgnore // Evita recursividad infinita al serializar a JSON
    private List<Propiedad> propiedades;
}
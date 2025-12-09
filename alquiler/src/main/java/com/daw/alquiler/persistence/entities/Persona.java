package com.daw.alquiler.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.JOINED) // Estrategia solicitada
@Getter @Setter @NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100)
    private String nombre;

    @Column(length = 20, unique = true)
    private String dni;

    @Column(length = 100)
    private String email;

    private String password;

    @Column(length = 20)
    private String telefono;
}

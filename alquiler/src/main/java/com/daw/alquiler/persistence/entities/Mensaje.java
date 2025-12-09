package com.daw.alquiler.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "mensaje")
@Getter @Setter @NoArgsConstructor
public class Mensaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "TEXT")
    private String contenido;

    // Relación opcional con reserva
    @ManyToOne
    @JoinColumn(name = "reserva_id")
    private Reserva reserva;

    // Emisor y Receptor son Personas
    @ManyToOne
    @JoinColumn(name = "emisor_id")
    private Persona emisor;

    @ManyToOne
    @JoinColumn(name = "receptor_id")
    private Persona receptor;
}

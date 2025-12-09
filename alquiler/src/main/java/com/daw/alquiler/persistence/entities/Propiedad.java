package com.daw.alquiler.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "propiedad")
@Getter @Setter @NoArgsConstructor
public class Propiedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titulo;
    
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    
    private String direccion;
    
    private double precio_noche;
    
    private int max_huespedes;
    
    private LocalDate calendario; // Según tus specs

    @ManyToOne
    @JoinColumn(name = "propietario_id")
    private Propietario propietario;

    @OneToMany(mappedBy = "propiedad", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ImagenPropiedad> imagenes;

    @OneToMany(mappedBy = "propiedad")
    @JsonIgnore
    private List<Reserva> reservas;
}

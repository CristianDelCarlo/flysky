package com.example.flysky.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Set;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "asiento")
public class Asiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private String ubicacion;
    private String clase;
    private Long factor_clase;

    @ManyToMany
    @JoinTable(
            name="pasaje",
            joinColumns = @JoinColumn(name = "id_asiento"),
            inverseJoinColumns = @JoinColumn(name = "id_vuelo")
    )
    private Set<Vuelo> vuelos;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_asiento", nullable = false)
    private Set<Pasaje> pasajes;

}

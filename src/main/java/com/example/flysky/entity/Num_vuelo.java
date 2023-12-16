package com.example.flysky.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.Set;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "num_vuelo")
public class Num_vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String aerolinea;
    private String avion;
    private String aerop_salida;
    private String aerop_llegada;
    private LocalDateTime hora_salida;
    private Long duracion;

    @OneToMany(mappedBy = "num_vuelo", cascade = CascadeType.ALL)
    private Set<Vuelo> vuelos;
}

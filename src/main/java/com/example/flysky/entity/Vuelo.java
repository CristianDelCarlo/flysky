package com.example.flysky.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Set;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "vuelo")
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dia_salida;
    private LocalDateTime llegada;
    private Long precio;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_nro_vuelo", nullable = false)
    private Num_vuelo num_vuelo;

    @ManyToMany(mappedBy = "vuelo")
    private Set<Asiento> asientos;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_nro_vuelo", nullable = false)
    private Set<Pasaje> pasajes;

}

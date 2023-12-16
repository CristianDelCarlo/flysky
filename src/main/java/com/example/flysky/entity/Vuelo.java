package com.example.flysky.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

import java.time.LocalDate;
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

    private LocalDate dia_salida;
    //private LocalDateTime llegada;
    private Long precio;

    @ManyToOne
    @JoinColumn(name = "id_Nro_Vuelo", nullable = false)
    private Num_vuelo num_vuelo;

    @OneToMany(mappedBy = "vuelo")
    private Set<Pasaje> pasajes;

}

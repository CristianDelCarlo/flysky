package com.example.flysky.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.Set;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "pasaje")
public class Pasaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String asiento;
    private String clase;

    private Long precio;
    private Double factor_Clase;
    private Long precio_final;

    @ManyToOne
    @JoinColumn(name = "id_Vuelo")
    private Vuelo vuelo;

    @ManyToOne
    @JoinColumn(name = "id_pasaje", nullable = false)
    private Reserva reserva;


}

package com.example.flysky.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Set;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String forma_pago;
    private LocalDateTime fecha;

    @OneToOne
    @JoinColumn(name = "id_Reserva")
    private Reserva reservaPag;

 }

package com.example.flysky.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fecha_res;
    private Integer nro_reserva;
    private Boolean es_contacto;

    @OneToMany(mappedBy = "reserva", cascade = CascadeType.ALL)
    private Set<Pasaje> pasajesres;

    @OneToMany(mappedBy = "reserva", cascade = CascadeType.ALL)
    private Set<Cliente> clientesres;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_pago", nullable = false)
    private Pago pago;
}

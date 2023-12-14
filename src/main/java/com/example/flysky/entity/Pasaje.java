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

    private Long precio_final;
    private Boolean reservado;

    @OneToMany(mappedBy = "pasaje", cascade = CascadeType.ALL)
    private Set<Asiento> asientospas;

    @OneToMany(mappedBy = "pasaje", cascade = CascadeType.ALL)
    private Set<Vuelo> vuelospas;

    @ManyToMany(mappedBy = "pasaje")
    private Set<Cliente> clientes;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_pasaje", nullable = false)
    private Set<Reserva> reservas;
}

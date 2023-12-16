package com.example.flysky.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.Set;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String dni;
    private LocalDateTime fecha_nac;
    private String mail;
    private Integer telefono;

    @OneToMany(mappedBy = "cliente")
    private Set<Reserva> reservas;

    /* la última sacada:
    @ManyToMany
    @JoinTable(
            name="reserva",
            joinColumns = @JoinColumn(name = "id_Cliente"),
            inverseJoinColumns = @JoinColumn(name = "id_Pasaje")
    )
    private Set<Pasaje> pasajes;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Set<Reserva> reservas;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Set<Reserva> reservas;


    @ManyToMany(mappedBy = "clientes")
    private Set<Pasaje> pasajes;
    */





}

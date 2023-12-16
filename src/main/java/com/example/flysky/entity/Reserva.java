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

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    private Cliente cliente;


    @OneToOne(mappedBy = "reservaPag", cascade = CascadeType.ALL)
    private Pago pago;

/*
    últimas configs:
    @ManyToOne
    @JoinColumn(name = "id_Pasaje", referencedColumnName = "id")
    private Pasaje pasaje;

    @ManyToOne
    @JoinColumn(name = "id_Cliente", referencedColumnName = "id")
    private Cliente cliente;


    @ManyToOne
    @JoinColumn(name = "id_Cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_Pasaje")
    private Pasaje pasaje;
    */





    /*
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_Pago", nullable = false)
    private Pago pago;
*/



}

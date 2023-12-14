package com.example.flysky.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;
@Getter
@Setter
public class Num_vueloDto {
    private Long id;
    private String aerolinea;
    private String aerop_salida;
    private String aerop_llegada;
    private LocalDateTime hora_salida;
    private Long duracion;
    private Set<VueloDto> vuelosDto;
}

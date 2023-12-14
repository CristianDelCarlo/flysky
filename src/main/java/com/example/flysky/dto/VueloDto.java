package com.example.flysky.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;
@Getter
@Setter
public class VueloDto {
    private Long id;
    private LocalDateTime dia_salida;
    private LocalDateTime llegada;
    private Long precio;
    private Num_vueloDto num_vueloDto;

    // private Set<AsientoDto> asientosDto;  (para completar después)
    //private Set<PasajeDto> pasajesdto;
}

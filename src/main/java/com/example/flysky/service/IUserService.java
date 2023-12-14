package com.example.flysky.service;

import com.example.flysky.dto.VueloDto;
import com.example.flysky.dto.Num_vueloDto;

import java.util.List;

public interface IUserService {

    List<VueloDto> buscarVuelos();
}

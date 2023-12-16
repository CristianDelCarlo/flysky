package com.example.flysky.service;

import com.example.flysky.dto.VueloDto;
import com.example.flysky.dto.Num_vueloDto;
import com.example.flysky.dto.VueloDto;
import com.example.flysky.entity.Vuelo;
import com.example.flysky.entity.Num_vuelo;
import com.example.flysky.repository.IVueloRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements IUserService{

    IVueloRepository vueloRepository;

    public UserServiceImp(IVueloRepository vueloRepository){
        this.vueloRepository = vueloRepository;
    }

    @Override
    public List<VueloDto> buscarVuelos(){
        ModelMapper mapper = new ModelMapper();
        List<Vuelo> vuelosEnt = vueloRepository.findAll();
        List<VueloDto> vuelosDto = new ArrayList<>();
        vuelosEnt.forEach(c-> vuelosDto.add(mapper.map(c,VueloDto.class)));
        return vuelosDto;

    }

}

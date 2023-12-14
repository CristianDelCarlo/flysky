package com.example.flysky.controller;

import com.example.flysky.dto.VueloDto;
import com.example.flysky.dto.Num_vueloDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.flysky.service.UserServiceImp;
import com.example.flysky.service.IUserService;


@RestController
public class UserController {

    IUserService userService;

    public UserController(UserServiceImp userService){
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getVuelos(){
        return new ResponseEntity<>(userService.buscarVuelos(), HttpStatus.OK);
    }

}

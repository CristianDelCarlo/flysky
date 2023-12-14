package com.example.flysky.repository;

import com.example.flysky.entity.Pasaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface IPasajeRepository extends JpaRepository<Pasaje,Long> {
}

package com.example.flysky.repository;

import com.example.flysky.entity.Asiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface IAsientoRepository extends JpaRepository<Asiento,Long> {
}

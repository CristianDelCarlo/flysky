package com.example.flysky.repository;

import com.example.flysky.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface IReservaRepository extends JpaRepository<Reserva,Long> {
}

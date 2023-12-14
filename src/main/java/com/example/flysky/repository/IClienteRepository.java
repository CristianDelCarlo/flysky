package com.example.flysky.repository;

import com.example.flysky.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface IClienteRepository extends JpaRepository<Cliente,Long> {
}

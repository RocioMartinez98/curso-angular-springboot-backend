package com.curso.springboot.backend.apirest.models.dao;

import com.curso.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDAO extends JpaRepository<Cliente,Long> {
}

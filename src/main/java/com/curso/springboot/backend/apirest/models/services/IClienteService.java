package com.curso.springboot.backend.apirest.models.services;

import com.curso.springboot.backend.apirest.models.entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {

    public List<Cliente> findAll();

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(long id);

}

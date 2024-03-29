package com.curso.springboot.backend.apirest.models.services;

import com.curso.springboot.backend.apirest.models.entity.Cliente;
import com.curso.springboot.backend.apirest.models.entity.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IClienteService {

    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(long id);

    public List<Region> findAllRegiones();

}

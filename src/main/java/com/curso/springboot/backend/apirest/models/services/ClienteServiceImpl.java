package com.curso.springboot.backend.apirest.models.services;

import com.curso.springboot.backend.apirest.models.dao.IClienteDAO;
import com.curso.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService{
    @Autowired
    private IClienteDAO clienteDAO;

    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>)clienteDAO.findAll();
    }

}

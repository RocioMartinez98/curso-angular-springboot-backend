package com.curso.springboot.backend.apirest.models.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    private String apellido;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    public Cliente(){}

    public Cliente(Long id, String nombre, String apellido, String email, Date createAt) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.createAt = createAt;
    }

    @PrePersist
    public void prePersist(){
        createAt = new Date();
    }
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    //private static final long serialVersionUID = 1L;
}

package com.curso.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean enabled;
    @Column(length = 60)
    private String password;
    @Column(unique = true, length = 20)
    private String username;
    private String nombre;
    private String apellido;
    @Column(unique = true)
    private String email;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)//si borro un usuario, se borran sus roles asociados
    @JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(name = "usuarios_id")
            , inverseJoinColumns = @JoinColumn(name = "roles_id"),
    uniqueConstraints = {@UniqueConstraint(columnNames = {"usuarios_id","roles_id"})}) //No es necesario, lo hace automatico, es por si quiero cambiar los nombres
    //uniqueConstraints si es necesario ya que nos permite que esta clave sea unica
    private List<Role> roles;

    public Usuario(Long id, Boolean enabled, String password, String username, String nombre, String apellido, String email, List<Role> roles) {
        this.id = id;
        this.enabled = enabled;
        this.password = password;
        this.username = username;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.roles = roles;
    }

    public Usuario(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}

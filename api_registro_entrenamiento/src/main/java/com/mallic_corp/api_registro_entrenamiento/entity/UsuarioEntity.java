package com.mallic_corp.api_registro_entrenamiento.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity (name = "usuario")
public class UsuarioEntity {
    @Id
    private String usuario;

    @Column (nullable = false)
    private String password;


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario (String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

}

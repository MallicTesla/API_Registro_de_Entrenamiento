package com.mallic_corp.api_registro_entrenamiento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mallic_corp.api_registro_entrenamiento.entity.UsuarioEntity;
import com.mallic_corp.api_registro_entrenamiento.model.Login;
import com.mallic_corp.api_registro_entrenamiento.repository.UsuarioRepository;


@RestController
public class SesionController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping ("login")
    public String inisiarSesion (@RequestBody Login login) {
        // busca el usuario
        var usuario = usuarioRepository.findById(login.usuario());

        if (usuario.isEmpty()) {
            return "credenciales incorrectas";
        }

        var entity = usuario.get();
        var passwordCorecto = passwordEncoder.matches(login.password(), entity.getPassword());

        if (passwordCorecto) {
            return "200";
        }else{
        return "Contraseña incorrecta";
        }

    }

    @PostMapping ("registro")
    public String registro (@RequestBody Login login) {
        var usuario = new UsuarioEntity();
        var encodePassword = passwordEncoder.encode(login.password());

        usuario.setUsuario(login.usuario());
        usuario.setPassword(encodePassword);

        usuarioRepository.save (usuario);

        return "200";
    }

}


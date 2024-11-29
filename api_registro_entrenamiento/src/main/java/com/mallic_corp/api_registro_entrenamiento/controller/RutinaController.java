package com.mallic_corp.api_registro_entrenamiento.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mallic_corp.api_registro_entrenamiento.model.Rutina;


@RestController
@RequestMapping("rutinas")
public class RutinaController {

    List<Rutina> rutinas = new ArrayList<>();

    @GetMapping
    public List <Rutina> optenerTodas(){

        return rutinas;
    }

    @PostMapping
    public Rutina crearRutina (@RequestBody Rutina entity) {

        rutinas.add(entity);

        System.out.println(entity);
        return entity;
    }
    


}

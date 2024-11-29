package com.mallic_corp.api_registro_entrenamiento.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mallic_corp.api_registro_entrenamiento.entity.RutinaEntity;
import com.mallic_corp.api_registro_entrenamiento.model.Rutina;
import com.mallic_corp.api_registro_entrenamiento.repository.RutinasRepository;


@RestController
@RequestMapping("rutinas")
public class RutinaController {
    @Autowired
    RutinasRepository rutinaRepository;

    @GetMapping
    public List <Rutina> optenerTodas(){
        var rutinas = rutinaRepository.findAll();

        return rutinas.stream().map((e)->new Rutina (e.getNombre(),e.getDescripcion())).toList();
    }

    @PostMapping
    public Rutina crearRutina (@RequestBody Rutina rutina) {

        var entity =new RutinaEntity();
        entity.setNombre (rutina.titulo());
        entity.setDescripcion (rutina.descripcion());

        rutinaRepository.save(entity);

        System.out.println(entity);
        return rutina;
    }
    


}

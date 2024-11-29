package com.mallic_corp.api_registro_entrenamiento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mallic_corp.api_registro_entrenamiento.entity.RutinaEntity;

@Repository
public interface RutinasRepository extends JpaRepository<RutinaEntity, Long>{

}

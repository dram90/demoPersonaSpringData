package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by professor on 20/06/2016.
 */
public interface PersonaRepository extends JpaRepository<Persona,Long> {

    List<Persona> findByNombre(String nombre);

    List<Persona> findByNombreAndApellido (String nombre, String apellido);
    List<Persona> findByNombreOrApellido (String nombre, String apellido);

    List<Persona> findByEdadGreaterThanEqual(Integer age);



}

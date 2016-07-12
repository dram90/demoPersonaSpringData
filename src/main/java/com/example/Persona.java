package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Locale;

/**
 * Created by professor on 20/06/2016.
 */
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private Integer edad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (!getId().equals(persona.getId())) return false;
        if (!getNombre().equals(persona.getNombre())) return false;
        if (!getApellido().equals(persona.getApellido())) return false;
        return getEdad().equals(persona.getEdad());

    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getNombre().hashCode();
        result = 31 * result + getApellido().hashCode();
        result = 31 * result + getEdad().hashCode();
        return result;
    }
}

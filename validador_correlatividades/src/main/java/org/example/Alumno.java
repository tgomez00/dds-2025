package org.example;

import lombok.Getter;
import lombok.Setter;
import java.util.List;


@Getter
@Setter
public class Alumno {
    private String nombre;
    private String apellido;
    private Integer edad;
    private String sexo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido, Integer edad, String sexo, List<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.materiasAprobadas = materiasAprobadas;
    }
}
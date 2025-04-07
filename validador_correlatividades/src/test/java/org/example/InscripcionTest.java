package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class InscripcionTest {

    List<Materia> materiasAprobadas;
    List<Materia> materiasCorrelativasAlgoritmos;
    List<Materia> materiasCorrelativasAM2;
    List<Materia> materiasCorrelativasParadigmas;
    List<Materia> materiasCorrelativasDisenio;
    Materia algoritmos;
    Materia analisismatematico1;
    Materia analisismatematico2;
    Materia paradigmas;
    Materia disenio;
    Alumno tomas;

    @BeforeEach
    public void inicializacion(){

         materiasAprobadas = new ArrayList<Materia>();
         materiasCorrelativasAlgoritmos = new ArrayList<Materia>();
         materiasCorrelativasAM2 = new ArrayList<Materia>();
         materiasCorrelativasParadigmas = new ArrayList<Materia>();
         materiasCorrelativasDisenio = new ArrayList<Materia>();

         algoritmos = new Materia("Algoritmos", materiasCorrelativasAlgoritmos);
         paradigmas = new Materia("Paradigmas", materiasCorrelativasParadigmas);
         disenio = new Materia("Disenio", materiasCorrelativasDisenio);
         analisismatematico2= new Materia("Analisis Matematico 2", materiasCorrelativasAM2);

         materiasCorrelativasParadigmas.add(algoritmos);
         materiasCorrelativasDisenio.add(paradigmas);
         materiasCorrelativasDisenio.add(algoritmos);
         materiasCorrelativasAM2.add(analisismatematico1);
         materiasAprobadas.add(algoritmos);
         materiasAprobadas.add(paradigmas);

         tomas = new Alumno("Tomas", "Gomez", 24, "M", materiasAprobadas);

    }

    @Test
    @DisplayName("Puede cursar Disenio de Sistemas")
    public void aprobada() {
        Inscripcion inscripcion = new Inscripcion();
        Assertions.assertTrue(inscripcion.aprobada(tomas, disenio));
    }

    @Test
    @DisplayName("No puede cursar Analisis matematico 2")
    public void rechazada() {
        Inscripcion inscripcion = new Inscripcion();
        Assertions.assertFalse(inscripcion.aprobada(tomas, analisismatematico2));
    }


}
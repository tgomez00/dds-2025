package org.example;

public class Inscripcion {

    public boolean aprobada(Alumno alumno, Materia materia) {
        for(Materia correlativa : materia.getCorrelativas()){
            if(!alumno.getMateriasAprobadas().contains(correlativa) || !aprobada(alumno, correlativa)){
                return false;
            }
       }
        return true;
    }
}


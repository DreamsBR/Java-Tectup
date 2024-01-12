package org.example.model;

public class Profesor extends Persona{

    String materia;

    public Profesor(String nombre, int edad,String materia){
        super(nombre, edad);
        this.materia = materia;
    }

    @Override
    public void realizarAcciones() {
        System.out.println(nombre + " Esta enseñando como docente");
    }
}

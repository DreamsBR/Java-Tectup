package org.example.model;

public class Estudiante extends Persona{

    String grado;

    public Estudiante(String nombre, int edad, String grado) {
        super(nombre, edad);
        this.grado = grado;
    }

    public Estudiante() {
    }

    @Override
    public void realizarAcciones() {
        System.out.println("El estudiante "+nombre + " esta estudiando en el grado : "+ grado);
    }
}

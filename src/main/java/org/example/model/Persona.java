package org.example.model;

import org.example.interfaces.Usuario;

public abstract class Persona implements Usuario {

    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {

    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrar aqui");
    }

    @Override
    public void iniciarSesion() {
        System.out.println( nombre +" ha iniciado sesión");
    }
    public abstract void realizarAcciones();
}

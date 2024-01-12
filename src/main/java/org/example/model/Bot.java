package org.example.model;

import org.example.interfaces.Usuario;

public class Bot implements Usuario {

    String name;

    public Bot(String name) {
        this.name = name;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Iniciar sesión bot");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrar sesión bot");
    }

    @Override
    public void realizarAcciones() {
        System.out.println("Soy un bot");
    }
}

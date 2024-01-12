package org.example;

import org.example.model.Bot;
import org.example.model.Estudiante;
import org.example.model.Profesor;

public class Main {
    public static void main(String[] args) {

        System.out.println("Profesor");
        Profesor profesor = new Profesor("Marcos", 25, "Ingles");
        profesor.iniciarSesion();
        profesor.realizarAcciones();
        profesor.cerrarSesion();

        System.out.println("Estudiante");
        Estudiante estudiante = new Estudiante("Mateo", 21, "2do grado");
        estudiante.iniciarSesion();
        estudiante.realizarAcciones();
        estudiante.cerrarSesion();

        System.out.println("Bot: ");
        Bot bot = new Bot("Bot Con");
        bot.iniciarSesion();
        bot.cerrarSesion();
        bot.realizarAcciones();

    }



}
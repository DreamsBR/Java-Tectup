package org.example;

import org.example.model.Circulo;
import org.example.model.Rectangulo;
import org.example.model.Triangulo;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(4);
        System.out.println(circulo.calculateArea());
        System.out.println(circulo.calculatePerimeter());

        Rectangulo rectangulo = new Rectangulo(6, 3);
        System.out.println(rectangulo.calculateArea());
        System.out.println(rectangulo.calculatePerimeter());


        Triangulo triangulo = new Triangulo(6,3,4);
        System.out.println(triangulo.calculateArea());
        System.out.println(triangulo.calculatePerimeter());



    }



}
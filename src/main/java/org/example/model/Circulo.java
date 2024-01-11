package org.example.model;

import org.example.interfaces.FormaGeometrica;

public class Circulo implements FormaGeometrica {

    double radio;

    final static double  pi = Math.PI;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return pi * (radio * radio);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * pi * radio;
    }
}

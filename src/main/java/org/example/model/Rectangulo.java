package org.example.model;

import org.example.interfaces.FormaGeometrica;

public class Rectangulo implements FormaGeometrica {

    double base;
    double altura;

    public Rectangulo (double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return base * altura;
    }

    @Override
    public double calculatePerimeter() {
        return (base + altura)*2;
    }
}

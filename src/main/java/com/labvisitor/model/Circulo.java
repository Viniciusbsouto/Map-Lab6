package com.labvisitor.model;

import com.labvisitor.visitor.Visitor;

public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

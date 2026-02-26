package com.labvisitor.model;

import com.labvisitor.visitor.Visitor;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() { return base; }
    public double getAltura() { return altura; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

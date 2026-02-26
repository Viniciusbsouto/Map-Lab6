package com.labvisitor.model;

import com.labvisitor.visitor.Visitor;

public class Trapezio extends Figura {
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double getBaseMaior() { return baseMaior; }
    public double getBaseMenor() { return baseMenor; }
    public double getAltura() { return altura; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

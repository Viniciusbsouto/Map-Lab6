package com.labvisitor.model;

import com.labvisitor.visitor.Visitor;

public class Retangulo extends Figura {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() { return largura; }
    public double getAltura() { return altura; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

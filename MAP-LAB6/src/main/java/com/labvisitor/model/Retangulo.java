package com.labvisitor.model;

import com.labvisitor.visitor.Visitor;

public class Retangulo implements Figura {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base e altura devem ser maiores que zero.");
        }
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("A base deve ser maior que zero.");
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura deve ser maior que zero.");
        }
        this.altura = altura;
    }

    @Override
    public <T> T aceitaVisita(Visitor<T> visitor) {
        return visitor.visitarRetangulo(this);
    }
}
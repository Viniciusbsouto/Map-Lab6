package com.labvisitor.model;

import com.labvisitor.visitor.Visitor;

public class Circulo implements Figura {
    private double raio;

    public Circulo(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.raio = raio;
    }

    @Override
    public <T> T aceitaVisita(Visitor<T> visitor) {
        return visitor.visitarCirculo(this);
    }
}
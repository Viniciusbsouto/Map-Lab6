package com.labvisitor.model;

import com.labvisitor.visitor.VisitorIF;

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
    public void aceitaVisita(VisitorIF visitor) {
        visitor.visitarCirculo(this);
    }
}
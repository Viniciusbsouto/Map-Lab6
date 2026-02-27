package com.labvisitor.model;

import com.labvisitor.visitor.VisitorIF;

public class Trapezio implements Figura {
    private double baseMaior;
    private double baseMenor;
    private double ladoEsquerdo;
    private double ladoDireito;
    private double altura;

    public Trapezio(double baseMaior, double baseMenor, double ladoEsquerdo, double ladoDireito, double altura) {
        if (baseMaior <= 0 || baseMenor <= 0 || ladoEsquerdo <= 0 || ladoDireito <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Todos os valores devem ser maiores que zero.");
        }

        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.ladoEsquerdo = ladoEsquerdo;
        this.ladoDireito = ladoDireito;
        this.altura = altura;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        if (baseMaior <= 0) {
            throw new IllegalArgumentException("A base maior deve ser maior que zero.");
        }
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        if (baseMenor <= 0) {
            throw new IllegalArgumentException("A base menor deve ser maior que zero.");
        }
        this.baseMenor = baseMenor;
    }

    public double getLadoEsquerdo() {
        return ladoEsquerdo;
    }

    public void setLadoEsquerdo(double ladoEsquerdo) {
        if (ladoEsquerdo <= 0) {
            throw new IllegalArgumentException("O lado esquerdo deve ser maior que zero.");
        }
        this.ladoEsquerdo = ladoEsquerdo;
    }

    public double getLadoDireito() {
        return ladoDireito;
    }

    public void setLadoDireito(double ladoDireito) {
        if (ladoDireito <= 0) {
            throw new IllegalArgumentException("O lado direito deve ser maior que zero.");
        }
        this.ladoDireito = ladoDireito;
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
    public void aceitaVisita(VisitorIF visitor) {
        visitor.visitarTrapezio(this);
    }
}
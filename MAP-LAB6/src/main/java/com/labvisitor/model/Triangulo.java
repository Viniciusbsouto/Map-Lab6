package com.labvisitor.model;

import com.labvisitor.visitor.VisitorIF;

public class Triangulo implements Figura {
    private double base;
    private double lado2;
    private double lado3;
    private double altura;

    public Triangulo(double base, double lado2, double lado3, double altura) {
        if (base <= 0 || lado2 <= 0 || lado3 <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Todos os valores devem ser maiores que zero.");
        }

        if (base + lado2 <= lado3 || base + lado3 <= lado2 || lado2 + lado3 <= base) {
            throw new IllegalArgumentException("Os lados não formam um triângulo válido.");
        }

        this.base = base;
        this.lado2 = lado2;
        this.lado3 = lado3;
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

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        if (lado2 <= 0) {
            throw new IllegalArgumentException("O lado deve ser maior que zero.");
        }
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        if (lado3 <= 0) {
            throw new IllegalArgumentException("O lado deve ser maior que zero.");
        }
        this.lado3 = lado3;
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
        visitor.visitarTriangulo(this);
    }
}
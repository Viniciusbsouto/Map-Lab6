package com.labvisitor.visitor;

import com.labvisitor.model.Circulo;
import com.labvisitor.model.Retangulo;
import com.labvisitor.model.Triangulo;
import com.labvisitor.model.Trapezio;

public class VisitorCalculaPerimetro implements VisitorIF {
    private double resultado;

    public double getResultado() {
        return resultado;
    }

    @Override
    public void visitarCirculo(Circulo c) {
        resultado = 2 * Math.PI * c.getRaio();
    }

    @Override
    public void visitarRetangulo(Retangulo r) {
        resultado = 2 * (r.getBase() + r.getAltura());
    }

    @Override
    public void visitarTriangulo(Triangulo t) {
        resultado = t.getBase() + t.getLado2() + t.getLado3();
    }

    @Override
    public void visitarTrapezio(Trapezio tz) {
        resultado = tz.getBaseMaior() + tz.getBaseMenor() + tz.getLadoEsquerdo() + tz.getLadoDireito();
    }
}
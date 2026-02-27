package com.labvisitor.visitor;

import com.labvisitor.model.Circulo;
import com.labvisitor.model.Retangulo;
import com.labvisitor.model.Triangulo;
import com.labvisitor.model.Trapezio;

public class VisitorCalculaArea implements VisitorIF {
    private double resultado;

    public double getResultado() {
        return resultado;
    }

    @Override
    public void visitarCirculo(Circulo c) {
        resultado = Math.PI * c.getRaio() * c.getRaio();
    }

    @Override
    public void visitarRetangulo(Retangulo r) {
        resultado = r.getBase() * r.getAltura();
    }

    @Override
    public void visitarTriangulo(Triangulo t) {
        resultado = (t.getBase() * t.getAltura()) / 2.0;
    }

    @Override
    public void visitarTrapezio(Trapezio tz) {
        resultado = ((tz.getBaseMaior() + tz.getBaseMenor()) * tz.getAltura()) / 2.0;
    }
}
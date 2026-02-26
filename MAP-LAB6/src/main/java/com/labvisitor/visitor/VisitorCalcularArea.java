package com.labvisitor.visitor;

import com.labvisitor.model.Circulo;
import com.labvisitor.model.Retangulo;
import com.labvisitor.model.Triangulo;
import com.labvisitor.model.Trapezio;

public class VisitorCalcularArea implements Visitor<Double> {

    @Override
    public Double visitarCirculo(Circulo circulo) {
        return Math.PI * circulo.getRaio() * circulo.getRaio();
    }

    @Override
    public Double visitarRetangulo(Retangulo retangulo) {
        return retangulo.getBase() * retangulo.getAltura();
    }

    @Override
    public Double visitarTriangulo(Triangulo triangulo) {
        return (triangulo.getBase() * triangulo.getAltura()) / 2.0;
    }

    @Override
    public Double visitarTrapezio(Trapezio trapezio) {
        return ((trapezio.getBaseMaior() + trapezio.getBaseMenor()) * trapezio.getAltura()) / 2.0;
    }
}
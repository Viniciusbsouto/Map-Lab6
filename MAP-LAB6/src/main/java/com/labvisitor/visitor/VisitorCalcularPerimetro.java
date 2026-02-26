package com.labvisitor.visitor;

import com.labvisitor.model.Circulo;
import com.labvisitor.model.Retangulo;
import com.labvisitor.model.Triangulo;
import com.labvisitor.model.Trapezio;

public class VisitorCalcularPerimetro implements Visitor<Double> {

    @Override
    public Double visitarCirculo(Circulo circulo) {
        return 2 * Math.PI * circulo.getRaio();
    }

    @Override
    public Double visitarRetangulo(Retangulo retangulo) {
        return 2 * (retangulo.getBase() + retangulo.getAltura());
    }

    @Override
    public Double visitarTriangulo(Triangulo triangulo) {
        return triangulo.getBase() + triangulo.getLado2() + triangulo.getLado3();
    }

    @Override
    public Double visitarTrapezio(Trapezio trapezio) {
        return trapezio.getBaseMaior()
                + trapezio.getBaseMenor()
                + trapezio.getLadoEsquerdo()
                + trapezio.getLadoDireito();
    }
}
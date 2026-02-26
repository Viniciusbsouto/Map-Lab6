package com.labvisitor.visitor;

import com.labvisitor.model.Circulo;
import com.labvisitor.model.Retangulo;
import com.labvisitor.model.Triangulo;
import com.labvisitor.model.Trapezio;

public class VisitorMaximizar implements Visitor<Void> {

    @Override
    public Void visitarCirculo(Circulo circulo) {
        circulo.setRaio(circulo.getRaio() * 2);
        return null;
    }

    @Override
    public Void visitarRetangulo(Retangulo retangulo) {
        retangulo.setBase(retangulo.getBase() * 2);
        retangulo.setAltura(retangulo.getAltura() * 2);
        return null;
    }

    @Override
    public Void visitarTriangulo(Triangulo triangulo) {
        triangulo.setBase(triangulo.getBase() * 2);
        triangulo.setLado2(triangulo.getLado2() * 2);
        triangulo.setLado3(triangulo.getLado3() * 2);
        triangulo.setAltura(triangulo.getAltura() * 2);
        return null;
    }

    @Override
    public Void visitarTrapezio(Trapezio trapezio) {
        trapezio.setBaseMaior(trapezio.getBaseMaior() * 2);
        trapezio.setBaseMenor(trapezio.getBaseMenor() * 2);
        trapezio.setLadoEsquerdo(trapezio.getLadoEsquerdo() * 2);
        trapezio.setLadoDireito(trapezio.getLadoDireito() * 2);
        trapezio.setAltura(trapezio.getAltura() * 2);
        return null;
    }
}
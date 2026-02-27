package com.labvisitor.visitor;

import com.labvisitor.model.Circulo;
import com.labvisitor.model.Retangulo;
import com.labvisitor.model.Trapezio;
import com.labvisitor.model.Triangulo;

public class VisitorMaximizar implements VisitorIF {

    @Override
    public void visitarCirculo(Circulo c) {
        c.setRaio(c.getRaio() * 2);
    }

    @Override
    public void visitarRetangulo(Retangulo r) {
        r.setBase(r.getBase() * 2);
        r.setAltura(r.getAltura() * 2);
    }

    @Override
    public void visitarTriangulo(Triangulo t) {
        t.setBase(t.getBase() * 2);
        t.setLado2(t.getLado2() * 2);
        t.setLado3(t.getLado3() * 2);
        t.setAltura(t.getAltura() * 2);
    }

    @Override
    public void visitarTrapezio(Trapezio tz) {
        tz.setBaseMaior(tz.getBaseMaior() * 2);
        tz.setBaseMenor(tz.getBaseMenor() * 2);
        tz.setLadoEsquerdo(tz.getLadoEsquerdo() * 2);
        tz.setLadoDireito(tz.getLadoDireito() * 2);
        tz.setAltura(tz.getAltura() * 2);
    }
}
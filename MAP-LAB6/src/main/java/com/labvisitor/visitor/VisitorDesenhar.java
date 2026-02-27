package com.labvisitor.visitor;

import com.labvisitor.model.Circulo;
import com.labvisitor.model.Retangulo;
import com.labvisitor.model.Trapezio;
import com.labvisitor.model.Triangulo;

public class VisitorDesenhar implements VisitorIF {
    private String desenho;

    public String getDesenho() {
        return desenho;
    }

    @Override
    public void visitarCirculo(Circulo c) {
        desenho = "Desenhando um círculo de raio " + c.getRaio();
    }

    @Override
    public void visitarRetangulo(Retangulo r) {
        desenho = "Desenhando um retângulo de base " + r.getBase() + " e altura " + r.getAltura();
    }

    @Override
    public void visitarTriangulo(Triangulo t) {
        desenho = "Desenhando um triângulo de lados " + t.getBase() + ", " + t.getLado2() + ", " + t.getLado3();
    }

    @Override
    public void visitarTrapezio(Trapezio tz) {
        desenho = "Desenhando um trapézio de bases " + tz.getBaseMaior() + " e " + tz.getBaseMenor();
    }
}
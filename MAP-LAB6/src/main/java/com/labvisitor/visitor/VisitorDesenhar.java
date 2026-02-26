package com.labvisitor.visitor;

import com.labvisitor.model.Circulo;
import com.labvisitor.model.Retangulo;
import com.labvisitor.model.Triangulo;
import com.labvisitor.model.Trapezio;

public class VisitorDesenhar implements Visitor<String> {

    @Override
    public String visitarCirculo(Circulo circulo) {
        return "Desenhando um círculo de raio " + circulo.getRaio();
    }

    @Override
    public String visitarRetangulo(Retangulo retangulo) {
        return "Desenhando um retângulo de base " + retangulo.getBase()
                + " e altura " + retangulo.getAltura();
    }

    @Override
    public String visitarTriangulo(Triangulo triangulo) {
        return "Desenhando um triângulo de lados "
                + triangulo.getBase() + ", "
                + triangulo.getLado2() + ", "
                + triangulo.getLado3();
    }

    @Override
    public String visitarTrapezio(Trapezio trapezio) {
        return "Desenhando um trapézio de bases "
                + trapezio.getBaseMaior() + " e "
                + trapezio.getBaseMenor();
    }
}
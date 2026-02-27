package com.labvisitor.visitor;

import com.labvisitor.model.Circulo;
import com.labvisitor.model.Retangulo;
import com.labvisitor.model.Trapezio;
import com.labvisitor.model.Triangulo;

public interface VisitorIF {
    void visitarCirculo(Circulo circulo);
    void visitarRetangulo(Retangulo retangulo);
    void visitarTriangulo(Triangulo triangulo);
    void visitarTrapezio(Trapezio trapezio);
}
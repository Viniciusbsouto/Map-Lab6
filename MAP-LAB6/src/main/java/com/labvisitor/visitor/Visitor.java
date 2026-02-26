package com.labvisitor.visitor;

import com.labvisitor.model.Circulo;
import com.labvisitor.model.Retangulo;
import com.labvisitor.model.Triangulo;
import com.labvisitor.model.Trapezio;

public interface Visitor<T> {
    T visitarCirculo(Circulo circulo);
    T visitarRetangulo(Retangulo retangulo);
    T visitarTriangulo(Triangulo triangulo);
    T visitarTrapezio(Trapezio trapezio);
}
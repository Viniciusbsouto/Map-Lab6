package com.labvisitor.visitor;

import com.labvisitor.model.Circulo;
import com.labvisitor.model.Retangulo;
import com.labvisitor.model.Triangulo;
import com.labvisitor.model.Trapezio;

public interface Visitor {
    void visit(Circulo c);
    void visit(Retangulo r);
    void visit(Triangulo t);
    void visit(Trapezio t);
}

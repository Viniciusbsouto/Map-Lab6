package com.labvisitor.visitor;

import com.labvisitor.model.*;

public class VisitorMaximizar implements Visitor {
    @Override public void visit(Circulo c) { }
    @Override public void visit(Retangulo r) { }
    @Override public void visit(Triangulo t) { }
    @Override public void visit(Trapezio t) { }
}

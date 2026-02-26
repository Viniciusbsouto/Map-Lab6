package com.labvisitor;

import com.labvisitor.model.Triangulo;
import com.labvisitor.visitor.Visitor;
import com.labvisitor.visitor.VisitorDesenhar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class TrianguloVisitorTest {
    @Test
    public void testTrianguloAcceptsVisitor() {
        Triangulo t = new Triangulo(3.0, 4.0);
        Visitor v = new VisitorDesenhar();
        assertDoesNotThrow(() -> t.accept(v));
    }
}

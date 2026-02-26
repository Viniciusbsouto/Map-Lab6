package com.labvisitor;

import com.labvisitor.model.Circulo;
import com.labvisitor.visitor.Visitor;
import com.labvisitor.visitor.VisitorDesenhar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class CirculoVisitorTest {
    @Test
    public void testCirculoAcceptsVisitor() {
        Circulo c = new Circulo(1.0);
        Visitor v = new VisitorDesenhar();
        assertDoesNotThrow(() -> c.accept(v));
    }
}

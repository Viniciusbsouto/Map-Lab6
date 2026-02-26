package com.labvisitor;

import com.labvisitor.model.Retangulo;
import com.labvisitor.visitor.Visitor;
import com.labvisitor.visitor.VisitorDesenhar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class RetanguloVisitorTest {
    @Test
    public void testRetanguloAcceptsVisitor() {
        Retangulo r = new Retangulo(2.0, 3.0);
        Visitor v = new VisitorDesenhar();
        assertDoesNotThrow(() -> r.accept(v));
    }
}

package com.labvisitor;

import com.labvisitor.model.Trapezio;
import com.labvisitor.visitor.Visitor;
import com.labvisitor.visitor.VisitorDesenhar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class TrapezioVisitorTest {
    @Test
    public void testTrapezioAcceptsVisitor() {
        Trapezio t = new Trapezio(5.0, 3.0, 2.0);
        Visitor v = new VisitorDesenhar();
        assertDoesNotThrow(() -> t.accept(v));
    }
}

package com.labvisitor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.labvisitor.model.Trapezio;
import com.labvisitor.visitor.VisitorCalcularArea;
import com.labvisitor.visitor.VisitorCalcularPerimetro;
import com.labvisitor.visitor.VisitorDesenhar;
import com.labvisitor.visitor.VisitorMaximizar;

public class TrapezioVisitorTest {

    @Test
    void deveCalcularAreaDoTrapezio() {
        Trapezio t = new Trapezio(10, 6, 5, 5, 4);
        assertEquals(32, t.aceitaVisita(new VisitorCalcularArea()), 1e-9);
    }

    @Test
    void deveCalcularPerimetroDoTrapezio() {
        Trapezio t = new Trapezio(10, 6, 5, 5, 4);
        assertEquals(26, t.aceitaVisita(new VisitorCalcularPerimetro()), 1e-9);
    }

    @Test
    void deveDesenharTrapezio() {
        Trapezio t = new Trapezio(10, 6, 5, 5, 4);
        assertTrue(t.aceitaVisita(new VisitorDesenhar()).contains("trapézio"));
    }

    @Test
    void deveMaximizarTrapezio() {
        Trapezio t = new Trapezio(10, 6, 5, 5, 4);
        t.aceitaVisita(new VisitorMaximizar());
        assertEquals(20, t.getBaseMaior(), 1e-9);
    }
}
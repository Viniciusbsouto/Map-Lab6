package com.labvisitor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.labvisitor.model.Trapezio;
import com.labvisitor.visitor.VisitorCalculaArea;
import com.labvisitor.visitor.VisitorCalculaPerimetro;
import com.labvisitor.visitor.VisitorDesenhar;
import com.labvisitor.visitor.VisitorMaximizar;

public class TrapezioVisitorTest {

    @Test
    void deveCalcularAreaDoTrapezio() {
        Trapezio tz = new Trapezio(10, 6, 5, 5, 4);
        VisitorCalculaArea visitor = new VisitorCalculaArea();

        tz.aceitaVisita(visitor);

        assertEquals(32, visitor.getResultado(), 1e-9);
    }

    @Test
    void deveCalcularPerimetroDoTrapezio() {
        Trapezio tz = new Trapezio(10, 6, 5, 5, 4);
        VisitorCalculaPerimetro visitor = new VisitorCalculaPerimetro();

        tz.aceitaVisita(visitor);

        assertEquals(26, visitor.getResultado(), 1e-9);
    }

    @Test
    void deveDesenharTrapezio() {
        Trapezio tz = new Trapezio(10, 6, 5, 5, 4);
        VisitorDesenhar visitor = new VisitorDesenhar();

        tz.aceitaVisita(visitor);

        assertTrue(visitor.getDesenho().contains("trapézio"));
    }

    @Test
    void deveMaximizarTrapezio() {
        Trapezio tz = new Trapezio(10, 6, 5, 5, 4);
        VisitorMaximizar visitor = new VisitorMaximizar();

        tz.aceitaVisita(visitor);

        assertEquals(20, tz.getBaseMaior(), 1e-9);
    }
}
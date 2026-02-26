package com.labvisitor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.labvisitor.model.Retangulo;
import com.labvisitor.visitor.VisitorCalcularArea;
import com.labvisitor.visitor.VisitorCalcularPerimetro;
import com.labvisitor.visitor.VisitorDesenhar;
import com.labvisitor.visitor.VisitorMaximizar;

public class RetanguloVisitorTest {

    @Test
    void deveCalcularAreaDoRetangulo() {
        Retangulo r = new Retangulo(4, 3);
        assertEquals(12, r.aceitaVisita(new VisitorCalcularArea()), 1e-9);
    }

    @Test
    void deveCalcularPerimetroDoRetangulo() {
        Retangulo r = new Retangulo(4, 3);
        assertEquals(14, r.aceitaVisita(new VisitorCalcularPerimetro()), 1e-9);
    }

    @Test
    void deveDesenharRetangulo() {
        Retangulo r = new Retangulo(4, 3);
        assertTrue(r.aceitaVisita(new VisitorDesenhar()).contains("retângulo"));
    }

    @Test
    void deveMaximizarRetangulo() {
        Retangulo r = new Retangulo(4, 3);
        r.aceitaVisita(new VisitorMaximizar());
        assertEquals(8, r.getBase(), 1e-9);
    }
}
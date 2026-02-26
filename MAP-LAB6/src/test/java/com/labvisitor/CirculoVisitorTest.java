package com.labvisitor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.labvisitor.model.Circulo;
import com.labvisitor.visitor.VisitorCalcularArea;
import com.labvisitor.visitor.VisitorCalcularPerimetro;
import com.labvisitor.visitor.VisitorDesenhar;
import com.labvisitor.visitor.VisitorMaximizar;

public class CirculoVisitorTest {

    @Test
    void deveCalcularAreaDoCirculo() {
        Circulo c = new Circulo(2);
        assertEquals(Math.PI * 4, c.aceitaVisita(new VisitorCalcularArea()), 1e-9);
    }

    @Test
    void deveCalcularPerimetroDoCirculo() {
        Circulo c = new Circulo(2);
        assertEquals(4 * Math.PI, c.aceitaVisita(new VisitorCalcularPerimetro()), 1e-9);
    }

    @Test
    void deveDesenharCirculo() {
        Circulo c = new Circulo(2);
        assertTrue(c.aceitaVisita(new VisitorDesenhar()).contains("círculo"));
    }

    @Test
    void deveMaximizarCirculo() {
        Circulo c = new Circulo(2);
        c.aceitaVisita(new VisitorMaximizar());
        assertEquals(4, c.getRaio(), 1e-9);
    }
}
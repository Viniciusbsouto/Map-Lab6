package com.labvisitor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.labvisitor.model.Triangulo;
import com.labvisitor.visitor.VisitorCalcularArea;
import com.labvisitor.visitor.VisitorCalcularPerimetro;
import com.labvisitor.visitor.VisitorDesenhar;
import com.labvisitor.visitor.VisitorMaximizar;

public class TrianguloVisitorTest {

    @Test
    void deveCalcularAreaDoTriangulo() {
        Triangulo t = new Triangulo(3, 4, 5, 4);
        assertEquals(6, t.aceitaVisita(new VisitorCalcularArea()), 1e-9);
    }

    @Test
    void deveCalcularPerimetroDoTriangulo() {
        Triangulo t = new Triangulo(3, 4, 5, 4);
        assertEquals(12, t.aceitaVisita(new VisitorCalcularPerimetro()), 1e-9);
    }

    @Test
    void deveDesenharTriangulo() {
        Triangulo t = new Triangulo(3, 4, 5, 4);
        assertTrue(t.aceitaVisita(new VisitorDesenhar()).contains("triângulo"));
    }

    @Test
    void deveMaximizarTriangulo() {
        Triangulo t = new Triangulo(3, 4, 5, 4);
        t.aceitaVisita(new VisitorMaximizar());
        assertEquals(6, t.getBase(), 1e-9);
    }
}
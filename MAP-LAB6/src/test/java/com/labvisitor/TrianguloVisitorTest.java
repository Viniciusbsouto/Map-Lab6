package com.labvisitor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.labvisitor.model.Triangulo;
import com.labvisitor.visitor.VisitorCalculaArea;
import com.labvisitor.visitor.VisitorCalculaPerimetro;
import com.labvisitor.visitor.VisitorDesenhar;
import com.labvisitor.visitor.VisitorMaximizar;

public class TrianguloVisitorTest {

    @Test
    void deveCalcularAreaDoTriangulo() {
        Triangulo t = new Triangulo(3, 4, 5, 4);
        VisitorCalculaArea visitor = new VisitorCalculaArea();

        t.aceitaVisita(visitor);

        assertEquals(6, visitor.getResultado(), 1e-9);
    }

    @Test
    void deveCalcularPerimetroDoTriangulo() {
        Triangulo t = new Triangulo(3, 4, 5, 4);
        VisitorCalculaPerimetro visitor = new VisitorCalculaPerimetro();

        t.aceitaVisita(visitor);

        assertEquals(12, visitor.getResultado(), 1e-9);
    }

    @Test
    void deveDesenharTriangulo() {
        Triangulo t = new Triangulo(3, 4, 5, 4);
        VisitorDesenhar visitor = new VisitorDesenhar();

        t.aceitaVisita(visitor);

        assertTrue(visitor.getDesenho().contains("triângulo"));
    }

    @Test
    void deveMaximizarTriangulo() {
        Triangulo t = new Triangulo(3, 4, 5, 4);
        VisitorMaximizar visitor = new VisitorMaximizar();

        t.aceitaVisita(visitor);

        assertEquals(6, t.getBase(), 1e-9);
    }
}
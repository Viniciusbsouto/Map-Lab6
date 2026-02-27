package com.labvisitor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.labvisitor.model.Circulo;
import com.labvisitor.visitor.VisitorCalculaArea;
import com.labvisitor.visitor.VisitorCalculaPerimetro;
import com.labvisitor.visitor.VisitorDesenhar;
import com.labvisitor.visitor.VisitorMaximizar;

public class CirculoVisitorTest {

    @Test
    void deveCalcularAreaDoCirculo() {
        Circulo c = new Circulo(2);
        VisitorCalculaArea visitor = new VisitorCalculaArea();

        c.aceitaVisita(visitor);

        assertEquals(Math.PI * 4, visitor.getResultado(), 1e-9);
    }

    @Test
    void deveCalcularPerimetroDoCirculo() {
        Circulo c = new Circulo(2);
        VisitorCalculaPerimetro visitor = new VisitorCalculaPerimetro();

        c.aceitaVisita(visitor);

        assertEquals(4 * Math.PI, visitor.getResultado(), 1e-9);
    }

    @Test
    void deveDesenharCirculo() {
        Circulo c = new Circulo(2);
        VisitorDesenhar visitor = new VisitorDesenhar();

        c.aceitaVisita(visitor);

        assertTrue(visitor.getDesenho().contains("círculo"));
    }

    @Test
    void deveMaximizarCirculo() {
        Circulo c = new Circulo(2);
        VisitorMaximizar visitor = new VisitorMaximizar();

        c.aceitaVisita(visitor);

        assertEquals(4, c.getRaio(), 1e-9);
    }
}
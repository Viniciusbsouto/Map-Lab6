package com.labvisitor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.labvisitor.model.Retangulo;
import com.labvisitor.visitor.VisitorCalculaArea;
import com.labvisitor.visitor.VisitorCalculaPerimetro;
import com.labvisitor.visitor.VisitorDesenhar;
import com.labvisitor.visitor.VisitorMaximizar;

public class RetanguloVisitorTest {

    @Test
    void deveCalcularAreaDoRetangulo() {
        Retangulo r = new Retangulo(4, 3);
        VisitorCalculaArea visitor = new VisitorCalculaArea();

        r.aceitaVisita(visitor);

        assertEquals(12, visitor.getResultado(), 1e-9);
    }

    @Test
    void deveCalcularPerimetroDoRetangulo() {
        Retangulo r = new Retangulo(4, 3);
        VisitorCalculaPerimetro visitor = new VisitorCalculaPerimetro();

        r.aceitaVisita(visitor);

        assertEquals(14, visitor.getResultado(), 1e-9);
    }

    @Test
    void deveDesenharRetangulo() {
        Retangulo r = new Retangulo(4, 3);
        VisitorDesenhar visitor = new VisitorDesenhar();

        r.aceitaVisita(visitor);

        assertTrue(visitor.getDesenho().contains("retângulo"));
    }

    @Test
    void deveMaximizarRetangulo() {
        Retangulo r = new Retangulo(4, 3);
        VisitorMaximizar visitor = new VisitorMaximizar();

        r.aceitaVisita(visitor);

        assertEquals(8, r.getBase(), 1e-9);
    }
}
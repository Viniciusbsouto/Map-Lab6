package com.labvisitor;

import com.labvisitor.model.Circulo;
import com.labvisitor.model.Figura;
import com.labvisitor.model.Retangulo;
import com.labvisitor.model.Trapezio;
import com.labvisitor.model.Triangulo;
import com.labvisitor.visitor.VisitorCalculaArea;
import com.labvisitor.visitor.VisitorCalculaPerimetro;
import com.labvisitor.visitor.VisitorDesenhar;
import com.labvisitor.visitor.VisitorMaximizar;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(5),
            new Retangulo(4, 6),
            new Triangulo(3, 4, 5, 4),
            new Trapezio(10, 6, 5, 5, 4)
        };

        VisitorDesenhar visitorDesenhar = new VisitorDesenhar();
        VisitorCalculaArea visitorArea = new VisitorCalculaArea();
        VisitorCalculaPerimetro visitorPerimetro = new VisitorCalculaPerimetro();
        VisitorMaximizar visitorMaximizar = new VisitorMaximizar();

        for (Figura figura : figuras) {
            System.out.println("================================");

            figura.aceitaVisita(visitorDesenhar);
            System.out.println(visitorDesenhar.getDesenho());

            figura.aceitaVisita(visitorArea);
            System.out.println("Área: " + visitorArea.getResultado());

            figura.aceitaVisita(visitorPerimetro);
            System.out.println("Perímetro: " + visitorPerimetro.getResultado());

            figura.aceitaVisita(visitorMaximizar);

            System.out.println("Após maximizar:");

            figura.aceitaVisita(visitorDesenhar);
            System.out.println(visitorDesenhar.getDesenho());

            figura.aceitaVisita(visitorArea);
            System.out.println("Área: " + visitorArea.getResultado());

            figura.aceitaVisita(visitorPerimetro);
            System.out.println("Perímetro: " + visitorPerimetro.getResultado());
        }
    }
}
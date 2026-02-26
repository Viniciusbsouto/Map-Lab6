package com.labvisitor;

import com.labvisitor.model.Circulo;
import com.labvisitor.model.Figura;
import com.labvisitor.model.Retangulo;
import com.labvisitor.model.Trapezio;
import com.labvisitor.model.Triangulo;
import com.labvisitor.visitor.VisitorCalcularArea;
import com.labvisitor.visitor.VisitorCalcularPerimetro;
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
        VisitorCalcularArea visitorArea = new VisitorCalcularArea();
        VisitorCalcularPerimetro visitorPerimetro = new VisitorCalcularPerimetro();
        VisitorMaximizar visitorMaximizar = new VisitorMaximizar();

        for (Figura figura : figuras) {
            System.out.println("==================================");
            System.out.println(figura.aceitaVisita(visitorDesenhar));
            System.out.println("Área: " + figura.aceitaVisita(visitorArea));
            System.out.println("Perímetro: " + figura.aceitaVisita(visitorPerimetro));

            figura.aceitaVisita(visitorMaximizar);

            System.out.println("Após maximizar:");
            System.out.println(figura.aceitaVisita(visitorDesenhar));
            System.out.println("Área: " + figura.aceitaVisita(visitorArea));
            System.out.println("Perímetro: " + figura.aceitaVisita(visitorPerimetro));
        }
    }
}
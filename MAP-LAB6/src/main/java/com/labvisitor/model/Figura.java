package com.labvisitor.model;

import com.labvisitor.visitor.VisitorIF;

public interface Figura {
    void aceitaVisita(VisitorIF visitor);
}
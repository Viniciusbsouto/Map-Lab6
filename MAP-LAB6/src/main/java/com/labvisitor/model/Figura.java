package com.labvisitor.model;

import com.labvisitor.visitor.Visitor;

public interface Figura {
    <T> T aceitaVisita(Visitor<T> visitor);
}
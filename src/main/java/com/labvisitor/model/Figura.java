package com.labvisitor.model;

import com.labvisitor.visitor.Visitor;

public abstract class Figura {
    public abstract void accept(Visitor visitor);
}

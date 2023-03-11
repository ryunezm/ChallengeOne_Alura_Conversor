package com.ryunezm.apps.javacurrconv.model;

public abstract class Measure{
    private String name;
    private String symbol;

    public Measure(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }


    public abstract double Convert(double quantity, Measure unitTarget);
}

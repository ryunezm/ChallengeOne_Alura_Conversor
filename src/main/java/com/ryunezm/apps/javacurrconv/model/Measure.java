package com.ryunezm.apps.javacurrconv.model;

public abstract class Measure{
    private String type;
    private String name;
    private String symbol;
    private double factor;

    public Measure(String type, String name, String symbol, double factor) {
        this.type = type;
        this.name = name;
        this.symbol = symbol;
        this.factor = factor;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getFactor() {
        return factor;
    }

    public abstract double Convert(double quantity, Measure unitTarget);
}

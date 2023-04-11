package com.ryunezm.apps.javacurrconv.model;

public abstract class Unit {
    private final String name;
    private final String symbol;

    protected double factor;

    public Unit(String name, String symbol, double factor) {
        this.name = name;
        this.symbol = symbol;
        this.factor = factor;
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
    public abstract double Convert(double quantity, Unit outUnit);

}

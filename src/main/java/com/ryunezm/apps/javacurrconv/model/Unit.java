package com.ryunezm.apps.javacurrconv.model;

public abstract class Unit {
    private String name;
    private String symbol;

    public Unit(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public abstract double Convert(double quantity, Unit outUnit);
}

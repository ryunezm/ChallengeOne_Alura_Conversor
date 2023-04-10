package com.ryunezm.apps.javacurrconv.model;

public class UnitLength extends Unit {
    private final double factor;

    public UnitLength(String name, String symbol, double factor) {
        super(name, symbol);
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }

    @Override
    public double Convert(double quantity, Unit outUnit) {
        UnitLength unitFinal = (UnitLength) outUnit;
        return (quantity/unitFinal.getFactor())*(factor);
    }
}

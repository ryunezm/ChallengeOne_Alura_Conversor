package com.ryunezm.apps.javacurrconv.model;

public class UnitTime extends Unit {
    private final double factor;

    public UnitTime(String name, String symbol, double factor) {
        super(name, symbol);
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }

    @Override
    public double Convert(double quantity, Unit outUnit) {
        UnitTime unitFinal = (UnitTime) outUnit;
        return (quantity/unitFinal.getFactor())*(factor);
    }
}

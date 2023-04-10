package com.ryunezm.apps.javacurrconv.model;

public class UnitTime extends Unit {
    private double factor;
    private boolean commonness;

    public UnitTime(String name, String symbol, double factor, boolean commonness) {
        super(name, symbol);
        this.factor = factor;
        this.commonness = commonness;
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

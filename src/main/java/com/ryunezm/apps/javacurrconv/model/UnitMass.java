package com.ryunezm.apps.javacurrconv.model;

public class UnitMass extends Unit {
    private final double factor;
    private final boolean commonness;

    public UnitMass(String name, String symbol, double factor, boolean commonness) {
        super(name, symbol);
        this.factor = factor;
        this.commonness = commonness;

    }

    public double getFactor() {
        return factor;
    }

    @Override
    public double Convert(double quantity, Unit outUnit) {
        UnitMass unitFinal = (UnitMass) outUnit;
        return (quantity/unitFinal.getFactor())*(factor);
    }
}

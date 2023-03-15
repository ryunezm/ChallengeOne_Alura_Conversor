package com.ryunezm.apps.javacurrconv.model;

public class UnitMass extends Unit {
    private double factor;
    private boolean commonness;

    public UnitMass(String name, String symbol, double factor, boolean commonness) {
        super(name, symbol);
        this.factor = factor;
        this.commonness = commonness;

    }

    public double getFactor() {
        return factor;
    }

    public boolean isCommonness() {
        return commonness;
    }

    /**
     * @param quantity
     * @param unitTarget
     * @return
     */
    @Override
    public double Convert(double quantity, Unit unitTarget) {
        UnitMass unitFinal = (UnitMass) unitTarget;
        return 0;
    }
}

package com.ryunezm.apps.javacurrconv.model;

public class UnitLength extends Unit {
    private double factor;
    private boolean commonness;

    public UnitLength(String name, String symbol, double factor, boolean commonness) {
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
        UnitLength unitFinal = (UnitLength) unitTarget;
        return (quantity/factor)*(unitFinal.getFactor());
    }
}

package com.ryunezm.apps.javacurrconv.model;

public class UnitTemperature extends Unit {
    private boolean commonness;

    public UnitTemperature(String name, String symbol, boolean commonness) {
        super(name, symbol);
        this.commonness = commonness;
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
        return 0;
    }
}

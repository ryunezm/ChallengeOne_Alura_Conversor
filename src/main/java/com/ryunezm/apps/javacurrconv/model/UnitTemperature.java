package com.ryunezm.apps.javacurrconv.model;

public class UnitTemperature extends Unit {

    public UnitTemperature(String name, String symbol) {
        super(name, symbol);
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

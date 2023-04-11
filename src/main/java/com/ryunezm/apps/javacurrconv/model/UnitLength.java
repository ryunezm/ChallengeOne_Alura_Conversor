package com.ryunezm.apps.javacurrconv.model;

public class UnitLength extends Unit {

    public UnitLength(String name, String symbol, double factor) {
        super(name, symbol, factor);
    }

    @Override
    public double Convert(double quantity, Unit outUnit) {
        UnitLength unitFinal = (UnitLength) outUnit;
        return (quantity/unitFinal.getFactor())*(factor);
    }
}

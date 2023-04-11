package com.ryunezm.apps.javacurrconv.model;

public class UnitTime extends Unit {

    public UnitTime(String name, String symbol, double factor) {
        super(name, symbol, factor);
    }

    @Override
    public double Convert(double quantity, Unit outUnit) {
        UnitTime unitFinal = (UnitTime) outUnit;
        return (quantity/unitFinal.getFactor())*(factor);
    }
}

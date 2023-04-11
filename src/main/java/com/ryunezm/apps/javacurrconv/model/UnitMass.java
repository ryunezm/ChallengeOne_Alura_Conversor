package com.ryunezm.apps.javacurrconv.model;

public class UnitMass extends Unit {

    public UnitMass(String name, String symbol, double factor) {
        super(name, symbol, factor);
    }


    @Override
    public double Convert(double quantity, Unit outUnit) {
        UnitMass unitFinal = (UnitMass) outUnit;
        return (quantity/unitFinal.getFactor())*(factor);
    }
}

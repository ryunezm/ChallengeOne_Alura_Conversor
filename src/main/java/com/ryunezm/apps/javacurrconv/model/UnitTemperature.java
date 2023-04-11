package com.ryunezm.apps.javacurrconv.model;

public class UnitTemperature extends Unit {

    public double complement;

    public UnitTemperature(String name, String symbol, double factor, double complement) {
        super(name, symbol, factor);
        this.complement = complement;
    }

    @Override
    public double Convert(double quantity, Unit outUnit) {
        UnitTemperature unitFinal = (UnitTemperature) outUnit;
        return (quantity - complement)*(unitFinal.getFactor()/factor) + unitFinal.complement;
    }
}

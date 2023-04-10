package com.ryunezm.apps.javacurrconv.model;

public class UnitTemperature extends Unit {

    public UnitTemperature(String name, String symbol) {
        super(name, symbol);
    }

    @Override
    public double Convert(double quantity, Unit outUnit) {
        return 0;
    }
}

package com.ryunezm.apps.javacurrconv.model;

public class UnitCurrency extends Unit {
    public String code;
    public UnitCurrency(String code, String name, String symbol, double factor) {
        super(name, symbol, factor);
        this.code = code;
    }

    @Override
    public double Convert(double quantity, Unit outUnit) {
        UnitCurrency unitFinal = (UnitCurrency) outUnit;
        return (quantity/factor)*(unitFinal.getFactor());
    }


}

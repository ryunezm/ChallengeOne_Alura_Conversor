package com.ryunezm.apps.javacurrconv.model;

public class UnitCurrency extends Unit {
    public String code;
    public double factor;
    public UnitCurrency(String code, String name, String symbol, double factor) {
        super(name, symbol);
        this.code = code;
        this.factor = factor;
    }

    public String getCode() { return code; }

    public double getFactor() { return factor; }

    @Override
    public double Convert(double quantity, Unit outUnit) {
        UnitCurrency unitFinal = (UnitCurrency) outUnit;
        return (quantity/factor)*(unitFinal.getFactor());
    }
}

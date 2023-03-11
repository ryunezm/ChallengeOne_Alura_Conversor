package com.ryunezm.apps.javacurrconv.model;

public class MeasureCurrency extends Measure{
    public String code;
    public double factor;
    public MeasureCurrency(String code, String name, String symbol, double factor) {
        super(name, symbol);
        this.code = code;
        this.factor = factor;
    }

    /**
     * @param quantity
     * @param unitTarget
     * @return
     */
    @Override
    public double Convert(double quantity, Measure unitTarget) {
        return 0;
    }
}

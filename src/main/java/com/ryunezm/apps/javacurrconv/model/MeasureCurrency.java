package com.ryunezm.apps.javacurrconv.model;

public class MeasureCurrency extends Measure{
    public MeasureCurrency(String type, String name, String symbol, double factor) {
        super(type, name, symbol, factor);
    }

    /**
     * @param quantity
     * @param target
     * @return
     */
    @Override
    public double Convert(double quantity, Measure target) {
        return 0;
    }
}

package com.ryunezm.apps.javacurrconv.model;

public class MeasureLength extends Measure{
    public MeasureLength(String type, String name, String symbol, double factor) {
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

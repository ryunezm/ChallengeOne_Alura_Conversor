package com.ryunezm.apps.javacurrconv.model;

public class MeasureTime extends Measure{
    public MeasureTime(String type, String name, String symbol, double factor) {
        super(type, name, symbol, factor);
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
